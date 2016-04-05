import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Müller
 */
public class VemData 
{
    public static void main(String args[])
    {
         try
         {
                byte opcao = 0;
                boolean sair = true;
                Scanner pegaInormação = new Scanner(System.in);
                do
                {
               
                    Utilitarios.mostraMenuDe5opcoes(); // menu Principal do sistema
                    opcao = 0;
                    opcao = pegaInormação.nextByte();
                    switch(opcao)
                    {

                        case 5:
                            Utilitarios.mostraNaTela("Deseja finalizar o Programa? \nResponda: \nTecle (s) para Sim ou "
                                    + "\nTecle (n) para Não?");
                            String resposta = pegaInormação.next().toLowerCase();
                            if(resposta.equals("s"))
                            {
                                   System.exit(0);
                                   break;
                            }
                            else if (resposta.equals("n"))
                            {                            
                                  sair = false;
                                  break;
                            }                        
                            else
                            {
                                while(!(resposta.equals("s")) || !(resposta.equals("n")))
                                {
                                    Utilitarios.mostraNaTela("ATENÇÃO!!! \nDeseja finalizar o Programa? \nResponda: \nTecle (s) para Sim ou "
                                    + "\nTecle (n) para Não?");
                                    resposta = pegaInormação.next().toLowerCase();
                                    if(resposta.equals("s"))
                                    {
                                        System.exit(0);
                                        break;
                                    }
                                    else if (resposta.equals("n"))
                                    {                            
                                        sair = false;
                                        break;
                                    }                                
                                }
                                break;
                            }
                            default:
                            System.out.println("O menu so vai de 1 a 5 \nDigite 1, 2, 3, 4 ou 5 !");
                            sair = false;
                    }
                
                }while(sair == false);
         }
         catch(InputMismatchException erro)
         {
               System.out.println("Por favor, tecle 1, 2, 3, 4 ou 5, não é possivel usar letras no menu " + erro);
         }        
    }    
}
