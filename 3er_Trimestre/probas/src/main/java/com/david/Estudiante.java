package com.david;
public class Estudiante {

    private String nombre;
    private int edad;
    private double calificacion;

    /**
     * Constructor da Clase Estudiante.
     * @param nombre Nombre de Estudiante.
     * @param edad Edad de Estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Método para poñer a calificación
     * @param calificacion Calificación de Estudiante
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Métogo Get Nome
     * @return Nombre de Estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método Set Nome
     * @param nombre Nombre de Estudiante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método Get Edad 
     * @return Edad do Estudiante
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método Set Edad 
     * @param edad Edad do Estudiante
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método Get Calificación
     * @return Devolve a Calificación do Estudiante
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Métódo booleano para saber se aproba o Estudiante
     * @return true ou false dependendo de se o Estudiante aprobou ou no (Calificación >= 5 --> True)
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /**
     * Método que calcula a Edade Escolar do Estudiante
     * @return Edad Escolar do Estudiante 
     */
    public int edadEscolar() {
        return edad / 12;
    }

    /**
     * Método booleano que verifica se o Estudiante é maior de 18 anos
     * @return Booleano que verifica se o Estudiante está na idade universitaria ou no (Edad >= 18 --> True)
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }

    /**
     * Método que imprime a información do Usuario
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}