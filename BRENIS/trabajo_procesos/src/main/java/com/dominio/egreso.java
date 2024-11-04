package com.dominio;

public class egreso {
    private int id_egreso;
    private String tipo_egreso;
    private String tipo_pago;
    private String A_nombre;
    private int dia_egreso;
    private int mes_egreso;
    private int year_egreso;
    private String descripcion;
    private Float monto;
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
    public String getTipo_pago() {
        return this.tipo_pago;
    }
    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
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
    public int getYear_egreso() {
        return this.year_egreso;
    }
    public void setYear_egreso(int year_egreso) {
        this.year_egreso = year_egreso;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Float getMonto() {
        return this.monto;
    }
    public void setMonto(Float monto) {
        this.monto = monto;
    }
    public String getEncargado_DNI() {
        return this.encargado_DNI;
    }
    public void setEncargado_DNI(String encargado_DNI) {
        this.encargado_DNI = encargado_DNI;
    }

    @Override
    public String toString() {
        return "egresos [id_egresos=" + id_egreso + ", tipo_egreso=" + tipo_egreso + ", tipo_pago=" + tipo_pago
                + ", A_nombre=" + A_nombre + ", dia_egreso=" + dia_egreso + ", mes_egreso=" + mes_egreso
                + ", year_egreso=" + year_egreso + ", descripcion=" + descripcion + ", monto=" + monto
                + ", encargado_DNI=" + encargado_DNI + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id_egreso;
        result = prime * result + ((tipo_egreso == null) ? 0 : tipo_egreso.hashCode());
        result = prime * result + ((tipo_pago == null) ? 0 : tipo_pago.hashCode());
        result = prime * result + ((A_nombre == null) ? 0 : A_nombre.hashCode());
        result = prime * result + dia_egreso;
        result = prime * result + mes_egreso;
        result = prime * result + year_egreso;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((monto == null) ? 0 : monto.hashCode());
        result = prime * result + ((encargado_DNI == null) ? 0 : encargado_DNI.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        egreso other = (egreso) obj;
        if (id_egreso != other.id_egreso)
            return false;
        if (tipo_egreso == null) {
            if (other.tipo_egreso != null)
                return false;
        } else if (!tipo_egreso.equals(other.tipo_egreso))
            return false;
        if (tipo_pago == null) {
            if (other.tipo_pago != null)
                return false;
        } else if (!tipo_pago.equals(other.tipo_pago))
            return false;
        if (A_nombre == null) {
            if (other.A_nombre != null)
                return false;
        } else if (!A_nombre.equals(other.A_nombre))
            return false;
        if (dia_egreso != other.dia_egreso)
            return false;
        if (mes_egreso != other.mes_egreso)
            return false;
        if (year_egreso != other.year_egreso)
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (monto == null) {
            if (other.monto != null)
                return false;
        } else if (!monto.equals(other.monto))
            return false;
        if (encargado_DNI == null) {
            if (other.encargado_DNI != null)
                return false;
        } else if (!encargado_DNI.equals(other.encargado_DNI))
            return false;
        return true;
    }

    public egreso(){}

    public egreso(int id_egreso){
        this.id_egreso = id_egreso;
    }

    public egreso(String tipo_Egreso, String tipo_pago, String A_nombre, int dia_egreso, int mes_egreso, int year_egreso, String descripcion, String encargado_DNI){
        this.tipo_egreso = tipo_Egreso;
        this.tipo_pago = tipo_pago;
        this.A_nombre = A_nombre;
        this.dia_egreso = dia_egreso;
        this.mes_egreso = mes_egreso;
        this.year_egreso = year_egreso;
        this.descripcion = descripcion;
        this.encargado_DNI = encargado_DNI;
    }

    public egreso(int id_egreso, String tipo_Egreso, String tipo_pago, String A_nombre, int dia_egreso, int mes_egreso, int year_egreso, String descripcion, String encargado_DNI){
        this(tipo_Egreso,tipo_pago,A_nombre,dia_egreso,mes_egreso,year_egreso,descripcion,encargado_DNI);
        this.id_egreso = id_egreso;
    }



    

    




}
