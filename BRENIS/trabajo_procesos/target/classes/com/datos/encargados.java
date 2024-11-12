package com.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import com.conexion.conexion;
import com.dominio.Periodo;
import com.dominio.encargado;

public class encargados {

    public encargados(){}

    public static  void agregarEncargado(encargado Encargado) {
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "INSERT INTO encargado(DNI, nombre, apellido, contraseña, username, habilitado) VALUES(?, ?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Encargado.getDni_encargado());
            ps.setString(2, Encargado.getNombre());
            ps.setString(3, Encargado.getApellido());
            ps.setString(4, Encargado.getContraseña());
            ps.setString(5, Encargado.getUsername());
            ps.setBoolean(6, Encargado.getHabilitado());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Error al agregar encargado: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    

    public static boolean verificar_Encargados() {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        
        try {
            String sql = "SELECT COUNT(*) FROM encargado";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            int count = 0;
            if (rs.next()) {
                count = rs.getInt(1);
            }
    
            return count == 0;
        } catch (Exception e) {
            System.out.println("Error al verificar la tabla 'Encargado': " + e.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public static void cambiar_permiso(encargado Encargado) {
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        String sql = "UPDATE encargado SET habilitado = 1 WHERE DNI = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Encargado.getDni_encargado());
    
            int cambiado = ps.executeUpdate();
            if (cambiado > 0) {
                System.out.println("El estado de habilitado del encargado con DNI " + Encargado.getDni_encargado() + " ha sido actualizado a true.");
                
                // Crear periodo para el encargado habilitado
                crearPeriodoParaEncargadoHabilitado(Encargado);
            } else {
                System.out.println("No se encontró un encargado con el DNI especificado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cambiar el estado de habilitado del encargado: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public static void deshabilitar_encargados(){
        PreparedStatement ps;
        Connection con = conexion.getConexion();
        try {
            String sql = "UPDATE encargado SET habilitado = 0";
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al deshabilitar a todos los encargados: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public static void actualizarEstadoAnual() {
        deshabilitar_encargados();
        Periodos.deshabilitarPeriodos();

        int añoActual = LocalDate.now().getYear();
        int totalEncargados = 12;
        int offset = (añoActual - 2024) % totalEncargados;

        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM encargado ORDER BY DNI LIMIT 1 OFFSET ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, offset); // Usa el offset calculado para seleccionar el encargado correspondiente
            rs = ps.executeQuery();

            if (rs.next()) {
                encargado Encargado = new encargado();
                Encargado.setDni_encargado(rs.getString("DNI"));
                Encargado.setNombre(rs.getString("nombre"));
                Encargado.setApellido(rs.getString("apellido"));
                Encargado.setContraseña(rs.getString("contraseña"));

                cambiar_permiso(Encargado); // Cambiamos el estado de habilitado del encargado seleccionado
            } else {
                System.out.println("No se encontró un encargado para el año actual.");
            }
        } catch (Exception e) {
            System.out.println("Error al seleccionar el encargado para el año actual: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    
    public static encargado verificarCredenciales(String username, String contraseña) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM encargado WHERE username = ? AND contraseña = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();

            if (rs.next()) {
                // Usamos verificarHabilitado para comprobar si el usuario está habilitado
                boolean habilitado = verificarHabilitado(username);
                if (habilitado) {
                    // Si el usuario está habilitado, creamos y retornamos el objeto encargado
                    encargado Encargado = new encargado();
                    Encargado.setDni_encargado(rs.getString("DNI"));
                    Encargado.setUsername(rs.getString("username"));
                    Encargado.setContraseña(rs.getString("contraseña"));
                    Encargado.setNombre(rs.getString("nombre"));
                    Encargado.setApellido(rs.getString("apellido"));
                    Encargado.setHabilitado(habilitado);
                    return Encargado;
                } else {
                    System.out.println("Usuario no habilitado.");
                    return null;
                }
            } else {
                System.out.println("Credenciales incorrectas.");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar credenciales: " + e.getMessage());
            return null;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }


    public static void crear_Encargados_defecto(){
        if(verificar_Encargados()){
            encargado Encargado1 = new encargado("72189012", "Carlos", "Lopez", "1234");
            agregarEncargado(Encargado1);
            encargado Encargado2 = new encargado("72189013", "Juan", "Martinez", "1234");
            agregarEncargado(Encargado2);
            encargado Encargado3 = new encargado("72189014", "Diego", "Ramirez", "1234");
            agregarEncargado(Encargado3);
            encargado Encargado4 = new encargado("72189015", "Luis", "Gomez", "1234");
            agregarEncargado(Encargado4);
            encargado Encargado5 = new encargado("72189016", "Sebastian", "Torres", "1234");
            agregarEncargado(Encargado5);
            encargado Encargado6 = new encargado("72189017", "Miguel", "Fernandez", "1234");
            agregarEncargado(Encargado6);
            encargado Encargado7 = new encargado("72189018", "Andres", "Morales", "1234");
            agregarEncargado(Encargado7);
            encargado Encargado8 = new encargado("72189019", "Ana", "Vargas", "1234");
            agregarEncargado(Encargado8);
            encargado Encargado9 = new encargado("72189020", "Ivan", "Ortega", "1234");
            agregarEncargado(Encargado9);
            encargado Encargado10 = new encargado("72189021", "Marco", "Castro", "1234");
            agregarEncargado(Encargado10);
            encargado Encargado11 = new encargado("72189022", "Joshua", "Chavez", "1234");
            agregarEncargado(Encargado11);
            encargado Encargado12 = new encargado("72189023", "Francisco", "Soto", "1234");
            agregarEncargado(Encargado12);
            
            actualizarEstadoAnual();
    
        } else{
    
            actualizarEstadoAnual();
    
        }
    
    }
    

    public static boolean verificarHabilitado(String username) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT habilitado FROM encargado WHERE username = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getBoolean("habilitado");
            } else {
                System.out.println("Usuario no encontrado.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar si el usuario está habilitado: " + e.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
    public static Periodo buscarPeriodoPorAño(String año) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM periodo WHERE año_periodo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, año);
            rs = ps.executeQuery();

            if (rs.next()) {
                // Si encuentra el periodo, crea el objeto y asigna los valores
                Periodo periodo = new Periodo();
                periodo.setIdPeriodo(rs.getInt("idPeriodo"));
                periodo.setAñoPeriodo(rs.getString("año_periodo"));
                periodo.setFechaApertura(rs.getDate("fecha_apertura"));
                periodo.setDisponible(rs.getBoolean("disponible"));
                periodo.setEncargadoDNI(rs.getString("Encargado_DNI"));
                return periodo;
            } else {
                System.out.println("No se encontró un periodo para el año " + año);
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el periodo por año: " + e.getMessage());
            return null;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public static void iniciarSesion() { //Funciones de prueba nadama
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su username: ");
        String username = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        PreparedStatement ps;
        ResultSet rs;
        Connection con = conexion.getConexion();
        String sql = "SELECT * FROM encargado WHERE username = ? AND contraseña = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();

            if (rs.next()) {
                if (verificarHabilitado(username)) {
                    System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + rs.getString("nombre") + "!");
                } else {
                    System.out.println("El usuario no está habilitado. No puede iniciar sesión.");
                }
            } else {
                System.out.println("Username o contraseña incorrectos.");
            }
        } catch (Exception e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
    private static void crearPeriodoParaEncargadoHabilitado(encargado Encargado) {
        Periodo periodo = new Periodo();
        periodo.setAñoPeriodo(String.valueOf(LocalDate.now().getYear()));
        periodo.setFechaApertura(java.sql.Date.valueOf(LocalDate.now()));
        periodo.setDisponible(true);
        periodo.setEncargadoDNI(Encargado.getDni_encargado());
        Periodos.agregarPeriodo(periodo);
    }

    public static void main(String[] args) {
        crear_Encargados_defecto();
        iniciarSesion();
    }

}
