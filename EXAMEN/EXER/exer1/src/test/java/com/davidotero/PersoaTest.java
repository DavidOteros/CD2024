package com.davidotero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PersoaTest {

    @Test
    void testSetGetIdade() {
        //Creamos nuevo objeto
        Persoa persoa = new Persoa();
        //Le damos una edad
        persoa.setIdade(25);
        //Comparamos que coincida
        assertEquals(25, persoa.getIdade());

    }


    @Test
    void testIdadeValida(){
        Persoa persoa = new Persoa ();
        persoa.setIdade(25);
        assertTrue(persoa.idadeValida());
    }


    @Test
    void testIdadeInvalidaInferior(){
        Persoa persoa = new Persoa ();
        persoa.setIdade(17);
        assertFalse(persoa.idadeValida());
    }


    @Test
    void testIdadeInvalidaSuperior(){
        Persoa persoa = new Persoa ();
        persoa.setIdade(80);
        assertFalse(persoa.idadeValida());
    }


}
