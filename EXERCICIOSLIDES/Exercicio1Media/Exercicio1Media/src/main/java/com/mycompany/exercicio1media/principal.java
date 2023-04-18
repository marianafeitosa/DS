/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1media;

import javax.swing.JOptionPane;

/**
 *
 * @author marianaarashiro
 */
public class principal {

    static void lerNota(){
        double nota1, nota2, media;
        String nome = "";
        lerNota();
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1º nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2º nota:"));
       calcularMedia(nota1, nota2);
          
        
    }

 
    static double calcularMedia(double n1, double n2) {
     double media = (n1+n2)/2;
        if(media >= 7){
            JOptionPane.showMessageDialog(null,"Aprovado" +media);
        }
        else{
            JOptionPane.showMessageDialog(null,"Reprovado" +media);
            
        }
        
    }

     public static void main(String[] args) {
         lerNota();
     }
}

