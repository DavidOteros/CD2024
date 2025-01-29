package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMatematica {
    
    @Test
    public void fib(){
        Matematica mat = new Matematica();
        assertEquals(mat.fib(0), 0);
    }
}
