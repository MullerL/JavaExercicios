
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */

public class Validacao 
{
    public static boolean verificaNomes(String nome, String nome2)
    {
        if (nome.toLowerCase().equals(nome2.toLowerCase()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean verificaNumero(int numero1, int numero2)
    {
        if (numero1 == numero2)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void exibir (String texto)
    {
        System.out.println(texto);
    }
}
