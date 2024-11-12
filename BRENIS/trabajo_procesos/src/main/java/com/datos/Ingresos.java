/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

import com.dominio.Ingreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.conexion.conexion;
import java.sql.SQLException;
import com.dominio.Apartamento;
public class Ingresos {
    
    public static float CalcularMonto(){
        float montoTotal = 0;
        float montoMensual = 0;
        int Total_Apartamentos = 0;
        Apartamentos apartamentos = null;
        List<Apartamento> apartamentosLlenos = null;
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT SUM(monto) FROM egresos";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                montoTotal += rs.getFloat("monto");
                apartamentos.crearLista();
                apartamentosLlenos = apartamentos.NroEdificiosLlenos();
                Total_Apartamentos = apartamentosLlenos.size();

                montoMensual = montoTotal/Total_Apartamentos;
                return montoMensual; 
            }
            return montoMensual;
        } catch (Exception e) {
            System.out.println("Error al calcular el monto: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al establecer la conexion: " +e.getMessage());
            }
        }
        return montoMensual;
    }
    public static List<Ingreso> ListaIngresos(){
        List<Ingreso> ingresos = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        var sql = "SELECT * FROM cuotas ORDER BY id_ingreso";
        try {
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var ingreso = new Ingreso();
                ingreso.setId_ingreso(rs.getInt("id_ingreso"));
                ingreso.setTipo_pago(rs.getString("tipo_pago"));
                ingreso.setDia_ingreso(rs.getInt("dia_ingreso"));
                ingreso.setMes_ingreso(rs.getInt("mes_ingreso"));
                ingreso.setA_ingreso(rs.getInt("ano_ingreso"));
                ingreso.setDpto(rs.getString("apartamento"));
                ingreso.setMonto(rs.getInt("monto"));
                ingreso.setPagado(rs.getBoolean("pagado"));
                ingreso.setDNI_encargado(rs.getString("encargado_DNI"));
                ingresos.add(ingreso);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar ingreso: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al establecer la conexion: " + e.getMessage());
            }
        }
        return ingresos;
    }
    
    public static boolean buscarIngreso_ID(Ingreso ingreso){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        var sql = "SELECT * FROM cuotas WHERE id_ingreso = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ingreso.getId_ingreso());
            rs = ps.executeQuery();
            if(rs.next()){
                ingreso.setTipo_pago(rs.getString("tipo_pago"));
                ingreso.setDia_ingreso(rs.getInt("dia_ingreso"));
                ingreso.setMes_ingreso(rs.getInt("mes_ingreso"));
                ingreso.setA_ingreso(rs.getInt("ano_ingreso"));
                ingreso.setDpto(rs.getString("apartamento"));
                ingreso.setMonto(rs.getInt("monto"));
                ingreso.setPagado(rs.getBoolean("pagado"));
                ingreso.setDNI_encargado(rs.getString("encargado_DNI"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el ingreso: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public static boolean agregarIngreso(Ingreso ingreso){
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "INSERT INTO cuotas (tipo_pago, dia_ingreso, mes_ingreso, ano_ingreso, apartamento, monto, pagado, encargado_DNI) "
                        + " VALUES(?, ?, ?, ?, ?, ?, ? ) ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ingreso.getTipo_pago());
            ps.setInt(2, ingreso.getDia_ingreso());
            ps.setInt(3, ingreso.getMes_ingreso());
            ps.setInt(4, ingreso.getA_ingreso());
            ps.setString(5, ingreso.getDpto());
            ps.setFloat(6, ingreso.getMonto());
            ps.setBoolean(7, ingreso.isPagado());
            ps.setString(8, ingreso.getDNI_encargado());
            ps.execute();
            return true;
            
        } catch (Exception e) {
            System.out.println("Error al agregar Ingreso: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al establecer la conexion: " + e.getMessage());
            }
        }
        return false;
    }
    
    public static boolean ModificarIngreso(Ingreso ingreso){
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "UPDATE cuotas SET tipo_pago=?, dia_ingreso=?, mes_ingreso=?, ano_ingreso=?, apartamento=?, monto=?, pagado=?, encargado_DNI=?" 
                        + "WHERE id_ingreso = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ingreso.getTipo_pago());
            ps.setInt(2, ingreso.getDia_ingreso());
            ps.setInt(3, ingreso.getMes_ingreso());
            ps.setInt(4, ingreso.getA_ingreso());
            ps.setString(5, ingreso.getDpto());
            ps.setFloat(6, ingreso.getMonto());
            ps.setBoolean(7, ingreso.isPagado());
            ps.setString(8, ingreso.getDNI_encargado());
            ps.setInt(9, ingreso.getId_ingreso());
            ps.execute();
            
        } catch (Exception e) {
            System.out.println("Error al modificar egreso: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al establecer la conexion: " + e.getMessage());
            }
        }
        return false;
    }
    
    public static boolean EliminarIngreso(Ingreso ingreso){
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "DELETE FROM cuotas WHERE id_ingreso = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ingreso.getId_ingreso());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar el ingreso: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al establecer la conexion: " + e.getMessage());
            }
        }
        return false;
    }
    
}
