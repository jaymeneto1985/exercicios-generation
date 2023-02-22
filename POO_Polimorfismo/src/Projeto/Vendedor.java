package Projeto;

public class Vendedor extends Funcionario {
    private int vendasRealizadas;

    public Vendedor(String nome, String cpf, String cargo, double salario, int idade, int vendasRealizadas) {
        super(nome, cpf, cargo, salario, idade);
        this.vendasRealizadas = vendasRealizadas;
    }

    public int getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void setVendasRealizadas(int vendasRealizadas) {
        this.vendasRealizadas = vendasRealizadas;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Vendas Realizadas: " + vendasRealizadas);
    }
}
