/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controledecaixa;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class EntradaSaidaDados {
    //metodo que realiza a entrada de dados
    public String entradaDados(String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }
    
    //metodo que realiza a saida de dados
    public void saidaDados(String mensagemSaida){
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
    
}
