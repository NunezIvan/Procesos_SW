package com.datos;

import com.conexion.conexion;
import com.dominio.Ingreso;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Ingresos {
    
    public static boolean crearIngreso(Ingreso ingreso) {
        String sql = "INSERT INTO cuotas (tipo_pago, dia_ingreso, mes_ingreso, ano_ingreso, apartamento, monto, pagado, idPeriodo, Encargado_DNI) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, ingreso.getTipoPago());
            ps.setInt(2, ingreso.getDiaIngreso());
            ps.setInt(3, ingreso.getMesIngreso());
            ps.setInt(4, ingreso.getAnoIngreso());
            ps.setString(5, ingreso.getApartamento());
            ps.setFloat(6, ingreso.getMonto());
            ps.setBoolean(7, ingreso.isPagado());
            ps.setInt(8, ingreso.getIdPeriodo());
            ps.setString(9, ingreso.getEncargadoDNI());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al crear el ingreso: " + e.getMessage());
            return false;
        }
    }
    
    public static boolean eliminarIngresoPorApartamentoYPeriodo(String apartamento, int idPeriodo, int mesIngreso) {
        PreparedStatement ps = null;
        Connection con = conexion.getConexion();
        String sql = "DELETE FROM cuotas WHERE apartamento = ? AND idPeriodo = ? AND mes_ingreso = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, apartamento); // Apartamento especificado
            ps.setInt(2, idPeriodo);      // ID del periodo especificado
            ps.setInt(3, mesIngreso);     // Mes del ingreso especificado

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Se eliminaron " + rowsAffected + " cuotas para el apartamento: " + apartamento);
                return true;
            } else {
                System.out.println("No se encontraron cuotas para el apartamento: " + apartamento);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar las cuotas para el apartamento: " + apartamento + " - " + e.getMessage());
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }
    
    // Crear un nuevo ingreso
    public static Ingreso buscarIngresoPorId(int idIngreso) {
        String sql = "SELECT * FROM cuotas WHERE id_ingreso = ?";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idIngreso);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Ingreso(
                            rs.getInt("id_ingreso"),
                            rs.getString("tipo_pago"),
                            rs.getInt("dia_ingreso"),
                            rs.getInt("mes_ingreso"),
                            rs.getInt("ano_ingreso"),
                            rs.getString("apartamento"),
                            rs.getFloat("monto"),
                            rs.getBoolean("pagado"),
                            rs.getInt("idPeriodo"),
                            rs.getString("Encargado_DNI")
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el ingreso por ID: " + e.getMessage());
        }
        return null;
    }
    
    public static List<Ingreso> obtenerIngresosPagadosPorPeriodoYMes_1(int idPeriodo, int mesIngreso) {
        List<Ingreso> ingresos = new ArrayList<>();
        String sql = "SELECT * FROM cuotas WHERE idPeriodo = ? AND mes_ingreso = ? AND pagado = true";

        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPeriodo);
            ps.setInt(2, mesIngreso);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Ingreso ingreso = new Ingreso(
                            rs.getInt("id_ingreso"),
                            rs.getString("tipo_pago"),
                            rs.getInt("dia_ingreso"),
                            rs.getInt("mes_ingreso"),
                            rs.getInt("ano_ingreso"),
                            rs.getString("apartamento"),
                            rs.getFloat("monto"),
                            rs.getBoolean("pagado"),
                            rs.getInt("idPeriodo"),
                            rs.getString("Encargado_DNI")
                    );
                    ingresos.add(ingreso);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener ingresos pagados por periodo y mes: " + e.getMessage());
        }

        return ingresos;
    }

    public static List<Ingreso> obtenerIngresosPorPeriodoYMes(int idPeriodo, int mesIngreso) {
        List<Ingreso> ingresos = new ArrayList<>();
        String sql = "SELECT * FROM cuotas WHERE idPeriodo = ? AND mes_ingreso = ?";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPeriodo);
            ps.setInt(2, mesIngreso);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Ingreso ingreso = new Ingreso(
                        rs.getInt("id_ingreso"),
                        rs.getString("tipo_pago"),
                        rs.getInt("dia_ingreso"),
                        rs.getInt("mes_ingreso"),
                        rs.getInt("ano_ingreso"),
                        rs.getString("apartamento"),
                        rs.getFloat("monto"),
                        rs.getBoolean("pagado"),
                        rs.getInt("idPeriodo"),
                        rs.getString("Encargado_DNI")
                    );
                    ingresos.add(ingreso);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener ingresos por periodo y mes: " + e.getMessage());
        }
        return ingresos;
    }

    
    public static boolean actualizarIngreso(Ingreso ingreso) {
        String sql = "UPDATE cuotas SET tipo_pago = ?, dia_ingreso = ?, mes_ingreso = ?, ano_ingreso = ?, apartamento = ?, monto = ?, pagado = ?, idPeriodo = ?, Encargado_DNI = ? " +
                     "WHERE id_ingreso = ?";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, ingreso.getTipoPago());
            ps.setInt(2, ingreso.getDiaIngreso());
            ps.setInt(3, ingreso.getMesIngreso());
            ps.setInt(4, ingreso.getAnoIngreso());
            ps.setString(5, ingreso.getApartamento());
            ps.setFloat(6, ingreso.getMonto());
            ps.setBoolean(7, ingreso.isPagado());
            ps.setInt(8, ingreso.getIdPeriodo());
            ps.setString(9, ingreso.getEncargadoDNI());
            ps.setInt(10, ingreso.getIdIngreso());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar el ingreso: " + e.getMessage());
            return false;
        }
    }

    public static boolean eliminarIngreso(int idIngreso) {
        String sql = "DELETE FROM cuotas WHERE id_ingreso = ?";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idIngreso);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar el ingreso: " + e.getMessage());
            return false;
        }
    }
    
    public static Ingreso obtenerIngresoPorFiltros(int idPeriodo, String encargadoDNI, int mesIngreso, String apartamento) {
        Ingreso ingreso = null;
        String sql = "SELECT * FROM cuotas WHERE idPeriodo = ? AND Encargado_DNI = ? AND mes_ingreso = ? AND apartamento = ?";

        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPeriodo);
            ps.setString(2, encargadoDNI);
            ps.setInt(3, mesIngreso);
            ps.setString(4, apartamento);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    ingreso = new Ingreso(
                        rs.getInt("id_ingreso"),
                        rs.getString("tipo_pago"),
                        rs.getInt("dia_ingreso"),
                        rs.getInt("mes_ingreso"),
                        rs.getInt("ano_ingreso"),
                        rs.getString("apartamento"),
                        rs.getFloat("monto"),
                        rs.getBoolean("pagado"),
                        rs.getInt("idPeriodo"),
                        rs.getString("Encargado_DNI")
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener ingreso por filtros: " + e.getMessage());
        }

        return ingreso;
    }
    
    public static boolean verificarIngresoPagado(int idPeriodo, String encargadoDNI, int mesIngreso, String apartamento) {
        boolean yaPagado = false;

        String sql = "SELECT pagado FROM cuotas WHERE idPeriodo = ? AND Encargado_DNI = ? AND mes_ingreso = ? AND apartamento = ?";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPeriodo);
            ps.setString(2, encargadoDNI);
            ps.setInt(3, mesIngreso);
            ps.setString(4, apartamento);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    yaPagado = rs.getBoolean("pagado");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar si el ingreso ya está pagado: " + e.getMessage());
        }

        return yaPagado;
    }
    
    
    
}
