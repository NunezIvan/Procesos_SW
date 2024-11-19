package com.dominio;

public class Ingreso {
    private int idIngreso;
    private String tipoPago;
    private int diaIngreso;
    private int mesIngreso;
    private int anoIngreso;
    private String apartamento;
    private float monto;
    private boolean pagado;
    private int idPeriodo;
    private String encargadoDNI;

    // Constructor vacío
    public Ingreso() {}

    // Constructor solo con el ID del ingreso
    public Ingreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    // Constructor con todos los atributos excepto el ID del ingreso
    public Ingreso(String tipoPago, int diaIngreso, int mesIngreso, int anoIngreso, String apartamento, float monto, boolean pagado, int idPeriodo, String encargadoDNI) {
        this.tipoPago = tipoPago;
        this.diaIngreso = diaIngreso;
        this.mesIngreso = mesIngreso;
        this.anoIngreso = anoIngreso;
        this.apartamento = apartamento;
        this.monto = monto;
        this.pagado = pagado;
        this.idPeriodo = idPeriodo;
        this.encargadoDNI = encargadoDNI;
    }
    
    public Ingreso(int idIngreso,String tipoPago, int diaIngreso, int mesIngreso, int anoIngreso, String apartamento, float monto, boolean pagado, int idPeriodo, String encargadoDNI) {
        this.idIngreso = idIngreso;
        this.tipoPago = tipoPago;
        this.diaIngreso = diaIngreso;
        this.mesIngreso = mesIngreso;
        this.anoIngreso = anoIngreso;
        this.apartamento = apartamento;
        this.monto = monto;
        this.pagado = pagado;
        this.idPeriodo = idPeriodo;
        this.encargadoDNI = encargadoDNI;
    }
    

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getDiaIngreso() {
        return diaIngreso;
    }

    public void setDiaIngreso(int diaIngreso) {
        this.diaIngreso = diaIngreso;
    }

    public int getMesIngreso() {
        return mesIngreso;
    }

    public void setMesIngreso(int mesIngreso) {
        this.mesIngreso = mesIngreso;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
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

    @Override
    public String toString() {
        return "Ingreso{" +
                "idIngreso=" + idIngreso +
                ", tipoPago='" + tipoPago + '\'' +
                ", diaIngreso=" + diaIngreso +
                ", mesIngreso=" + mesIngreso +
                ", anoIngreso=" + anoIngreso +
                ", apartamento='" + apartamento + '\'' +
                ", monto=" + monto +
                ", pagado=" + pagado +
                ", idPeriodo=" + idPeriodo +
                ", encargadoDNI='" + encargadoDNI + '\'' +
                '}';
    }
}
