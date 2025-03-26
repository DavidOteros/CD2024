package com.xulioxesus;

public class Calculadora implements Imprimible
{
    
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    public void imprimir() {
        System.out.println("pepe");
    }

    public String imprimirEnPdf() {
        return "Pepe";
    }
}