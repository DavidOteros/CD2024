package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestNivel {
    
    @Test
    void testConstructorVacío(){
        Nivel nivel = new Nivel();
        assertNull(nivel.getNivel());
    }

    @Test
    void testConstructor(){
        Nivel nivel = new Nivel("Medio");
        assertTrue(nivel.getNivel().equals("Medio"));
    }

    @Test
    void comprobarSetters(){
        Nivel nivel = new Nivel ();
        nivel.setNivel("medio");
        
    }

    @Test
    public void testToString(){
        Nivel nivel = new Nivel("medio");
        String expected = "Nivel [nivel=medio]";
        assertEquals(expected, nivel.toString());
    }

}
