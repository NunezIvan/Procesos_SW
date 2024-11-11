
package com.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.conexion.conexion;
import com.dominio.Periodo;
import java.time.LocalDate;

public class Periodos {
    
    
    public static void agregarPeriodo(Periodo periodo) {
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "INSERT INTO periodo(año_periodo, fecha_apertura, disponible, Encargado_DNI) VALUES(?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, periodo.getAñoPeriodo());
            ps.setDate(2, periodo.getFechaApertura());
            ps.setBoolean(3, periodo.isDisponible());
            ps.setString(4, periodo.getEncargadoDNI());
            ps.execute();
            System.out.println("Periodo agregado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al agregar periodo: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
    public static Periodo obtenerPeriodoPorId(Periodo periodo) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM periodo WHERE idPeriodo = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, periodo.getIdPeriodo());
            rs = ps.executeQuery();

            if (rs.next()) {
                periodo = new Periodo();
                periodo.setIdPeriodo(rs.getInt("idPeriodo"));
                periodo.setAñoPeriodo(rs.getString("año_periodo"));
                periodo.setFechaApertura(rs.getDate("fecha_apertura"));
                periodo.setDisponible(rs.getBoolean("disponible"));
                periodo.setEncargadoDNI(rs.getString("Encargado_DNI"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener periodo: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return periodo;
    }
    
    public static void actualizarPeriodo() {
    Connection con = conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    
    int añoActual = LocalDate.now().getYear(); // Obtiene el año actual
    String selectSql = "SELECT idPeriodo, año_periodo FROM periodo";
    String updateSql = "UPDATE periodo SET disponible = ? WHERE idPeriodo = ?";

    try {
        // Primero, obtenemos todos los registros de la tabla periodo
        ps = con.prepareStatement(selectSql);
        rs = ps.executeQuery();

        while (rs.next()) {
            int idPeriodo = rs.getInt("idPeriodo");
            String añoPeriodo = rs.getString("año_periodo");
            
            // Compara el año del periodo con el año actual
            boolean disponible = añoPeriodo.equals(String.valueOf(añoActual));

            try ( // Actualiza el campo disponible de acuerdo a la comparación
                    PreparedStatement updatePs = con.prepareStatement(updateSql)) {
                updatePs.setBoolean(1, disponible);
                updatePs.setInt(2, idPeriodo);
                updatePs.executeUpdate();
            }
        }
        
        System.out.println("Actualización de disponibilidad de periodos completada.");
    } catch (SQLException e) {
        System.out.println("Error al actualizar periodos: " + e.getMessage());
    } finally {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}

    
    public static void eliminarPeriodo(int idPeriodo) {
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "DELETE FROM periodo WHERE idPeriodo = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPeriodo);
            ps.execute();
            System.out.println("Periodo eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar periodo: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
}
