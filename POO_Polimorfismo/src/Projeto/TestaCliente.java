package Projeto;
public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "111.222.333-44", "Rua A, 123", "(11) 99999-9999", 30);
        Cliente cliente2 = new Cliente("Maria", "555.666.777-88", "Rua B, 456", "(11) 88888-8888", 25);
        Cliente cliente3 = new Cliente("Pedro", "23.456.444/0001-23", "Rua c, 789", "(11) 77777-7777", 35);
        
        System.out.println("Dados do primeiro cliente:");
        cliente1.visualizar();

        System.out.println("\nDados do segundo cliente:");
        cliente2.visualizar();
        
        System.out.println("\nDados do segundo cliente:");
        cliente3.visualizar();
        
    }
    
        public static void main1(String[] args) {
            Cliente_PessoaFisica pf;
    }
        public static void main2(String[] args) {
            Cliente_PessoaJuridica pj;
    }
}