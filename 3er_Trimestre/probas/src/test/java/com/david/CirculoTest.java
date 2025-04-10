package com.david;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CirculoTest {

    private static final int X1 = 1;
    private static final int Y1 = 2;
    private static final int RADIO1 = 3;

    private static final int RADIO2 = 5;
    private static final int DIAMETRO2 = 10;
    private static final int AREA_RADIO2 = 25;

    private static final int X3 = 5;
    private static final int Y3 = 10;
    private static final double RADIO3 = 7.5;

    @Test
    public void comprobarConstructor() {

        Circulo c = new Circulo(X1, Y1, RADIO1);

        assertEquals(X1, c.obtenerX());
        assertEquals(Y1, c.obtenerY());
        assertEquals(RADIO1, c.obtenerRadio());

        assertTrue(c instanceof Circulo);
    }

    @Test
    public void comprobarDiametro() {
        Circulo c = new Circulo(0, 0, RADIO2);

        assertEquals(DIAMETRO2, c.obtenerDiametro());
    }

    @Test
    public void comprobarCircunferencia() {
        Circulo c = new Circulo(0, 0, RADIO2);
        assertEquals(Math.PI * DIAMETRO2, c.obtenerCircunferencia());
    }

    @Test
    public void comprobarArea() {
        Circulo c = new Circulo(0, 0, RADIO2);
        assertEquals(Math.PI * AREA_RADIO2, c.obtenerArea());
    }

    @Test
    public void comprobarToString() {
        Circulo c = new Circulo(X3, Y3, RADIO3);

        String resultado = "Centro = [" + X3 + "," + Y3 + "]; Radio = " + RADIO3;
        assertEquals(resultado, c.toString());
    }
}
