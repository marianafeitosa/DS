/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.imc;

/**
 *
 * @author marianaarashiro
 */
public class IMC {
    
    // Atributos
    private double peso;
    private double altura;
    private double imc;

    // Construtor sem parâmetros
    public IMC() {
        this(0, 0, 0);
    }

    // Construtor com parâmetros
    public IMC(double peso, double altura, double imc) {
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }
    
    
    
     
    // Métodos para realizar os cálculos com base nos valores dos atributos
    public void imc() {
        setImc(this.getPeso() / (this.getAltura() * this.getAltura()));
    }

   
    // Método para sair do programa
    public void sair() {
        System.exit(0);
    }
    
    

}
