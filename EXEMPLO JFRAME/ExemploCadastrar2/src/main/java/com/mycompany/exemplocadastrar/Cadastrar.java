/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocadastrar;


//importando as classes graficas
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author dti
 */

// declarando a unica classe "Cadastrar" que herda da classe JFrame
public class Cadastrar extends JFrame {
    
    //criando as estruturas da classe de instancia, sendo as variaveis que se tornaram objeto﻿﻿﻿criar o atributo "cadastrar" da classe Jbutton
    JLabel rotulotitulo, rotulonome, rotulomatricula, rotulodisciplina,rotuloqto;
    JFormattedTextField nome,matricula,disciplina,qto;
    
    JButton cadastrar;
    
    
    // metodo construtor, construindo a estrutura dentro desse método
    public  Cadastrar() {
        // metodo super declara o nome da janela,
        super("Cadastrar Professor");
        // classe Container, instanciando ao objeto tela usando o método getContentane
        Container tela = getContentPane();
        // setLayout - setando a tela como nula, porque se não usar, não consegue posicionar os objetos na tela
        setLayout(null);
        
        
        // instanciando os objetos rotulos passando uma cadeia de caracteres: "CEP", "Telefone", "CPF", "Data", "Cadastrar"
        rotulotitulo= new JLabel("Cadastro de Professor");
        rotulonome = new JLabel("Nome:");
        rotulomatricula = new JLabel("Matrícula:");
        rotulodisciplina = new JLabel("Disiciplina:");
        rotuloqto = new JLabel("Qto de Aulas:");
         cadastrar = new JButton("Confirmar");
         
         
       // setando os obejtos que instanciou , determinando a posição e a coluna que esses serão inseridos
       rotulotitulo.setBounds(50, 10, 100, 20);
        rotulonome.setBounds(50,40,100,20);
        rotulomatricula.setBounds(50,80,100,20);
        rotulodisciplina.setBounds(50,120,100,20);
        rotuloqto.setBounds(50,160,100,20);
         cadastrar.setBounds(200,200,100,20);
         
         
       
         
         
        
         nome = new JFormattedTextField();
            matricula = new JFormattedTextField();
            disciplina = new JFormattedTextField();
            qto = new JFormattedTextField();
            
            nome.setBounds(150,40,100,20);   // [x(horizontal),y(vertical),height(tamanho),witdh(largura)]
            matricula.setBounds(150,80,100,20);   //  y = aumentar para mover para baixo no setBounds   
            disciplina.setBounds(150,120,100,20);  //  x = aumentar para mover para os lados e vice-versa
            qto.setBounds(150,160,100,20);
            cadastrar.setBounds(250,190,100,20);
            
            
            // determinando a ação do botão , o método ouve e ação e é adicionado *não entendi muito bem essa parte professor
            cadastrar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
               
               // variavel "cep, cpf,telefone,data" passa a ter um valor em String
               //JOptionPane.showMessageDialog mostra os valores digitados na tela 
                JOptionPane.showMessageDialog(null, ("Dados digitados:\n\n" +
                        "Nome: " +nome.getText()+ "\n" +
                        "Matrícula: " +matricula.getText()+ "\n" +
                        "Disciplina: " +disciplina.getText()+ "\n" +
                        "Quantidade de aulas: " +qto.getText())); 
                    }
                  
                    
                    
                }
        );
             
           // adicionando ao objeto tela
           tela.add(rotulotitulo);
            tela.add(rotulonome);
            tela.add(rotulomatricula);
            tela.add(rotulodisciplina);
            tela.add(rotuloqto);
            tela.add(nome);
            tela.add(matricula);
            tela.add(disciplina);
            tela.add(qto);
            tela.add(cadastrar);
            
            //﻿﻿﻿﻿setSize dimensiona a tela, tornando-a visivel
         setSize(400,250);
         //tela fica vísivel 
         setVisible(true);
    }
    public static void main(String args[]) {
         //instancia a classe "Cadastrar" dentro do método main, passando o parametro JFrame.EXIT_ON_CLOSE 
        Cadastrar app = new Cadastrar();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    
    
    
}
