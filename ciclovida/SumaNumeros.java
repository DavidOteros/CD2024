package ciclovida;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        double resultado = numero1 + numero2;
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
        
        scanner.close();
    }
}


