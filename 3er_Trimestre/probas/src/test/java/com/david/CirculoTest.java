package com.david;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CirculoTest {

    @Test
    public void comprobarConstructor() {

        Circulo c = new Circulo(1, 2, 3);

        assertEquals(1, c.obtenerX());
        assertEquals(2, c.obtenerY());
        assertEquals(3, c.obtenerRadio());

        assertTrue(c instanceof Circulo);
    }

    @Test
    public void comprobarDiametro() {
        Circulo c = new Circulo(0, 0, 5);

        assertEquals(10, c.obtenerDiametro());
    }

    @Test
    public void comprobarCircunferencia() {
        Circulo c = new Circulo(0, 0, 5);
        assertEquals(Math.PI * 10, c.obtenerCircunferencia());
    }

    @Test
    public void comprobarArea() {
        Circulo c = new Circulo(0, 0, 5);
        assertEquals(Math.PI * 25, c.obtenerArea());
    }

    @Test
    public void comprobarToString() {
        Circulo c = new Circulo(5, 10, 7.5);

        String resultado = "Centro = [5,10]; Radio = 7.5";
        assertEquals(resultado, c.toString());
    }
}
