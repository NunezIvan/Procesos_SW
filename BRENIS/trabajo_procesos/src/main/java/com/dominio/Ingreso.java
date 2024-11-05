
package com.dominio;

import java.util.Objects;

public class Ingreso {
    private int id_ingreso;
    private int mes;
    private int año;
    private String modo;
    private float monto;
    private String descripcion;

    public Ingreso(int id_ingreso, int mes, int año, String modo, float monto, String descripcion) {
        this.id_ingreso = id_ingreso;
        this.mes = mes;
        this.año = año;
        this.modo = modo;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public Ingreso() {
    }

    public int getId_ingreso() {
        return id_ingreso;
    }

    public void setId_ingreso(int id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Ingresos[" + "id_ingreso=" + id_ingreso + ", mes=" + mes + ", a\u00f1o=" + año + ", modo=" + modo + ", monto=" + monto + ", descripcion=" + descripcion + ']';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id_ingreso;
        hash = 97 * hash + this.mes;
        hash = 97 * hash + this.año;
        hash = 97 * hash + Objects.hashCode(this.modo);
        hash = 97 * hash + Float.floatToIntBits(this.monto);
        hash = 97 * hash + Objects.hashCode(this.descripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ingreso other = (Ingreso) obj;
        if (this.id_ingreso != other.id_ingreso) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        if (this.año != other.año) {
            return false;
        }
        if (Float.floatToIntBits(this.monto) != Float.floatToIntBits(other.monto)) {
            return false;
        }
        if (!Objects.equals(this.modo, other.modo)) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }
    
    
    
    
}

