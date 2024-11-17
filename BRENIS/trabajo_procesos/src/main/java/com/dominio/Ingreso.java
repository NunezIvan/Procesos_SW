/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dominio;

public class Ingreso {
    private int id_ingreso;
    private String tipo_pago;
    private int dia_ingreso;
    private int mes_ingreso;
    private int año_ingreso;
    private String apartamento;
    private float monto;
    private boolean pagado;
    private int id_Periodo;
    private String DNI_encargado;

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

    public int getAño_ingreso() {
        return año_ingreso;
    }

    public void setAño_ingreso(int año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
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

    public int getId_Periodo() {
        return id_Periodo;
    }

    public void setId_Periodo(int id_Periodo) {
        this.id_Periodo = id_Periodo;
    }

    public String getDNI_encargado() {
        return DNI_encargado;
    }

    public void setDNI_encargado(String DNI_encargado) {
        this.DNI_encargado = DNI_encargado;
    }

    public Ingreso() {
    }

    public Ingreso(String tipo_pago, int dia_ingreso, int mes_ingreso, int año_ingreso, String apartamento, float monto, boolean pagado, int id_Periodo, String DNI_encargado) {
        this.tipo_pago = tipo_pago;
        this.dia_ingreso = dia_ingreso;
        this.mes_ingreso = mes_ingreso;
        this.año_ingreso = año_ingreso;
        this.apartamento = apartamento;
        this.monto = monto;
        this.pagado = pagado;
        this.id_Periodo = id_Periodo;
        this.DNI_encargado = DNI_encargado;
    }

    public Ingreso(int id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    @Override
    public String toString() {
        return "Cuota{" + "id_ingreso=" + id_ingreso + ", tipo_pago=" + tipo_pago + ", dia_ingreso=" + dia_ingreso + ", mes_ingreso=" + mes_ingreso + ", a\u00f1o_ingreso=" + año_ingreso + ", apartamento=" + apartamento + ", monto=" + monto + ", pagado=" + pagado + ", id_Periodo=" + id_Periodo + ", DNI_encargado=" + DNI_encargado + '}';
    }
    
    
}
