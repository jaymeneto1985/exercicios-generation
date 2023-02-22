import java.util.Scanner;

public class exercicio_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeiroNumero, ultimoNumero;
	        
        System.out.print("Digite o primeiro número do intervalo: ");
        primeiroNumero = sc.nextInt();
	        
        System.out.print("Digite o último número do intervalo: ");
        ultimoNumero = sc.nextInt();
	        
        if (primeiroNumero >= ultimoNumero) {
            System.out.println("Intervalo inválido!");
            System.exit(0);
        }
	        
        System.out.println("No intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");
        for (int i = primeiroNumero; i <= ultimoNumero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }
    }
}
