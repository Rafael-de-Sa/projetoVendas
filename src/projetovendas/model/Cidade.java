package projetovendas.model;

import projetovendas.interfaces.IOperacao;

public class Cidade implements IOperacao {
    private String nomeCidade;
    private int codIbge;

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public int getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(int codIbge) {
        this.codIbge = codIbge;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome='" + nomeCidade + '\'' + ", codIbge=" + codIbge + '}';
    }

    @Override
    public void cadastrar() {
        String insert = "INSERT INTO tbCidade(nome,codIbge)" + "VALUES ('" + getNomeCidade() + "'," + getCodIbge() + ");";
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
