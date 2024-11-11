/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dominio;

import java.util.Objects;

public class Ingreso {
    private int id_ingreso;
    private String tipo_pago;
    private int dia_ingreso;
    private int mes_ingreso;
    private int A_ingreso;
    private String dpto;
    private float monto;
    private boolean pagado;
    private String DNI_encargado;

    public Ingreso() {
    }

    public Ingreso(int id_ingreso) {
        this.id_ingreso = id_ingreso;
    }
    
    
    public Ingreso(String tipo_pago, int dia_ingreso, int mes_ingreso, int A_ingreso, String dpto, float monto, boolean pagado, String DNI_encargado) {
        this.tipo_pago = tipo_pago;
        this.dia_ingreso = dia_ingreso;
        this.mes_ingreso = mes_ingreso;
        this.A_ingreso = A_ingreso;
        this.dpto = dpto;
        this.monto = monto;
        this.pagado = pagado;
        this.DNI_encargado = DNI_encargado;
    }

    public Ingreso(int id_ingreso, String tipo_pago, int dia_ingreso, int mes_ingreso, int A_ingreso, String dpto, float monto, boolean pagado, String DNI_encargado) {
        this(tipo_pago, dia_ingreso, mes_ingreso, A_ingreso, dpto, monto, pagado, DNI_encargado);
        this.id_ingreso = id_ingreso;
    }

    public int getId_ingreso() {
        return id_ingreso;
    }

    public void setId_ingreso(int id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public int getDia_ingreso() {
        return dia_ingreso;
    }

    public void setDia_ingreso(int dia_ingreso) {
        this.dia_ingreso = dia_ingreso;
    }

    public int getMes_ingreso() {
        return mes_ingreso;
    }

    public void setMes_ingreso(int mes_ingreso) {
        this.mes_ingreso = mes_ingreso;
    }

    public int getA_ingreso() {
        return A_ingreso;
    }

    public void setA_ingreso(int A_ingreso) {
        this.A_ingreso = A_ingreso;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    

    public String getDNI_encargado() {
        return DNI_encargado;
    }

    public void setDNI_encargado(String DNI_encargado) {
        this.DNI_encargado = DNI_encargado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id_ingreso;
        hash = 17 * hash + Objects.hashCode(this.tipo_pago);
        hash = 17 * hash + this.dia_ingreso;
        hash = 17 * hash + this.mes_ingreso;
        hash = 17 * hash + this.A_ingreso;
        hash = 17 * hash + Objects.hashCode(this.dpto);
        hash = 17 * hash + Float.floatToIntBits(this.monto);
        hash = 17 * hash + (this.pagado ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.DNI_encargado);
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
        if (this.dia_ingreso != other.dia_ingreso) {
            return false;
        }
        if (this.mes_ingreso != other.mes_ingreso) {
            return false;
        }
        if (this.A_ingreso != other.A_ingreso) {
            return false;
        }
        if (Float.floatToIntBits(this.monto) != Float.floatToIntBits(other.monto)) {
            return false;
        }
        if (this.pagado != other.pagado) {
            return false;
        }
        if (!Objects.equals(this.tipo_pago, other.tipo_pago)) {
            return false;
        }
        if (!Objects.equals(this.dpto, other.dpto)) {
            return false;
        }
        return Objects.equals(this.DNI_encargado, other.DNI_encargado);
    }
    
    
}