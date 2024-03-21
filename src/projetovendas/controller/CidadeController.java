package projetovendas.controller;

import projetovendas.interfaces.IOperacao;
import projetovendas.model.Cidade;

public class CidadeController implements IOperacao {
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "CidadeController{" +
                "cidade=" + cidade +
                '}';
    }

    @Override
    public void cadastrar() {
        cidade.cadastrar();
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        cidade = null;
        return false;
    }

    @Override
    public void cancelar() {

    }
}
