/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dominio;

public class Apartamento {
    private int nroApartamento;
    private int nivel;
    private boolean propietario;

    public Apartamento(int nroApartamento, int nivel, boolean propietario) {
        this.nroApartamento = nroApartamento;
        this.nivel = nivel;
        this.propietario = propietario;
    }

    public int getNroApartamento() {
        return nroApartamento;
    }

    public void setNroApartamento(int nroApartamento) {
        this.nroApartamento = nroApartamento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isPropietario() {
        return propietario;
    }

    public void setPropietario(boolean propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return nroApartamento + "," + nivel + "," + propietario;
    }
    
    
    
    
}
