/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ola;

/**
 *
 * @author Müller
 */
import java.util.Scanner;
public class Possivel_Senha_2 
{
    public static void main (String args[])
    {
        Scanner pegaInf = new Scanner(System.in);
        Util.naTela("+---------------------------------+");
        Util.naTela("| Programa para criação de senhas |");
        Util.naTela("| usando as vogais.                |");
        Util.naTela("|           30/08/2011            |");
        Util.naTela("|             Müller              |");
        Util.naTela("+---------------------------------+");
        
        Util.naTela("Digite uma senha com letras");
        String sTexto = pegaInf.next().toUpperCase();
                     
        for (int contador = 0; contador < sTexto.length(); contador++)
        {            
            if (sTexto.charAt(contador) == 'A')
            {
                Util.naTela(sTexto.charAt(contador).substring(contador, sTexto.length()));
                //Util.naTela("dddddddd" + sTexto.substring(contador, sTexto.length()).charAt(contador));
                
            }
        }
        
    }
}
