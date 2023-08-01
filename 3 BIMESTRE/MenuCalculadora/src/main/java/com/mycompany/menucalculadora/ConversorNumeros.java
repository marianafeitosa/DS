/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucalculadora;

/**
 *
 * @author marianaarashiro
 */
public class ConversorNumeros {
    // Método que converte uma string para int
    public int StringToInt(String num) {
        int conversor = Integer.parseInt(num);
        return conversor;
    }

    // Método que converte uma string para double
    public double stringToDouble(String num) {
        double conversor = Double.parseDouble(num);
        return conversor;
    }
}
