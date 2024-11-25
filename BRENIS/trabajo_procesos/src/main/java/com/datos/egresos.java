package com.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.conexion.conexion;
import com.dominio.egreso;

public class egresos {

    public static float obtenerSumaEgresos(int idPeriodo) {
        float sumaTotal = 0.0f;
        String sql = "SELECT monto FROM egresos WHERE idPeriodo = ?";

        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPeriodo);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    sumaTotal += rs.getFloat("monto");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la suma de egresos por idPeriodo: " + e.getMessage());
        }

        return sumaTotal;
    }

    
    public static List<egreso> listarEgresosPorPeriodoYMes(int idPeriodo, int mesEgreso) {
        List<egreso> egresos = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM egresos WHERE idPeriodo = ? AND mes_egreso = ? ORDER BY id_egreso";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPeriodo); // Filtra por el período especificado
            ps.setInt(2, mesEgreso); // Filtra por el mes dentro de ese período
            rs = ps.executeQuery();

            while (rs.next()) {
                var egreso = new egreso();
                egreso.setId_egreso(rs.getInt("id_egreso"));
                egreso.setTipo_egreso(rs.getString("tipo_egreso"));
                egreso.setTipo(rs.getString("tipo"));
                egreso.setModo_pago(rs.getString("modo_pago"));
                egreso.setA_nombre(rs.getString("A_nombre"));
                egreso.setDia_egreso(rs.getInt("dia_egreso"));
                egreso.setMes_egreso(rs.getInt("mes_egreso"));
                egreso.setAno_egreso(rs.getInt("ano_egreso"));
                egreso.setMonto(rs.getFloat("monto"));
                egreso.setIdPeriodo(rs.getInt("idPeriodo"));
                egreso.setEncargado_DNI(rs.getString("Encargado_DNI"));
                egresos.add(egreso);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar egresos por periodo y mes: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return egresos;
    }
    
    public static boolean buscarEgreso_id(egreso Egreso){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        var sql = "SELECT * FROM egresos WHERE id_egreso = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Egreso.getId_egreso());
            rs = ps.executeQuery();
            if(rs.next()){
                Egreso.setTipo_egreso(rs.getString("tipo_egreso"));
                Egreso.setTipo(rs.getString("tipo"));
                Egreso.setModo_pago(rs.getString("modo_pago"));
                Egreso.setA_nombre(rs.getString("A_nombre"));
                Egreso.setDia_egreso(rs.getInt("dia_egreso"));
                Egreso.setMes_egreso(rs.getInt("mes_egreso"));
                Egreso.setAno_egreso(rs.getInt("ano_egreso"));
                Egreso.setMonto(rs.getFloat("monto"));
                Egreso.setIdPeriodo(rs.getInt("idPeriodo"));
                Egreso.setEncargado_DNI(rs.getString("Encargado_DNI"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al buscar egreso: " + e.getMessage());
        } finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }

    public static boolean agregarEgreso(egreso egreso) {
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "INSERT INTO egresos (tipo_egreso, tipo, modo_pago, A_nombre, dia_egreso, mes_egreso, ano_egreso, monto, idPeriodo, Encargado_DNI) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, egreso.getTipo_egreso());
            ps.setString(2, egreso.getTipo());
            ps.setString(3, egreso.getModo_pago());
            ps.setString(4, egreso.getA_nombre());
            ps.setInt(5, egreso.getDia_egreso());
            ps.setInt(6, egreso.getMes_egreso());
            ps.setInt(7, egreso.getAno_egreso());
            ps.setFloat(8, egreso.getMonto());
            ps.setInt(9, egreso.getIdPeriodo());
            ps.setString(10, egreso.getEncargado_DNI());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar el egreso: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }

    public static boolean modificarEgreso(egreso egreso) {
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "UPDATE egresos SET tipo_egreso=?, tipo=?, modo_pago=?, A_nombre=?, dia_egreso=?, mes_egreso=?, ano_egreso=?, monto=?, idPeriodo=?, Encargado_DNI=? "
                   + " WHERE id_egreso = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, egreso.getTipo_egreso());
            ps.setString(2, egreso.getTipo());
            ps.setString(3, egreso.getModo_pago());
            ps.setString(4, egreso.getA_nombre());
            ps.setInt(5, egreso.getDia_egreso());
            ps.setInt(6, egreso.getMes_egreso());
            ps.setInt(7, egreso.getAno_egreso());
            ps.setFloat(8, egreso.getMonto());
            ps.setInt(9, egreso.getIdPeriodo());
            ps.setString(10, egreso.getEncargado_DNI());
            ps.setInt(11, egreso.getId_egreso());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar el egreso: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }

    public static boolean eliminarEgreso(egreso egreso) {
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "DELETE FROM egresos WHERE id_egreso=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, egreso.getId_egreso());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar el egreso: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }
    
    public static boolean existeEncargadoDNI(String dni) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        var sql = "SELECT 1 FROM egresos WHERE encargado_DNI = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el DNI del encargado: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }
    
        public static float calcularEgresoTotal(int idPeriodo, int mesEgreso) {
            float totalEgreso = 0.0f;

            String sql = "SELECT SUM(monto) AS total FROM egresos WHERE idPeriodo = ? AND mes_egreso = ?";

            try (Connection con = conexion.getConexion();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, idPeriodo); // Filtro por periodo
                ps.setInt(2, mesEgreso); // Filtro por mes

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    totalEgreso = rs.getFloat("total"); // Obtiene el total de la columna "total"
                }

            } catch (SQLException e) {
                System.out.println("Error al calcular el egreso total: " + e.getMessage());
            }

            return totalEgreso;
        }
        
        public static boolean existeEgresoAguaPorMesYPeriodo(int mes, int idPeriodo) {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = conexion.getConexion();
            // Usar TRIM en la consulta
            String sql = "SELECT 1 FROM egresos WHERE tipo = ? AND mes_egreso = ? AND idPeriodo = ? LIMIT 1";

            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, " Agua"); // Tipo sin espacios
                ps.setInt(2, mes);
                ps.setInt(3, idPeriodo);
                rs = ps.executeQuery();

                if (rs.next()) {
                    return true; // Existe al menos un registro
                }
            } catch (SQLException e) {
                System.out.println("Error al verificar si existe un egreso del tipo 'Agua' para el mes " + mes + " y periodo " + idPeriodo + ": " + e.getMessage());
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (ps != null) ps.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }

            return false; // No existe o ocurrió un error
        }



        
        public static egreso obtenerEgresoAguaPorMesYPeriodo(int mes, int idPeriodo) {
            egreso egresoExistente = null;
            Connection con = conexion.getConexion();

            // Usar TRIM en la consulta
            String sql = "SELECT * FROM egresos WHERE tipo = ? AND mes_egreso = ? AND idPeriodo = ? LIMIT 1";

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, " Agua"); // Tipo sin espacios
                ps.setInt(2, mes);
                ps.setInt(3, idPeriodo);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        egresoExistente = new egreso();
                        egresoExistente.setId_egreso(rs.getInt("id_egreso"));
                        egresoExistente.setTipo_egreso(rs.getString("tipo_egreso"));
                        egresoExistente.setTipo(rs.getString("tipo"));
                        egresoExistente.setModo_pago(rs.getString("modo_pago"));
                        egresoExistente.setA_nombre(rs.getString("a_nombre"));
                        egresoExistente.setDia_egreso(rs.getInt("dia_egreso"));
                        egresoExistente.setMes_egreso(rs.getInt("mes_egreso"));
                        egresoExistente.setAno_egreso(rs.getInt("ano_egreso"));
                        egresoExistente.setMonto(rs.getFloat("monto"));
                        egresoExistente.setIdPeriodo(rs.getInt("idPeriodo"));
                        egresoExistente.setEncargado_DNI(rs.getString("Encargado_DNI"));
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error al obtener el egreso de 'Agua' para el mes " + mes + " y periodo " + idPeriodo + ": " + e.getMessage());
            }

            return egresoExistente;
        }


    }

    
