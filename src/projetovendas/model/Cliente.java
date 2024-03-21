package projetovendas.model;

import projetovendas.interfaces.IPesquisar;

public class Cliente extends Pessoa implements IPesquisar {

    private Double renda;
    private int status;
    private String localDeTrabalho;

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    @Override
    public String toString() {
        return "Cliente{" + "renda=" + renda + ", status=" + status + ", localDeTrabalho='" + localDeTrabalho + '\'' + ", enderecos=" + enderecos + '}';
    }

    @Override
    public Pessoa pesquisar() {
        return new Cliente();
    }
}
