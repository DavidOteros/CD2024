package com.xulioxesus;

public class TestImprimible {
    
    public void run(Imprimible loquesea){
        loquesea.imprimirEnPdf();
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        TestImprimible test = new TestImprimible();

        test.run(calc);
    }
}
