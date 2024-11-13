package com.dominio;

import java.util.List;

public class egreso {

    private int id_egreso;
    private String tipo_egreso;
    private String tipo;
    private String modo_pago;
    private String A_nombre;
    private int dia_egreso;
    private int mes_egreso;
    private int ano_egreso;
    private Float monto;
    private int idPeriodo;
    private String encargado_DNI;

    public int getId_egreso() {
        return this.id_egreso;
    }
    public void setId_egreso(int id_egresos) {
        this.id_egreso = id_egresos;
    }
    public String getTipo_egreso() {
        return this.tipo_egreso;
    }
    public void setTipo_egreso(String tipo_egreso) {
        this.tipo_egreso = tipo_egreso;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getModo_pago() {
        return this.modo_pago;
    }
    public void setModo_pago(String modo_pago) {
        this.modo_pago = modo_pago;
    }
    public String getA_nombre() {
        return this.A_nombre;
    }
    public void setA_nombre(String a_nombre) {
        A_nombre = a_nombre;
    }
    public int getDia_egreso() {
        return this.dia_egreso;
    }
    public void setDia_egreso(int dia_egreso) {
        this.dia_egreso = dia_egreso;
    }
    public int getMes_egreso() {
        return this.mes_egreso;
    }
    public void setMes_egreso(int mes_egreso) {
        this.mes_egreso = mes_egreso;
    }
    public int getAno_egreso() {
        return this.ano_egreso;
    }
    public void setAno_egreso(int ano_egreso) {
        this.ano_egreso = ano_egreso;
    }
    public Float getMonto() {
        return this.monto;
    }
    public void setMonto(Float monto) {
        this.monto = monto;
    }
    public int getIdPeriodo() {
        return idPeriodo;
    }
    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }
    public String getEncargado_DNI() {
        return this.encargado_DNI;
    }
    public void setEncargado_DNI(String encargado_DNI) {
        this.encargado_DNI = encargado_DNI;
    }

    @Override
    public String toString() {
        return "egreso [id_egreso=" + id_egreso + ", tipo_egreso=" + tipo_egreso + ", tipo=" + tipo + ", modo_pago=" + modo_pago
                + ", A_nombre=" + A_nombre + ", dia_egreso=" + dia_egreso + ", mes_egreso=" + mes_egreso
                + ", ano_egreso=" + ano_egreso + ", monto=" + monto + ", idPeriodo=" + idPeriodo
                + ", encargado_DNI=" + encargado_DNI + "]";
    }
    
    public egreso(){}
    
    public egreso(int idEgreso){
        this.id_egreso = idEgreso;
        
    }
    
    //Constructor
    public egreso(String tipo_egreso, String tipo, String modo_pago, String A_nombre, int dia_egreso, int mes_egreso, int ano_egreso, float monto, int idPeriodo, String encargadoDNI){
        this.tipo_egreso = tipo_egreso;
        this.tipo = tipo;
        this.modo_pago = modo_pago;
        this.A_nombre = A_nombre;
        this.dia_egreso = dia_egreso;
        this.mes_egreso = mes_egreso;
        this.ano_egreso = ano_egreso;
        this.monto = monto;
        this.idPeriodo = idPeriodo;
        this.encargado_DNI = encargadoDNI;
    }
    
    
}
