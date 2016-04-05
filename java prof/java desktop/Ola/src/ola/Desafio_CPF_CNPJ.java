/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ola;

import java.util.Scanner;

/**
 *
 * @author Müller
 */
public class Desafio_CPF_CNPJ 
{
    public static void main (String args[])
    {
        Scanner pegaInf = new Scanner(System.in);
        System.out.println("Digite o cpf, ou CNPJ por favor");
        String sDigitado = pegaInf.next();
        if (sDigitado.length() == 11)
        {
            System.out.println("" + sDigitado.charAt(0) +
                               sDigitado.charAt(1) +
                               sDigitado.charAt(2) +(".")+
                               sDigitado.charAt(3) + 
                               sDigitado.charAt(4)+
                               sDigitado.charAt(5) + (".") +
                               sDigitado.charAt(6)+
                               sDigitado.charAt(7)+
                               sDigitado.charAt(8)+("-")+
                               sDigitado.charAt(9)+
                               sDigitado.charAt(10));
        }
        else if (sDigitado.length() == 14)
        {
            System.out.println(sDigitado.charAt(0) + 
                               sDigitado.charAt(1) +(".")+
                               sDigitado.charAt(2) +
                               sDigitado.charAt(3) + 
                               sDigitado.charAt(4)+(".")+
                               sDigitado.charAt(5) +
                               sDigitado.charAt(6)+
                               sDigitado.charAt(7) +("/")+
                               sDigitado.charAt(8)+
                               sDigitado.charAt(9)+
                               sDigitado.charAt(10)+
                               sDigitado.charAt(11) + ("-") +
                               sDigitado.charAt(12) +
                               sDigitado.charAt(13));
        }
        else if (sDigitado.length() != 14 || sDigitado.length() != 11)
        {
            System.out.println("Digite um cpf ou cnpj");
        }
        
        //String cpf = "111.111.111-11";
        //String cnpj = "11.111.111/1111-11";
        //System.out.println("cabei cpf = "+ cpf +" cnpj = " + cnpj);
        
        
        
    }
}
