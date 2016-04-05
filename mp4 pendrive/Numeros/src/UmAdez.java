
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Müller
 */
public class UmAdez 
{
    public static void main (String args [])
    {
        try
        {
            Scanner pegaInf = new Scanner(System.in);
            Util.naTela("Digite um numero de 1 a 10");
            int numero = pegaInf.nextInt();
            switch (numero)
            {
                case 1:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero um");
                    }
                break;
                case 2:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero dois" );
                    }
                break;
                case 3:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero três" );
                    }
                break;
                case 4:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero quatro" );
                    }
                break;
                case 5:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero cinco" );
                    }
                break;
                case 6:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero seis" );
                    }
                break;
                case 7:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero sete" );
                    }
                break;
                case 8:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero oito" );
                    }
                break;
                case 9:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero nove" );
                    }
                break;
                case 10:
                    for (int conta = 1;conta <= numero; conta++)
                    {
                        Util.naTela("Informado numero dez" );
                    }
                break;
            }
        }
        catch (InputMismatchException erro)
        {
            Util.naTela("Por favor digite um numero de 0 a 10... 0 a 10...  0 a 10...!!!!!!" + erro);
        }
    }
}
