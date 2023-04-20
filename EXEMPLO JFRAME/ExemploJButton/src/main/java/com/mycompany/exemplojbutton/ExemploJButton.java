/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplojbutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.text.html.HTML.Tag.P;

/**
 *
 * @author marianaarashiro
 */
public class ExemploJButton extends JFrame {
    JButton botao1,botao2,botao3,botao4;
    public ExemploJButton(){
        super("Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);
        // adicionando vários botôes na janela 
        botao1 = new JButton("Procurar");
        botao2 = new JButton("Voltar>>");
        botao3 = new JButton("Próximo>>");
        botao4 = new JButton("Abrir");
        //setBounds- posiciona os objetos utilizando este método
        botao1.setBounds(50,20,100,20);
        botao2.setBounds(50,60,100,20);
        botao3.setBounds(50,100,100,20);
        botao4.setBounds(50,140,100,20);
        
        //adicionando cor de fundo no botão 
        botao1.setBackground(Color.red);
        botao2.setBackground(Color.ORANGE);
        botao3.setBackground(Color.yellow);
        botao4.setBackground(Color.green);
        
        //adicionando as seguintes linhas dentro do botao com setMnemonic
        
        // adicionando os botões na tela 
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);
        setSize(400,250);
        setVisible(true);
    }
    public static void main(String args[]){
        ExemploJButton app = new ExemploJButton();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
}
