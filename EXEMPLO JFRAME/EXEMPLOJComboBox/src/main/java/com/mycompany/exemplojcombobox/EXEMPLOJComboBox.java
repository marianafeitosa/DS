/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplojcombobox;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author marianaarashiro
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EXEMPLOJComboBox extends JFrame {
    private JComboBox<String> lista;
    private String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia",
            "Pernambuco", "Rio Grande do Sul", "Acre"};
    private JButton exibir;
    private JLabel rotulo;

    public EXEMPLOJComboBox() {
        super("Exemplo de JComboBox");
        Container tela = getContentPane();
        setLayout(null);

        lista = new JComboBox<>(cidades);
        lista.setEditable(true);
        lista.setMaximumRowCount(5);
        lista.setBounds(50, 50, 150, 30);

        exibir = new JButton("Exibir");
        exibir.setBounds(270, 50, 100, 30);

        rotulo = new JLabel();
        rotulo.setBounds(50, 150, 200, 30);

        exibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotulo.setText("O estado é: " + lista.getSelectedItem().toString());
            }
        });

        tela.add(lista);
        tela.add(exibir);
        tela.add(rotulo);

        setSize(400, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
         EXEMPLOJComboBox app = new EXEMPLOJComboBox();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




