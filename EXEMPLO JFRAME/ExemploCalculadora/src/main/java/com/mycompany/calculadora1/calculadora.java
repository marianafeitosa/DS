/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dti
 */
public class calculadora extends JFrame {
JLabel rotulo1,rotulo2, exibir, texto3;
JTextField texto1, texto2;
JButton somar, sub, mult, div, sair, hab, deshab, ocu, exi, limpar;
public calculadora(){
  super("Calculadora");
  Container tela = getContentPane();
  ImageIcon icone = new ImageIcon("calculadoraicone.png");
  setIconImage(icone.getImage());
  
  setLayout(null);
  rotulo1 = new JLabel("1° número:");  
  rotulo2 = new JLabel("2° número:");
  texto1 = new JTextField(5);
  texto2 = new JTextField(5);
  texto3 = new JLabel("Resultado:");
  exibir = new JLabel("");
  somar = new JButton("+");
  sub = new JButton("-");
  mult = new JButton("*");
  div = new JButton("/");
  sair = new JButton("Sair");
  hab = new JButton ("Habilitar");
  deshab = new JButton ("Desabilitar");
  ocu = new JButton ("Ocultar");
  exi = new JButton ("Exibir");
  limpar = new JButton ("Limpar");
  

  rotulo1.setBounds(50,20,100,20);
  rotulo2.setBounds(50,45,100,20);
  texto1.setBounds (120,20,80,20);
  texto2.setBounds (120,45,80,20);
  texto3.setBounds (50,100,80,20);
  exibir.setBounds (120,100,200,20);
  somar.setBounds  (320,20,90,20);
  sub.setBounds    (320,40,90,20);
  mult.setBounds   (320,60,90,20);
  div.setBounds    (320,80,90,20);
  hab.setBounds    (50,150,90,20);
  deshab.setBounds (130,150,110,20);
  ocu.setBounds    (230,150,90,20);
  exi.setBounds    (320,150,90,20);
  limpar.setBounds (320,100,90,20);
  sair.setBounds   (320,180,90,20);
 
  texto3.setForeground(Color.red);
  deshab.setMnemonic(KeyEvent.VK_D);
  hab.setMnemonic(KeyEvent.VK_H);
  ocu.setMnemonic(KeyEvent.VK_O);
  exi.setMnemonic(KeyEvent.VK_E);
  sair.setMnemonic(KeyEvent.VK_F);
  limpar.setMnemonic(KeyEvent.VK_L);
  

  somar.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    int numero1, numero2,soma;
    soma=0;
    numero1=Integer.parseInt(texto1.getText());
    numero2=Integer.parseInt(texto2.getText());
    soma = numero1+numero2;
    exibir.setVisible(true);
    exibir.setText("A soma será de "+soma); 
  } }
  );
  sub.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    int numero1, numero2,sub;
    sub=0;
    numero1=Integer.parseInt(texto1.getText());
    numero2=Integer.parseInt(texto2.getText());
    sub = numero1-numero2;
    exibir.setVisible(true);
    exibir.setText("A subtração será de "+sub); 
  } }
  );
  mult.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    int numero1, numero2,mult;
    mult=0;
    numero1=Integer.parseInt(texto1.getText());
    numero2=Integer.parseInt(texto2.getText());
    mult = numero1*numero2;
    exibir.setVisible(true);
    exibir.setText("A multiplicação será de "+mult); 
  } }
  );
div.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    int numero1, numero2,div;
    div=0;
    numero1=Integer.parseInt(texto1.getText());
    numero2=Integer.parseInt(texto2.getText());
    div = numero1/numero2;
    exibir.setVisible(true);
    exibir.setText("A divisão será de "+div); 
  } }
  ); 
sair.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    System.exit(0);
    }
  }
  ); 
limpar.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    texto1.setText(null);
    texto2.setText(null);
    exibir.setText(null);
    texto1.requestFocus();
    }
  }
  );
ocu.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    rotulo1.setVisible(false);
    rotulo2.setVisible(false);
    exibir.setVisible(false);
    texto3.setVisible(false);

    }
  }
  );
exi.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    rotulo1.setVisible(true);
    rotulo2.setVisible(true);
    exibir.setVisible(true);
    texto3.setVisible(true);

    }
  }
  );
deshab.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    rotulo1.setEnabled(false);
    rotulo2.setEnabled(false);
    exibir.setEnabled(false);
    texto3.setEnabled(false);
    texto1.setEnabled(false);
    texto2.setEnabled(false);
    }
  }
  );
hab.addActionListener(
  new ActionListener(){
    public void actionPerformed(ActionEvent e) {
    rotulo1.setEnabled(true);
    rotulo2.setEnabled(true);
    exibir.setEnabled(true);
    texto3.setEnabled(true);
    texto2.setEnabled(true);
    texto1.setEnabled(true);
    }
  }
  );
  exibir.setVisible(false);
  tela.add(rotulo1);tela.add(rotulo2);
  tela.add(texto1);tela.add(texto2);
  tela.add(texto3); tela.add(exibir);
  tela.add(sub); tela.add(mult);
  tela.add(div); tela.add(sair);
  tela.add(somar); tela.add(hab);
  tela.add(deshab); tela.add(ocu);
  tela.add(exi);tela.add(limpar);
 
    
  setSize(400,250);
  setVisible(true);
  setExtendedState(MAXIMIZED_BOTH);
}
public static void main (String args[]){
           calculadora app = new calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

