import java.io.File;
/**
 *
 * @author Müller
 */
// parametro1 = 1criar diretorio 2deletar diretorio
// parametro2 = nome do arquivo
// parametro3 = mostrar mensagens informativas ex diretorio criado
public class CriaDeleteNomeMsg 
{
    public static void main (String assinatura[])
    {
        if (assinatura.length < 4 && assinatura.length > 0)
        {
            if (assinatura[0].equals("1"))
            {
                // public static void criarDiretorio //cria pasta(String sDiretorio)    
                String nomeDaPasta = assinatura[1];//assinatura[1] tera o nome da pasta
                File pasta = new File(nomeDaPasta);
                if(pasta.mkdir())
                {//cria  a pasta
                    System.out.println((assinatura[2].equals("1")) ? "Pasta criada !!!" : "");
                }   
                else
                {
                    System.out.println("Erro ao criar a pasta");
                }
            }
            else if (assinatura[0].equals("2"))
            {
                // public static void criarDiretorio //cria pasta(String sDiretorio)    
                String nomeDaPasta = assinatura[1];
                File pasta = new File(nomeDaPasta);
                if(pasta.delete())
                {//deleta a pasta
                    System.out.println((assinatura[2].equals("1")) ? "Pasta deletada !!!" : "");
                }   
                else
                {
                    System.out.println("Erro ao deletar a pasta");
                }
            }
        }
        else
        {
            System.out.println("Parametros incorretos!!!");
        }
       
    
    }
}
