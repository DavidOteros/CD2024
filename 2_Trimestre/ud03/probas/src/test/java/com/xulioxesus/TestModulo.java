package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void testConstructor() {
        Modulo modulo = new Modulo("01", "Matematicas", "Clases Particulares", 2, 2);
    
        // Usar assertEquals para comprobar cada atributo
        assertEquals("01", modulo.getCodigo());
        assertEquals("Matematicas", modulo.getNombre());
        assertEquals("Clases Particulares", modulo.getDescripcion());
        assertEquals(2, modulo.getHoras());
        assertEquals(2, modulo.getSesiones());
    }

    @Test 
    public void comprobarSetters(){

        Modulo modulo = new Modulo();

        modulo.setCodigo("01");
        modulo.setNombre("David");
        modulo.setDescripcion("Clases Particulares");
        modulo.setHoras(2);
        modulo.setSesiones(2);

        assertEquals("01", modulo.getCodigo());
        assertEquals("David", modulo.getNombre());
        assertEquals("Clases Particulares", modulo.getDescripcion());
        assertEquals(2, modulo.getHoras());
        assertEquals(2, modulo.getSesiones());

    }

    @Test
    public void comprobarToString(){

        Modulo modulo = new Modulo("1234", "Matematicas", "Clases de refuerzo", 2, 4);

        String esperado = "Modulo [codigo=1234, nombre=Matematicas, descripcion=Clases de refuerzo, horas=2, sesiones=4]";
 
        assertEquals(esperado, modulo.toString());
        
    }

    @Test
    public void comprobarSesionesAP(){
        
        Modulo modulo = new Modulo();

        assertEquals(0, modulo.sesionesAP());
    }

    @Test
    public void comprobarSesionesPD(){
        
        Modulo modulo = new Modulo();

        assertEquals(0, modulo.sesionesPD());
    }
}
