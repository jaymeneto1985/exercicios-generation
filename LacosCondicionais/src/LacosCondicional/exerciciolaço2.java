package LacosCondicional;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exerciciolaço2 {
    public static void main(String[] args) {
        double num;
        Scanner ler = new Scanner(System.in);
        System.out.println("\nDigite um numero qualquer: ");
        DecimalFormat teste = new DecimalFormat("0.00");
        num = ler.nextFloat();

        if (num % 2 == 0) {
            double raiz = Math.sqrt(num);
            System.out.println(num + " é par e raiz quadrada: " + teste.format(raiz));
        }else {
            double quadrado = Math.pow(num, 2);
            System.out.println(num + " é impar  e o quadrado: " + teste.format(quadrado));
        }
    }
}

