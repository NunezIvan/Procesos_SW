/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

import com.dominio.Ingreso;
import com.dominio.ApartamentoMemoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.conexion.conexion;
import java.sql.SQLException;

public class Ingresos {
    
    public static float CalcularMonto(){
        float montoTotal = 0.0f;
        float montoAgua = 0.0f;
        float montoMensual = 0.0f;
        int Total_Apartamentos = 0;
        List<String> apartamentos = new ArrayList<>();
        ApartamentoMemoria memoria = new ApartamentoMemoria();
        apartamentos = memoria.cargarListaApartamentos();
        
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT SUM(monto) AS total FROM egresos";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                montoTotal = rs.getFloat("total");
            }
        } catch (Exception e) {
            System.out.println("Error al calcular el monto: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al establecer la conexion: " +e.getMessage());
            }
        }
        String sql2 = "SELECT SUM(monto_Total) AS total FROM consumo_agua";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                montoAgua = rs.getFloat("total");
                Total_Apartamentos = apartamentos.size();
                montoMensual = (montoTotal+montoAgua)/Total_Apartamentos;
            }
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
    
    
    public static List<Ingreso> ListaIngresosporPeriodo(int idPeriodo){
        List<Ingreso> ingresos = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        var sql = "SELECT * FROM cuotas WHERE idPeriodo = ? ORDER BY id_ingreso";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, idPeriodo);
            rs = ps.executeQuery();
            while(rs.next()){
                var ingreso = new Ingreso();
                ingreso.setId_ingreso(rs.getInt("id_ingreso"));
                ingreso.setTipo_pago(rs.getString("tipo_pago"));
                ingreso.setDia_ingreso(rs.getInt("dia_ingreso"));
                ingreso.setMes_ingreso(rs.getInt("mes_ingreso"));
                ingreso.setAño_ingreso(rs.getInt("ano_ingreso"));
                ingreso.setApartamento(rs.getString("apartamento"));
                ingreso.setMonto(rs.getInt("monto"));
                ingreso.setPagado(rs.getBoolean("pagado"));
                ingreso.setId_Periodo(rs.getInt("idPeriodo"));
                ingreso.setDNI_encargado(rs.getString("Encargado_DNI"));
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
    
    public static List<Ingreso> ListarIngresosporPeriodoYMes(int idPeriodo, int mes_ingreso){
        List<Ingreso> ingresos = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM cuotas WHERE idPeriodo = ? AND mes_ingreso = ? ORDER BY id_ingreso";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPeriodo);
            ps.setInt(2, mes_ingreso);
            rs = ps.executeQuery();
            while(rs.next()){
                var ingreso = new Ingreso();
                ingreso.setId_ingreso(rs.getInt("id_ingreso"));
                ingreso.setTipo_pago(rs.getString("tipo_pago"));
                ingreso.setDia_ingreso(rs.getInt("dia_ingreso"));
                ingreso.setMes_ingreso(rs.getInt("mes_ingreso"));
                ingreso.setAño_ingreso(rs.getInt("ano_ingreso"));
                ingreso.setApartamento(rs.getString("apartamento"));
                ingreso.setMonto(rs.getInt("monto"));
                ingreso.setPagado(rs.getBoolean("pagado"));
                ingreso.setId_Periodo(rs.getInt("idPeriodo"));
                ingreso.setDNI_encargado(rs.getString("Encargado_DNI"));
                ingresos.add(ingreso);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar ingreso por Periodo y Mes : " + e.getMessage());
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
                ingreso.setAño_ingreso(rs.getInt("ano_ingreso"));
                ingreso.setApartamento(rs.getString("apartamento"));
                ingreso.setMonto(rs.getInt("monto"));
                ingreso.setPagado(rs.getBoolean("pagado"));
                ingreso.setId_Periodo(rs.getInt("idPeriodo"));
                ingreso.setDNI_encargado(rs.getString("Encargado_DNI"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el ingreso: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al establecer la conexion: " + e.getMessage());
            }
        }
        return false;
    }
    
    public static boolean agregarIngreso(Ingreso ingreso){
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "INSERT INTO cuotas (tipo_pago, dia_ingreso, mes_ingreso, ano_ingreso, apartamento, monto, pagado, idPeriodo, Encargado_DNI) "
                        + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ingreso.getTipo_pago());
            ps.setInt(2, ingreso.getDia_ingreso());
            ps.setInt(3, ingreso.getMes_ingreso());
            ps.setInt(4, ingreso.getAño_ingreso());
            ps.setString(5, ingreso.getApartamento());
            ps.setFloat(6, ingreso.getMonto());
            ps.setBoolean(7, ingreso.isPagado());
            ps.setInt(8, ingreso.getId_Periodo());
            ps.setString(9, ingreso.getDNI_encargado());
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
        String sql = "UPDATE cuotas SET tipo_pago=?, dia_ingreso=?, mes_ingreso=?, ano_ingreso=?, apartamento=?, monto=?, pagado=?, idPeriodo=?, Encargado_DNI=?" 
                        + "WHERE id_ingreso = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ingreso.getTipo_pago());
            ps.setInt(2, ingreso.getDia_ingreso());
            ps.setInt(3, ingreso.getMes_ingreso());
            ps.setInt(4, ingreso.getAño_ingreso());
            ps.setString(5, ingreso.getApartamento());
            ps.setFloat(6, ingreso.getMonto());
            ps.setBoolean(7, ingreso.isPagado());
            ps.setInt(8, ingreso.getId_Periodo());
            ps.setString(9, ingreso.getDNI_encargado());
            ps.setInt(10, ingreso.getId_ingreso());
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
    
    public static boolean existeEncargadoDNI(String dni) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        var sql = "SELECT 1 FROM cuotas WHERE Encargado_DNI = ?";
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
    
    public static float calcularEgresoTotal(int idPeriodo, int mes_ingreso) {
            float total_Ingreso = 0.0f;

            String sql = "SELECT SUM(monto) AS total FROM cuotas WHERE idPeriodo = ? AND mes_ingreso = ?";

            try (Connection con = conexion.getConexion();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, idPeriodo); // Filtro por periodo
                ps.setInt(2, mes_ingreso); // Filtro por mes

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    total_Ingreso = rs.getFloat("total"); // Obtiene el total de la columna "total"
                }

            } catch (SQLException e) {
                System.out.println("Error al calcular el egreso total: " + e.getMessage());
            }

            return total_Ingreso;
        }

}
