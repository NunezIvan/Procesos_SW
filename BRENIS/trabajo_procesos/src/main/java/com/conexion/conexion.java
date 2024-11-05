package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        var baseDatos = "trabajo_procesos"; //Aca va el nombre de la db en tu local
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root"; //Aca va el usuario que tienes en el local
        var password = "KazumaHumilde123"; //Aca va tu contraseña
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
