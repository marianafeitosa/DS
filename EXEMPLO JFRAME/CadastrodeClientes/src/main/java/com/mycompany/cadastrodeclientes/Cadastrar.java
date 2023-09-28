/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrodeclientes;

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
public class Cadastrar  extends JFrame {
    
    //criando as estruturas da classe de instancia, sendo as variaveis que se tornaram objeto﻿﻿﻿criar o atributo "cadastrar" da classe Jbutton
    JLabel rotulotitulo, rotulonome, rotuloendereco, rotuloemail, rotuloestado,rotulocep, rotulotel,rotulodata;
    JFormattedTextField cep,estado,tel,data, nome, endereco, email;
    MaskFormatter mascaracep, mascaratel, mascaradata;
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
        rotulotitulo = new JLabel("Cadastro de Cliente");
        rotulonome = new JLabel("Nome");
        rotuloendereco = new JLabel("Endereço:");
        rotuloemail = new JLabel("Email:");
        rotulocep = new JLabel("CEP:");
         rotuloestado = new JLabel("Estado:");
        rotulotel = new JLabel("Telefone:");
        rotulodata = new JLabel("Data de Nascimento:");
         cadastrar = new JButton("Cadastrar");
         
         
       // setando os obejtos que instanciou , determinando a posição e a coluna que esses serão inseridos
       rotulotitulo.setBounds(50, 20, 100, 20);
       rotulonome.setBounds(50,40,100,20);
       rotuloendereco.setBounds(50,60,100,20);
       rotuloemail.setBounds(50,80,100,20);
       rotulocep.setBounds(50,100,100,20);
       rotuloestado.setBounds(50,120,100,20);
       rotulotel.setBounds(50,140,100,20);
       rotulodata.setBounds(50,160,100,20);
       cadastrar.setBounds(200,200,100,20);
         
         
         // nãp entendi como usa o try e o catch , vou usar em quais situações? 
        try{
            mascaracep = new MaskFormatter("#####-###");
            mascaratel = new MaskFormatter("(##)######-####");
           
            mascaradata = new MaskFormatter("##/##/####");
            
            mascaracep.setPlaceholder("_");
            mascaratel.setPlaceholder("_");
           
            mascaradata.setPlaceholder("_");
            
        } catch(ParseException excp){      
           
           
        }
         cep = new JFormattedTextField(mascaracep);
            tel = new JFormattedTextField(mascaratel);
          
            data = new JFormattedTextField(mascaradata);
            
            cep.setBounds(150,40,100,20);   // [x(horizontal),y(vertical),height(tamanho),witdh(largura)]
            tel.setBounds(150,80,100,20);   //  y = aumentar para mover para baixo no setBounds   
                                             //  x = aumentar para mover para os lados e vice-versa
            data.setBounds(150,160,100,20);
            cadastrar.setBounds(250,190,100,20);
            
            
            // determinando a ação do botão , o método ouve e ação e é adicionado *não entendi muito bem essa parte professor
            cadastrar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
               
               // variavel "cep, cpf,telefone,data" passa a ter um valor em String
               //JOptionPane.showMessageDialog mostra os valores digitados na tela 
                JOptionPane.showMessageDialog(null, ("Dados digitados:\n\n" +
                        "   Nome: " +nome.getText()+ "\n" +
                        "Endereço: " +endereco.getText()+ "\n" +
                        "Email: " +email.getText()+ "\n" +
                        "CEP: " +cep.getText ()  + "\n" +
                        "Estado: " +estado.getText()  + "\n" + 
                        "Telefone: " +tel.getText()  + "\n" + 
                        "Data de Nascimento: " +data.getText()    )); 
                    }
                  
                    
                    
                }
        );
             
           // adicionando ao objeto tela
           tela.add(rotulotitulo);
           tela.add(rotulonome);
           tela.add(rotuloendereco);
           tela.add(rotuloemail);
            tela.add(rotulocep);
            tela.add(rotuloestado);
            tela.add(rotulotel);
            tela.add(rotulodata);
            
            tela.add(nome);
            tela.add(endereco);
            tela.add(email);
            tela.add(cep);
            tela.add(estado);
            tela.add(tel);
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
    

