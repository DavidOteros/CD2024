package com.xulioxesus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class TestProfesor {

    @Test
    public void testSetAndGetNombre() {
        Profesor profe = new Profesor();
        profe.setNombre("Pepe");
        assertEquals("Pepe", profe.getNombre(), "El nombre del profesor debería ser Pepe");
    }

    @Test
    public void testSetAndGetEspecialidad() {
        Profesor profe = new Profesor();
        profe.setEspecialidad("Física");
        assertEquals("Física", profe.getEspecialidad(), "La especialidad debería ser Física");
    }

    @Test
    public void testSetAndGetCuerpo() {
        Profesor profe = new Profesor();
        profe.setCuerpo("Secundaria");
        assertEquals("Secundaria", profe.getCuerpo(), "El cuerpo debería ser Secundaria");
    }

    @Test
    public void testSetAndGetSustituto() {
        Profesor profe = new Profesor();
        profe.setSustituto(true);
        assertTrue(profe.isSustituto(), "El profesor debería ser sustituto");
        profe.setSustituto(false);
        assertFalse(profe.isSustituto(), "El profesor no debería ser sustituto");
    }

    @Test
    public void testSetAndGetFecOposicion() {
        Profesor profe = new Profesor();
        Date fecha = new Date();
        profe.setFecOposicion(fecha);
        assertEquals(fecha, profe.getFecOposicion(), "La fecha de oposición debería coincidir");
    }

    @Test
    public void testToString() {
        Profesor profe = new Profesor();
        profe.setEspecialidad("Matemáticas");
        profe.setCuerpo("Primaria");
        profe.setSustituto(true);
        Date fecha = new Date();
        profe.setFecOposicion(fecha);

        String esperado = "Profesor [especialidad=Matemáticas, cuerpo=Primaria, sustituto=true, fecOposicion=" + fecha + "]";
        assertEquals(esperado, profe.toString(), "La representación en cadena no es correcta");
    }
}
