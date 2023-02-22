package Projeto;
public class TestaFuncionario {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("João", "123.456.789-00", "Gerente de Vendas", 5000, 30, "Vendas");
        Gerente gerente2 = new Gerente("Maria", "987.654.321-00", "Gerente de Marketing", 6000, 35, "Marketing");

        Vendedor vendedor1 = new Vendedor("José", "111.222.333-44", "Vendedor", 2000, 25, 20);
        Vendedor vendedor2 = new Vendedor("Ana", "555.666.777-88", "Vendedora", 2500, 28, 30);

        gerente1.visualizar();
        System.out.println("---------------------");
        gerente2.visualizar();
        System.out.println("---------------------");
        vendedor1.visualizar();
        System.out.println("---------------------");
        vendedor2.visualizar();
        }
 }