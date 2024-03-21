package projetovendas.model;

import projetovendas.interfaces.IOperacao;

public class Endereco implements IOperacao {

    private String logradouro;
    private Cidade cidade;
    private String bairro;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro='" + logradouro + '\'' + ", cidade=" + cidade + ", bairro='" + bairro + '\'' + '}';
    }

    @Override
    public void cadastrar() {
        String insert = "INSERT INTO tbEndereco (logradouro, bairro, cidade) " +
                "VALUES ('" + getLogradouro() + "','"
                + getBairro() + "',"
                + getCidade() + ")";
        System.out.println(insert);
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        return false;
    }

    @Override
    public void cancelar() {

    }
}
