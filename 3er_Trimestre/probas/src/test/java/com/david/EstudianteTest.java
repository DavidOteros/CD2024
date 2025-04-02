package com.david;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {

    @Test
    public void comprobarConstructor() {
        Estudiante javier = new Estudiante("Javier", 20);
        Estudiante pablo = new Estudiante("Pablo", 17);

        assertEquals("Javier", javier.getNombre());
        assertEquals(20, javier.getEdad());
        
        assertEquals("Pablo", pablo.getNombre());
        assertEquals(17, pablo.getEdad());
    }

    @Test
    public void comprobarSettersYGetters() {
        Estudiante javier = new Estudiante("Javier", 20);
        
        javier.setNombre("Juan");
        javier.setEdad(22);
        javier.setCalificacion(8.5);
        
        assertEquals("Juan", javier.getNombre());
        assertEquals(22, javier.getEdad());
        assertEquals(8.5, javier.getCalificacion());
    }

    @Test
    public void comprobarAprobo() {
        Estudiante javier = new Estudiante("Javier", 20);
        javier.setCalificacion(6.0);
        
        Estudiante pablo = new Estudiante("Pablo", 17);
        pablo.setCalificacion(4.0);
        
        // Comprobar si aprobaron
        assertTrue(javier.aprobo());
        assertFalse(pablo.aprobo());
    }

    @Test
    public void comprobarEdadEscolar() {
        Estudiante javier = new Estudiante("Javier", 20);
        Estudiante pablo = new Estudiante("Pablo", 17);

        // Comprobar la edad escolar
        assertEquals(1, javier.edadEscolar());
        assertEquals(1, pablo.edadEscolar());
    }

    @Test
    public void comprobarEsUniversitario() {
        Estudiante javier = new Estudiante("Javier", 20);
        Estudiante pablo = new Estudiante("Pablo", 17);

        // Comprobar si son universitarios
        assertTrue(javier.esUniversitario());
        assertFalse(pablo.esUniversitario());
    }
}
