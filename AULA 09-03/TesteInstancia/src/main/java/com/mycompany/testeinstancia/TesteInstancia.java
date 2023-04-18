/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeinstancia;
// está importando uma classe de formatação "DecimalFormat" e importando a classe "Scanner"
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dti
 */
// classe principal
public class TesteInstancia {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); // Instância da classe Scanner, recebendo o objeto "entrada", que recebe um parâmetro para entrar com os dados 
        byte n = 0; // contador de notas
        // declarando as váriaveis 
        double nota, soma = 0;
        double media;
        System.out.println("Nota do aluno, -1 encerra o programa!");
        nota = entrada.nextInt(); // objeto "entrada" que tem um parâmetro para digitar um valor 
        // condições 
        while(nota!= -1){
            soma = soma + nota;
            n = (byte) (n+1);
            System.out.println("Nota do aluno, -1 encerra o programa!");
            nota = entrada.nextInt();
        }
        // Instância da classe "DecimalFormat
        DecimalFormat df= new DecimalFormat("0.00");
        //condições + teste lógico 
        if (n != 0){
            media = soma / n;
            System.out.println("Média igual a:" + df.format(media));
        }
        else
            System.out.println("Nenhuma nota foi digitada!");   
        
    }
    
}
