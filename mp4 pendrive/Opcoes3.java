
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Opcoes3 
{
    public static void main (String args[])
    {
        Scanner pegaFrazzzzzzzzeComZ = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String sFrase = pegaFrazzzzzzzzeComZ.next();
        //reverteString(sFrase);
        stringReverte(sFrase);
    }
    public static void reverteString(String sFrase)
    {
        for (int contador = sFrase.length(); contador > 0;contador--) //frase.length() = 6, 5, 4, 3, 2, 1
        {
            System.out.print(sFrase.charAt(contador-1));// 6 - 1 = 5 4 3 2 1 0            
        }
    }
    public static void stringReverte(String texto)
    {
        String reverse = new StringBuffer(texto).reverse().toString();
        System.out.println(reverse);
    }
}
