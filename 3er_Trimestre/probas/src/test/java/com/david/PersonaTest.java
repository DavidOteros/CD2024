package com.david;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    private static final String NOMBRE_INICIAL = "David";
    private static final String NOMBRE_NUEVO = "Carlos";
    private static final int EDAD_INICIAL = 25;
    private static final int EDAD_NUEVA = 30;

    @Test
    public void comprobarConstructorYGetters() {
        Persona p = new Persona(NOMBRE_INICIAL, EDAD_INICIAL);

        assertEquals(NOMBRE_INICIAL, p.getNombre());
        assertEquals(EDAD_INICIAL, p.getEdad());
        assertTrue(p instanceof Persona);
    }

    @Test
    public void comprobarSetters() {
        Persona p = new Persona(NOMBRE_INICIAL, EDAD_INICIAL);

        p.setNombre(NOMBRE_NUEVO);
        p.setEdad(EDAD_NUEVA);

        assertEquals(NOMBRE_NUEVO, p.getNombre());
        assertEquals(EDAD_NUEVA, p.getEdad());
    }

    @Test
    public void comprobarImprimirDetalles() {
        Persona p = new Persona(NOMBRE_INICIAL, EDAD_INICIAL);

        ByteArrayOutputStream salidaConsola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaConsola));

        p.imprimirDetalles();

        String salidaEsperada = "Nombre: " + NOMBRE_INICIAL + "\nEdad: " + EDAD_INICIAL + "\n";
        assertEquals(salidaEsperada, salidaConsola.toString());
    }
}
