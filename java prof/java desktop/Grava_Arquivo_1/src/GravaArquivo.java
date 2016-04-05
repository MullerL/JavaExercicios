
import java.io.File;
import java.io.FileOutputStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class GravaArquivo 
{
    public static void main (String args[])
    {
        String sTesxto = "Texto a ser gravado no bloco de notas eibpeirnbpeibnepinbepinbpintpienbpite";
        String sNomeArquivo = "arquivo Müller";
        gravaArquivo(sTesxto, sNomeArquivo);
    }
    public static void gravaArquivo(String sText, String sNomeArquivo)
    {
        try
        {
            File arquivo;
            arquivo = new File(sNomeArquivo + ".txt");
            FileOutputStream fos = new FileOutputStream(arquivo);
            
            String sTexto = sText;
            fos.write(sTexto.getBytes());
            fos.close();
            
        }
        catch(Exception erro)
        {
            erro.printStackTrace();
        }
    }
}
