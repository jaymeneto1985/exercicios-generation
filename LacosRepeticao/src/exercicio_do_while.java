import java.util.Scanner;

public class exercicio_do_while {
    public static void main(String[] args) {
        int numero = 0, somaTotal = 0;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("\n Digite um número. Para sair, digite 0: ");
            numero = ler.nextInt();

            somaTotal += numero;
        } while (numero != 0);
        System.out.println("A soma dos numeros digitados é: " + somaTotal);
    }
}
