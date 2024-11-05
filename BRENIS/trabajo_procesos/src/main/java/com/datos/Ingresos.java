
package com.datos;

import com.dominio.Ingreso;
import java.util.ArrayList;
import java.util.List;
public class Ingresos {
    
    private List<Ingreso> ingresos;
    private int contador_id = 0;

    public Ingresos() {
        ingresos = new ArrayList<>();
    }
    
    
    public boolean agregarIngreso(String modo, String descripcion, int mes, int año, float monto){
        try {
            ingresos.add(new Ingreso(contador_id++, mes, año, modo, monto, descripcion));
            System.out.println("Ingreso añadido con exito");
            return true;
        } catch (Exception e) {
            System.out.println("Error al añadir el ingreso " + e.getMessage());
        }
        return false;
    }
    
    public void mostrarIngreso(){
        float total = 0;
        try {
            System.out.println("Lista de Ingresos");
            for(Ingreso ingreso: ingresos){
                System.out.println(ingreso);
                total += ingreso.getMonto();
            }
            System.out.println("Total de ingresos: " +total);
        } catch (Exception e) {
            System.out.println("Error al mostrar los ingreos" + e.getMessage());
        }
    }
    
    public void buscarIngresoporId(int id){
        for(Ingreso ingreso: ingresos){
            if(ingreso.getId_ingreso() == id){
                System.out.println("Ingreso con la id " + id + " encontrado: " +ingreso);
                return;
            }
        }
        System.out.println("Ingreso con la id " + id + "no encontrado");
    }
    
    public void modificarIngreso(int id, int mes, int año, String modo, float monto, String descripcion){
        for(Ingreso ingreso: ingresos){
            if(ingreso.getId_ingreso() == id){
                ingreso.setAño(año);
                ingreso.setMes(mes);
                ingreso.setModo(modo);
                ingreso.setMonto(monto);
                ingreso.setDescripcion(descripcion);
                System.out.println("Modificacion realizada con exito");
                return;
            }
        }
        System.out.println("Ingreso con la id " + id + "no encontrado");
    }
    
    public void eliminarIngreso(int id){
        try{
            for(Ingreso ingreso: ingresos){
                if(ingreso.getId_ingreso() == id){
                    ingresos.remove(ingreso);
                    return;
                }
            }
            System.out.println("Ingreso con la id " + id + " no encontrado");
        }catch(Exception e){
            System.out.println("Error al eliminar el ingreso " + e.getMessage());
        }
    }
}
