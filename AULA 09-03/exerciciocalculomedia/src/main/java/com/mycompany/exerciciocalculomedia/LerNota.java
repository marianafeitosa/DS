/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciocalculomedia;

import javax.swing.JOptionPane; // importando pacote JOptionPane e permite que o usuário insira caixa de diálogos para exibir informações 

/**
 *
 * @author dti
 */

public class LerNota { // publicando a classe principal
    public static void main(String[] args){
        lerNota(); // metodo lerNota 
        
    }
    static void lerNota(){ //metodo 
        //declarando variaveis 
        double n1,n2;
        String nome;
        // janela de entrada de dados, permitindo que o usuario digite 
        nome=JOptionPane.showInputDialog(null, "Digite um Nome:");
        // variavel n1 e n2 está recebendo a nota
           n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota:"));
           n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota:"));
           JOptionPane.showMessageDialog(null, nome);
        calculaMedia(n1,n2);
    }
    
    private static void calculaMedia (double a1, double a2){ // chamando o método "calculaMedia" para calcular a média
        double md;
        md=(a1+a2)/2;
        // condições
        if (md>=7)
            JOptionPane.showMessageDialog(null,"Aprovado"+ md);
        else
            
                JOptionPane.showMessageDialog(null,"Reprovado"+ md);
          
               
       
        
        
    }
    //fim da classe LerNota
    
}
