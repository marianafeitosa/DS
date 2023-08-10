/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automotivo;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Automotivo {
    // classe principal com os atributos(modelo, marca,cor,ano,chassi) privados. Se utiliza o encapsulamento quando há a existência de atributos privados 
    private String modelo;
    private String marca;
     private String cor;
    private Integer ano;
    private Integer chassi;
   
    
    public Automotivo() { // método construtor sem parâmetros 
        this("", "", "", 0 , 0 ); // inicializando as variáveis privadas para depois recber elas usando o "this"
    }
    public Automotivo (String modelo, String marca,  String cor, Integer ano , Integer chassi){ //método construtor com parâmetros -> está fazendo referência de inicialização aos atributod privados utilizando o "this". 
        // "this" -> chama um atributo, uma classe ou uma variável privada 
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.chassi= chassi;
        
    }

    /**
     * @return the modelo
     */
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
     * @return the chassi
     */
    public Integer getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(Integer chassi) {
        this.chassi = chassi;
    }
    
        
    public void provarExistencia(){ // provar Existencia é um método 
        // System.out.println ("Modelo; " + this.getModelo());
        // System.out.println ("Marca; " + this.getMarca());
         // System.out.println ("Cor; " + this.getCor());
        // System.out.println ("Ano; " + this.getAno());
         // System.out.println ("Chassi; " + this.getChassi());
       
        
        JOptionPane.showMessageDialog(null, "Modelo:" + this.getModelo() + "\nMarca:" + this.getMarca() + "\n Cor:" + this.getCor() + "\n Ano:" + this.getAno() + "\n Chassi:" + this.getChassi() );
        // pode fazer um por um como no exemplo abaixo:
         // JOptionPane.showMessageDialog(null, "Modelo:" + this.getModelo());
        // JOptionPane.showMessageDialog(null, "Marca:" + this.getMarca());
         // JOptionPane.showMessageDialog(null, "Cor:" + this.getCor());
         // JOptionPane.showMessageDialog(null, "Ano:" + this.getAno());
          // JOptionPane.showMessageDialog(null, "Chassi:" + this.getChassi());
         
        
    }
     public void entrarDados(){
         String modelo = JOptionPane.showInputDialog("Modelo:");
    setModelo(modelo);
    marca = JOptionPane.showInputDialog("Marca:");
    setMarca(marca);
    String cor = JOptionPane.showInputDialog("Cor:");
    setCor (cor);
    ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
    setAno(ano);
    chassi = Integer.parseInt(JOptionPane.showInputDialog("Chassi:"));
    setChassi(chassi);
    
    
    
    }
    
    
}
