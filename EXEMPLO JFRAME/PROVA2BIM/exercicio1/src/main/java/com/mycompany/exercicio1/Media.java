/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class Media extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4, exibir;
JTextField texto1, texto2, texto3, texto4;
JButton calcular;
public Media(){
  super("Calculando a Média");
  Container tela = getContentPane();
  
  
  setLayout(null);
  rotulo1 = new JLabel("1° nota:");  
  rotulo2 = new JLabel("2° nota:");
  rotulo3 = new JLabel("3° nota:");
  rotulo4 = new JLabel("4° nota:");
  texto1 = new JTextField(5);
  texto2 = new JTextField(5);
  texto3= new JTextField(5);
  texto4= new JTextField(5);
  exibir = new JLabel("");
  calcular = new JButton("Calcular");
 
  

  rotulo1.setBounds(50,20,100,20);
  rotulo2.setBounds(50,45,100,20);
  rotulo3.setBounds(50, 70, 100,20);
  rotulo4.setBounds(50,95,100,20);
  texto1.setBounds (120,20,80,20);
  texto2.setBounds (120,45,80,20);
  texto3.setBounds (120,70,80,20);
  texto4.setBounds(120,95,80,20);
  exibir.setBounds (120,200,200,20);
  calcular.setBounds  (320,20,90,20);
 
 
 
  

  calcular.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    double media1, media2,media3, media4, media;
    media=0;
    media1=Double.parseDouble(texto1.getText());
    media2=Double.parseDouble(texto2.getText());
    media3=Double.parseDouble(texto3.getText());
    media4=Double.parseDouble(texto4.getText());
    media = (media1+media2+media3+media4)/4;
    exibir.setVisible(true);
    exibir.setText("A média será de: "+media); 
  } }
  );
  
  exibir.setVisible(false);
  tela.add(rotulo1);tela.add(rotulo2); tela.add(rotulo3); tela.add(rotulo4);
  tela.add(texto1);tela.add(texto2); tela.add(texto3); tela.add(texto4);
  tela.add(exibir);
  
  tela.add(calcular); 
 
    
  setSize(400,250);
  setVisible(true);
  setExtendedState(MAXIMIZED_BOTH);
}
public static void main (String args[]){
           Media app = new Media();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    
}
