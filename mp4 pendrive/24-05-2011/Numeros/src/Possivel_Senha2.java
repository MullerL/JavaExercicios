

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Müller
 */
import java.util.Scanner;
public class Possivel_Senha2 
{
    public static void main (String args[])
    {
        String sNovoTexto = "";
        Scanner pegaInf = new Scanner(System.in);
        Util.naTela("+---------------------------------+");
        Util.naTela("| Programa para criação de senhas |");
        Util.naTela("| usando as vogais.                |");
        Util.naTela("|           30/08/2011            |");
        Util.naTela("|             Müller              |");
        Util.naTela("+---------------------------------+");
        
        Util.naTela("Digite uma senha com letras");
        String sTexto = pegaInf.next().toUpperCase();
        for (int cont = 0; cont < sTexto.length(); cont++)
        {       
            char cLetra = sTexto.charAt(cont);
            if (cLetra == ('A'))
            {
               sTexto = "1";
            }
            if (cLetra == ('E'))
            {
               sTexto = "2";
            }
            if (cLetra == ('I'))
            {
               sTexto = "3";
            }
            if (cLetra == ('O'))
            {
               sTexto = "4";
            }
            if (cLetra == ('U'))
            {
               sTexto = "5";
            }
        }
        Util.naTela(sTexto);
    }
}
