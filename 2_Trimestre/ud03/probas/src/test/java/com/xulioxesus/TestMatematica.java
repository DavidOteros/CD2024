package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMatematica {

    @Test
    public void fib() {
        Matematica mat = new Matematica();

        // Casos base
        assertEquals(0, mat.fib(0), "El Fibonacci de 0 debería ser 0");
        assertEquals(1, mat.fib(1), "El Fibonacci de 1 debería ser 1");

        // Vale ya lo entendí
        assertEquals(1, mat.fib(2), "El Fibonacci de 2 debería ser 1");
        assertEquals(2, mat.fib(3), "El Fibonacci de 3 debería ser 2");
        assertEquals(3, mat.fib(4), "El Fibonacci de 4 debería ser 3");
        assertEquals(5, mat.fib(5), "El Fibonacci de 5 debería ser 5");
        assertEquals(8, mat.fib(6), "El Fibonacci de 6 debería ser 8");
        assertEquals(13, mat.fib(7), "El Fibonacci de 7 debería ser 13");
    }
}
