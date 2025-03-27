package com.david;

public class Persona {

    private String nombre;
    private int edad;


    /**
     * Constructor da Clase Persoa
     * @param nombre Nombre da Clase Persoa
     * @param edad Edad da Clase Persoa
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método para obter o Nome 
     * @return Devolve o nome 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para Settear o Nome 
     * @param nombre Nombre do obxeto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obter a Edad
     * @return  Edad do obxeto
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para Setter a Edad
     * @param edad Edad do obxeto
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para imprimir Nombre e Edad do obxeto
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
