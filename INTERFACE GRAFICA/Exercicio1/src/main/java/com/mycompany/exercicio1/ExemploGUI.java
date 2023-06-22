/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

/**
 *
 * @author dti
 */
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
public class ExemploGUI extends JFrame implements ActionListener {

    private JLabel labelPesquisar, labelID, labelNome, labelEndereco, labelMunicipio, labelCEP, labelTel, labelCel, labelCPF, labelCNPJ, labelGenero;
    private JTextField fieldID, fieldNome, fieldEndereco, fieldMunicipio, fieldCEP, fieldTel, fieldCel, fieldCPF, fieldCNPJ;
    private JButton btnCadastrar, btnLimpar, btnFechar;
    private JRadioButton radioMasculino, radioFeminino;

    public ExemploGUI() {
        setTitle("Cadastro de Clientes");
        setSize(400, 550);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        ImageIcon icone = new ImageIcon("src/Boss.png");
  setIconImage(icone.getImage());
        

        labelPesquisar = new JLabel("Pesquisar:");
        labelPesquisar.setBounds(20, 20, 100, 20);
        ImageIcon pesquisarIcon = new ImageIcon("src/View.png");
       labelPesquisar.setIcon(pesquisarIcon);
        add(labelPesquisar);

        JComboBox<String> comboPesquisar = new JComboBox<>(new String[]{"", "Engenheiro", "Médico", "Dentista","Juiz"});
        comboPesquisar.setBounds(120, 20, 200, 20);
        add(comboPesquisar);

        labelID = new JLabel("ID:");
        labelID.setBounds(20, 60, 100, 20);
        add(labelID);

        fieldID = new JTextField();
        fieldID.setBounds(120, 60, 50, 20);
        add(fieldID);

        labelNome = new JLabel("Nome/Empresa:");
        labelNome.setBounds(20, 100, 100, 20);
        add(labelNome);

        fieldNome = new JTextField();
        fieldNome.setBounds(120, 100, 200, 20);
        add(fieldNome);

        labelEndereco = new JLabel("Endereço:");
        labelEndereco.setBounds(20, 140, 100, 20);
        add(labelEndereco);

        fieldEndereco = new JTextField();
        fieldEndereco.setBounds(120, 140, 250, 20);
        add(fieldEndereco);

        labelMunicipio = new JLabel("Município:");
        labelMunicipio.setBounds(20, 180, 100, 20);
        add(labelMunicipio);

        fieldMunicipio = new JTextField();
        fieldMunicipio.setBounds(120, 180, 150, 20);
        add(fieldMunicipio);

        labelCEP = new JLabel("CEP:");
        labelCEP.setBounds(20, 220, 100, 20);
        add(labelCEP);

        try {
            MaskFormatter cepFormatter = new MaskFormatter("#####-###");
            fieldCEP = new JFormattedTextField(cepFormatter);
            fieldCEP.setBounds(120, 220, 150, 20);
            add(fieldCEP);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        labelTel = new JLabel("Tel:");
        labelTel.setBounds(20, 260, 100, 20);
        add(labelTel);

        try {
            MaskFormatter telFormatter = new MaskFormatter("(##) ####-####");
            fieldTel = new JFormattedTextField(telFormatter);
            fieldTel.setBounds(120, 260, 150, 20);
            add(fieldTel);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        labelCel = new JLabel("Cel:");
        labelCel.setBounds(20, 300, 100, 20);
        add(labelCel);

        try {
            MaskFormatter celFormatter = new MaskFormatter("(##) #####-####");
            fieldCel = new JFormattedTextField(celFormatter);
            fieldCel.setBounds(120, 300, 150, 20);
            add(fieldCel);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        labelCPF = new JLabel("CPF:");
        labelCPF.setBounds(20, 340, 100, 20);
        add(labelCPF);

        try {
            MaskFormatter cpfFormatter = new MaskFormatter("###.###.###-##");
            fieldCPF = new JFormattedTextField(cpfFormatter);
            fieldCPF.setBounds(120, 340, 150, 20);
            add(fieldCPF);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        labelCNPJ = new JLabel("CNPJ:");
        labelCNPJ.setBounds(20, 380, 100, 20);
        add(labelCNPJ);

        try {
            MaskFormatter cnpjFormatter = new MaskFormatter("##.###.###/####-##");
            fieldCNPJ = new JFormattedTextField(cnpjFormatter);
            fieldCNPJ.setBounds(120, 380, 150, 20);
            add(fieldCNPJ);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        labelGenero = new JLabel("Gênero:");
        labelGenero.setBounds(20, 420, 100, 20);
        add(labelGenero);

        radioMasculino = new JRadioButton("M");
        radioMasculino.setBounds(120, 420, 100, 20);
        add(radioMasculino);

        radioFeminino = new JRadioButton("F");
        radioFeminino.setBounds(230, 420, 100, 20);
        add(radioFeminino);

        ButtonGroup generoGroup = new ButtonGroup();
        generoGroup.add(radioMasculino);
        generoGroup.add(radioFeminino);

        btnCadastrar = new JButton("");
        btnCadastrar.setBounds(20, 460, 100, 30);
        btnCadastrar.addActionListener(this);
         ImageIcon cadastrarIcon = new ImageIcon("src/Yes.png");
       btnCadastrar.setIcon(cadastrarIcon);
        add(btnCadastrar);

        btnLimpar = new JButton("");
        btnLimpar.setBounds(140, 460, 100, 30);
        btnLimpar.addActionListener(this);
         ImageIcon limparIcon = new ImageIcon("src/edit.png");
       btnLimpar.setIcon(limparIcon);
        add(btnLimpar);

        btnFechar = new JButton("");
        btnFechar.setBounds(260, 460, 100, 30);
        btnFechar.addActionListener(this);
         ImageIcon fecharIcon = new ImageIcon("src/Close.png");
       btnFechar.setIcon(fecharIcon);
        add(btnFechar);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastrar) {
            String mensagem = "ID: " + fieldID.getText() + "\n" +
                    "Nome/Empresa: " + fieldNome.getText() + "\n" +
                    "Endereço: " + fieldEndereco.getText() + "\n" +
                    "Município: " + fieldMunicipio.getText() + "\n" +
                    "CEP: " + fieldCEP.getText() + "\n" +
                    "Telefone: " + fieldTel.getText() + "\n" +
                    "Celular: " + fieldCel.getText() + "\n" +
                    "CPF: " + fieldCPF.getText() + "\n" +
                    "CNPJ: " + fieldCNPJ.getText() + "\n" +
                    "Gênero: " + (radioMasculino.isSelected() ? "M" : "F");

            JOptionPane.showMessageDialog(this, mensagem, "Dados cadastrados", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnLimpar) {
            fieldID.setText("");
            fieldNome.setText("");
            fieldEndereco.setText("");
            fieldMunicipio.setText("");
            fieldCEP.setText("");
            fieldTel.setText("");
            fieldCel.setText("");
            fieldCPF.setText("");
            fieldCNPJ.setText("");
            radioMasculino.setSelected(false);
            radioFeminino.setSelected(false);
        } else if (e.getSource() == btnFechar) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new ExemploGUI();
    }
}
