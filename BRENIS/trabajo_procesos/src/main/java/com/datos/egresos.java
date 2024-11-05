/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public static List<egreso> listarEgresos(){
        List<egreso> egresos = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        var sql = "SELECT * FROM egresos ORDER BY id_egreso";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var egreso = new egreso();
                egreso.setId_egreso(rs.getInt("id_egreso"));
                egreso.setTipo_egreso(rs.getString("tipo_egreso"));
                egreso.setTipo_pago(rs.getString("tipo_pago"));
                egreso.setA_nombre(rs.getString("A_nombre"));
                egreso.setDia_egreso(rs.getInt("dia_egreso"));
                egreso.setMes_egreso(rs.getInt("mes_egreso"));
                egreso.setYear_egreso(rs.getInt("ano_egreso"));
                egreso.setDescripcion(rs.getString("descripción"));
                egreso.setMonto(rs.getFloat("monto"));
                egreso.setEncargado_DNI(rs.getString("encargado_DNI"));
                egresos.add(egreso);
            }
        } catch(SQLException e){
            System.out.println("Error al listar egresos: " + e.getMessage());
        } finally{
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
            ps.setInt(1,Egreso.getId_egreso());
            rs = ps.executeQuery();
            if(rs.next()){
                Egreso.setTipo_egreso(rs.getString("tipo_egreso"));
                Egreso.setTipo_pago(rs.getString("tipo_pago"));
                Egreso.setA_nombre(rs.getString("A_nombre"));
                Egreso.setDia_egreso(rs.getInt("dia_egreso"));
                Egreso.setMes_egreso(rs.getInt("mes_egreso"));
                Egreso.setYear_egreso(rs.getInt("ano_egreso"));
                Egreso.setDescripcion(rs.getString("descripción"));
                Egreso.setMonto(rs.getFloat("monto"));
                Egreso.setEncargado_DNI(rs.getString("encargado_DNI"));

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
        String sql = "INSERT INTO egresos (tipo_egreso, tipo_pago, A_nombre, dia_egreso, mes_egreso, ano_egreso, descripción, monto, encargado_DNI) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, egreso.getTipo_egreso());
            ps.setString(2, egreso.getTipo_pago());
            ps.setString(3, egreso.getA_nombre());
            ps.setInt(4, egreso.getDia_egreso());
            ps.setInt(5, egreso.getMes_egreso());
            ps.setInt(6, egreso.getYear_egreso());
            ps.setString(7, egreso.getDescripcion());
            ps.setFloat(8, egreso.getMonto());
            ps.setString(9, egreso.getEncargado_DNI());
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
        String sql = "UPDATE egresos SET tipo_egreso=?, tipo_pago=?, A_nombre=?, dia_egreso=?, mes_egreso=?, ano_egreso=?, descripción=?, monto=?, encargado_DNI=? "
                   + " WHERE id_egreso = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, egreso.getTipo_egreso());
            ps.setString(2, egreso.getTipo_pago());
            ps.setString(3, egreso.getA_nombre());
            ps.setInt(4, egreso.getDia_egreso());
            ps.setInt(5, egreso.getMes_egreso());
            ps.setInt(6, egreso.getYear_egreso());
            ps.setString(7, egreso.getDescripcion());
            ps.setFloat(8, egreso.getMonto());
            ps.setString(9, egreso.getEncargado_DNI());
            ps.setInt(10, egreso.getId_egreso());
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
}

