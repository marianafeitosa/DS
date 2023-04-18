/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dti
 */
public class Janela_01 extends JFrame{
     public Janela_01(){ // metodo construtor com o mesmo nome da classe
        super("Exercicio 2");
        Container tela = getContentPane();
        tela.setBackground (new Color(125,125,125));; 
        ImageIcon icone = new ImageIcon("teste.png");
        setIconImage(icone.getImage());
        setExtendedState(MAXIMIZED_BOTH);
         setLocationRelativeTo(null); 
      
        setSize(400,200);
        setVisible(true); // para a janela funcionar
         
    }
    
    public static void main(String args[]){
        Janela_01 app = new Janela_01();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
