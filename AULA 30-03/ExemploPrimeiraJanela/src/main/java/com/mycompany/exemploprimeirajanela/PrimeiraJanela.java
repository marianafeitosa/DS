/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploprimeirajanela;

// imprtando pacote para mostra a cor da janela 
// import java.awt.Color;
// import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class PrimeiraJanela extends JFrame { // classe
    public PrimeiraJanela(){ // metodo construtor com o mesmo nome da classe
        super("Nossa primeira janela");
        ImageIcon icone = new ImageIcon("teste.img");
        setIconImage(icone.getImage());
      
        setSize(300,150);
        setVisible(true); // para a janela funcionar
         // Container tela = getContentPane();
      //  tela.setBackground (new Color(0, 0 , 0));  // defininindo a cor de fundo para a janela *da  para usar as cores rgb pelo "(new Color(2255,128,128));"
       // setLocationRelativeTo(null);  janela centralizada
       // setExtendedState(ICONIFIED); janela minimizada
        //setExtendedState(MAXIMIZED_BOTH);// janela maximizada
        // setResizable(false); não consegue redimensionar o tamanho da janela
    }
    
    public static void main(String args[]){
        PrimeiraJanela app = new PrimeiraJanela();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
