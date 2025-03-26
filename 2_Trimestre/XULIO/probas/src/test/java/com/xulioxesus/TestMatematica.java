package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestMatematica {
    
    @Test
    public void fib(){
        assertEquals(Matematica.fib(0), 0);
        assertEquals(Matematica.fib(1), 1);
        assertEquals(Matematica.fib(2), 1);
        assertEquals(Matematica.fib(3), 2);
        assertEquals(Matematica.fib(7), 13);
        assertEquals(Matematica.fib(8), 21);
    }

    @Test
    void testSortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, Matematica.bubbleSort(input));
    }

    @Test
    void testUnsortedArray() {
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, Matematica.bubbleSort(input));
    }

    @Test
    void testReverseArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, Matematica.bubbleSort(input));
    }

    @Test
    void testArrayWithDuplicates() {
        int[] input = {4, 2, 2, 8, 3, 3, 1};
        int[] expected = {1, 2, 2, 3, 3, 4, 8};
        assertArrayEquals(expected, Matematica.bubbleSort(input));
    }

    @Test
    void testSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, Matematica.bubbleSort(input));
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, Matematica.bubbleSort(input));
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "2,3,5", "10,5,15"})
    void testSum(int a, int b, int expected) {
        assertEquals(expected, Matematica.sum(a, b));
    }
}
