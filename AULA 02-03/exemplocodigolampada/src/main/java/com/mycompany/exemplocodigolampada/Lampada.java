
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocodigolampada;

/**
 *
 * @author dti
 */
public class Lampada { // classe principal 
    private String estadoDaLampada = "apagada"; // declarando a variavel estadoDaLampada
    
    // criando os métodos da classe Lampada
    public void acende() { // metodo 
        estadoDaLampada = "acesa";
    }
    public void apaga(){
        estadoDaLampada = "apagada";
        
    }
    public void mostraEstado (){
        if (estadoDaLampada.equals("acesa")){ // está comparando as strings ou seja o estado da lampada, se está acesa ou apagada 
            System.out.println("Está acesa!");
        } else {
            System.out.println("Está apagada");
        }
    }
    
    
} // fim da classe Lampada
