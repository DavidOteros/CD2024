package UD03.javamanual;;

public class TestPersona {
    public static void main(String[] args) {
        Persona mengano, fulano;

        mengano = new Persona();
        fulano = new Persona();

        mengano.nombre = "Pepe";
        fulano.nombre = "Manuel";

        System.out.println(mengano.getNombre());

        System.out.println(mengano + " " + fulano);
        
    }
}