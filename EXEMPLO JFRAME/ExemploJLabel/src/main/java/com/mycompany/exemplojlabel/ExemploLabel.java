/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplojlabel;


// importando as classes gráficas
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dti
 */
// declarando a classe "ExemploLabel" e herdando a classe JFrame
public class ExemploLabel extends JFrame{
    // usa a classe JLabel para criar 4 atributos ("rotulo1...)
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    // usando o método construtor para construir a tela
    public ExemploLabel(){
        // método "super" - para dar o nome da janela
        super("Exemplo com Label");
        //  instanciando a classe Container criando o objeto tela , acontece atraves do método Layout
        Container tela = getContentPane();
        setLayout(null);
        // instanciando cada um dos atributos que criou atrvés da classe JLabel
        rotulo1 = new JLabel ("Nome:");
        rotulo2 = new JLabel ("Idade:");
        rotulo3 = new JLabel ("Telefone:");
        rotulo4 = new JLabel ("Celular:");
        //setBounds- posiciona os objetos utilizando este método
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);
        rotulo4.setBounds(50,140,80,20);
        //setForeground- permite que coloque cor nos textos
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.blue);
        rotulo3.setForeground(new Color(190, 152,142));
        rotulo4.setForeground(new Color(201, 200,100));
        //setFont- serve para definir o tipo, estilo e tamanho da fonte
        rotulo1.setFont(new Font("Arial", Font.BOLD,14));
        rotulo2.setFont(new Font("Comic Sans MS", Font.BOLD,16));
        rotulo3.setFont(new Font("Courier New", Font.BOLD,18));
        rotulo4.setFont(new Font("Times New Roman", Font.BOLD,20));
        // add- serve para adicionar cada um dos objetos ao objeto tela usando o método "add"
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        //setSize- dimensiona o tamanho da tela
        setSize(400,250);
        //setVisable(true)- permite que a tela se torne vísivel para o usuário
        setVisible(true);
        // setLocationRelativeTo-  permite que a janela fique centralizada
        setLocationRelativeTo(null);
        
        
    }
    public static void main(String args []){
        //instancia a classe"ExemploLabel dentro do método main, passando o parametro JFrame.EXIT_ON_CLOSE 
        ExemploLabel app = new ExemploLabel();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
