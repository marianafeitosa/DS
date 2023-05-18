/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.awt.Container;
import static java.awt.Frame.MAXIMIZED_BOTH;
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
public class Teorema extends JFrame {
     JLabel rotulo1,rotulo2, exibir;
JTextField texto1, texto2;
JButton calcular;
public Teorema(){
  super("Calculando a Hipotenusa");
  Container tela = getContentPane();
  
  
  setLayout(null);
  rotulo1 = new JLabel("Base:");  
  rotulo2 = new JLabel("Altura:");
 
  texto1 = new JTextField(5);
  texto2 = new JTextField(5);
  
  exibir = new JLabel("");
  calcular = new JButton("Calcular");
 
  

  rotulo1.setBounds(50,20,100,20);
  rotulo2.setBounds(50,45,100,20);
  
  texto1.setBounds (120,20,80,20);
  texto2.setBounds (120,45,80,20);
  
  exibir.setBounds (120,200,200,20);
  calcular.setBounds  (320,20,90,20);
 
 
 
  

  calcular.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    try{
        double base = Double.parseDouble(texto1.getText());
        double altura= Double.parseDouble(texto2.getText());
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        
        exibir.setVisible(true);
        exibir.setText("A hipotenusa será de: " + hipotenusa); 
        
    } catch (NumberFormatException ex) {
        exibir.setVisible(true);
        
    }
 } }
  );
  
  exibir.setVisible(false);
  tela.add(rotulo1);tela.add(rotulo2); 
  tela.add(texto1);tela.add(texto2); 
  tela.add(exibir);
  
  tela.add(calcular); 
 
    
  setSize(400,250);
  setVisible(true);
  setExtendedState(MAXIMIZED_BOTH);
}
public static void main (String args[]){
           Teorema app = new Teorema();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    
}
