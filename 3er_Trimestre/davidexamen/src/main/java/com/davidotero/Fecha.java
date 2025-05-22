package com.davidotero;

public final class Fecha {

    private static final int MES_12 = 12;
    private static final int DIA_28 = 28;
    private static final int DIA_29 = 29;
    private static final int DIA_30 = 30;
    private static final int DIA_31 = 31;
    private static final int COMPROBANTE4 = 4;
    private static final int COMPROBANTE100 = 100;
    private static final int COMPROBANTE400 = 400;
    private static final int C1 = 1;
    private static final int C2 = 2;
    private static final int C3 = 3;
    private static final int C4 = 4;
    private static final int C5 = 5;
    private static final int C6 = 6;
    private static final int C7 = 7;
    private static final int C8 = 8;
    private static final int C9 = 9;
    private static final int C10 = 10;
    private static final int C11 = 11;
    private static final int C12 = 12;

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
            case C1:
                diasMes = DIA_31;
                break;
            case C2:
                if (COMPROBANTE400 == 0 || COMPROBANTE4 == 0 && COMPROBANTE100 != 0) {
                    diasMes = DIA_29;
                } else {
                    diasMes = DIA_28;
                }
                break;
            case C3:
                diasMes = DIA_31;
                break;
            case C4:
                diasMes = DIA_30;
                break;
            case C5:
                diasMes = DIA_31;
                break;
            case C6:
                diasMes = DIA_30;
                break;
            case C7:
                diasMes = DIA_31;
                break;
            case C8:
                diasMes = DIA_31;
                break;
            case C9:
                diasMes = DIA_30;
                break;
            case C10:
                diasMes = DIA_31;
                break;
            case C11:
                diasMes = DIA_30;
                break;
            case C12:
                diasMes = DIA_31;
                break;
            default:
        }

        if (dia > diasMes) {
            return false;
        }
        return true;

    }

}
