package com.dominio;

import java.sql.Date;

public class Periodo {
    private int idPeriodo;
    private String añoPeriodo;
    private Date fechaApertura;
    private boolean disponible;
    private String encargadoDNI;

    // Constructor vacío
    public Periodo() {}

    // Constructor solo con id
    public Periodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    // Constructor con todas las características excepto id
    public Periodo(String añoPeriodo, Date fechaApertura, boolean disponible, String encargadoDNI) {
        this.añoPeriodo = añoPeriodo;
        this.fechaApertura = fechaApertura;
        this.disponible = disponible;
        this.encargadoDNI = encargadoDNI;
    }

    // Getters y Setters
    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getAñoPeriodo() {
        return añoPeriodo;
    }

    public void setAñoPeriodo(String añoPeriodo) {
        this.añoPeriodo = añoPeriodo;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getEncargadoDNI() {
        return encargadoDNI;
    }

    public void setEncargadoDNI(String encargadoDNI) {
        this.encargadoDNI = encargadoDNI;
    }
}