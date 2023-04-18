/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codificacaodaclasseusuario;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class principal {
    
    public static void main(String[] args){
        Usuario usuario1 = new Usuario ();
 
        usuario1.provarExistencia();
        
        usuario1.nome = JOptionPane.showInputDialog(null, "Digite o nome:");
        
        usuario1.email = JOptionPane.showInputDialog(null, "Digite o email:");
        
        usuario1.login = JOptionPane.showInputDialog(null, "Digite o login:");
        
        usuario1.senha = JOptionPane.showInputDialog(null, "Digite a senha:");      
        
        JOptionPane.showMessageDialog(null,usuario1.nome);
          JOptionPane.showMessageDialog(null,usuario1.email);
            JOptionPane.showMessageDialog(null,usuario1.login);
              JOptionPane.showMessageDialog(null,usuario1.senha);
        
       
        
         
    }
    
}
