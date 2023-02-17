import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int[][] matriz = new int[3][3];
    Scanner entrada = new Scanner(System.in);
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
        matriz[i][j] = entrada.nextInt();
      }
    }
    
    System.out.print("Diagonal principal: ");
    for (int i = 0; i < 3; i++) {
      System.out.print(matriz[i][i] + " ");
    }
    System.out.println();
    
    System.out.print("Diagonal secundária: ");
    for (int i = 0; i < 3; i++) {
      System.out.print(matriz[i][2-i] + " ");
    }
    System.out.println();
    
    int somaPrincipal = 0;
    for (int i = 0; i < 3; i++) {
      somaPrincipal += matriz[i][i];
    }
    System.out.println("Soma da diagonal principal: " + somaPrincipal);
    
    int somaSecundaria = 0;
    for (int i = 0; i < 3; i++) {
      somaSecundaria += matriz[i][2-i];
    }
    System.out.println("Soma da diagonal secundária: " + somaSecundaria);
  }
}