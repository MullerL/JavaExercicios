/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ola;

import javax.swing.*;

/**
 *
 * @author aluno
 */
public class Ola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //pegar tres numeros multiplicar dividir somar
        int valor1 , valor2, valor3;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1° valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2° valor"));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 3° valor"));
        JOptionPane.showMessageDialog(null," valor 3 = " + valor3 + " valor 2 = " + valor2 + "valor 3 * valor 2 = " + valor3 * valor2);
        JOptionPane.showMessageDialog(null," valor 3 = " + valor3 + " valor 1 = " + valor1 + "valor 3 / valor 1 = " + valor3 / valor1);
        JOptionPane.showMessageDialog(null," valor 3 = " + valor3 + " valor 2 = " + valor2 + "valor 3 + valor 2 = " + valor3 *+ valor2);
        
        
        
        
    }
}
