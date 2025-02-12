package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestModulo {
    
    @Test
    void testConstructorVacío(){
        Modulo modulo = new Modulo();
        assertNull(modulo.getCodigo());
        assertNull(modulo.getNombre());
        assertNull(modulo.getDescripcion());
        assertNull(modulo.getHoras());
        assertNull(modulo.getSesiones());
    }

    @Test
    public void testConstructor(){
        Modulo modulo = new Modulo("01", "Matematicas", "Clases Particulares", 2, 2);
        assertTrue(modulo.getCodigo().equals("01"));
        assertTrue(modulo.getNombre().equals("Matematicas"));
        assertTrue(modulo.getDescripcion().equals("Clases Particulares"));
        assertTrue(modulo.getHoras().equals(2));
        assertTrue(modulo.getSesiones().equals(2));
    }

    @Test 
    public void comprobarSetters(){

        Modulo modulo = new Modulo();

        modulo.setCodigo("01");
        modulo.setNombre("David");
        modulo.setDescripcion("Clases Particulares");
        modulo.setHoras(2);
        modulo.setSesiones(2);

    }

}
