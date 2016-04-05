/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author Müller
 */

public class MegaSena 
{    
    public static void main(String[] args) 
    {
        String opcao = "";
        do
        {
            System.out.println("Mega Sena Estimativa de Prêmio R$ 29.000.000,00");        
            for (int cont = 1; cont <= 6; cont++)
            {
                int numero = (int) (Math.random() * 100);
                if (numero <= 60)
                {            
                    System.out.print(numero + " - ");                
                }
                else
                {
                    cont--;
                }
            }
            Scanner pegaInformacao = new Scanner(System.in);
            System.out.println("\nDeseja gerar outros numeros: SIM ou NÃO");
            opcao = pegaInformacao.next().toUpperCase();            
        }while(opcao.equals("Sim"));
    }
}
