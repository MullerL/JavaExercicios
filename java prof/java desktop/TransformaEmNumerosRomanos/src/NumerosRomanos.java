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
        String numeros = "1234"; 
        try
        {                
                String opcao = "";
                Scanner pegaInformacao = new Scanner(System.in);
                do
                {                    
                            String mil = "", quinhentos = "", cem = "", cinquenta = "", dez = "", cinco = "", um = "";
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
                                while (numero >= 1000)
                                {
                                     mil = mil + "M";
                                     numero = numero - 1000;
                                     System.out.print(mil);
                                }
                                while (numero >= 500)
                                {
                                    quinhentos = quinhentos + "D";
                                    numero = numero - 500;
                                    System.out.print(quinhentos);
                                }
                                while (numero >= 100)
                                {
                                    cem = cem + "C";
                                    numero = numero - 100;
                                    System.out.print(cem);
                                }
                                while (numero >= 50)
                                {
                                    cinquenta = cinquenta + "L";
                                    numero = numero - 50;
                                    System.out.print(cinquenta);
                                }
                                while (numero >= 10)
                                {
                                    dez = dez + "X";
                                    numero = numero - 10;
                                    System.out.print(dez);
                                }
                                while (numero >= 5)
                                {
                                    cinco = cinco + "V";
                                    numero = numero - 5;
                                    System.out.print(cinco);
                                }
                                while (numero >= 1)
                                {
                                    um = um + "I";
                                    numero = numero - 1;                                    
                                }                       
                                System.out.print(um);
                            }
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