package LacosCondicional;
import java.util.Scanner;

public class exerciciolaço3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        
        double preco, total;
        String produto;
        
        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.0;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.0;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.0;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.0;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.0;
                break;
            case 6:
                produto = "Suco de laranja";
                preco = 13.0;
                break;
            default:
                produto = "Produto não encontrado";
                preco = 0.0;
        }
        
        total = quantidade * preco;
        System.out.printf("Total da compra: R$ %.2f\n", total);
        System.out.printf("Produto escolhido: %s\n", produto);
        
        sc.close();
    }
}

