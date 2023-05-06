/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocadastrar;


//importando as classes graficas
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author dti
 */

// declarando a unica classe "Cadastrar" que herda da classe JFrame
public class Cadastrar extends JFrame {
    
    //criando as estruturas da classe de instancia, sendo as variaveis que se tornaram objeto﻿﻿﻿criar o atributo "cadastrar" da classe Jbutton
    JLabel rotulocep, rotulotel, rotulocpf,rotulodata;
    JFormattedTextField cep,tel,cpf,data;
    MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradata;
    JButton cadastrar;
    
    
    // metodo construtor, construindo a estrutura dentro desse método
    public  Cadastrar() {
        // metodo super declara o nome da janela,
        super("Cadastro");
        // classe Container, instanciando ao objeto tela usando o método getContentane
        Container tela = getContentPane();
        // setLayout - setando a tela como nula, porque se não usar, não consegue posicionar os objetos na tela
        setLayout(null);
        
        
        // instanciando os objetos rotulos passando uma cadeia de caracteres: "CEP", "Telefone", "CPF", "Data", "Cadastrar"
        rotulocep = new JLabel("CEP:");
        rotulotel = new JLabel("Telefone:");
        rotulocpf = new JLabel("CPF:");
        rotulodata = new JLabel("Data:");
         cadastrar = new JButton("Cadastrar");
         
         
       // setando os obejtos que instanciou , determinando a posição e a coluna que esses serão inseridos
        rotulocep.setBounds(50,40,100,20);
        rotulotel.setBounds(50,80,100,20);
        rotulocpf.setBounds(50,120,100,20);
        rotulodata.setBounds(50,160,100,20);
         cadastrar.setBounds(200,200,100,20);
        
        try{
            mascaracep = new MaskFormatter("#####-###");
            mascaratel = new MaskFormatter("(##)######-####");
            mascaracpf = new MaskFormatter("#########-##");
            mascaradata = new MaskFormatter("##/##/####");
            
            mascaracep.setPlaceholder("_");
            mascaratel.setPlaceholder("_");
            mascaracpf.setPlaceholder("_");
            mascaradata.setPlaceholder("_");
            
        } catch(ParseException excp){      
           
           
        }
         cep = new JFormattedTextField(mascaracep);
            tel = new JFormattedTextField(mascaratel);
            cpf = new JFormattedTextField(mascaracpf);
            data = new JFormattedTextField(mascaradata);
            
            cep.setBounds(150,40,100,20);   // [x(horizontal),y(vertical),height(tamanho),witdh(largura)]
            tel.setBounds(150,80,100,20);   //  y = aumentar para mover para baixo no setBounds   
            cpf.setBounds(150,120,100,20);  //  x = aumentar para mover para os lados e vice-versa
            data.setBounds(150,160,100,20);
            cadastrar.setBounds(250,190,100,20);
            
            
            // determinando a ação do botão , o método ouve e ação e é adicionado *não entendi muito bem essa parte professor
            cadastrar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
               
               // variavel "cep, cpf,telefone,data" passa a ter um valor em String
               //JOptionPane.showMessageDialog mostra os valores digitados na tela 
                JOptionPane.showMessageDialog(null, ("Dados digitados:\n\n" +
                        "CEP: " +cep.getText()+ "\n" +
                        "Telefone: " +tel.getText()+ "\n" +
                        "Data: " +data.getText()+ "\n" +
                        "CPF: " +cpf.getText())); 
                    }
                  
                    
                    
                }
        );
             
           // adicionando ao objeto tela
            tela.add(rotulocep);
            tela.add(rotulotel);
            tela.add(rotulocpf);
            tela.add(rotulodata);
            tela.add(cep);
            tela.add(tel);
            tela.add(cpf);
            tela.add(data);
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
