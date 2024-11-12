/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

import com.dominio.Apartamento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Apartamentos {   
    public static void crearLista(){
        List<Apartamento> lista = new ArrayList<>();
        File archivo = new File("apartamentos.txt");
        for(int i = 0; i < 2; i++) {
            int index = 100*i+1;
            for (int j = 0; j < 3; j++) {
                int nroapartamento = j + index;
                Random rd = new Random();
                Apartamento apartamento = new Apartamento(nroapartamento, i+1, rd.nextBoolean());
                lista.add(apartamento);
            }   
        }
        
        try {
            FileWriter escritura = new FileWriter(archivo);
            for(Apartamento apartamento : lista){
                escritura.write(apartamento.toString());
            }
            escritura.close();
            
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    public static List<Apartamento> NroEdificiosLlenos(){
        List<Apartamento> apartamentosLlenos = new ArrayList<>();
        try {
            BufferedReader lectura = new BufferedReader(new FileReader("apartamentos.txt"));
            String linea;
            while((linea = lectura.readLine()) != null){
                String[] datos = linea.split(",");
                int numero = Integer.parseInt(datos[0]);
                int nivel = Integer.parseInt(datos[1]);
                boolean existePropietario = Boolean.parseBoolean(datos[2]);
                if(existePropietario){
                    Apartamento apartamento = new Apartamento(numero, nivel, existePropietario);
                    apartamentosLlenos.add(apartamento);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return apartamentosLlenos;
    }
}
