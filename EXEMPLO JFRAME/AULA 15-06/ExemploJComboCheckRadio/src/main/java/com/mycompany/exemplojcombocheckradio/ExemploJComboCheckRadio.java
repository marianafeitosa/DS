/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplojcombocheckradio;

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

/**
 *
 * @author dti
 */
public class ExemploJComboCheckRadio extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, texto;
    JCheckBox negrito,italico,normal,negritoitalico;
    JRadioButton tam1,tam2,tam3,tam4;
    ButtonGroup grupo;
    String cor [] = { "Sem Cor", "Vermelho", "Azul", "Verde", "Amarelo","Branco","Preto"};
    JComboBox lista;
    Integer estilo, tamfonte;
    
    public ExemploJComboCheckRadio(){
        super("Exemplo Combo Check Radio BOX");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("Cor");
        rotulo2 = new JLabel("Estilo");
        rotulo3 = new JLabel("Tamanho");
        texto = new JLabel ("Programa feito em Java");
        lista = new JComboBox(cor);
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
        
        
        tamfonte=12;
        estilo=Font.PLAIN;
        //coloca cor na fonte
        
        lista.addActionListener(new ActionListener ()){
        public void actionPerformed(ActionEvent e){
            
            
            
        }
        
    }
        
    }
    
    
    
    
}
