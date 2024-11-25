package com.datos;

import com.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Reportes {
    public static int obtenerMesesSinRegistros(int idPeriodo) {
        Connection con = conexion.getConexion(); // Tu conexión a la base de datos
        int mesActual = LocalDate.now().getMonthValue(); // Obtener el mes actual (1-12)

        String sql = "SELECT COUNT(*) AS mesesSinRegistros " +
                     "FROM ( " +
                     "    SELECT 1 AS mes UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL " +
                     "    SELECT 5 UNION ALL SELECT 6 UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL " +
                     "    SELECT 9 UNION ALL SELECT 10 UNION ALL SELECT 11 UNION ALL SELECT 12 " +
                     ") AS meses " +
                     "LEFT JOIN ( " +
                     "    SELECT DISTINCT mes_ingreso AS mes FROM cuotas WHERE idPeriodo = ? " +
                     "    UNION " +
                     "    SELECT DISTINCT mes_egreso AS mes FROM egresos WHERE idPeriodo = ? " +
                     "    UNION " +
                     "    SELECT DISTINCT mes_consumo AS mes FROM consumo_agua WHERE idPeriodo = ? " +
                     ") registros ON meses.mes = registros.mes " +
                     "WHERE meses.mes <= ? AND registros.mes IS NULL";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPeriodo); // Parámetro del periodo para cuotas
            ps.setInt(2, idPeriodo); // Parámetro del periodo para egresos
            ps.setInt(3, idPeriodo); // Parámetro del periodo para consumo_agua
            ps.setInt(4, mesActual); // Limitar hasta el mes actual

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("mesesSinRegistros"); // Retornar la cantidad de meses sin registros
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los meses sin registros: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return 0; // Si ocurre un error, retorna 0
    }

    
    public static boolean verificarTodasCuotasPagadasHastaMesActual(int idPeriodo) {
        Connection con = conexion.getConexion(); // Tu conexión a la base de datos
        int mesActual = LocalDate.now().getMonthValue(); // Obtener el mes actual (1-12)

        String sql = "SELECT COUNT(*) AS cuotasNoPagadas " +
                     "FROM cuotas " +
                     "WHERE idPeriodo = ? AND mes_ingreso <= ? AND pagado = 0";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPeriodo); // Parámetro del periodo
            ps.setInt(2, mesActual); // Limitar los meses a verificar hasta el mes actual

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int cuotasNoPagadas = rs.getInt("cuotasNoPagadas");
                return cuotasNoPagadas == 0; // Si no hay cuotas con pagado = 0, todas están pagadas
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar cuotas pagadas: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false; // Si ocurre un error, asumimos que no todas las cuotas están pagadas
    }
    
    public static int obtenerMesesSinConsumoAgua(int idPeriodo) {
        Connection con = conexion.getConexion(); // Tu conexión a la base de datos
        int mesActual = LocalDate.now().getMonthValue(); // Obtener el mes actual (1-12)

        // Corrección para MySQL: Generar números del 1 al 12
        String sql = 
            "SELECT COUNT(*) AS mesesSinConsumo " +
            "FROM ( " +
            "  SELECT 1 AS mes UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5 UNION " +
            "  SELECT 6 UNION SELECT 7 UNION SELECT 8 UNION SELECT 9 UNION SELECT 10 UNION " +
            "  SELECT 11 UNION SELECT 12 " +
            ") meses " +
            "LEFT JOIN ( " +
            "  SELECT DISTINCT mes_consumo AS mes FROM consumo_agua WHERE idPeriodo = ? " +
            ") registros ON meses.mes = registros.mes " +
            "WHERE meses.mes <= ? AND registros.mes IS NULL";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPeriodo); // Parámetro del periodo
            ps.setInt(2, mesActual); // Limitar hasta el mes actual

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("mesesSinConsumo"); // Retorna la cantidad de meses sin consumo
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener meses sin consumo de agua: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return 0; // Si ocurre un error, retorna 0
    }
    
    public static boolean tienePocaActividadMesActual(int idPeriodo) {
        Connection con = conexion.getConexion();
        int mesActual = LocalDate.now().getMonthValue(); // Obtener el mes actual (1-12)

        String sql = "SELECT " +
                     "  (SELECT COUNT(*) FROM cuotas WHERE idPeriodo = ? AND mes_ingreso = ?) AS cuotas, " +
                     "  (SELECT COUNT(*) FROM egresos WHERE idPeriodo = ? AND mes_egreso = ?) AS egresos, " +
                     "  (SELECT COUNT(*) FROM consumo_agua WHERE idPeriodo = ? AND mes_consumo = ?) AS consumos";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPeriodo);
            ps.setInt(2, mesActual); 
            ps.setInt(3, idPeriodo);
            ps.setInt(4, mesActual);
            ps.setInt(5, idPeriodo);
            ps.setInt(6, mesActual);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int cuotas = rs.getInt("cuotas");
                    int egresos = rs.getInt("egresos");
                    int consumos = rs.getInt("consumos");

                    // Definir el umbral mínimo de actividad
                    int umbral = 5; // Cambia este valor según lo que consideres "poca actividad"

                    return cuotas < umbral && egresos < umbral && consumos < umbral;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar la actividad del mes actual: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return false; // Retorna false si ocurre algún error
    }
    
    
    public static int obtenerPagosPorDepartamento(int idPeriodo, String apartamento) {
        int pagosRealizados = 0;
        String sql = "SELECT COUNT(*) AS pagosRealizados " +
                     "FROM cuotas " +
                     "WHERE idPeriodo = ? AND apartamento = ? AND pagado = TRUE";

        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPeriodo);
            ps.setString(2, apartamento);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    pagosRealizados = rs.getInt("pagosRealizados");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener pagos para el apartamento " + apartamento + ": " + e.getMessage());
        }

        return pagosRealizados;
    }


}
