package com.davidotero;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    @Test
    public void encontrarMinimo() {
        int[] array = new int[] { 4, 2, 8 };

        assertEquals(2, ArrayUtils.encontrarMinimo(array));
    }

    @Test
    public void encontrarVacioMinimo() {
        int[] array = new int[] {};

        try {
            ArrayUtils.encontrarMinimo(array);
        } catch (IllegalArgumentException e) {
            assertEquals("El array no puede estar vacío", e.getMessage());
        }
    }

    @Test
    public void encontrarMaximo() {
        int[] array = new int[] { 8, 4, 2, 16, 22 };
        assertEquals(22, ArrayUtils.encontrarMaximo(array));
    }

    @Test
    public void encontrarVacioMaximo(){
        int [] array = new int[] {};

        try {
            ArrayUtils.encontrarMaximo(array);
        } catch (IllegalArgumentException e) {
            assertEquals("El array no puede estar vacío", e.getMessage());
        }
    }


    @Test
    public void calcularPromedio(){
        int [] array = new int[] {10, 30};
        assertEquals(20, ArrayUtils.calcularPromedio(array));
    }

    @Test
    public void encontrarPromedioVacio(){
        int [] array = new int[] {};

        try {
            ArrayUtils.calcularPromedio(array);
        } catch (IllegalArgumentException e) {
            assertEquals("El array no puede estar vacío", e.getMessage());
        }
    }

}
