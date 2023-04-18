/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio4atualizado;

import java.util.Scanner;

/**
 *
 * @author marianaarashiro
 */
public class principal {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int cont = 0;
       
       System.out.println("Informe o número até que deseje parar digitando o 0");
       
       while(true){
           int num = sc.nextInt();
           
           if (num == 0){
               break;
       }
           if (num >=100 && num <=200){
               cont++;
           }
           
       }
       
       System.out.println("Os números digitados entre 100 e 200 foram:" + cont);
    }
}
