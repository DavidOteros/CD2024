package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class TestPersona {

    @Test
    public void comprobarNombre() {

        // Aquí esta creando una nueva algo, y está dando nombre PEPE, asegurandose que
        // funcionen bien los getter y los setter, que lo que escribes sea lo mismo que
        // lo que te devuelve
        Persona mengano = new Persona();
        mengano.setNombre("Pepe");

        boolean resultado = mengano.getNombre() == "Pepe";

        assertTrue(resultado);
    }

    @Test
    public void comprobarConstructorVacio() {

        Persona mengano = new Persona();
        // Aquí se esta asegurando con assertNull, que cuando creas una nueva persona,
        // los atributos sean nullos porque yo de momento aún no los definí

        // boolean resultado = mengano.getNombre() == null;
        // assertTrue(resultado);

        assertNull(mengano.getNombre());
        assertNull(mengano.getApellido1());
        assertNull(mengano.getApellido2());
        assertNull(mengano.getCorreo());
        assertNull(mengano.getDni());
        assertNull(mengano.getFecNacimiento());
        assertNull(mengano.getIban());
        assertNull(mengano.getMovil());
    }

    @Test
    public void comprobarConstructorCompleto() {

        Persona mengano = new Persona("12345678R", "Pepe",
                "Romero", "Torres",
                "pepe@gmail.com", 123456789,
                new Date(), "ES123456789");

        assertTrue(mengano.getNombre().equals("Pepe"));
        assertTrue(mengano.getApellido1().equals("Romero"));
        assertTrue(mengano.getApellido2().equals("Torres"));
        assertTrue(mengano.getCorreo().equals("pepe@gmail.com"));
        assertTrue(mengano.getDni().equals("12345678R"));
        assertTrue(mengano.getIban().equals("ES123456789"));
        assertEquals(mengano.getMovil(), 123456789);
        // se utiliza en las pruebas unitarias para verificar que el valor devuelto por el método getFecNacimiento() es una instancia de la clase Date.
        assertTrue(mengano.getFecNacimiento() instanceof Date);

        assertTrue(mengano instanceof Persona);
    }

    @Test
    public void comprobarSetters() {

        Persona mengano = new Persona();

        mengano.setApellido1("Romero");
        mengano.setApellido2("Torres");
        mengano.setCorreo("pepe@gmail.com");
        mengano.setDni("12345678R");
        mengano.setFecNacimiento(new Date());
        mengano.setIban("ES123456789");
        mengano.setMovil(123456789);
        mengano.setNombre("Pepe");

        assertTrue(mengano.getNombre().equals("Pepe"));
        assertTrue(mengano.getApellido1().equals("Romero"));
        assertTrue(mengano.getApellido2().equals("Torres"));
        assertTrue(mengano.getCorreo().equals("pepe@gmail.com"));
        assertTrue(mengano.getDni().equals("12345678R"));
        assertTrue(mengano.getIban().equals("ES123456789"));
        assertEquals(mengano.getMovil(), 123456789);
        assertTrue(mengano.getFecNacimiento() instanceof Date);
        assertTrue(mengano instanceof Persona);
    }

    @Test
    public void testToString() {
        Persona persona = new Persona("12345678A", "Juan", "Pérez", "García", "juan@example.com",
                600123456, new Date(), "ES6621000418401234567891");

        String expected = "Persona [dni=12345678A, nombre=Juan, apellido1=Pérez, apellido2=García, correo=juan@example.com, "
                +
                "movil=600123456, fecNacimiento=" + persona.getFecNacimiento() +
                ", iban=ES6621000418401234567891]";

        assertEquals(expected, persona.toString());
    }

}
