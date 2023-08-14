/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

/**
 *
 * @author marianaarashiro
 */
public class MenuIMC {
    private Situacao situacao;
    private IMC imc;  
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;

    public MenuIMC() {
        this.situacao = new Situacao();
        this.imc = new IMC();  
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }

    public void executarImc() {
        do {
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        } while (this.opcao != 5);
    }

 private void executarMenuPrincipal() {
    String mensagemMenu = "Selecione uma opção:\n"
        + "1 - Cadastrar Peso e Altura\n"
        + "2 - Consultar Dados Cadastrados\n"
        + "3 - Calcular IMC\n"
        + "4 - Verificar Situação\n"
        + "5 - Sair\n";
    
    int opcaoSelecionada = -1;
    boolean entradaValida = false;

    while (!entradaValida) {
        String entradaDados = io.entradaDados(mensagemMenu);
        try {
            opcaoSelecionada = conversor.stringToInt(entradaDados);
            entradaValida = true;
        } catch (NumberFormatException e) {
            io.saidaDados("Entrada inválida. Por favor, digite um número válido.");
        }
    }

    this.opcao = opcaoSelecionada;
}


    private void avaliarOpcaoEscolhida() {
        switch (this.opcao) {
            case 1:
                double peso = conversor.stringToDouble(io.entradaDados("Digite o peso (kg): "));
        double altura = conversor.stringToDouble(io.entradaDados("Digite a altura (m): "));
        imc.setPeso(peso);
        imc.setAltura(altura);
        io.saidaDados("Peso e altura cadastrados com sucesso!");
                break;
            case 2:
                    io.saidaDados("Dados Cadastrados:");
        io.saidaDados("Peso: " + imc.getPeso() + " kg");
        io.saidaDados("Altura: " + imc.getAltura() + " m");
                break;
            case 3:
               imc.imc();
        io.saidaDados("\nIMC Calculado: " + imc.getImc());
                break;
            case 4:
                double imcValor = imc.getImc();
    situacao.verificarSituacao(imcValor);
                break;
            case 5:
                io.saidaDados("Finalizando o Programa...");
                break;
            default:
                io.saidaDados("Opção Inválida");
                break;
        }
    }

    


  
    

   
}

