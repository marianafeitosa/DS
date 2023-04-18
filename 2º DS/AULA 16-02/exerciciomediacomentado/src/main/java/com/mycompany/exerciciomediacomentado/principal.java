 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciomediacomentado;

import javax.swing.JOptionPane; // permite que o usuário insira caixa de diálogos para exibir informações 

/**
 *
 * @author dti
 */
public class principal { // classe principal
   public static void main(String[] args) // public: acesso público , static: é criado um espa~ço na memória quando carregado , void: retorno que não retorna nenhum valor , main: nome do  método
   {
     // declaração das váriaveis, atribuição e execução delas
     double n1 = 0, n2 = 0, n3 = 0, n4 = 0, md = 0;
     String des = "";
     n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota:"));
     n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota:"));
     n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota:"));
     n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4° nota:"));
     
     // cálculo da média, onde a variável "md" soma as 4 notas fornecidas pelo usuário e divide por 4
     md = (n1 + n2 + n3 + n4) / 4;
     // o if/else permite que o programa avalie a expressão como verdadeira ou falsa , se a expressão "if (md >=6)" for verdadeira será executada pelo programa, caso contrário a expressão "else if (md <3)" ou "else" será executada
        
     if (md >=6)
     {
         des = "Aprovado";
     }
     else if (md <3)
     {
         des = "Retido";
         
     }
     else
     {
         des = "Exame";
     }
     
     // exibe a mensagem no display do usuário
     JOptionPane.showMessageDialog(null, "A média é: " + md + "\nStituação do aluno:"  + des);
         
     
   }
}
