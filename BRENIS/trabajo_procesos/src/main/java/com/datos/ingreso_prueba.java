
package com.datos;
import com.dominio.Ingreso;
import com.datos.Ingresos;
import java.util.Scanner;

public class ingreso_prueba {
    private Ingresos ingresos;
    private Scanner consola;

    public ingreso_prueba() {
        ingresos = new Ingresos();
        consola = new Scanner(System.in);  
    }
    
    public void mostrarIngresos_prueba(){
        int opcion = 0;
        do{
            System.out.println("""
                *** Gestión de Egresos ***
                1. Agregar Ingresos
                2. Mostrar Ingresos
                3. Buscar Ingresos por id
                4. Modificar Ingreso
                5. Eliminar Ingreso
                6. Salir
                Elige una opción:\s""");
            try {
                opcion = consola.nextInt();
                consola.nextLine();
                System.out.flush();
                switch(opcion){
                    case 1:{
                        System.out.print("Tipo de ingreso: ");
                        String tipo = consola.nextLine();
                        System.out.print("Descripción: ");
                        String descripcion = consola.nextLine();
                        System.out.print("Mes (01-Enero/ 12-Diciembre): ");
                        int mes = Integer.parseInt(consola.nextLine());
                        System.out.print("Año: ");
                        int año = Integer.parseInt(consola.nextLine());
                        System.out.print("Monto: ");
                        float monto = consola.nextFloat();
                        ingresos.agregarIngreso(tipo, descripcion, mes, año, monto);
                        break;
                    }
                    case 2:{
                        ingresos.mostrarIngreso();
                        break;
                    }
                    case 3:{
                        System.out.println("Ingrese el id del ingreso a buscar: ");
                        int id_busqueda = consola.nextInt();
                        ingresos.buscarIngresoporId(id_busqueda);
                        break;
                    }
                    case 4:{
                        System.out.print("Ingrese el id del ingreso a modificar: ");
                        int id_Modificar = consola.nextInt();
                        consola.nextLine();
                        System.out.print("Nuevo tipo de ingreso: ");
                        String tipo = consola.nextLine();
                        System.out.print("Nueva descripción: ");
                        String descripcion = consola.nextLine();
                        System.out.print("Nuevo mes (01-Enero/ 12-Diciembre): ");
                        int mes = Integer.parseInt(consola.nextLine());
                        System.out.print("Nuevo año: ");
                        int año = Integer.parseInt(consola.nextLine());
                        System.out.print("Nuevo monto: ");
                        float monto = consola.nextFloat();
                        ingresos.modificarIngreso(id_Modificar, mes, año, tipo, monto, descripcion);
                        break;
                    }
                    case 5:{
                        System.out.println("Ingrese el id del ingreso a eliminar: ");
                        int id_Eliminar = consola.nextInt();
                        ingresos.eliminarIngreso(id_Eliminar);
                        break;
                    }
                    case 6:{
                        System.out.println("Saliendo del sistema...");
                        break;
                    }
                    default:{
                        System.out.println("Opcion Invalida...");
                    }
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida, ingrese de nuevo " + e.getMessage());
                opcion = 0;
            }
        }while(opcion != 6 );
        consola.close();
    }
    public static void main(String[] args) {
        ingreso_prueba menu = new ingreso_prueba();
        menu.mostrarIngresos_prueba();
    }
    
    
}
