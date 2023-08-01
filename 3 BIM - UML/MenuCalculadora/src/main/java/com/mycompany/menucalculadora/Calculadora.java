/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menucalculadora;

/**
 *
 * @author marianaarashiro
 */
public class Calculadora {
    // Atributos
    private double numero01;
    private double numero02;
    private double resultado;

    // Construtor sem parâmetros
    public Calculadora() {
        this(0, 0, 0);
    }

    // Construtor com parâmetros
    public Calculadora(double numero01, double numero02, double resultado) {
        this.numero01 = numero01;
        this.numero02 = numero02;
        this.resultado = resultado;
    }

    // Método para obter o valor de numero01
    public double getNumero01() {
        return numero01;
    }

    // Método para definir o valor de numero01
    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    // Método para obter o valor de numero02
    public double getNumero02() {
        return numero02;
    }

    // Método para definir o valor de numero02
    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    // Método para obter o resultado
    public double getResultado() {
        return resultado;
    }

    // Método para definir o resultado
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    // Métodos para realizar os cálculos com base nos valores dos atributos
    public void somar() {
        setResultado(this.getNumero01() + this.getNumero02());
    }

    public void subtrair() {
        setResultado(this.getNumero01() - this.getNumero02());
    }

    public void multiplicar() {
        setResultado(this.getNumero01() * this.getNumero02());
    }

    public void dividir() {
        setResultado(this.getNumero01() / this.getNumero02());
    }

    // Método para sair do programa
    public void sair() {
        System.exit(0);
    }

    // Método principal para demonstrar o uso da classe Calculadora
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.setNumero01(10);
        calculadora.setNumero02(5);

        calculadora.somar();
        System.out.println("Soma: " + calculadora.getResultado());

        calculadora.subtrair();
        System.out.println("Subtração: " + calculadora.getResultado());

        calculadora.multiplicar();
        System.out.println("Multiplicação: " + calculadora.getResultado());

        calculadora.dividir();
        System.out.println("Divisão: " + calculadora.getResultado());

        calculadora.sair();
    }

    void somar(double num1, double num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void subtrair(double num1, double num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void multiplicar(double num1, double num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void dividir(double num1, double num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
