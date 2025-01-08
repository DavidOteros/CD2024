package ud03;

import java.util.Date;

public class Persona {

    //Atributos:
    String dni;
    String nombre;
    String apellido1;
    String apellido;
    String correo;
    Integer movil;
    Date fechNacimiento;

    //Métodos

    public Persona(String nom, String apel){

        nombre=nom;
        apellido1=apel;
    }


}