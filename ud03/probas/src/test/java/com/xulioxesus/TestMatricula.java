package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestMatricula {
    
    //Comprobamos constructor vacío

    @Test
    public void comprobarConstructorVacio(){
        Matricula matricula = new Matricula();

        assertNull(matricula.getAlumno());
        assertNull(matricula.getModulo());
        assertNull(matricula.getNota());
        assertNull(matricula.getCurso());

    }
    
    @Test
    public void comprobarConstructor(){

        Alumno alumno = new Alumno();
        Modulo modulo = new Modulo();

        Matricula matricula = new Matricula(alumno, modulo, 9, "Matemáticas");

        assertEquals(alumno, matricula.getAlumno());
        assertEquals(modulo, matricula.getModulo());
        assertEquals(9, matricula.getNota());
        assertEquals("Matemáticas", matricula.getCurso());

        //Comrpobamos que sea una instancia de 
        assertTrue(matricula instanceof Matricula);
    }

    @Test
    public void comprobarSetters(){

        // Creamos alumnos
        Alumno alumno = new Alumno();
        Modulo modulo = new Modulo();

        //Creamos matricula
        Matricula matricula = new Matricula();

        //Ponemos setters
        matricula.setAlumno(alumno);
        matricula.setModulo(modulo);
        matricula.setCurso("Primero");
        matricula.setNota(5);

        assertEquals(alumno, matricula.getAlumno());
        assertEquals(modulo, matricula.getModulo());
        assertEquals("Primero", matricula.getCurso());
        assertEquals(5, matricula.getNota());

    }

    @Test
    public void comprobarToString(){

        Alumno alumno = new Alumno();
        Modulo modulo = new Modulo();
        Matricula matricula = new Matricula(alumno, modulo, 9, "Matemáticas");

        String expected = "Matricula [alumno=" + alumno + ", modulo=" + modulo + ", nota=9, curso=Matemáticas]";

        assertEquals(expected, matricula.toString());

    }

}
