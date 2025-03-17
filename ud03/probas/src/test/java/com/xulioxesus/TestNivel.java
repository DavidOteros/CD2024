package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestNivel {

    @Test
    void constructorVacio() {
        // Crear instancia usando el constructor por defecto
        Nivel nivel = new Nivel();

        // Asegurarse de que sea una instancia de Nivel
        assertTrue(nivel instanceof Nivel, "El objeto no es una instancia de Nivel.");

        // Comprobar que el atributo 'nivel' es null por defecto
        assertNull(nivel.getNivel(), "El atributo 'nivel' debería ser null por defecto.");
    }

    @Test
    void constructorConParametro() {
        // Crear instancia usando el constructor con parámetro
        String expectedNivel = "Primario";
        Nivel nivel = new Nivel(expectedNivel);

        // Comprobar que el atributo 'nivel' se ha inicializado correctamente
        assertEquals(expectedNivel, nivel.getNivel(), "El constructor con parámetro no inicializó el atributo correctamente.");
    }

    @Test
    void comprobarSettersYGetters() {
        // Crear instancia
        Nivel nivel = new Nivel();

        // Configurar el valor del atributo usando el setter
        String expectedNivel = "Secundario";
        nivel.setNivel(expectedNivel);

        // Verificar que el getter devuelve el valor correcto
        assertEquals(expectedNivel, nivel.getNivel(), "El setter/getter de 'nivel' no funciona correctamente.");
    }

    @Test
    void comprobarToString() {
        // Crear instancia y configurar el atributo
        Nivel nivel = new Nivel();
        String expectedNivel = "Universitario";
        nivel.setNivel(expectedNivel);

        // Comprobar el método toString()
        String expectedString = "Nivel [nivel=" + expectedNivel + "]";
        assertEquals(expectedString, nivel.toString(), "El método toString no devuelve la cadena esperada.");
    }
}
