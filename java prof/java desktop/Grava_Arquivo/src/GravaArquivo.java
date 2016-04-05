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
        String sConteudo_do_Arquivo = "Texto a ser gravado no bloco de nota gravoooooooooo";
        String sNomeArquivo = "uSuarios.txt";
        for (int contador = 0; contador < sNomeArquivo.length(); contador++) /* o nome do meu arquivo tem 13 posições temha que
             percorrer todas as 13 posições, o charAt começa do 0, 0 + 12 = 13 posições*/
        {
            if ((sNomeArquivo.charAt(contador) == '/') || (sNomeArquivo.charAt(contador) == '|') ||
                    (sNomeArquivo.charAt(contador) == ':') || (sNomeArquivo.charAt(contador) == '*') ||
                    (sNomeArquivo.charAt(contador) == '?') || (sNomeArquivo.charAt(contador) == '<') ||
                    (sNomeArquivo.charAt(contador) == '>') || (sNomeArquivo.charAt(contador) == '"') || 
                    (sNomeArquivo.charAt(contador) == '\\'))
            {
                 System.out.println("O nome do arquivo não pode conter / | : * ? < > " + '"' + " \\ no  S.O windows");
            }
            else
            {
                gravaArquivo(sConteudo_do_Arquivo, sNomeArquivo);
            }
        }
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
