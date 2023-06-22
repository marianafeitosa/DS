/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplocombocheckradio;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author marianaarashiro
 */

public class ExemploComboCheckRadio extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, texto;
    JCheckBox negrito, italico, normal, negritoitalico;
    JRadioButton tam1, tam2, tam3, tam4;
    ButtonGroup grupo;
    String[] cor = {"Sem Cor", "Vermelho", "Azul", "Verde", "Amarelo", "Branco", "Preto"};
    JComboBox<String> lista;
    Integer estilo, tamfonte;

    public ExemploComboCheckRadio() {
        super("Exemplo Combo Check Radio BOX");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("Cor");
        rotulo2 = new JLabel("Estilo");
        rotulo3 = new JLabel("Tamanho");
        texto = new JLabel("Programa feito em Java");
        lista = new JComboBox<>(cor);
        lista.setMaximumRowCount(7);
        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Italico");
        normal = new JCheckBox("Normal");
        negritoitalico = new JCheckBox("Negrito Itálico");
        tam1 = new JRadioButton("12");
        tam2 = new JRadioButton("14");
        tam3 = new JRadioButton("16");
        tam4 = new JRadioButton("18");
        grupo = new ButtonGroup();
        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo.add(tam4);

        // Posicionamento dos componentes na tela
        rotulo1.setBounds(40, 20, 70, 20);
        rotulo2.setBounds(200, 20, 70, 20);
        rotulo3.setBounds(300, 20, 70, 20);
        texto.setBounds(100, 200, 300, 20);
        lista.setBounds(40, 50, 150, 20);
        negrito.setBounds(200, 50, 100, 20);
        italico.setBounds(200, 70, 100, 20);
        normal.setBounds(200, 90, 100, 20);
        negritoitalico.setBounds(200, 110, 150, 20);
        tam1.setBounds(350, 50, 100, 20);
        tam2.setBounds(350, 70, 100, 20);
        tam3.setBounds(350, 90, 100, 20);
        tam4.setBounds(350, 110, 100, 20);

        // Ação do combobox para alterar a cor do texto
       lista.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String corSelecionada = lista.getSelectedItem().toString();
        
        if (corSelecionada.equals("Sem Cor")) {
            texto.setForeground(Color.BLACK);
        } else if (corSelecionada.equals("Vermelho")) {
            texto.setForeground(Color.RED);
        } else if (corSelecionada.equals("Azul")) {
            texto.setForeground(Color.BLUE);
        } else if (corSelecionada.equals("Verde")) {
            texto.setForeground(Color.GREEN);
        } else if (corSelecionada.equals("Amarelo")) {
            texto.setForeground(Color.YELLOW);
        } else if (corSelecionada.equals("Branco")) {
            texto.setForeground(Color.WHITE);
        } else if (corSelecionada.equals("Preto")) {
            texto.setForeground(Color.BLACK);
        }
    }
});


        // Ação para definir tamanho da fonte
        tam1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 12;
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        tam2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 14;
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        tam3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 16;
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        tam4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tamfonte = 18;
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        // Ação para definir estilo da fonte
        negrito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estilo = Font.BOLD;
                normal.setSelected(false);
                italico.setSelected(false);
                negritoitalico.setSelected(false);
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        italico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estilo = Font.ITALIC;
                normal.setSelected(false);
                negrito.setSelected(false);
                negritoitalico.setSelected(false);
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });

        normal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estilo = Font.PLAIN;
                negrito.setSelected(false);
                italico.setSelected(false);
                negritoitalico.setSelected(false);
                texto.setFont(new Font("", estilo, tamfonte));
            }
        });
        


    // Coloca a fonte em negrito e itálico
negritoitalico.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        estilo = Font.BOLD + Font.ITALIC;
        negrito.setSelected(false);
        italico.setSelected(false);
        normal.setSelected(false);
        texto.setFont(new Font("", estilo, tamfonte));
    }
});

// Adicionando os componentes ao container
tela.add(rotulo1);
tela.add(rotulo2);
tela.add(rotulo3);
tela.add(texto);
tela.add(negrito);
tela.add(italico);
tela.add(normal);
tela.add(negritoitalico);
tela.add(tam1);
tela.add(tam2);
tela.add(tam3);
tela.add(tam4);
tela.add(lista);

// Configurações da janela
setSize(500, 300);
setLocationRelativeTo(null);
setVisible(true);
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new ExemploComboCheckRadio().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    });
}
}

