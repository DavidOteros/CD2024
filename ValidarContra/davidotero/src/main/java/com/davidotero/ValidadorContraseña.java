package com.davidotero;

public class ValidadorContraseña {

    public boolean esValida(String contraseña) {

        
        if (contraseña == null || contraseña.length() < 8) {
            return false; // Menos de 8 caracteres o nula
        }

        return tieneMayuscula(contraseña) &&
               tieneMinuscula(contraseña) &&
               tieneNumero(contraseña) &&
               tieneEspecial(contraseña);
    }

    private boolean tieneMayuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (c >= 65 && c <= 90) { // A-Z en ASCII
                return true;
            }
        }
        return false;
    }

    private boolean tieneMinuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (c >= 97 && c <= 122) { // a-z en ASCII
                return true;
            }
        }
        return false;
    }

    private boolean tieneNumero(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (c >= 48 && c <= 57) { // 0-9 en ASCII
                return true;
            }
        }
        return false;
    }

    private boolean tieneEspecial(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64) ||
                (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) { // Caracteres especiales en ASCII
                return true;
            }
        }
        return false;
    }
}
