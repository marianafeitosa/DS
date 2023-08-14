/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

import javax.swing.JOptionPane;

/**
 *
 * @author marianaarashiro
 */


public class Situacao {
  
    public void verificarSituacao(double imc) {
        if (imc < 16.4) {
            JOptionPane.showMessageDialog(null, "Sua Classificação é de Magreza");
        } else if (imc >= 16.4 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Sua Classificação Está Dentro do Normal");
        } else if (imc >= 25.0 && imc <= 29.5) {
            JOptionPane.showMessageDialog(null, "Sua Classificação é de Sobrepeso ");
        } else  {
            JOptionPane.showMessageDialog(null, "Sua Classificação é Obesidade");
        } 
    }
}


    

