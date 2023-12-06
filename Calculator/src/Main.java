import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com valor do raio: ");
        double raio = ler.nextDouble();

        double c =Calculator.circumferencia(raio);
        double v = Calculator.volume(raio);

        System.out.printf("Circumferencia: %.2f%n",c );
        System.out.printf("Volume: %.2f%n",v );
        System.out.printf("PI: %.2f%n", Calculator.PI );




        ler.close();
    }
}