package com.davidotero;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    @Test
    public void probarConstructor() {

        CuentaBancaria c = new CuentaBancaria("Miguel", 1000);

        assertEquals("Miguel", c.getTitular());
        assertEquals(1000, c.getSaldo());
    }

    @Test
    public void depositar() {
        CuentaBancaria c = new CuentaBancaria("Miguel", 1000);
        c.depositar(200);
        assertEquals(1200, c.getSaldo());

    }

    @Test
    public void depositarCantidadNegativaLanzaExcepcion() {
        CuentaBancaria c = new CuentaBancaria("Luis", 300);

        try {
            c.depositar(-100);
        } catch (IllegalArgumentException e) {
            assertEquals("La cantidad a depositar debe ser mayor que cero.", e.getMessage());
        }
    }

    @Test
    public void retirar(){
        CuentaBancaria c = new CuentaBancaria("Miguel", 200);
        c.retirar(100);
        assertEquals(100, c.getSaldo());
    }

    @Test
    public void retirarDeMenosException(){
        CuentaBancaria c = new CuentaBancaria("Miguel", 200);
        try {
            c.retirar(-300);
        } catch (IllegalArgumentException e) {
            assertEquals("No se puede retirar la cantidad especificada.", e.getMessage());
        }
    }


    @Test
    public void retirarDeMasException(){
        CuentaBancaria c = new CuentaBancaria("Miguel", 200);
        try {
            c.retirar(300);
        } catch (IllegalArgumentException e) {
            assertEquals("No se puede retirar la cantidad especificada.", e.getMessage());
        }
    }


}
