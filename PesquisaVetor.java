import java.util.Scanner;

public class PesquisaVetor {
    public static void main(String[] args) {
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número a ser pesquisado: ");
        int num = input.nextInt();
        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
            	posicao = i;
                break;
            }
        }
        if (posicao == -1) {
            System.out.println("Não foi encontrado!");
        } else {
            System.out.println("O número " + num + " foi encontrado na posição " + posicao + " do vetor.");
        }
    }
}
