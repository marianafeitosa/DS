/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploatributo;

/**
 *
 * @author marianaarashiro
 */
//criando outra classe para testar a classe Produto
public class TestaProd {
    public static void main (String a []){
        // atributos

        String s = " "; 
        Produto produto ;
        // instância do produto
        produto = new Produto(10, "Sabonete", 12, 1.20);
        // contatenando 
        System.out.println(produto.codigo + s + produto.nome);
        System.out.println(produto.quantidade + s + produto.preco);
        produto.quantidade = 100;
        System.out.println(produto.quantidade + s + produto.preco);
        produto.preco = 1.10;
        System.out.println(produto.quantidade + s + produto.preco);
    }
    
}
