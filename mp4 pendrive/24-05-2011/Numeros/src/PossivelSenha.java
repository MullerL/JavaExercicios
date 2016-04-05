
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Müller
 */
import java.util.Scanner;
public class PossivelSenha
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
        String sTexto = pegaInf.next();
        
        String sSubstitui_Texto = sTexto.toUpperCase().replace('A', '1').replace('E', '2')
                .replace('I', '3').replace('O', '4').replace('U', '5'); // primeiro coloca em maiusculas depois substitui        
        
        Util.naTela(sSubstitui_Texto);
        /*for (int contador = 0; contador < sTexto.length(); contador++)
        {
            if (sTexto.charAt(contador) == 'a' || sTexto.charAt(contador) == 'A')
            {
                //Util.naTela(sTexto.substring(1, sTexto.length()) + sTexto.charAt(contador));
                
            }
        } */      
    }
}
