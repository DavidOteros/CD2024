package com.david;

/**
 * Clase Circulo: Sus atributos son X, Y e o radio do círculo.
 */
public class Circulo {
    private int x;
    private int y;
    private double radio;

    /**
     * Constructor de circulo.
     * @param valorX Valor X do Circulo.
     * @param valorY Valor Y do Circulo.
     * @param valorRadio Valor do Radio do Circulo.
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Método para establecer o eixo X do Circulo.
     * @param valorX Pvalor X do Circulo.
     */
    public void establecerX(int valorX) {
        x = valorX;
    }

    /**
     * Método para obter o eixo X do Circulo.
     * @return O valor X do Circulo.
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Método para establecer o eixo Y do Circulo.
     * @param valorY O valor Y do Circulo.
     */
    public void establecerY(int valorY) {
        y = valorY;
    }

    /**
     * Método para obter o eixo Y.
     * @return Devolve o Valor Y do Circulo.
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Método para calcular o radio do Circulo.
     * @param valorRadio Valor do Radio do Circulo.
     */
    public void establecerRadio(double valorRadio) {
        radio = valorRadio < 0.0 ? 0.0 : valorRadio;
    }

    /**
     * Método para obter o radio.
     * @return O radio do Circulo.
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Método para obter o diámetro do Circulo.
     * @return Devolve o Diámetro do Circulo.
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Método para devolver a circunferencia do Circulo.
     * @return Devolve a circunferencia do Circulo.
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Método para devolver a Area do Circulo.
     * @return Devolver a Area do Circulo.
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Método toString.
     * @return Devolve as coordenadas X e Y, e o Radio do Circulo.
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
