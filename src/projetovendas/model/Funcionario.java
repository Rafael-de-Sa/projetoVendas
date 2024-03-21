package projetovendas.model;

import projetovendas.interfaces.IPesquisar;

public class Funcionario extends Pessoa implements IPesquisar {
    private String cargo;
    private Double comissao;
    private long dataAdmissao;
    private long dataDemissao;
    private String funcao;
    private int status;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public long getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(long dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public long getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(long dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cargo='" + cargo + '\'' + ", comissao=" + comissao + ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao + ", funcao='" + funcao + '\'' + ", status=" + status + ", enderecos=" + enderecos + '}';
    }

    @Override
    public Pessoa pesquisar() {
        return null;
    }
}
