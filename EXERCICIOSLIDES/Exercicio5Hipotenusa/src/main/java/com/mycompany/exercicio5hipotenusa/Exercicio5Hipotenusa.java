/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio5hipotenusa;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author mariana
 * 
 */
public class Exercicio5Hipotenusa {

    public static void main(String[] args) {
        double base, altura, hipotenusa;
      
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base:" ));
        altura= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura:" ));
        Calcularhipotenusa(base,altura);
        
    }
    

    static double Calcularhipotenusa(double base, double altura) {
        
       double hipotenusa= (double) sqrt(base*base + altura*altura);
       JOptionPane.showMessageDialog(null, "O valor da hipotenusa é:" +hipotenusa);
       hipotenusa = (double) Math.sqrt(hipotenusa);
       return hipotenusa;
    }
}
