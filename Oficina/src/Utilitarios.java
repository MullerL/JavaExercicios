import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Properties;
/**
 *
 * @author Müller
 */
public class Utilitarios
{
    public static boolean carregaParametros(String sUsuario)//retorna true quando usuario existe, false quando não existe
    {
        Properties config = new Properties();
        String arquivo = "C:\\Users\\Müller\\Desktop\\desktop...desktop\\java!!!!!!!\\TrabalhoIndividualProgramação3\\usuarios\\"+sUsuario+".txt";

        //String sConfirmaUsuario = "", sSenhaSenha = "", sConfirmaSenha = "", sUltimoAcesso="";
        try
        {
            //String sConfirmaUsuario = "", sSenhaSenha = "", sConfirmaSenha = "", sUltimoAcesso="";
            config.load(new FileInputStream(arquivo));
            //sConfirmaUsuario = config.getProperty("[USUARIO]");
            //sSenhaSenha = config.getProperty("[SENHA]");
            //if (sSenhaSenha == sUsuario)
            //{
                
            //}
            /*sConfirmaSenha = config.getProperty("[CONFIRMAÇÃO DE SENHA]");
            String parametros = "Parametros carregados: \n \n" +
                "Usuario.................:" + sUsuario + "\n" +
                "Senha...................:" + sSenhaSenha + "\n" +
                "confirmação da senha....:" + sConfirmaSenha + "\n";
            Utilitarios.mostraNaTela(parametros);*/
            return true;
            //sUltimoAcesso = config.getProperty("[ULTIMO_ACESSO]");
            //if((sUsuario == sConfirmaUsuario) && (sSenha == sConfirmaSenha))
            //{
               
           // }
            
            //System.out.println("");
        }
        catch(IOException eeerro)
        {
            //System.out.println("Erro ao carregar os parametros");
            return false;
        }
        /*String parametros = "Parametros carregados: \n \n" +
                "Usuario..........:" + sUsuario + "\n" +
                "Senha............:" + sSenha + "\n" +
                "Grupo Usuario....:" + sGrupoUsuario + "\n" +
                "Ultimo acesso....:" + sUltimoAcesso + "\n";
        System.out.println(parametros);*/
    }

    public static boolean carregaParametros(String sUsuario, String sSenha)// preciso do sUsuario para achar o caminho da senha 
            //do usuario, e verificar com a que ele digitou na para fazer a validação e retorna true a caso a senha esteje correta 
    {
        Properties config = new Properties();
        String arquivo = "C:\\Users\\Müller\\Desktop\\desktop...desktop\\java!!!!!!!\\TrabalhoIndividualProgramação3\\usuarios\\"+sUsuario+".txt";

        String sConfirmaUsu = sUsuario, sSenhaSenha = sSenha;
        try
        {
            config.load(new FileInputStream(arquivo));
            //sConfirmaUsu = config.getProperty("[USUARIO]");//PEGA A INFORMAÇÃO Q ESTIVER NA FRENTE DE [USUARIO]=
            sSenhaSenha = config.getProperty("[SENHA]");//PEGA A INFORMAÇÃO Q ESTIVER NA FRENTE DE [SENHA]=
            
            //sUltimoAcesso = config.getProperty("[ULTIMO_ACESSO]");
            if(sSenha.equals(sSenhaSenha))
            {
                return true;
            }
            else
            {                
                return false;
            }
            //String parametros = "Parametros carregados: \n \n" + sUsuario + "\n" + sSenhaSenha;
            //System.out.println(parametros);
        }
        catch(IOException eeerro)
        {
              return false;
            //System.out.println("Erro ao carregar os parametros");
            //return "false";
        }
        /*String parametros = "Parametros carregados: \n \n" +
                "Usuario..........:" + sUsuario + "\n" +
                "Senha............:" + sSenha + "\n" +
                "Grupo Usuario....:" + sGrupoUsuario + "\n" +
                "Ultimo acesso....:" + sUltimoAcesso + "\n";
        System.out.println(parametros);*/
    }
    
    public static void gravaArquivo(String sUsuario, String sSenha, String sConfirmaSenha)//grava nome, senha, 
            //confirmação de senha, e data do cadastro
    {
        try
        {
            File arquivo;
            arquivo = new File("C:\\Users\\Müller\\Desktop\\desktop...desktop\\java!!!!!!!\\TrabalhoIndividualProgramação3\\usuarios\\" + sUsuario+".txt");
            FileOutputStream fos = new FileOutputStream(arquivo);
            
            String sUsuarioGrava = "[USUARIO] = " + sUsuario + System.getProperty("line.separator");
            fos.write(sUsuarioGrava.getBytes());

            String sSenhaGrava = "[SENHA] = " + sSenha + System.getProperty("line.separator");
            fos.write(sSenhaGrava.getBytes());
            //if (sSenha == sConfirmaSenha)
            //{
                String sConfirmaSenhaGrava = "[CONFIRMACAO_DE_SENHA] = " + sConfirmaSenha + System.getProperty("line.separator");
                fos.write(sConfirmaSenhaGrava.getBytes());
                String sDataHora = informaDataHora();
                String sUltimoAcesso = "[ULTIMO_ACESSO] = " + sDataHora;
                fos.write(sUltimoAcesso.getBytes());
                fos.close();
            //}
            //else
            //{
              //  mostraNaTela("Senha de Confirmação errada");
            //}
            
        }
        catch(Exception erro)
        {
            erro.printStackTrace();
        }
    }
    
    public static void criarDiretorio(String sDiretorio)
    {
        String sdiretorio = sDiretorio;
        File dir = new File(sdiretorio);
        if(dir.mkdir())
        {
            mostraNaTela("Pastas criadas (Banco de dados)");
        }
        else
        {
            mostraNaTela("As pastas ja foram criadas (Banco de dados)");
            //System.out.println("Erro ao criar o diretorio");
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
            mostraNaTela("Erro ao renomear o diretorio");
        }
    }
    public static void mostraNaTela(String texto)
    {
        System.out.println(texto);
    }
    
    public static String informaDataHora() 
    {
        //Locale localidade = new Locale("pt", "BR"); // linguagem (pt) país (BR)
        GregorianCalendar calendarioGregoriano = new GregorianCalendar();
        SimpleDateFormat formatarAdata = new SimpleDateFormat("EEEE', 'dd' de 'MMMMM' de 'yyyy' as 'HH':'mm aa");
        //na linha de cima EEEE dia da semana, dd dia em numeros MMMMM mes, yyyy ano, localidade portugues BRasil
        return String.valueOf(formatarAdata.format(calendarioGregoriano.getTime()));
    }
    
    public static void carregaParametrosDataHora(String sUsuario) // mostra ultimo acesso
    {
        Properties config = new Properties();
        String arquivo = "C:\\Users\\Müller\\Desktop\\desktop...desktop\\java!!!!!!!\\TrabalhoIndividualProgramação3\\usuarios\\"+sUsuario+".txt";

        //String sConfirmaUsuario = "", sSenhaSenha = "", sConfirmaSenha = "", sUltimoAcesso="";
        try
        {
            //String sConfirmaUsuario = "", sSenhaSenha = "", sConfirmaSenha = "", sUltimoAcesso="";
            config.load(new FileInputStream(arquivo));
            String sAcessoUltimo = config.getProperty("[ULTIMO_ACESSO]");
            System.out.println(sAcessoUltimo);
            //sSenhaSenha = config.getProperty("[SENHA]");
            //if (sSenhaSenha == sUsuario)
            //{
                
            //}
            /*sConfirmaSenha = config.getProperty("[CONFIRMAÇÃO DE SENHA]");
            String parametros = "Parametros carregados: \n \n" +
                "Usuario.................:" + sUsuario + "\n" +
                "Senha...................:" + sSenhaSenha + "\n" +
                "confirmação da senha....:" + sConfirmaSenha + "\n";
            Utilitarios.mostraNaTela(parametros);*/
            //return true;
            //sUltimoAcesso = config.getProperty("[ULTIMO_ACESSO]");
            //if((sUsuario == sConfirmaUsuario) && (sSenha == sConfirmaSenha))
            //{
               
           // }
            
            /*System.out.println(parametros);*/
        }
        catch(IOException eeerro)
        {
            System.out.println("Erro ao carregar ao carregar a data");
            //return false;
        }
        /*String parametros = "Parametros carregados: \n \n" +
                "Usuario..........:" + sUsuario + "\n" +
                "Senha............:" + sSenha + "\n" +
                "Grupo Usuario....:" + sGrupoUsuario + "\n" +
                "Ultimo acesso....:" + sUltimoAcesso + "\n";
        System.out.println(parametros);*/
    }
    public static void mostraMenuDe5opcoes()
    {
        Utilitarios.mostraNaTela("Tecle (1) Cadastrar Perguntas \nTecle (2) Cadastrar Entrevistados \nTecle (3)"
                                        + " Realizar entrevistas \nTecle (4) Relatório \nTecle (5) Sair");
    }
}
