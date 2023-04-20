/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplojbutton;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author marianaarashiro
 */
public class ExemploJButton extends JFrame {
    JButton botao;
    public ExemploJButton(){
        super("Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);
        botao = new JButton("Procurar");
        botao.setBounds(50,20,100,20);
        tela.add(botao);
        setSize(400,250);
        setVisible(true);
    }
    public static void main(String args[]){
        ExemploJButton app = new ExemploJButton();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
}
