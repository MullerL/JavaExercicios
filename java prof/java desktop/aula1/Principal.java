/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soufabra.aula1;

/**
 *
 * @author Müller
 * @date 19/04/2011
 * @descricao aplicacao do teste
 */
import javax.swing.*;
public class Principal
{
    public static void main (String args[])
    {/*
        System.out.println("ola mundo");
        System.out.println ("01 - Somar");
        System.out.println ("02 - Subtrair");
        System.out.println ("03 - Multiplicar");
        System.out.println (1+2);
        System.out.println (1-2);
        JOptionPane.showMessageDialog (null,1*2);
    */
        Somar.Somar(15, 35);
        Subtrair.Subtrair(0, 0);
        Multiplicar.Multiplicar(15, 35);
        Divisao.Divisao (15,35);
        //Util.exibir("Ola mundo");
        //Util.exibeMenu();
    }
}

