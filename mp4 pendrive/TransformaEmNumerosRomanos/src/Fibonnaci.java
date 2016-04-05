
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
        //numeroA[0] = 0;
        //numeroA[3] = 2;
        int contador = 3, resultado = 0, outro = 0, i = 0;
        /*if (numero < 3 && 0 > numero)
        {
            System.out.println(1);
        }
        for(contador = 3; contador <= numero; contador++)
        {            
            numeroA[contador] = cont + numeroA[contador];
            cont++;
        }
        System.out.println(numeroA[contador]);*/
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
