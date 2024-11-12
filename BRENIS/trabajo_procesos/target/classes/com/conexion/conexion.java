package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        var baseDatos = "db_procesos";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = "KazumaHumilde123";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url,usuario,password);
        }catch(Exception e){
            System.out.println("Error al conectar a la base de datos");
        }
        return conexion;
    }
    public static void main(String[] args) {
        var Conexion = conexion.getConexion();
        if(Conexion != null){
            System.out.println("Conexion: " + Conexion);
        }else{
            System.out.println("Error al conectarse");
        }
    }
}