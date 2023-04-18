/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal
{
    public static Scanner input = new Scanner(System.in);
       public static int i;
       
       public static void main(String[] args) 
       {
    System.out.println("Números ímpares existentes entre 75 e 197.");
    for(int i= 75; i <=197; i++)
    {
           if(i % 2 != 0){
               System.out.println(i);
           }
    }
       
       }
}
