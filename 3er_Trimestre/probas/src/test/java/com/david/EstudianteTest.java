package com.david;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EstudianteTest {

    private static final int EDAD_JAVIER = 20;
    private static final int EDAD_PABLO = 17;
    private static final int NUEVA_EDAD = 22;
    private static final double CALIFICACION_BUENA = 8.5;
    private static final double CALIFICACION_APROBADA = 6.0;
    private static final double CALIFICACION_REPROBADA = 4.0;

    @Test
    public void comprobarConstructor() {
        Estudiante javier = new Estudiante("Javier", EDAD_JAVIER);
        Estudiante pablo = new Estudiante("Pablo", EDAD_PABLO);

        assertEquals("Javier", javier.getNombre());
        assertEquals(EDAD_JAVIER, javier.getEdad());
        assertEquals("Pablo", pablo.getNombre());
        assertEquals(EDAD_PABLO, pablo.getEdad());
    }

    @Test
    public void comprobarSettersYGetters() {
        Estudiante javier = new Estudiante("Javier", EDAD_JAVIER);

        javier.setNombre("Juan");
        javier.setEdad(NUEVA_EDAD);
        javier.setCalificacion(CALIFICACION_BUENA);

        assertEquals("Juan", javier.getNombre());
        assertEquals(NUEVA_EDAD, javier.getEdad());
        assertEquals(CALIFICACION_BUENA, javier.getCalificacion());
    }

    @Test
    public void comprobarAprobo() {
        Estudiante javier = new Estudiante("Javier", EDAD_JAVIER);
        javier.setCalificacion(CALIFICACION_APROBADA);

        Estudiante pablo = new Estudiante("Pablo", EDAD_PABLO);
        pablo.setCalificacion(CALIFICACION_REPROBADA);

        assertTrue(javier.aprobo());
        assertFalse(pablo.aprobo());
    }

    @Test
    public void comprobarEdadEscolar() {
        Estudiante javier = new Estudiante("Javier", EDAD_JAVIER);
        Estudiante pablo = new Estudiante("Pablo", EDAD_PABLO);

        assertEquals(1, javier.edadEscolar());
        assertEquals(1, pablo.edadEscolar());
    }

    @Test
    public void comprobarEsUniversitario() {
        Estudiante javier = new Estudiante("Javier", EDAD_JAVIER);
        Estudiante pablo = new Estudiante("Pablo", EDAD_PABLO);

        assertTrue(javier.esUniversitario());
        assertFalse(pablo.esUniversitario());
    }
}
