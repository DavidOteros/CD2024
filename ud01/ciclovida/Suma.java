public class Suma {
    public static void main(String[] args) {
       
        double numero1 = Double.parseDouble(args[0]);
        double numero2 = Double.parseDouble(args[1]);
        
        double suma = numero1 + numero2;

        if (args.length == 3){
            double numero3 = Double.parseDouble(args[2]);
            suma = suma + numero3;
        }

        suma = numero1 + numero2;


        System.out.println(suma);
       
    }
}
