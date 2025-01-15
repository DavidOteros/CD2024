package UD03.javamanual;

import java.util.Date;

public class Modulo {

    //Atributos
    String codigo;
    String nombre;
    String descripcion;
    Integer horas;
    Integer sesiones;
    String iban;

    public Modulo(){
        
    }


    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public Integer getSesiones() {
        return sesiones;
    }
    public void setSesiones(Integer sesiones) {
        this.sesiones = sesiones;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }


    @Override
    public String toString() {
        return "Modulo [getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre() + ", getDescripcion()="
                + getDescripcion() + ", getHoras()=" + getHoras() + ", getSesiones()=" + getSesiones() + ", getIban()="
                + getIban() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    
    
}