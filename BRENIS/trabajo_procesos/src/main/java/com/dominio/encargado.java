package com.dominio;

public class encargado {
    private String dni_encargado;
    private String username;
    private String nombre;
    private String apellido;
    private String contraseña;
    private Boolean habilitado;

    public String getDni_encargado() {
        return this.dni_encargado;
    }
    public void setDni_encargado(String dni_encargado) {
        this.dni_encargado = dni_encargado;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getContraseña() {
        return this.contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public Boolean getHabilitado() {
        return this.habilitado;
    }
    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "encargado [dni_encargado=" + dni_encargado + ", username=" + username + ", nombre=" + nombre
                + ", apellido=" + apellido + ", contraseña=" + contraseña + ", habilitado=" + habilitado + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni_encargado == null) ? 0 : dni_encargado.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((contraseña == null) ? 0 : contraseña.hashCode());
        result = prime * result + ((habilitado == null) ? 0 : habilitado.hashCode());
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
        encargado other = (encargado) obj;
        if (dni_encargado == null) {
            if (other.dni_encargado != null)
                return false;
        } else if (!dni_encargado.equals(other.dni_encargado))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (contraseña == null) {
            if (other.contraseña != null)
                return false;
        } else if (!contraseña.equals(other.contraseña))
            return false;
        if (habilitado == null) {
            if (other.habilitado != null)
                return false;
        } else if (!habilitado.equals(other.habilitado))
            return false;
        return true;
    }

    public encargado(){}

    public encargado(String DNI){
        this.dni_encargado = DNI;
    }

    public encargado(String DNI,String nombre, String apellido, String contraseña){
        this.dni_encargado = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = (this.nombre + "_" + this.apellido).replace(" ", "_").toLowerCase();
        this.contraseña = contraseña;
        this.habilitado = false;
    }
    




}
