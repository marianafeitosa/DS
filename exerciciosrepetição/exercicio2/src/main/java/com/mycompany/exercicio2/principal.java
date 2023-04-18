/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class principal 
{
    public static Scanner input = new Scanner(System.in);
    public static int numero;
    
    
     public static void main(String[] args) {
        System.out.println("Números inteiros entre 200 a 100 em ordem decrescente.");
        
        
            for(numero = 200; numero>=100; numero-- )
            {
                System.out.println(numero);
                
                System.out.println("");
            }
        }
     }

