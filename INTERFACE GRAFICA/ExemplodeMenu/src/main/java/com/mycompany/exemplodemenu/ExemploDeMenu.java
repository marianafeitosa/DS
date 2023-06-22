/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplodemenu;

/**
 *
 * @author marianaarashiro
 */
import javax.swing.*;
import java.awt.event.KeyEvent;

public class ExemploDeMenu extends JFrame {
    JMenuBar barra;
    JMenu opcoes;
    JMenuItem limpar, fonte, sair;

    public ExemploDeMenu() {
        super("Exemplo de Menus");
        

        barra = new JMenuBar();
        setJMenuBar(barra);

        opcoes = new JMenu("Opções");
        barra.add(opcoes);

        limpar = new JMenuItem("Limpar");
        fonte = new JMenuItem("Fonte");
        sair = new JMenuItem("Sair");

        limpar.setMnemonic(KeyEvent.VK_L);
        fonte.setMnemonic(KeyEvent.VK_F);
        sair.setMnemonic(KeyEvent.VK_S);

        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.addSeparator();
        opcoes.add(sair);

        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        ExemploDeMenu app = new ExemploDeMenu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
