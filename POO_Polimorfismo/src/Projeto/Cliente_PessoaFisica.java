package Projeto;

public class Cliente_PessoaFisica extends Cliente {
    private String CPF;

    public Cliente_PessoaFisica(String nome, String CPF, String endereco, String telefone, int idade) {
        super(nome, CPF, endereco, telefone, idade);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCpf(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CPF: " + CPF);
    }
}
