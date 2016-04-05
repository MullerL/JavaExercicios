/**
 *
 * @author mÜLLER
 */
public class PassandoParametrosAntesDeExecutarOprograma 
{
    public static void main (String parametros[])
    {
        String sPrametro00 = parametros[0];// parametro1 = 1criar diretorio 2deletar diretorio
        String sPrametro01 = parametros[1];// parametro2 = nome do arquivo
        String sPrametro02 = parametros[2];// parametro3 = mostrar mensagens informativas ex diretorio criado
        //boolean bDebug = false;
        //if(sPrametro00.equals("1"))
        //{
          //  bDebug = true;
        //}
        //if(sPrametro02.equals("1"))
        //{
            //cria diretorio
        //}
        //else if(sPrametro02.equals("2"))
        //{ 
            //deleta diretorio
        //}
        System.out.println("Esse programa captura os valores passados como parametros");
        if(parametros.length > 2)
        {
            System.out.println("Primeiro paramentro " + sPrametro00);
            System.out.println("Segundo paramentro " + sPrametro01);
            System.out.println("Terceiro paramentro " + sPrametro02);
        }
        /*else
        {
            if(bDebug == true)
            {
                System.out.println("O erro foi ");
            }
        }*/
    }
}
//passar 3 parametros 1parametro = 1soma 2multiplica 3subtração
// 2parametro numero
// 3parametro numero
//java -jar F:\Opcoes\dist\Opcoes.jar (executa o .jar)