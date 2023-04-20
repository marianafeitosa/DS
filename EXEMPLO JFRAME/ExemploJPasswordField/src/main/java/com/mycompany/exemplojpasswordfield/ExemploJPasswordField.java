/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplojpasswordfield;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author dti
 */
// declarando a classe "ExemploPasswordField" e herdando a classe JFrame
public class ExemploJPasswordField extends JFrame{
    // usa a classe JPasswordField para criar o atributo rotulo 
    JPasswordField caixa;
    // usa a classe JLabel para criar o atributo rotulo
    JLabel rotulo;
     // usando o método construtor para construir a tela
    public ExemploJPasswordField(){
        // método "super" - para dar o nome da janela
        super("Exemplo com JPasswordField");
        //  instanciando a classe Container criando o objeto tela , acontece atraves do método Layout
        Container tela = getContentPane();
        setLayout(null);
        // instanciando cada um dos atributos que criou atrvés da classe JLabel e JPasswordField
        rotulo = new JLabel("Senha:");
        caixa = new JPasswordField(10);
         //setBounds- posiciona os objetos utilizando este método
        rotulo.setBounds(50,20,100,20);
        caixa.setBounds(50,60,100,20);
          // add- serve para adicionar cada um dos objetos ao objeto tela usando o método "add"
        tela.add(rotulo);
        tela.add(caixa);
        //setSize- dimensiona o tamanho da tela
        setSize(400,250);
          //setVisable(true)- permite que a tela se torne vísivel para o usuário
        setVisible(true);
        
    }
    public static void main(String args[]){
        //instancia a classe"ExemploJPasswordField" dentro do método main, passando o parametro JFrame.EXIT_ON_CLOSE 
        ExemploJPasswordField app = new ExemploJPasswordField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
}
