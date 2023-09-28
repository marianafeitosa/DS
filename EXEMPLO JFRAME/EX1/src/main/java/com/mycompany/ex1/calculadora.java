/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.print.attribute.standard.Media;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class calculadora extends JFrame{
     JLabel rotulo1,rotulo2,rotulo3,rotulo4, exibir;
JTextField texto1, texto2, texto3, texto4;
JButton calcular;
public calculadora(){
  super("Calculando a Média");
  Container tela = getContentPane();
  
  
  setLayout(null);
  rotulo1 = new JLabel("1° numero:");  
  rotulo2 = new JLabel("2° numero:");
  
  texto1 = new JTextField(5);
  texto2 = new JTextField(5);
 
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
    public void actionPerfomed(ActionEvent e){
                int numero1, numero2,soma,sub,mult,div,resto;
    soma=0;
    numero1=Integer.parseInt(texto1.getText());
    numero2=Integer.parseInt(texto2.getText());
    soma = numero1+numero2;
    exibir.setVisible(true);
    exibir.setText("A soma será de "+soma); 
    
    
    sub=0;
    numero1=Integer.parseInt(texto1.getText());
    numero2=Integer.parseInt(texto2.getText());
    sub = numero1-numero2;
    exibir.setVisible(true);
    exibir.setText("A subtração será de "+sub); 
    
     mult=0;
    numero1=Integer.parseInt(texto1.getText());
    numero2=Integer.parseInt(texto2.getText());
    mult = numero1*numero2;
    exibir.setVisible(true);
    exibir.setText("A multiplicação será de "+mult);
    
    div=0;
    numero1=Integer.parseInt(texto1.getText());
    numero2=Integer.parseInt(texto2.getText());
    div = numero1/numero2;
    exibir.setVisible(true);
    exibir.setText("A divisão será de "+div); 
    
    
        resto=0;
                 numero1=Integer.parseInt(texto1.getText());
                 numero2=Integer.parseInt(texto2.getText());
                  resto = numero1%numero2;
    exibir.setVisible(true);
    exibir.setText("O resto será de "+resto); 
    
    
    
    
                
                
            }
 }
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
           calculadora app = new calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
