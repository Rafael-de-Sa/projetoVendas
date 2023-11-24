package model;

import interfaces.IOperacao;

import java.math.BigDecimal;

public class Produto implements IOperacao {
    private String nomeProduto;
    private BigDecimal preco;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "nomeProduto='" + nomeProduto + '\'' + ", preco=" + preco + '}';
    }

    @Override
    public void cadastrar() {

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
