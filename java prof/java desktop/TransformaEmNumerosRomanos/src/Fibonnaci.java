import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Müller
 */
public class Fibonnaci 
{
    public static void main (String args [])
    {
        Scanner pegaDigitado = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = pegaDigitado.nextInt();
        
        int numeroA[] = new int [numero+10];
        int contador = 3, resultado = 0, outro = 0, i = 0;
        
        int a = 1;
        if (numero == 1)
        {
            System.out.println(1);
        }
        else
        {
            for (i = 1; outro < numero-1; outro++)
            {  
                numeroA[outro] = i;
                i = i + a;
                a = i - a;
                resultado = numeroA[outro];
            }
            System.out.println(resultado);
        }
    }
}
