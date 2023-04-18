/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploautomotivocomentado;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Automotivo {// classe principal com os atributos(modelo, marca,ano e cor) privados. Se utiliza o encapsulamento quando há a existência de atributos privados 
    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    
    public Automotivo() { // método construtor sem parâmetros 
        this("", "", 0, ""); // inicializando as variáveis privadas para depois recber elas usando o "this"
    }
    public Automotivo (String modelo, String marca, Integer ano, String cor){ //método construtor com parâmetros -> está fazendo referência de inicialização aos atributod privados utilizando o "this". 
        // "this" -> chama um atributo, uma classe ou uma variável privada 
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        
    }

    /**
     * @return the modelo
     */
    // utiliza o get para receber o método 
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void provarExistencia(){ // provar Existencia é um método 
        // System.out.println ("Modelo; " + this.getModelo());
        // System.out.println ("Marca; " + this.getMarca());
        // System.out.println ("Ano; " + this.getAno());
        // System.out.println ("Cor; " + this.getCor());
        
        JOptionPane.showMessageDialog(null, "Modelo:" + this.getModelo() + "\nMarca:" + this.getMarca() + "\n Ano:" + this.getAno() + "\n Cor:" + this.getCor());
        // pode fazer um por um como no exemplo abaixo:
        // JOptionPane.showMessageDialog(null, "Marca:" + this.getMarca());
         // JOptionPane.showMessageDialog(null, "Ano:" + this.getAno());
          // JOptionPane.showMessageDialog(null, "Cor:" + this.getCor());
        
    }
    
    public void entraDados(){
         String modelo = JOptionPane.showInputDialog("Modelo:");
    setModelo(modelo);
    marca = JOptionPane.showInputDialog("Marca:");
    setMarca(marca);
    ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
    setAno(ano);
    String cor = JOptionPane.showInputDialog("cor:");
    setCor (cor);
    
    
    }
    
    public static void main(String[] args){
        Automotivo autol;
        autol = new Automotivo();
        autol.entraDados();
        autol.provarExistencia();
        //todo código de aplicação lógica aqui 
    }
    // fim da classe Automotivo
    // classe privada- > o main está lá dentro por isso é uma única classe, diferente do exemplo da lammpada 
}
