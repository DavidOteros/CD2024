package com.david;

public class Fecha {

    private static final int MES_12 = 12;
    private static final int DIA_28 = 28;
    private static final int DIA_29 = 29;
    private static final int DIA_30 = 30;
    private static final int DIA_31 = 31;
    private static final int COMPROBANTE4 = 4;
    private static final int COMPROBANTE100 = 100;
    private static final int COMPROBANTE400 = 400;
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

        int diasMes = 0;

        switch (mes) {
            case 1:
                diasMes = DIA_31;
                break;
            case 2:
                if (anio % COMPROBANTE400 == 0 || anio % COMPROBANTE4 == 0 && anio % COMPROBANTE100 != 0) {
                    diasMes = DIA_29;
                } else {
                    diasMes = DIA_28;
                }
                break;
            case 3:
                diasMes = DIA_31;
                break;
            case 4:
                diasMes = DIA_30;
                break;
            case 5:
                diasMes = DIA_31;
                break;
            case 6:
                diasMes = DIA_30;
                break;
            case 7:
                diasMes = DIA_31;
                break;
            case 8:
                diasMes = DIA_31;
                break;
            case 9:
                diasMes = DIA_30;
                break;
            case 10:
                diasMes = DIA_31;
                break;
            case 11:
                diasMes = DIA_30;
                break;
            case 12:
                diasMes = DIA_31;
                break;
            default:
        }

        return dia <= diasMes;
    }

}
