package com.david;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonaTest {

    @Test
    public void comprobarConstructorYGetters() {
        Persona p = new Persona("David", 25);
        
        assertEquals("David", p.getNombre());
        assertEquals(25, p.getEdad());
        assertTrue(p instanceof Persona);
    }

    @Test
    public void comprobarSetters() {
        Persona p = new Persona("David", 25);
        
        p.setNombre("Carlos");
        p.setEdad(30);
        
        assertEquals("Carlos", p.getNombre());
        assertEquals(30, p.getEdad());
    }

    @Test
    public void comprobarImprimirDetalles() {
        Persona p = new Persona("David", 25);
    
        ByteArrayOutputStream salidaConsola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaConsola));
    
        p.imprimirDetalles();
    
        String salidaEsperada = "Nombre: David\nEdad: 25\n";
        assertEquals(salidaEsperada, salidaConsola.toString());
    }
}
