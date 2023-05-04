/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocadastrar;

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
public class Cadastrar extends JFrame {
    JLabel rotulocep, rotulotel, rotulocpf,rotulodata;
    JFormattedTextField cep,tel,cpf,data;
    MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradata;
    JButton cadastrar;
    
    public  Cadastrar() {
        super("Cadastro");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulocep = new JLabel("CEP:");
        rotulotel = new JLabel("Telefone:");
        rotulocpf = new JLabel("CPF:");
        rotulodata = new JLabel("Data:");
         cadastrar = new JButton("Somar");
        
        rotulocep.setBounds(50,40,100,20);
        rotulotel.setBounds(50,80,100,20);
        rotulocpf.setBounds(50,120,100,20);
        rotulodata.setBounds(50,160,100,20);
        
        cadastrar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                          String cep = rotulocep.getText();
                          String tel = rotulotel.getText();
                          String data = rotulodata.getText();
                          String cpf = rotulocpf.getText();

                String mensagem = "Dados digitados:\n\n" +
                        "CEP: " + cep + "\n" +
                        "Telefone: " + tel + "\n" +
                        "Data: " + data + "\n" +
                        "CPF: " + cpf;

                JOptionPane.showMessageDialog(null, mensagem); 
                    }
                  
                    
                    
                }
        );
        
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
            
            cep.setBounds(150,40,100,20);
            tel.setBounds(150,80,100,20);
            cpf.setBounds(150,120,100,20);
            data.setBounds(150,160,100,20);
            cadastrar.setBounds(150,100,80,20);
             
            
            tela.add(rotulocep);
            tela.add(rotulotel);
            tela.add(rotulocpf);
            tela.add(rotulodata);
            tela.add(cep);
            tela.add(tel);
            tela.add(cpf);
            tela.add(data);
            tela.add(cadastrar);
         setSize(400,250);
         setVisible(true);
    }
    public static void main(String args[]) {
        Cadastrar app = new Cadastrar();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    
    
    
}
