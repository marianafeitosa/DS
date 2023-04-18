/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocodigolampada;

/**
 *
 * @author dti
 */
public class ExemploLampada {
    
    
    public static void main (String[] args){ // pacote da biblioteca de java
        
        // estancia da classe Lampada (criando o objeto lampada)
        Lampada lampada = new Lampada(); // Lampada: classe ; lampada:objeto new: operador Lampada(): método
        
        lampada.acende();
        lampada.apaga();
        lampada.mostraEstado();
    }
    
}
