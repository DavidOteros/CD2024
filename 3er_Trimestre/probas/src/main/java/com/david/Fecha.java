package com.david;

public class Fecha {

    private static final int MES_12 = 12;
    private static final int DIA_30 = 30;
    private static final int DIA_31 = 31;


    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean valida() {
        if (dia < 1 || dia > DIA_31) {
            return false;
        }
        if (mes < 1 || mes > MES_12) {
            return false;
        }
        // determinamos la cantidad de días del mes:
        int diasMes = 0;
        switch (mes) {
            case 1:
            case 2: // verificación de año bisiesto
                if (anio % 400 == 0
                    || anio % 4 == 0
                    && anio % 100 != 0) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                diasMes = DIA_30;
                break;
            case 12:
                diasMes = DIA_31;
                break;
            default:
        }

        if (dia > diasMes) {
            return false;
        }
        else {
            return true;
        }
    }

}

