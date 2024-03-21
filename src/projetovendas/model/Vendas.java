package projetovendas.model;

import projetovendas.interfaces.IOperacao;

public class Vendas implements IOperacao {
    private long data;
    private long hora;
    private int produtosVendidos;
    private double valorTotal;
    private int status;
    private Cliente cliente;

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
