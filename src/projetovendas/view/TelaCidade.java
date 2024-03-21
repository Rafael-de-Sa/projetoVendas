package projetovendas.view;

import projetovendas.controller.CidadeController;

import javax.swing.*;
import java.awt.*;

public class TelaCidade extends javax.swing.JFrame {
    CidadeController cidadeController;
    public TelaCidade(){
        initComponents();
        this.setTitle("Cadastro Cidade");
        cidadeController = new CidadeController();
    }

    public TelaCidade(CidadeController cidadeController, JTextField tFNomeCidade, JTextField tFCodIBGE, JButton cadastrarButton, JButton cancelarButton, JButton excluirButton, JButton alterarButton) throws HeadlessException {
        this.cidadeController = cidadeController;
        this.tFNomeCidade = tFNomeCidade;
        this.tFCodIBGE = tFCodIBGE;
        this.cadastrarButton = cadastrarButton;
        this.cancelarButton = cancelarButton;
        this.excluirButton = excluirButton;
        this.alterarButton = alterarButton;
    }

    public TelaCidade(GraphicsConfiguration gc, CidadeController cidadeController, JTextField tFNomeCidade, JTextField tFCodIBGE, JButton cadastrarButton, JButton cancelarButton, JButton excluirButton, JButton alterarButton) {
        super(gc);
        this.cidadeController = cidadeController;
        this.tFNomeCidade = tFNomeCidade;
        this.tFCodIBGE = tFCodIBGE;
        this.cadastrarButton = cadastrarButton;
        this.cancelarButton = cancelarButton;
        this.excluirButton = excluirButton;
        this.alterarButton = alterarButton;
    }

    public TelaCidade(String title, CidadeController cidadeController, JTextField tFNomeCidade, JTextField tFCodIBGE, JButton cadastrarButton, JButton cancelarButton, JButton excluirButton, JButton alterarButton) throws HeadlessException {
        super(title);
        this.cidadeController = cidadeController;
        this.tFNomeCidade = tFNomeCidade;
        this.tFCodIBGE = tFCodIBGE;
        this.cadastrarButton = cadastrarButton;
        this.cancelarButton = cancelarButton;
        this.excluirButton = excluirButton;
        this.alterarButton = alterarButton;
    }

    public TelaCidade(String title, GraphicsConfiguration gc, CidadeController cidadeController, JTextField tFNomeCidade, JTextField tFCodIBGE, JButton cadastrarButton, JButton cancelarButton, JButton excluirButton, JButton alterarButton) {
        super(title, gc);
        this.cidadeController = cidadeController;
        this.tFNomeCidade = tFNomeCidade;
        this.tFCodIBGE = tFCodIBGE;
        this.cadastrarButton = cadastrarButton;
        this.cancelarButton = cancelarButton;
        this.excluirButton = excluirButton;
        this.alterarButton = alterarButton;
    }

    private void initComponents() {

    }

    private JTextField tFNomeCidade;
    private JTextField tFCodIBGE;
    private JButton cadastrarButton;
    private JButton cancelarButton;
    private JButton excluirButton;
    private JButton alterarButton;
}
