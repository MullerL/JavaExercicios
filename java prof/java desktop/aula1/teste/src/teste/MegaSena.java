package teste;
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
        {int numero[] = new int[6];

            //int numero[] = new int[5];
            System.out.println("Mega Sena Estimativa de Prêmio R$ 29.000.000,00");        
            /*public static void geraNumeros()
            {
                for (int cont = 0; cont <= 5; cont++)
                {
                    numero[cont] = (int) (Math.random() * 100);

                    /*if ((numero[cont] <= 60) && (numero[0] != numero[0]))
                    {            
                        System.out.print(numero + " - ");             
                    }
                    else
                    {
                        cont--;
                    }
                }*/
            //}
            geraNumeros();
            for (int cont = 0; cont <= 5; cont++)
            {
                if ((numero[cont] <= 60) && (numero[0] != numero[cont+1]) &&
                        (numero[1] != numero[0]) && 
                        (numero[1] != numero[2]) &&
                        (numero[1] != numero[3]) &&
                        (numero[1] != numero[4]) &&
                        (numero[1] != numero[5]) &&
                        (numero[2] != numero[0]) &&
                        (numero[2] != numero[1]) &&
                        (numero[2] != numero[3]) &&
                        (numero[2] != numero[4]) &&
                        (numero[2] != numero[5]) &&
                        (numero[3] != numero[0]) &&
                        (numero[3] != numero[1]) &&
                        (numero[3] != numero[2]) &&
                        (numero[3] != numero[4]) &&
                        (numero[3] != numero[5]) &&
                        (numero[4] != numero[0]) &&
                        (numero[4] != numero[1]) &&
                        (numero[4] != numero[2]) &&
                        (numero[4] != numero[3]) &&
                        (numero[4] != numero[5]) &&
                        (numero[5] != numero[0]) &&
                        (numero[5] != numero[1]) &&
                        (numero[5] != numero[2]) &&
                        (numero[5] != numero[3]) &&
                        (numero[5] != numero[4]))
                    {            
                        System.out.print(numero + " - ");             
                    }
                    else
                    {
                        geraNumeros();
                        cont--;
                    }
            }
            Scanner pegaInformacao = new Scanner(System.in);
            System.out.println("\nDeseja gerar outros numeros: SIM ou NÃO");
            opcao = pegaInformacao.next().toUpperCase();            
        }while(opcao.equals("Sim"));
    }
    
    public static void geraNumeros() // gera 6 numeros
        {
                int numero[] = new int[6];
                for (int cont = 0; cont <= 5; cont++)
                {
                    numero[cont] = (int) (Math.random() * 100);
                }
        }
}
