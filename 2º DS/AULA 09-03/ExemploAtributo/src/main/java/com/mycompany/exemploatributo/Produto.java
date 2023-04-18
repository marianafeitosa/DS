/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemploatributo;

/**
 *
 * @author marianaarashiro
 */
// classe principal 
public class Produto  extends Object{
    // atributos a classe Produto -> HERANÇA = produto herda do objeto 
    public int codigo;
    public String nome;
    public int quantidade;
    public double preco;
    // método constrtutor com parâmetros -> ex no código = "int c" -> faz referência ao código , "String n" faz referência ao nome
    public Produto(int c, String n, int q, double p){
        codigo = c;
        nome = n;
        quantidade = q;
        preco = p;
        
    }

 }

