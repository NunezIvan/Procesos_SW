package com.datos;


import java.util.Scanner;
import com.datos.egresos;
import com.dominio.egreso;

public class egreso_prueba {
    public static void main(String[] args) {
        egresosApp();
    }

    private static void egresosApp() {
        var salir = false;
        var consola = new Scanner(System.in);
        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion);
            } catch (Exception e) {
                System.out.println("Error al ejecutar opciones: " + e.getMessage());
            }
        }
        consola.close();
    }

    
    private static int mostrarMenu(Scanner consola) {
        System.out.println("""
                *** Gestión de Egresos ***
                1. Listar Egresos
                2. Buscar Egreso por ID
                3. Agregar Egreso
                4. Modificar Egreso
                5. Eliminar Egreso
                6. Salir
                Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner consola, int opcion) {
        var salir = false;
        switch (opcion) {
            case 1 -> {
                System.out.println("--- Listado de Egresos ---");
                var listaEgresos = egresos.listarEgresos();
                listaEgresos.forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("Introduce el ID del egreso a buscar: ");
                var idEgreso = Integer.parseInt(consola.nextLine());
                var egreso = new egreso(idEgreso);
                var encontrado = egresos.buscarEgreso_id(egreso);
                if (encontrado) {
                    System.out.println("Egreso encontrado: " + egreso);
                } else {
                    System.out.println("Egreso no encontrado con ID: " + idEgreso);
                }
            }
            case 3 -> {
                System.out.println("--- Agregar Egreso ---");
                System.out.print("Tipo de Egreso: ");
                var tipoEgreso = consola.nextLine();
                System.out.print("Tipo de Pago: ");
                var tipoPago = consola.nextLine();
                System.out.print("A nombre de: ");
                var aNombre = consola.nextLine();
                System.out.print("Día de Egreso: ");
                var diaEgreso = Integer.parseInt(consola.nextLine());
                System.out.print("Mes de Egreso: ");
                var mesEgreso = Integer.parseInt(consola.nextLine());
                System.out.print("Año de Egreso: ");
                var anoEgreso = Integer.parseInt(consola.nextLine());
                System.out.print("Descripción: ");
                var descripcion = consola.nextLine();
                System.out.print("Monto: ");
                var monto = Float.parseFloat(consola.nextLine());
                System.out.print("DNI del Encargado: ");
                var encargadoDNI = consola.nextLine();
                
                if (!egresos.existeEncargadoDNI(encargadoDNI)) {
                    System.out.println("Error: El DNI del encargado no existe. Por favor, verifique el DNI.");
                    break;
                }

                var nuevoEgreso = new egreso(tipoEgreso, tipoPago, aNombre, diaEgreso, mesEgreso, anoEgreso, descripcion, encargadoDNI);
                nuevoEgreso.setMonto(monto);
                
                var agregado = egresos.agregarEgreso(nuevoEgreso);
                if (agregado) {
                    System.out.println("Egreso agregado exitosamente: " + nuevoEgreso);
                } else {
                    System.out.println("Error al agregar el egreso.");
                }
            }
            case 4 -> { 
                System.out.println("--- Modificar Egreso ---");
                System.out.print("ID del Egreso a modificar: ");
                var idEgreso = Integer.parseInt(consola.nextLine());
                System.out.print("Tipo de Egreso: ");
                var tipoEgreso = consola.nextLine();
                System.out.print("Tipo de Pago: ");
                var tipoPago = consola.nextLine();
                System.out.print("A nombre de: ");
                var aNombre = consola.nextLine();
                System.out.print("Día de Egreso: ");
                var diaEgreso = Integer.parseInt(consola.nextLine());
                System.out.print("Mes de Egreso: ");
                var mesEgreso = Integer.parseInt(consola.nextLine());
                System.out.print("Año de Egreso: ");
                var anoEgreso = Integer.parseInt(consola.nextLine());
                System.out.print("Descripción: ");
                var descripcion = consola.nextLine();
                System.out.print("Monto: ");
                var monto = Float.parseFloat(consola.nextLine());
                System.out.print("DNI del Encargado: ");
                var encargadoDNI = consola.nextLine();
                
                if (!egresos.existeEncargadoDNI(encargadoDNI)) {
                    System.out.println("Error: El DNI del encargado no existe. Por favor, verifique el DNI.");
                    break;
                }

                var egreso = new egreso(idEgreso, tipoEgreso, tipoPago, aNombre, diaEgreso, mesEgreso, anoEgreso, descripcion, encargadoDNI);
                egreso.setMonto(monto);
                
                var modificado = egresos.modificarEgreso(egreso);
                if (modificado) {
                    System.out.println("Egreso modificado exitosamente: " + egreso);
                } else {
                    System.out.println("Error al modificar el egreso.");
                }
            }
            case 5 -> { 
                System.out.println("--- Eliminar Egreso ---");
                System.out.print("ID del Egreso a eliminar: ");
                var idEgreso = Integer.parseInt(consola.nextLine());
                var egreso = new egreso(idEgreso);
                var eliminado = egresos.eliminarEgreso(egreso);
                if (eliminado) {
                    System.out.println("Egreso eliminado exitosamente.");
                } else {
                    System.out.println("Error al eliminar el egreso.");
                }
            }
            case 6 -> salir = true;
            default -> System.out.println("Opción no reconocida.");
        }
        return salir;
    }
}
