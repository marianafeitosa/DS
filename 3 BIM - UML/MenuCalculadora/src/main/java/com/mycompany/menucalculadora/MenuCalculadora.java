/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.menucalculadora;

/**
 *
 * @author marianaarashiro
 */
public class MenuCalculadora {

    // Atributos
    private Calculadora calculadora;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;

    // Método construtor que instancia os objetos
    public MenuCalculadora() {
        this.calculadora = new Calculadora();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }

    // Método que executa a calculadora até que a opção 0 seja escolhida
    public void executarCalculadora() {
        do {
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        } while (this.opcao != 0);
    }

    // Método que mostra o menu da calculadora e recebe a opção escolhida pelo usuário
    private void executarMenuPrincipal() {
        String mensagemMenu = "Selecione uma opção:\n"
            + "1 - Somar\n"
            + "2 - Subtrair\n"
            + "3 - Multiplicar\n"
            + "4 - Dividir\n"
            + "0 - Sair";
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.StringToInt(entradaDados);
    }

    // Método que avalia a opção escolhida pelo usuário e realiza a operação correspondente
    public void avaliarOpcaoEscolhida() {
        double num1 = 0, num2 = 0;
        if (this.opcao != 0 && this.opcao <= 4) {
            String mensagemEntrada1 = "Digite o 1º número: ";
            num1 = conversor.stringToDouble(io.entradaDados(mensagemEntrada1));
            calculadora.setNumero01(num1);

            String mensagemEntrada2 = "Digite o 2º número: ";
            num2 = conversor.stringToDouble(io.entradaDados(mensagemEntrada2));
            calculadora.setNumero02(num2);
        }

        switch (this.opcao) {
            case 1:
                calculadora.somar();
                io.saidaDados("Resultado da soma: " + calculadora.getResultado());
                break;
            case 2:
                calculadora.subtrair();
                io.saidaDados("Resultado da subtração: " + calculadora.getResultado());
                break;
            case 3:
                calculadora.multiplicar();
                io.saidaDados("Resultado da multiplicação: " + calculadora.getResultado());
                break;
            case 4:
                calculadora.dividir();
                io.saidaDados("Resultado da divisão: " + calculadora.getResultado());
                break;
            case 0:
                io.saidaDados("Saindo da calculadora...");
                calculadora.sair();
                break;
            default:
                io.saidaDados("Opção Inválida");
                break;
        }
    }

    public static void main(String[] args) {
        MenuCalculadora menu = new MenuCalculadora();
        menu.executarCalculadora();
    }
}
