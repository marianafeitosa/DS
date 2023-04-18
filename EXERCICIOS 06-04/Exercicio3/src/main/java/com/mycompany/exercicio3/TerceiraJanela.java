/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

import java.awt.Color;
import static java.awt.Color.cyan;
import java.awt.Container;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dti
 */
public class TerceiraJanela extends JFrame{
    JLabel rotulo0, rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6;
     public TerceiraJanela(){ // metodo construtor com o mesmo nome da classe
        super("Exercício 3");
        Container tela = getContentPane();
        setLayout(null);
       rotulo0 = new JLabel("Cadastro de Clientes");
        rotulo1 = new JLabel ("Nome:");
        rotulo2 = new JLabel ("Endereço:");
        rotulo3 = new JLabel ("Cidade:");
        rotulo4 = new JLabel ("Estado:");
        rotulo5 = new JLabel ("CEP:");
        rotulo6 = new JLabel ("Telefone:");
        rotulo0.setBounds(60,15,160,20);
        rotulo1.setBounds(50,20,80,60);
        rotulo2.setBounds(50,40,80,60);
        rotulo3.setBounds(50,60,80,60);
        rotulo4.setBounds(50,80,80,60);
        rotulo5.setBounds(50,100,80,60);
        rotulo6.setBounds(50,120,80,60);
        rotulo0.setForeground(Color.BLUE);
        rotulo1.setForeground(Color.black);
        rotulo2.setForeground(Color.black);
        rotulo3.setForeground(Color.black);
        rotulo4.setForeground(Color.black);
        rotulo5.setForeground(Color.black);
        rotulo6.setForeground(Color.black);
        rotulo0.setFont(new Font("Arial",Font.BOLD,14));
        rotulo1.setFont(new Font("Arial",Font.BOLD,12));
        rotulo2.setFont(new Font("Arial",Font.BOLD,12));
        rotulo3.setFont(new Font("Arial",Font.BOLD,12));
        rotulo4.setFont(new Font("Arial",Font.BOLD,12));
        rotulo5.setFont(new Font("Arial",Font.BOLD,12));
        rotulo6.setFont(new Font("Arial",Font.BOLD,12));
        tela.add(rotulo0);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
         setVisible(true);
        
        tela.setBackground (new Color(0, 255, 255));; 
        ImageIcon icone = new ImageIcon("teste.png");
        setIconImage(icone.getImage());
        setLocationRelativeTo(null);
      
        setSize(250,250);
        setResizable(false);
       
       
    }
    
    public static void main(String args[]){
        TerceiraJanela app = new TerceiraJanela();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
}
