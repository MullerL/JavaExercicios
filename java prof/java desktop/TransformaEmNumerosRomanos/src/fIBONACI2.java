import java.util.Scanner;

/**
 * @author Müller
 */
public class fIBONACI2
{
    public static void main (String args[])
    {
        int contador = 1;
        Scanner entradaDeinformacao = new Scanner(System.in);
        while(1==1)
        {
            System.out.println("Digite quais dos numeros na sequencia Fibonacci deseja ver ex 1°, 2°, 3° ...");
            int posicao = entradaDeinformacao.nextInt();
            //double eVetor[] = new double[posicao+10];
            int a = 1;
            int b = 0;
            int c = 1;
            for (contador = 0; contador < posicao; contador++)
            {
                c = b;
                b = a + c;
                a = c;
            }
            System.out.println("posição " + (contador) + " = " + b);
            continue;
        }
    }
}
