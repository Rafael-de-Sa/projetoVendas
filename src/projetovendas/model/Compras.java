package projetovendas.model;

import projetovendas.interfaces.IOperacao;

public class Compras implements IOperacao {
    private int data;
    private int hora;
    private int produtosComprados;
    private Double valorTotal;
    private int status;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(int produtosComprados) {
        this.produtosComprados = produtosComprados;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "data=" + data +
                ", hora=" + hora +
                ", produtosComprados=" + produtosComprados +
                ", valorTotal=" + valorTotal +
                ", status=" + status +
                '}';
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
