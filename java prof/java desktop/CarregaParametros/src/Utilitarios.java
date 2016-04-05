import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Utilitarios
{
    public static void carregaParametros()
    {
        Properties config = new Properties();
        String arquivo = "fabra.ini";

        String sUsuario = "", sSenha = "", sGrupoUsuario = "", sUltimoAcesso="";
        try
        {
            config.load(new FileInputStream(arquivo));
            sUsuario = config.getProperty("[USUARIO]");
            sSenha = config.getProperty("[SENHA]");
            sGrupoUsuario = config.getProperty("[GRUPO_USUARIO]");
            sUltimoAcesso = config.getProperty("[ULTIMO_ACESSO]");
        }
        catch(IOException eeerro)
        {
            System.out.println("Erro ao carregar os parametros");
        }
        String parametros = "Parametros carregados: \n \n" +
                "Usuario..........:" + sUsuario + "\n" +
                "Senha............:" + sSenha + "\n" +
                "Grupo Usuario....:" + sGrupoUsuario + "\n" +
                "Ultimo acesso....:" + sUltimoAcesso + "\n";
        System.out.println(parametros);
    }
    
    public static void criarDiretorio(String sDiretorio)
    {
        String sdiretorio = sDiretorio;
        File dir = new File(sdiretorio);
        if(dir.mkdir())
        {
            //conseguiu criar
        }
        else
        {
            System.out.println("Erro ao criar o diretorio");
        }
    }
    public static void renomeiaDiretorio(String sNomeAtual, String sNovoNome)
    {
        File diretorioAtual = new File (sNomeAtual);
        File novoDiretorio = new File (sNovoNome);

        if(diretorioAtual.renameTo(novoDiretorio))
        {
        }
        else
        {
            System.out.println("Erro ao renomear o diretorio");
        }
    }
}
