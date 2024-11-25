/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dominio;

/**
 *
 * @author diegu
 */
public class contingencia {
    private int IdContingencia;
    private String tipoPago;
    private int dia_Contingencia;
    private int mes_Contingencia;
    private int year_Contingencia;
    private String apartamento;
    private float monto;
    private boolean pagado;
    private int idPeriodo;
    private String encargadoDNI;
    
    public int getIdContingencia(){
        return this.IdContingencia;
    }
    
    public void setIdContignencia(int IdContingencia){
        this.IdContingencia = IdContingencia;
    }
    
    public void setDiaContingencia(int diaContingencia){
        this.dia_Contingencia = diaContingencia;
    }
    
    public int getDiaContingencia(){
        return this.dia_Contingencia;
    }
    
    public String getTipoPago(){
        return this.tipoPago;
    }
    
    public void setTipoPago(String TipoPago){
        this.tipoPago = TipoPago;
    }
    
    public int getMesContingencia(){
        return this.mes_Contingencia;
    }
    
    public void setMesContingencia(int Mes_Contingencia){
        this.mes_Contingencia = Mes_Contingencia;
    }
    
    public int getYearContingencia(){
        return this.year_Contingencia;
    }
    
    public void setYearContingencia(int yearContingencia){
        this.year_Contingencia = yearContingencia;
    }
    
    public String getApartamento(){
        return this.apartamento;
    }
    
    public void setApartamento(String apartamento){
        this.apartamento = apartamento;
    }
    
    public float getMonto(){
        return this.monto;
    }
    
    public void setMonto(float monto){
        this.monto = monto;
    }
    
    public boolean getPagado(){
        return this.pagado;
    }
    
    public void setPagado(boolean pagado){
        this.pagado = pagado;
    }
    
    public int getidPeriodo(){
        return this.idPeriodo;
    }
    
    public void setIdPerido(int idPeriodo){
        this.idPeriodo = idPeriodo;
    }
    
    public String getEncargadoDNI(){
        return this.encargadoDNI;
    }
    
    public void setEncargadoDNI (String encargadoDNI){
        this.encargadoDNI = encargadoDNI;
    }
    
}
