package UD03.javamanual;

import java.util.Date;

public class Centro {

    //Atributos
    Integer codigo;
    String nombre;
    String localidad;
    String calle;
    String numero;
    Integer codigoPostal;

    public Centro(){
        
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Centro [getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre() + ", getLocalidad()="
                + getLocalidad() + ", getCalle()=" + getCalle() + ", getNumero()=" + getNumero()
                + ", getCodigoPostal()=" + getCodigoPostal() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }


   