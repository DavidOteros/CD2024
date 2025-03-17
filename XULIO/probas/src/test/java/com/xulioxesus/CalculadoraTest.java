package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraTest implements ThrowingRunnable{

    private final Calculadora calculadora = new Calculadora();

    @ParameterizedTest
    @CsvSource({"1,2,3", "-1,-1,-2", "0,5,5"})
    void testSumar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.sumar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"5,3,2", "10,5,5", "0,0,0"})
    void testRestar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.restar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2,3,6", "-2,2,-4", "0,5,0"})
    void testMultiplicar(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.multiplicar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"6,2,3", "10,5,2", "9,3,3"})
    void testDividir(int a, int b, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.dividir(a, b), 0.001);
    }

    @ParameterizedTest
    @CsvSource({"10,0"})
    void testDividirPorCero(int a, int b) {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(a, b));
    }
}
