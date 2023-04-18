/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo03; // criando um pacote na biblioteca java, chamando a pasta onde o programa vai estar

import javax.swing.JOptionPane; // importando a classe gráfica JOptionPane

/**
 *
 * @author Admin
 */
public class exemplo_tres { // criando a classe principal "exemplo_tres" e é pública
    
    public static void main(String[] args){
        //declarando as váriaveis 
        int idade1, idade2;
        String nome1, nome2;
        // saída para o usuario digitar o nome e a idade das duas pesssoas 
        nome1= JOptionPane.showInputDialog("Digite o nome da 1° pessoa:");
        idade1= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1° pessoa:"));
        
        nome2= JOptionPane.showInputDialog("Digite o nome da 2° pessoa:");
        idade2= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2° pessoa:"));
        
        String texto = PessoaMaisVelha(nome1, idade1, nome2, idade2); // recebe o método PessoasMaisVelha
        
        JOptionPane.showMessageDialog(null, texto);
        
    }

 static String PessoaMaisVelha(String n1, int id1, String n2, int id2) { // método PessoasMaisVelhas retorna com uma string informando o nome da pessoa mais velha 
     // condições atribuidas as variaveis 
        if (id1 > id2)
            return n1 + "é a pessoa mais velha";
        else
            if(id2 > id1)
            return n2 + "é a pessoa mais velha";
            else 
                return n1 + "e" + n2+ "tem a mesma idade";
                
    }
    
}
