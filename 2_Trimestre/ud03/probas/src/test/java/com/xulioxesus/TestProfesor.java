package com.xulioxesus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class TestProfesor {

    @Test 
    public void comprobarConstructor() {
        // Crear instancia de Profesor usando el constructor sin parámetros
        Profesor profe = new Profesor();

        // Comprobar los valores iniciales de los atributos
        assertNull(profe.getEspecialidad(), "El atributo 'especialidad' debería ser null.");
        assertNull(profe.getCuerpo(), "El atributo 'cuerpo' debería ser null.");
        assertFalse(profe.isSustituto(), "El atributo 'sustituto' debería ser false.");
        assertNull(profe.getFecOposicion(), "El atributo 'fecOposicion' debería ser null.");
    }

    @Test 
    public void comprobarSettersYGetters() {
        Profesor profe = new Profesor();

        // Configurar valores con setters
        profe.setEspecialidad("Matemáticas");
        profe.setCuerpo("Industrial");
        profe.setSustituto(true);
        Date fecha = new Date(2000 - 1900, 0, 1); // Año 2000, enero (mes 0), día 1
        profe.setFecOposicion(fecha);

        // Verificar valores con getters
        assertEquals("Matemáticas", profe.getEspecialidad(), "El setter/getter de 'especialidad' no funciona correctamente.");
        assertEquals("Industrial", profe.getCuerpo(), "El setter/getter de 'cuerpo' no funciona correctamente.");
        assertTrue(profe.isSustituto(), "El setter/getter de 'sustituto' no funciona correctamente.");
        assertEquals(fecha, profe.getFecOposicion(), "El setter/getter de 'fecOposicion' no funciona correctamente.");
    }

    @Test
    public void comprobarToString() {
        Profesor profe = new Profesor();

        // Configurar valores
        profe.setEspecialidad("Filosofía");
        profe.setCuerpo("Secundaria");
        profe.setSustituto(false);
        Date fecha = new Date(2025 - 1900, 2, 16); // Año 2025, marzo (mes 2), día 16
        profe.setFecOposicion(fecha);

        // Crear la cadena esperada
        String expectedString = "Profesor [especialidad=Filosofía, cuerpo=Secundaria, sustituto=false, fecOposicion=" + fecha + "]";

        // Comprobar el método toString
        assertEquals(expectedString, profe.toString(), "El método toString no devuelve el resultado esperado.");
    }
}
