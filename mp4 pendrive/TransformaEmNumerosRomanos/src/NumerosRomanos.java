import com.sun.jndi.toolkit.ctx.Continuation;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * @author Müller
 */
public class NumerosRomanos 
{
    public static void main (String args [])
    {
        int cont = 1;
        try
        {
                String opcao = "";
                Scanner pegaInformacao = new Scanner(System.in);
                do
                {                    
                            System.out.println("ESTE PROGRAMA CONVERTE UM NUMERO DO TIPO INTEIRO, EM NUMERO ROMANO");
                            System.out.println("Digite um numero maior que 0");
                            int numero = pegaInformacao.nextInt();
                            if (numero < 0)
                            {                                
                                System.out.println("Digite um numero maior que 0");
                            }
                            else if (numero == 0)
                            {
                                System.out.println("Não existe zero em numeros Romanos");                               
                            }
                            else
                            {
                                String sNumero = String.valueOf(numero);
                                if (numero < 4000 && sNumero.length() == 4)
                                {
                                    for (char contador = '1'; contador <= sNumero.charAt(0);contador = (char) cont++)
                                    {
                                        if (contador == contador)
                                        {
                                            String mil = "M";
                                            System.out.println(mil);
                                            contador = (char) (cont+1);
                                        }
                                        /*else
                                        {
                                            
                                        }*/
                                    }
                                }
                            }
                                    /*else if (sNumero.charAt(0) == '2')
                                    {
                                        String miL2 = "MM";
                                        System.out.println(miL2);
                                    }
                                    else if (sNumero.charAt(0) == '3')
                                    {
                                        String miL3 = "MMM";
                                        System.out.println(miL3);
                                    }*/
                                    
                                    
                                
                                                
                           System.out.println("\nDeseja continuar no programa Sim ou Não?");
                           opcao = pegaInformacao.next().toUpperCase();         
                }while(opcao.equals("SIM"));
        }
        catch (InputMismatchException erro)
        {
             System.out.println("ATENÇÃO!!! NÃO É POSSIVEL USAR LETRAS ");                        
        }
        
    }    
}