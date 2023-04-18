/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo02; // cria um pacote na biblioteca java, chamando a pasta onde o programa vai estar

import javax.swing.JOptionPane; // importando a classe grafica JOptionPane 

/**
 *
 * @author Admin
 */
public class exemplo_dois { // - criando a classe exemplo_dois - é publica
    public static void main (String[] args){
       
        digite();

    }

     static void digite() {
          int t;
        String p;
       p = JOptionPane.showInputDialog("Digite uma palavra qualquer:");
         t= tamanho(p);
          JOptionPane.showMessageDialog(null,p+ "possui"+t+"caracteres");
    }

   static int tamanho(String x) { // está copiando o conteúdo da váriavel "p"
        return x.length(); // retorna ao método
    }
    
}
