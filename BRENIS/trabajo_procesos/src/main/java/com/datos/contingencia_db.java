/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

import com.conexion.conexion;
import com.dominio.contingencia;
import static com.conexion.conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diegu
 */
public class contingencia_db {
    
    public static void generarContingenciaMensual(int idPeriodo, String EncargadoDNI, int mes ) throws SQLException {
    List<String> apartamentos = List.of("201", "202", "301", "302", "401", "402", "501", "502", "601", "602");

    LocalDate fechaActual = LocalDate.now();
    int year = fechaActual.getYear();
    int day = fechaActual.getDayOfMonth();

    Connection conexion = getConexion();
    if (conexion != null) {
        String sqlVerificar = "SELECT COUNT(*) FROM contingencia WHERE mes_ingreso =? AND ano_ingreso =?";
        String sqlInsertar = "INSERT INTO contingencia (tipo_pago, dia_contingencia, mes_ingreso, ano_ingreso, apartamento, monto, pagado, idPeriodo, Encargado_DNI) VALUES (?,?,?,?,?,?,?,?,?)";

        try (PreparedStatement psVerificar = conexion.prepareStatement(sqlVerificar)) {
            psVerificar.setInt(1, mes);
            psVerificar.setInt(2, year);

            try (ResultSet rs = psVerificar.executeQuery()) {
                if (rs.next() && rs.getInt(1) == 0) { // Verifica si no hay registros existentes
                    for (String apartamento : apartamentos) { // Itera sobre los apartamentos
                        float monto = 60.0f;
                        String pagado = "0";

                        try (PreparedStatement psInsertar = conexion.prepareStatement(sqlInsertar)) {
                            psInsertar.setString(1," ") ;
                            psInsertar.setInt(2, day);
                            psInsertar.setInt(3, mes);
                            psInsertar.setInt(4, year);
                            psInsertar.setString(5, apartamento);
                            psInsertar.setFloat(6, monto);
                            psInsertar.setString(7, pagado);
                            psInsertar.setInt(8, idPeriodo);
                            psInsertar.setString(9, EncargadoDNI);
                            psInsertar.executeUpdate();
                        }
                    }
                }
            }
        } catch (SQLException e) {
            // Muestra el error
            
        }
    }
    
    
}
    
    public static void pagarContingenciaMensual(int mes, int year, String apartamento, String tipoPago){
        /* Codigo para pagar Contingencia
        Se necesita:
        Dato de mes, dato de año, apartamento
        Estos dos datos se utilizan para buscar la contingencia especifica y cambia su booleano de pagado que se inicia en false
        a true*/
        
        Connection conexion = getConexion();
        if (conexion != null){
            String sqlBuscar = "SELECT idcontingencia, tipo_pago, dia_contingencia, mes_ingreso, ano_ingreso, apartamento, monto, pagado, idPeriodo, Encargado_DNI FROM contingencia WHERE mes_ingreso =? AND ano_ingreso =? AND apartamento =? AND pagado = 0";
            
            try(PreparedStatement st = conexion.prepareCall(sqlBuscar)){
                st.setInt(1, mes);
                st.setInt(2, year);
                st.setString(3, apartamento);
                ResultSet rs = st.executeQuery();
                
                if(rs.next()){
                    contingencia contingencia = new contingencia();
                    contingencia.setIdContignencia(rs.getInt("idcontingencia"));
                    contingencia.setTipoPago(tipoPago);
                    contingencia.setDiaContingencia(rs.getInt("dia_contingencia"));
                    contingencia.setMesContingencia(rs.getInt("mes_ingreso"));
                    contingencia.setYearContingencia(rs.getInt("ano_ingreso"));
                    contingencia.setApartamento(rs.getString("apartamento"));
                    contingencia.setMonto(rs.getFloat("monto"));
                    contingencia.setPagado(rs.getBoolean("pagado"));
                    contingencia.setIdPerido(rs.getInt("idPeriodo"));
                    contingencia.setEncargadoDNI(rs.getString("Encargado_DNI"));
                   
                   contingencia.setPagado(true);
                   contingencia.setTipoPago(tipoPago);
                    
                   String sqlActualizar = "UPDATE contingencia SET pagado = ?, tipo_pago =?  WHERE idcontingencia = ?";
                   
                   try(PreparedStatement ust = conexion.prepareStatement(sqlActualizar) ){
                       ust.setBoolean(1, contingencia.getPagado());
                       ust.setString(2, contingencia.getTipoPago());
                       ust.setInt(3,contingencia.getIdContingencia());
                       ust.executeUpdate();
                   }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }

    public static List<contingencia> cargarContingencias(int mes){
       
        Connection conexion = getConexion();
        List<contingencia> ListaContingencia = new ArrayList<>();
        if(conexion != null){
            String sql = "SELECT idcontingencia, tipo_pago, dia_contingencia, mes_ingreso, ano_ingreso, apartamento, monto, pagado, idPeriodo, Encargado_DNI FROM contingencia WHERE mes_ingreso =?";
            try(PreparedStatement ps = conexion.prepareStatement(sql)){
                ps.setInt(1,mes);
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()){
                    contingencia Contingencia = new contingencia();
                    Contingencia.setIdContignencia(rs.getInt("idcontingencia"));
                    Contingencia.setTipoPago(rs.getString("tipo_pago"));
                    Contingencia.setDiaContingencia(rs.getInt("dia_contingencia"));
                    Contingencia.setMesContingencia(rs.getInt("mes_ingreso"));
                    Contingencia.setYearContingencia(rs.getInt("ano_ingreso"));
                    Contingencia.setApartamento(rs.getString("apartamento"));
                    Contingencia.setMonto(rs.getFloat("monto"));
                    Contingencia.setPagado(rs.getBoolean("pagado"));
                    Contingencia.setIdPerido(rs.getInt("idPeriodo"));
                    Contingencia.setEncargadoDNI(rs.getString("Encargado_DNI"));
                    
                    ListaContingencia.add(Contingencia);
                    
                    
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return ListaContingencia;
    }
    
    public static float obtenerSumaContingencias(int idPeriodo) {
        float sumaTotal = 0.0f;
        String sql = "SELECT monto FROM contingencia WHERE idPeriodo = ? AND pagado = true";

        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPeriodo);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    sumaTotal += rs.getFloat("monto");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la suma de contingencias pagadas por idPeriodo: " + e.getMessage());
        }

        return sumaTotal;
    }
    
}
    
