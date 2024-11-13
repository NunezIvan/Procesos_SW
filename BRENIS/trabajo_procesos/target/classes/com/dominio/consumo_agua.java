package com.dominio;

public class consumo_agua {
    private int idConsumoAgua;
    private String tipoConsumo;
    private int mesConsumo;
    private int lecturaAnterior;
    private int lecturaActual;
    private float cargoFijo;
    private String mora;
    private float igvConsumo;
    private float pagoConsumo;
    private float pagoDesague;
    private float montoTotal;
    private String apartamento;
    private int idPeriodo;
    private String encargadoDNI;

    // Constructor vacío
    public consumo_agua() {
    }

    // Constructor con ID
    public consumo_agua(int idConsumoAgua) {
        this.idConsumoAgua = idConsumoAgua;
    }

    // Constructor con todos los campos menos el ID
    public consumo_agua(String tipoConsumo, int mesConsumo, int lecturaAnterior, int lecturaActual, float cargoFijo,
                        String mora, float igvConsumo, float pagoConsumo, float pagoDesague, float montoTotal,
                        String apartamento, int idPeriodo, String encargadoDNI) {
        this.tipoConsumo = tipoConsumo;
        this.mesConsumo = mesConsumo;
        this.lecturaAnterior = lecturaAnterior;
        this.lecturaActual = lecturaActual;
        this.cargoFijo = cargoFijo;
        this.mora = mora;
        this.igvConsumo = igvConsumo;
        this.pagoConsumo = pagoConsumo;
        this.pagoDesague = pagoDesague;
        this.montoTotal = montoTotal;
        this.apartamento = apartamento;
        this.idPeriodo = idPeriodo;
        this.encargadoDNI = encargadoDNI;
    }

    // Getters y Setters
    public int getIdConsumoAgua() {
        return this.idConsumoAgua;
    }

    public void setIdConsumoAgua(int idConsumoAgua) {
        this.idConsumoAgua = idConsumoAgua;
    }

    public String getTipoConsumo() {
        return tipoConsumo;
    }

    public void setTipoConsumo(String tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }

    public int getMesConsumo() {
        return mesConsumo;
    }

    public void setMesConsumo(int mesConsumo) {
        this.mesConsumo = mesConsumo;
    }

    public int getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(int lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public int getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(int lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    public float getCargoFijo() {
        return cargoFijo;
    }

    public void setCargoFijo(float cargoFijo) {
        this.cargoFijo = cargoFijo;
    }

    public String getMora() {
        return mora;
    }

    public void setMora(String mora) {
        this.mora = mora;
    }

    public float getIgvConsumo() {
        return igvConsumo;
    }

    public void setIgvConsumo(float igvConsumo) {
        this.igvConsumo = igvConsumo;
    }

    public float getPagoConsumo() {
        return pagoConsumo;
    }

    public void setPagoConsumo(float pagoConsumo) {
        this.pagoConsumo = pagoConsumo;
    }

    public float getPagoDesague() {
        return pagoDesague;
    }

    public void setPagoDesague(float pagoDesague) {
        this.pagoDesague = pagoDesague;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getEncargadoDNI() {
        return encargadoDNI;
    }

    public void setEncargadoDNI(String encargadoDNI) {
        this.encargadoDNI = encargadoDNI;
    }
}
