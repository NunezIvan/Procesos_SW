/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

import static com.conexion.conexion.getConexion;
import com.dominio.ApartamentosMemoria;
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
    
    public void generarContingenciaMensual(int idPeriodo, int EncargadoDNI) throws SQLException{
        
        List<String> apartamentos = new ArrayList<>();
        ApartamentosMemoria memoria = new ApartamentosMemoria();
        
        apartamentos = memoria.cargarListaApartamentos();
        
        LocalDate fechaActual = LocalDate.now();
        
        int year = fechaActual.getYear();
        int mes = fechaActual.getDayOfMonth();
        
        Connection conexion = getConexion();
        if(conexion != null){
            String sqlVerificar = "SELECT COUNT (*) FROM db_procesos.contingencia WHERE mes_ingreso =? AND ano_ingreso =?";
            String sqlInsertar = "Insert INTO db_procesos.contingencia (tipo_pago, mes_ingreso, ano_ingreso, apartamento, monto, pagado, idPeriodo, Encargado_DNI) VALUES (?,?,?,?,?,?,?,?)";
            
            try(PreparedStatement psVerificar = conexion.prepareStatement(sqlVerificar)){
                psVerificar.setInt(2,mes);
                psVerificar.setInt(3,year);
                ResultSet rs = psVerificar.executeQuery();
                
                int i = 0;
                
                if (rs.next()){
                    while(i<apartamentos.size()){
                        String apartamento = apartamentos.get(i);
                        float monto = 50;
                        String pagado = "0";
                        
                        try(PreparedStatement psInsertar = conexion.prepareStatement(sqlInsertar)){
                            psInsertar.setNull(1, java.sql.Types.VARCHAR);
                            psInsertar.setInt(2,mes);
                            psInsertar.setInt(3,year);
                            psInsertar.setString(4,apartamento);
                            psInsertar.setFloat(5,monto);
                            psInsertar.setString(6,pagado);
                            psInsertar.setInt(7, idPeriodo);
                            psInsertar.setInt(8, EncargadoDNI);
                            psInsertar.executeUpdate();
                    }
                        i++;
                    }
                    
                }
                } catch(SQLException e){
                }
            }
        }
        
    }
    
