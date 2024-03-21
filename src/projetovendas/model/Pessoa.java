package projetovendas.model;

import projetovendas.interfaces.IOperacao;

import java.util.List;

public class Pessoa implements IOperacao {
    protected List<Endereco> enderecos;
    private String nome;
    private String tipoPessoa;
    private String email;
    private int contador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", tipoPessoa='" + tipoPessoa + '\'' + ", email='" + email + '\'' + ", contador=" + contador + ", enderecos=" + enderecos + '}';
    }

    @Override
    public void cadastrar() {

    }

    @Override
    public boolean alterar() {
        return true;
    }

    @Override
    public boolean excluir() {
        return true;
    }

    @Override
    public void cancelar() {

    }
}
