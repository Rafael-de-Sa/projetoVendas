package projetovendas.controller;

import projetovendas.interfaces.IOperacao;
import projetovendas.model.Endereco;

public class EnderecoController implements IOperacao {
    private Endereco endereco;

    @Override
    public void cadastrar() {
        endereco.cadastrar();
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        endereco = null;
        return false;
    }

    @Override
    public void cancelar() {
        endereco.cancelar();
    }
}
