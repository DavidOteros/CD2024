package com.david;

import java.text.DecimalFormat;

/**
 * Clase que nos permite comprobar a Clase Obxeto Circulo
 */

public class Main {

    /**
     * Método main que nos mostra os comportamentos da Clase Obxeto Circulo
     * @param args O constructor do circulo e a aplicación dos distintos métodos
     */

    public static void main(String[] args) {
        Circulo circulo = new Circulo(37,43,2.5);
        String salida =
                "La coordenada X es "+circulo.obtenerX()+
                "\nLa coordenada Y es "+circulo.obtenerY()+
                "\nEl radio es "+circulo.obtenerRadio();
        circulo.establecerX(35);
        circulo.establecerY(20);
        circulo.establecerRadio(4.2);
        salida+="\n\nLa nueva ubicación y el radio de círculo son\n"+circulo.toString();
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida+="\nEl diámetro es "+dosDigitos.format(circulo.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulo.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulo.obtenerArea());
        System.out.println(salida);
        System.exit(0);
    }
}