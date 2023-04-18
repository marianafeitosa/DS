/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo01; // criando um pacote na biblioteca java, chamando a pasta onde o programa vai estar

import javax.swing.JOptionPane; // importando a classe grafica JOptionPane 

/**
 *
 * @author Admin
 */
public class exemplo_um { //  criando a classe exemplo 1- é publica
    
    public static void main(String[] args){ // usando um método sem valor de retorno (void), não usa a clausula "return"
        // método "digite"
        digite();
        
       
        
    }
    
    static void digite(){
        // declarando a variavel
         int a;
         
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:")); //  executa a ação do método "digite"´pelo JOptionPane 
         dobro(a); // "a" é um parâmetro 
       
    }
    
    static void dobro(int n){
        int d = n * 2; // "n" está copiando o valor de "a" e está fazendo o cálculo 
        JOptionPane.showMessageDialog(null, "Dobro de  "+n+ "é"  +d); // exibe o valor de n e d pelo JOptionPane 
    }
    
    
}
