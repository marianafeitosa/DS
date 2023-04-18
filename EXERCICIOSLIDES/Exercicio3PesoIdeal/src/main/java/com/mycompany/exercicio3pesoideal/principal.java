/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3pesoideal;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class principal {
      private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double alt, peso;
        String sexo;
         
        System.out.println("Digite sua altura:");
        alt = input.nextDouble();
        System.out.println("Informe seu sexo F para Feminino/ M para Masculino:");
        sexo = input.nextLine();
        if (sexo.equals("M")) {
            peso = (72.7 * alt) - 58;
            System.out.println("O seu peso ideal é:" + peso);
        } else {
            if (sexo.equals("F")) {
                peso = (62.1 * alt) - 44.7;
                System.out.println("O seu peso ideal é:" + peso);
            }
        }
    }
    
    
}
