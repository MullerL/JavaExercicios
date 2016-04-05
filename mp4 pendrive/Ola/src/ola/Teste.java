/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ola;

import java.util.*;

/**
 *
 * @author Müller
 */
public class Teste 
{    
    
    public static void main(String[] args) 
    {        
        System.out.println("Mega Sena Estimativa de Prêmio R$ 29.000.000,00");        
        for (int cont = 1; cont <= 6; cont++)
        {
            int numero = (int) (Math.random() * 100);
            if (numero <= 60)
            {            
                System.out.println(numero);                
            }
            else
            {
                cont--;
            }
        }
    }
}
