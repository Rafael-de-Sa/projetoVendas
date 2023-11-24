package model;

import interfaces.IPesquisar;

public class Fornecedor extends Pessoa implements IPesquisar {
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "status=" + status + ", enderecos=" + enderecos + '}';
    }

    @Override
    public Pessoa pesquisar() {
        return new Fornecedor();
    }
}
