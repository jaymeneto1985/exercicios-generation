package Projeto;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, String cpf, String cargo, double salario, int idade, String departamento) {
        super(nome, cpf, cargo, salario, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Departamento: " + departamento);
    }
}