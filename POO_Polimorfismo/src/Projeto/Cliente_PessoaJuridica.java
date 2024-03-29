package Projeto;

public class Cliente_PessoaJuridica extends Cliente {
    private String CNPJ;

    public Cliente_PessoaJuridica(String nome, String CPF, String endereco, String telefone, int idade, String CNPJ) {
        super(nome, CPF, endereco, telefone, idade);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ: " + CNPJ);
    }
}