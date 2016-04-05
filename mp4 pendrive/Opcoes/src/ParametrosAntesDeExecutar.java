 
//passar 3 parametros 1parametro = 1soma 2multiplica 3subtração
// 2parametro numero
// 3parametro numero
//java -jar F:\Opcoes\dist\Opcoes.jar (executa o .jar)

public class ParametrosAntesDeExecutar 
{  
    public static void main (String args [])
    {
        if( 0 < Integer.parseInt(args[0]) && Integer.parseInt(args[0]) < 4)
        {
            if (Integer.parseInt(args[0]) == 1)
            {
                System.out.println("A soma dos valores = " + (Integer.parseInt(args[1])+Integer.parseInt(args[2])));
            }
            else if (Integer.parseInt(args[0]) == 2)
            {
                System.out.println("A multiplicação dos valores = " + (Integer.parseInt(args[1])*Integer.parseInt(args[2])));
            }
            else
            {
                System.out.println("A subtração dos valores = " + (Integer.parseInt(args[1])-Integer.parseInt(args[2])));
            }
        }
        else
        {
            System.out.println("Parametros incorretos");
        }
    }
}