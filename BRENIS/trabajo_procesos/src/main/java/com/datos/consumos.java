package com.datos;

import com.conexion.conexion;
import com.dominio.consumo_agua;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class consumos {

    public static boolean agregarConsumo(consumo_agua consumo) {
        String sql = "INSERT INTO consumo_agua (tipo_consumo, mes_consumo, lectura_anterior, lectura_actual, cargo_fijo, mora, igv_consumo, pagoConsumo, pagoDesague, monto_Total, apartamento, idPeriodo, Encargado_DNI) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, consumo.getTipoConsumo());
            ps.setInt(2, consumo.getMesConsumo());
            ps.setInt(3, consumo.getLecturaAnterior());
            ps.setInt(4, consumo.getLecturaActual());
            ps.setFloat(5, consumo.getCargoFijo());
            ps.setString(6, consumo.getMora());
            ps.setFloat(7, consumo.getIgvConsumo());
            ps.setFloat(8, consumo.getPagoConsumo());
            ps.setFloat(9, consumo.getPagoDesague());
            ps.setFloat(10, consumo.getMontoTotal());
            ps.setString(11, consumo.getApartamento());
            ps.setInt(12, consumo.getIdPeriodo());
            ps.setString(13, consumo.getEncargadoDNI());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar consumo: " + e.getMessage());
        }
        return false;
    }

    public static boolean actualizarConsumo(consumo_agua consumo) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = conexion.getConexion();
            String sql = "UPDATE consumo_agua SET lectura_anterior = ?, lectura_actual = ?, cargo_fijo = ?, mora = ?, igv_consumo = ?, pagoConsumo = ?, pagoDesague = ?, monto_Total = ? WHERE id_consumo_agua = ?";
            ps = con.prepareStatement(sql);

            ps.setInt(1, consumo.getLecturaAnterior());
            ps.setInt(2, consumo.getLecturaActual());
            ps.setFloat(3, consumo.getCargoFijo());
            ps.setString(4, consumo.getMora());
            ps.setFloat(5, consumo.getIgvConsumo());
            ps.setFloat(6, consumo.getPagoConsumo());
            ps.setFloat(7, consumo.getPagoDesague());
            ps.setFloat(8, consumo.getMontoTotal());
            ps.setInt(9, consumo.getIdConsumoAgua());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al actualizar el consumo: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }



    public static boolean eliminarConsumo(int idConsumoAgua) {
        String sql = "DELETE FROM consumo_agua WHERE id_consumo_agua = ?";
        try (Connection con = conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idConsumoAgua);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar consumo: " + e.getMessage());
        }
        return false;
    }

    public static consumo_agua buscarConsumoPorID(int idConsumoAgua) {
        String sql = "SELECT * FROM consumo_agua WHERE id_consumo_agua = ?";
        try (Connection con = conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idConsumoAgua);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new consumo_agua(
                    rs.getString("tipo_consumo"),
                    rs.getInt("mes_consumo"),
                    rs.getInt("lectura_anterior"),
                    rs.getInt("lectura_actual"),
                    rs.getFloat("cargo_fijo"),
                    rs.getString("mora"),
                    rs.getFloat("igv_consumo"),
                    rs.getFloat("pagoConsumo"),
                    rs.getFloat("pagoDesague"),
                    rs.getFloat("monto_Total"),
                    rs.getString("apartamento"),
                    rs.getInt("idPeriodo"),
                    rs.getString("Encargado_DNI")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar consumo: " + e.getMessage());
        }
        return null;
    }

    public static List<consumo_agua> listarConsumos() {
        List<consumo_agua> consumos = new ArrayList<>();
        String sql = "SELECT * FROM consumo_agua";
        try (Connection con = conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                consumos.add(new consumo_agua(
                    rs.getString("tipo_consumo"),
                    rs.getInt("mes_consumo"),
                    rs.getInt("lectura_anterior"),
                    rs.getInt("lectura_actual"),
                    rs.getFloat("cargo_fijo"),
                    rs.getString("mora"),
                    rs.getFloat("igv_consumo"),
                    rs.getFloat("pagoConsumo"),
                    rs.getFloat("pagoDesague"),
                    rs.getFloat("monto_Total"),
                    rs.getString("apartamento"),
                    rs.getInt("idPeriodo"),
                    rs.getString("Encargado_DNI")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar consumos: " + e.getMessage());
        }
        return consumos;
    }
    
    public static consumo_agua obtenerConsumoPorPeriodoYMes(int idPeriodo, int mes) {
        String sql = "SELECT * FROM consumo_agua WHERE idPeriodo = ? AND mes_consumo = ?";

        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPeriodo);
            ps.setInt(2, mes);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                consumo_agua consumoExistente = new consumo_agua();

                // Asignar valores utilizando setters
                consumoExistente.setIdConsumoAgua(rs.getInt("id_consumo_agua"));
                consumoExistente.setTipoConsumo(rs.getString("tipo_consumo"));
                consumoExistente.setMesConsumo(rs.getInt("mes_consumo"));
                consumoExistente.setLecturaAnterior(rs.getInt("lectura_anterior"));
                consumoExistente.setLecturaActual(rs.getInt("lectura_actual"));
                consumoExistente.setCargoFijo(rs.getFloat("cargo_fijo"));
                consumoExistente.setMora(rs.getString("mora"));
                consumoExistente.setIgvConsumo(rs.getFloat("igv_consumo"));
                consumoExistente.setPagoConsumo(rs.getFloat("pagoConsumo"));
                consumoExistente.setPagoDesague(rs.getFloat("pagoDesague"));
                consumoExistente.setMontoTotal(rs.getFloat("monto_Total"));
                consumoExistente.setApartamento(rs.getString("apartamento"));
                consumoExistente.setIdPeriodo(rs.getInt("idPeriodo"));
                consumoExistente.setEncargadoDNI(rs.getString("Encargado_DNI"));

                // Devolver el objeto con los datos asignados
                return consumoExistente;
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener consumo de agua para el mes " + mes + ": " + e.getMessage());
        }

        return null;  // Si no se encuentra un consumo, devuelve null
    }

    
    public static boolean existeConsumoAguaPorMesYPeriodo(int mes, int idPeriodo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getConexion();
        String sql = "SELECT 1 FROM consumo_agua WHERE mes_consumo = ? AND idPeriodo = ? LIMIT 1";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mes); // Filtra por el mes
            ps.setInt(2, idPeriodo); // Filtra por el período
            rs = ps.executeQuery();

            if (rs.next()) {
                return true; // Existe al menos un consumo para el mes y período
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar si existe un consumo de agua para el mes " + mes + " y período " + idPeriodo + ": " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return false; // No existe consumo o ocurrió un error
    }
    
    public static consumo_agua obtenerConsumoExteriorPorMesYPeriodo(int mes, int idPeriodo) {
        consumo_agua consumoExistente = null;
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM consumo_agua WHERE mes_consumo = ? AND idPeriodo = ? AND tipo_consumo = ? AND apartamento = ? LIMIT 1";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, mes);
            ps.setInt(2, idPeriodo);
            ps.setString(3, "Exterior");
            ps.setString(4, "Exterior");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                consumoExistente = new consumo_agua();
                consumoExistente.setIdConsumoAgua(rs.getInt("id_consumo_agua"));
                consumoExistente.setTipoConsumo(rs.getString("tipo_consumo"));
                consumoExistente.setMesConsumo(rs.getInt("mes_consumo"));
                consumoExistente.setLecturaAnterior(rs.getInt("lectura_anterior"));
                consumoExistente.setLecturaActual(rs.getInt("lectura_actual"));
                consumoExistente.setCargoFijo(rs.getFloat("cargo_fijo"));
                consumoExistente.setMora(rs.getString("mora"));
                consumoExistente.setIgvConsumo(rs.getFloat("igv_consumo"));
                consumoExistente.setPagoConsumo(rs.getFloat("pagoConsumo"));
                consumoExistente.setPagoDesague(rs.getFloat("pagoDesague"));
                consumoExistente.setMontoTotal(rs.getFloat("monto_Total"));
                consumoExistente.setApartamento(rs.getString("apartamento"));
                consumoExistente.setIdPeriodo(rs.getInt("idPeriodo"));
                consumoExistente.setEncargadoDNI(rs.getString("Encargado_DNI"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el consumo de agua 'Exterior' para el mes y el periodo: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return consumoExistente;
    }
    
    
    public static consumo_agua obtenerConsumoPorPeriodoMesApartamento(int idPeriodo, int mes, String apartamento) {
        consumo_agua consumoExistente = null;
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM consumo_agua WHERE idPeriodo = ? AND mes_consumo = ? AND apartamento = ? LIMIT 1";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPeriodo);
            ps.setInt(2, mes);
            ps.setString(3, apartamento);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                consumoExistente = new consumo_agua();
                consumoExistente.setIdConsumoAgua(rs.getInt("id_consumo_agua"));
                consumoExistente.setTipoConsumo(rs.getString("tipo_consumo"));
                consumoExistente.setMesConsumo(rs.getInt("mes_consumo"));
                consumoExistente.setLecturaAnterior(rs.getInt("lectura_anterior"));
                consumoExistente.setLecturaActual(rs.getInt("lectura_actual"));
                consumoExistente.setCargoFijo(rs.getFloat("cargo_fijo"));
                consumoExistente.setMora(rs.getString("mora"));
                consumoExistente.setIgvConsumo(rs.getFloat("igv_consumo"));
                consumoExistente.setPagoConsumo(rs.getFloat("pagoConsumo"));
                consumoExistente.setPagoDesague(rs.getFloat("pagoDesague"));
                consumoExistente.setMontoTotal(rs.getFloat("monto_Total"));
                consumoExistente.setApartamento(rs.getString("apartamento"));
                consumoExistente.setIdPeriodo(rs.getInt("idPeriodo"));
                consumoExistente.setEncargadoDNI(rs.getString("Encargado_DNI"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el consumo: " + e.getMessage());
        }

        return consumoExistente;
    }
    
    public static boolean actualizarConsumoAACC(int idPeriodo, int mes, float totalConsumo, float totalDesague, float totalIGV, float totalConsumoAgua) {
        String sql = "UPDATE consumo_agua SET pagoConsumo = ?, pagoDesague = ?, igv_consumo = ?, monto_Total = ? WHERE idPeriodo = ? AND mes_consumo = ? AND tipo_consumo = 'AACC'";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setFloat(1, totalConsumo);
            ps.setFloat(2, totalDesague);
            ps.setFloat(3, totalIGV);
            ps.setFloat(4, totalConsumoAgua);
            ps.setInt(5, idPeriodo);
            ps.setInt(6, mes);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0; // Retorna true si se actualizó correctamente
        } catch (SQLException e) {
            System.out.println("Error al actualizar el registro de AACC: " + e.getMessage());
            return false;
        }
    }
    
    public static List<consumo_agua> listarConsumosPorOrden(int idPeriodo, int mes) {
        List<consumo_agua> listaConsumos = new ArrayList<>();
        String sqlExterior = "SELECT * FROM consumo_agua WHERE idPeriodo = ? AND mes_consumo = ? AND tipo_consumo = 'Exterior'";
        String sqlAACC = "SELECT * FROM consumo_agua WHERE idPeriodo = ? AND mes_consumo = ? AND tipo_consumo = 'AACC'";
        String sqlApartamentos = "SELECT * FROM consumo_agua WHERE idPeriodo = ? AND mes_consumo = ? AND tipo_consumo LIKE '%Apartamento%' ORDER BY apartamento";

        try (Connection con = conexion.getConexion()) {
            // Primero obtenemos el consumo tipo "Exterior"
            try (PreparedStatement ps = con.prepareStatement(sqlExterior)) {
                ps.setInt(1, idPeriodo);
                ps.setInt(2, mes);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    consumo_agua consumo = new consumo_agua();
                    consumo.setIdConsumoAgua(rs.getInt("id_consumo_agua"));
                    consumo.setTipoConsumo(rs.getString("tipo_consumo"));
                    consumo.setMesConsumo(rs.getInt("mes_consumo"));
                    consumo.setLecturaAnterior(rs.getInt("lectura_anterior"));
                    consumo.setLecturaActual(rs.getInt("lectura_actual"));
                    consumo.setCargoFijo(rs.getFloat("cargo_fijo"));
                    consumo.setMora(rs.getString("mora"));
                    consumo.setIgvConsumo(rs.getFloat("igv_consumo"));
                    consumo.setPagoConsumo(rs.getFloat("pagoConsumo"));
                    consumo.setPagoDesague(rs.getFloat("pagoDesague"));
                    consumo.setMontoTotal(rs.getFloat("monto_Total"));
                    consumo.setApartamento(rs.getString("apartamento"));
                    consumo.setIdPeriodo(rs.getInt("idPeriodo"));
                    consumo.setEncargadoDNI(rs.getString("Encargado_DNI"));
                    listaConsumos.add(consumo);
                }
            }

            // Luego obtenemos el consumo tipo "AACC"
            try (PreparedStatement ps = con.prepareStatement(sqlAACC)) {
                ps.setInt(1, idPeriodo);
                ps.setInt(2, mes);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    consumo_agua consumo = new consumo_agua();
                    consumo.setIdConsumoAgua(rs.getInt("id_consumo_agua"));
                    consumo.setTipoConsumo(rs.getString("tipo_consumo"));
                    consumo.setMesConsumo(rs.getInt("mes_consumo"));
                    consumo.setLecturaAnterior(rs.getInt("lectura_anterior"));
                    consumo.setLecturaActual(rs.getInt("lectura_actual"));
                    consumo.setCargoFijo(rs.getFloat("cargo_fijo"));
                    consumo.setMora(rs.getString("mora"));
                    consumo.setIgvConsumo(rs.getFloat("igv_consumo"));
                    consumo.setPagoConsumo(rs.getFloat("pagoConsumo"));
                    consumo.setPagoDesague(rs.getFloat("pagoDesague"));
                    consumo.setMontoTotal(rs.getFloat("monto_Total"));
                    consumo.setApartamento(rs.getString("apartamento"));
                    consumo.setIdPeriodo(rs.getInt("idPeriodo"));
                    consumo.setEncargadoDNI(rs.getString("Encargado_DNI"));
                    listaConsumos.add(consumo);
                }
            }

            // Finalmente obtenemos los consumos de los apartamentos en orden
            try (PreparedStatement ps = con.prepareStatement(sqlApartamentos)) {
                ps.setInt(1, idPeriodo);
                ps.setInt(2, mes);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    consumo_agua consumo = new consumo_agua();
                    consumo.setIdConsumoAgua(rs.getInt("id_consumo_agua"));
                    consumo.setTipoConsumo(rs.getString("tipo_consumo"));
                    consumo.setMesConsumo(rs.getInt("mes_consumo"));
                    consumo.setLecturaAnterior(rs.getInt("lectura_anterior"));
                    consumo.setLecturaActual(rs.getInt("lectura_actual"));
                    consumo.setCargoFijo(rs.getFloat("cargo_fijo"));
                    consumo.setMora(rs.getString("mora"));
                    consumo.setIgvConsumo(rs.getFloat("igv_consumo"));
                    consumo.setPagoConsumo(rs.getFloat("pagoConsumo"));
                    consumo.setPagoDesague(rs.getFloat("pagoDesague"));
                    consumo.setMontoTotal(rs.getFloat("monto_Total"));
                    consumo.setApartamento(rs.getString("apartamento"));
                    consumo.setIdPeriodo(rs.getInt("idPeriodo"));
                    consumo.setEncargadoDNI(rs.getString("Encargado_DNI"));
                    listaConsumos.add(consumo);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los consumos: " + e.getMessage());
        }

        return listaConsumos;
    }
    
        public static boolean existeConsumoAguaPorDepartamento(String apartamento, int idPeriodo, int mesConsumo) {
        Connection con = conexion.getConexion();
        String sql = "SELECT 1 FROM consumo_agua WHERE apartamento = ? AND idPeriodo = ? AND mes_consumo = ? LIMIT 1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, apartamento.trim()); // Asegúrate de eliminar espacios innecesarios
            ps.setInt(2, idPeriodo);
            ps.setInt(3, mesConsumo);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return true; // Se encontró el consumo
                }
            }
        } catch (SQLException e) {
            System.out.println("Error verificando consumo de agua para " + apartamento + ": " + e.getMessage());
        }
        return false; // No se encontró el consumo
        }
        
    public static float obtenerConsumoAguaPorDepartamento(String apartamento, int idPeriodo, int mesConsumo) {
        Connection con = conexion.getConexion();
        String sql = "SELECT monto_total FROM consumo_agua WHERE apartamento = ? AND idPeriodo = ? AND mes_consumo = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, apartamento);
            ps.setInt(2, idPeriodo);
            ps.setInt(3, mesConsumo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getFloat("monto_total"); // Retorna el monto total del consumo de agua
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el consumo de agua por departamento: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return 0.0f; // Retorna 0 si no se encuentra registro o ocurre un error
    }
    
    public static consumo_agua obtenerConsumoAACC(int idPeriodo, int mes) {
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM consumo_agua WHERE tipo_consumo = ? AND idPeriodo = ? AND mes_consumo = ? LIMIT 1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "AACC");
            ps.setInt(2, idPeriodo);
            ps.setInt(3, mes);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new consumo_agua(
                            rs.getString("tipo_consumo"),
                            rs.getInt("mes_consumo"),
                            rs.getInt("lectura_anterior"),
                            rs.getInt("lectura_actual"),
                            rs.getFloat("cargo_fijo"),
                            rs.getString("mora"),
                            rs.getFloat("igv_consumo"),
                            rs.getFloat("pagoConsumo"),
                            rs.getFloat("pagoDesague"),
                            rs.getFloat("monto_Total"),
                            rs.getString("apartamento"),
                            rs.getInt("idPeriodo"),
                            rs.getString("Encargado_DNI")
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el consumo de AACC: " + e.getMessage());
        }
        return null; // No se encontró el AACC
    }

    
}
