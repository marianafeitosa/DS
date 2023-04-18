/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplojfield;


import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class ExemploJTextField extends JFrame {
       // usa a classe JLabel para criar 4 atributos ("rotulo1...)
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    JTextField texto1,texto2,texto3,texto4;
    // usando o método construtor para construir a tela
    public ExemploJTextField(){
        // método "super" - para dar o nome da janela
        super("Exemplo com JTextField");
        //  instanciando a classe Container criando o objeto tela , acontece atraves do método Layout
        Container tela = getContentPane();
        setLayout(null);
        // instanciando cada um0 dos atributos que criou atrvés da classe JLabel
        rotulo1 = new JLabel ("Nome:");
        rotulo2 = new JLabel ("Idade:");
        rotulo3 = new JLabel ("Telefone:");
        rotulo4 = new JLabel ("Celular:");
        
        // instanciando cada um0 dos atributos que criou atrvés da classe JTextField
        texto1= new JTextField(50);
        texto1= new JTextField(3);
        texto1= new JTextField(10);
        texto1= new JTextField(10);
        //setBounds- posiciona os objetos utilizando este método
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);
        rotulo4.setBounds(50,140,80,20);
        
       //setBounds- posiciona os textos utilizando este método
        texto1.setBounds(110,20,200,20);
        texto2.setBounds(110,60,20,20);
        texto3.setBounds(110,100,80,20);
        texto4.setBounds(110,140,80,20);
       
        
        
   
        // add- serve para adicionar cada um dos objetos ao objeto tela usando o método "add"
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        
        //setSize- dimensiona o tamanho da tela
        setSize(400,250);
        //setVisable(true)- permite que a tela se torne vísivel para o usuário
        setVisible(true);
        // setLocationRelativeTo-  permite que a janela fique centralizada
        setLocationRelativeTo(null);
        
        
    }
    public static void main(String args []){
        //instancia a classe"ExemploLabel dentro do método main, passando o parametro JFrame.EXIT_ON_CLOSE 
        ExemploJTextField app = new ExemploJTextField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
