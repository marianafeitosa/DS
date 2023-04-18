/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2diferenca;

import static com.mycompany.exercicio2diferenca.principal.diferenca;
import javax.swing.JOptionPane;

/**
 *
 * @author mariana
 */
public class principal {

    public static void main(String[] args) {
       double numero1 , numero2 ; 
       double diferenca = 0;
          
       
       numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número para cálculo de diferença:"));
       numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número para cálculo de diferença:"));
       diferenca(numero1, numero2);
    }

     static void diferenca(double numero1, double numero2) {
      
         
        
        if(numero1 > numero2){
            double  diferenca = (numero1-numero2);
            JOptionPane.showMessageDialog(null, "A diferença entre esses é :" +diferenca);
        } else {
            double diferenca = (numero2 - numero1);
            JOptionPane.showMessageDialog(null, "A diferença entre esses é :" +diferenca);
           
        }
    }
}
