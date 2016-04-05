package janelagraficas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Müller
 */
public class Utilitarios
{
    public static boolean carregaParametros(String sUsuario)//retorna true quando usuario existe, false quando não existe
    {
        Properties config = new Properties();
        String arquivo = "usuarios\\"+sUsuario+".txt";

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
            //do usuario, e verificar com a que ele digitou na para fazer a validação e retorna true caso a senha esteje correta 
    {
        Properties config = new Properties();
        String arquivo = "usuarios\\"+sUsuario+".txt";

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
            arquivo = new File("usuarios\\" + sUsuario+".txt");
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
    
    public static void gravaPerguntas(short shNumeroDaQuestão, short numeroCodigoPergunta, String sUsuario, String sPergunta)//grava Perguntas
    {
        NumberFormat formatador = new DecimalFormat("00");//formata colocando 0 a esquerda até 09
        try
        {
            //erro na hora de verificar numero da ultima pergunta
            BufferedWriter out = new BufferedWriter(new FileWriter("perguntas\\" + formatador.format(numeroCodigoPergunta) + sUsuario+".txt", true));
            //String numeroPergunta = formatador.format(sPergunta.charAt(0)+sPergunta.charAt(1)); 
            out.write("[PERGUNTA_" + formatador.format(shNumeroDaQuestão) + "] = " + sPergunta + System.getProperty("line.separator"));
            out.close();
        }
        catch(Exception erro)
        {
            System.out.println("Erro ao gravar pergunta");
        }
    }
    
    public static boolean criarDiretorio(String sDiretorio)// cria diretorio
    {
        String sdiretorio = sDiretorio;
        File dir = new File(sdiretorio);
        if(dir.mkdir())
        {
            //mostraNaTela("Pastas criadas (Banco de dados)");
            return true;
        }
        else
        {
            return false;
            //mostraNaTela("As pastas ja foram criadas (Banco de dados)");
            //System.out.println("Erro ao criar o diretorio");
        }
    }
    
    public static void renomeiaDiretorio(String sNomeAtual, String sNovoNome)//renomeia diretorio
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
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static String informaDataHora()// pega data do sistema
    {
        //Locale localidade = new Locale("pt", "BR"); // linguagem (pt) país (BR)
        GregorianCalendar calendarioGregoriano = new GregorianCalendar();
        SimpleDateFormat formatarAdata = new SimpleDateFormat("EEEE', 'dd' de 'MMMMM' de 'yyyy' as 'HH':'mm aa");
        //na linha de cima EEEE dia da semana, dd dia em numeros MMMMM mes, yyyy ano, localidade portugues BRasil
        return String.valueOf(formatarAdata.format(calendarioGregoriano.getTime()));
    }
    
    public static void carregaParametrosDataHora(String sUsuario) // mostra ultimo acesso, void
    {
        Properties config = new Properties();
        String arquivo = "usuarios\\"+sUsuario+".txt";

        //String sConfirmaUsuario = "", sSenhaSenha = "", sConfirmaSenha = "", sUltimoAcesso="";
        try
        {
            //String sConfirmaUsuario = "", sSenhaSenha = "", sConfirmaSenha = "", sUltimoAcesso="";
            config.load(new FileInputStream(arquivo));
            String sAcessoUltimo = config.getProperty("[ULTIMO_ACESSO]");
            Utilitarios.mostraNaTela("Seu ultimo acesso foi: " + sAcessoUltimo);
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
            Utilitarios.mostraNaTela("Erro ao carregar a data" + eeerro);
            //return false;
        }
        /*String parametros = "Parametros carregados: \n \n" +
                "Usuario..........:" + sUsuario + "\n" +
                "Senha............:" + sSenha + "\n" +
                "Grupo Usuario....:" + sGrupoUsuario + "\n" +
                "Ultimo acesso....:" + sUltimoAcesso + "\n";
        System.out.println(parametros);*/
    }
    
    // mostra Numero Da Ultima Pergunta, sUsuario ja com o numero do codigo das perguntas
    public static short carregaParametrosNumeroDaUltimaPergunta(short shNumeroQuestao, String sUsuario) 
    {
        Properties config = new Properties();
        String arquivo = "perguntas\\"+sUsuario+".txt";
        try
        {
            config.load(new FileInputStream(arquivo));
            //String sNumerDaPergunta = String.valueOf(sUsuario.charAt(0) + sUsuario.charAt(1));
            String sNumeroUltimaPergunta = config.getProperty("[PERGUNTA_"+ shNumeroQuestao+"]");// pega oq esta na ffrente de [PERGUNTA]

            //sNumeroUltimaPergunta = String.valueOf(sNumeroUltimaPergunta.charAt(0)) + 
            //String.valueOf(sNumeroUltimaPergunta.charAt(1));//pega o numero da pergunta até 99
            //short numeroPergunta = Short.parseShort(sNumeroUltimaPergunta);// transforma o numero em short
            return shNumeroQuestao;
        }
        catch(IOException eeerro)
        {
            //System.out.println("_________________________________________________________________");
            return 0000000000;  
        }
    }
    public static void mostraMenuDe5opcoes() // mostra menu 1 a 5 
    {
        Utilitarios.mostraNaTela("Tecle (1) Cadastrar Perguntas \nTecle (2) Cadastrar Entrevistados \nTecle (3)"
                                        + " Realizar entrevistas \nTecle (4) Relatório \nTecle (5) Sair");
    }
    
    public static short carregaParametrosNumeroDeGrupoPerguntas(String sUsuario) // ultimo grupo de perguntas
    {
        NumberFormat formatador = new DecimalFormat("00");
        String sNumeroUltimoGrupoPergunta = "";
        short ultimoGrupo = 0;
        short codigoPergunta = 1;
        while (codigoPergunta < 100)
            {
                try
                {
                    //procuro quando não achar retorno o numero depois +1 ex 04 o grupo de perguntas tera numero = 05
                    Properties config = new Properties();
                    String arquivo = "perguntas\\"+ formatador.format(codigoPergunta)+sUsuario+".txt";
                    config.load(new FileInputStream(arquivo));            
                    sNumeroUltimoGrupoPergunta = formatador.format(codigoPergunta);
                    ultimoGrupo = Short.parseShort(sNumeroUltimoGrupoPergunta);// transforma o numero em short
                    //return Short.parseShort(sNumeroUltimoGrupoPergunta);// transforma o numero em short
                    codigoPergunta++;
                    continue;
                }
                catch(IOException eeerro)
                {
                    //System.out.println("-----------------------------------------------------------------");
                    return ultimoGrupo;
                    //break;
                }
            }   
        return 0; //missing return statement = falta instrução de retorno
        //continue;
    }
    
    public static void gravaEntrevistados(String sMatricula, String sNome, String sTelefone, String sEmail)//grava entrevistados
    {
        try
        {
            BufferedWriter out = new BufferedWriter(new FileWriter("pessoasEntrevistadas\\" + sMatricula + ".txt", true));
            out.write("[MATRICULA] = " + sMatricula + System.getProperty("line.separator"));
            out.write("[NOME] = " + sNome + System.getProperty("line.separator"));
            out.write("[TELEFONE] = " + sTelefone + System.getProperty("line.separator"));
            out.write("[EMAIL] = " + sEmail + System.getProperty("line.separator"));
            out.close();
        }
        catch(Exception erro)
        {
            Utilitarios.mostraNaTela("Erro ao gravar entrevistados");
        }
    }
    
    public static boolean carregaParametrosDadosEntrevistado(String sMatricula, String sTelefone, String sEmail) // confirma dados do entrevistado
    {
        Properties config = new Properties();
        String arquivo = "pessoasEntrevistadas\\" + sMatricula + ".txt";
        try 
        {
            config.load(new FileInputStream(arquivo));
            String sKdMatricula = config.getProperty("[MATRICULA]");// pega oq esta na ffrente de [MATRICULA]
            String sKdTelefone = config.getProperty("[TELEFONE]");// pega oq esta na ffrente de [TELEFONE]
            String sKdEmail = config.getProperty("[EMAIL]");// pega oq esta na ffrente de [EMAIL]
            if (sKdMatricula.equals(sMatricula) || sKdTelefone.equals(sTelefone) || sKdEmail.equals(sEmail)) 
            {                
                return true;      
            }
            else
            {                
                return false;
            }
        }
        catch (IOException eeerro) 
        {
            //Utilitarios.mostraNaTela("##############################################");//quando não acha matricula passada para realização do cadastro
            return false;
        }
    }
    
    public static boolean carregaParametrosNumeroDeGrupoPerguntasExiste(String sMatricula, String sCodigo, String sUsuario) // existe grupo de pergunta
    {
        NumberFormat formatador = new DecimalFormat("00");
        try
        {
            Scanner pegaInformacao = new Scanner(System.in);
            short shCodigo = Short.parseShort(sCodigo);
            Properties config = new Properties();
            String arquivo = "perguntas\\"+ formatador.format(shCodigo)+sUsuario+".txt";
            BufferedReader input = new BufferedReader(new FileReader(arquivo));
            config.load(new FileInputStream(arquivo));
            String sPerguntaCadastrada = "";
            
            //short shNumeroQuestao = 1;
            
            while(input.ready())
            {
                //String sKdPergunta = config.getProperty("[PERGUNTA_" + formatador.format(shNumeroQuestao) + "]");// pega oq esta na ffrente de [PERGUNTA]
            
                sPerguntaCadastrada = input.readLine();
                sPerguntaCadastrada = sPerguntaCadastrada.substring(18, sPerguntaCadastrada.length());
                String sResposta = JOptionPane.showInputDialog(sPerguntaCadastrada);
                //String sResposta = pegaInformacao.nextLine();
                Utilitarios.gravaRespostasEntrevistados(sMatricula, sCodigo, sPerguntaCadastrada, sResposta);
                //Utilitarios.mostraNaTela(sKdPergunta);
                //shNumeroQuestao++;
            }
            input.close();
            return true;
        }
        catch(IOException eeerro)
        {
            return false;
        }
        catch (IllegalArgumentException erro)//na hora de digitar o codigo da entrevista
        {
            Utilitarios.mostraNaTela("Atenção!!! Digite o codigo usando numeros");
            return false;
        }
    }
    
    public static void gravaRespostasEntrevistados(String sMatricula, String sCodigoConjuntoPerguntas, String sPergunta, String sResposta)//grava respostas do entrevistado
    {
        try
        {
            BufferedWriter out = new BufferedWriter(new FileWriter("respostas\\" + sMatricula + "+" + sCodigoConjuntoPerguntas + ".txt", true));
            out.write("[PERGUNTA] = " + sPergunta + System.getProperty("line.separator"));
            out.write("[RESPOSTA] = " + sResposta + System.getProperty("line.separator"));
            out.close();
        }
        catch(Exception erro)
        {
            Utilitarios.mostraNaTela("Erro ao gravar respostas entrevistados");
        }
    }
    
    public static void carregaParametrosTodosDadosEntrevistado(String sMatricula) // mostra dados do entrevistado
    {
        
        try 
        {
            Properties config = new Properties();
            String arquivo = "pessoasEntrevistadas\\" + sMatricula + ".txt";
            BufferedReader input = new BufferedReader(new FileReader(arquivo));
            config.load(new FileInputStream(arquivo));
            //Properties config = new Properties();
            /*String sKdMatricula = config.getProperty("[MATRICULA]");// pega oq esta na ffrente de [MATRICULA]
            String sKdNome = config.getProperty("[NOME]");// pega oq esta na ffrente de [NOME]
            String sKdTelefone = config.getProperty("[TELEFONE]");// pega oq esta na ffrente de [TELEFONE]
            String sKdEmail = config.getProperty("[EMAIL]");// pega oq esta na ffrente de [EMAIL]
            Utilitarios.mostraNaTela(sKdNome);*/
            String sDadosGravados = "";
            while(input.ready())
            {                            
                sDadosGravados += input.readLine()+"\n";//pega até a ultima linha do cadastro do entrevistado
            }
            Utilitarios.mostraNaTela(sDadosGravados);// mostra todos os dados do entrevistado
            input.close();
        }
        catch (IOException eeerro) 
        {
            Utilitarios.mostraNaTela("A matricula não esta cadastrada!");            
        }
    }
    
    public static void carregaParametrosTodasRespostasEntrevistado(String sMatricula) // mostra dados do entrevistado
    {
        boolean mostroRespostas = false;
        short codigoPergunta = 1;
        while (codigoPergunta < 100)
        {            
            try 
            {
                Properties config = new Properties();
                String arquivo = "respostas\\" + sMatricula + "+"+ String.valueOf(codigoPergunta) +".txt";
                BufferedReader input = new BufferedReader(new FileReader(arquivo));//new FileReader(arquivo
                config.load(new FileInputStream(arquivo));
                //Properties config = new Properties();
                /*String sKdMatricula = config.getProperty("[MATRICULA]");// pega oq esta na ffrente de [MATRICULA]
                String sKdNome = config.getProperty("[NOME]");// pega oq esta na ffrente de [NOME]
                String sKdTelefone = config.getProperty("[TELEFONE]");// pega oq esta na ffrente de [TELEFONE]
                String sKdEmail = config.getProperty("[EMAIL]");// pega oq esta na ffrente de [EMAIL]
                Utilitarios.mostraNaTela(sKdNome);*/
                String sDadosGravados = "";
                while(input.ready())
                {                            
                    sDadosGravados += input.readLine() + "\n";                    
                    mostroRespostas = true;
                }
                Utilitarios.mostraNaTela("Respostas das perguntas do codigo = " + codigoPergunta + "\n\n" + sDadosGravados);
                input.close();
                codigoPergunta++;
            }
            catch (IOException eeerro) 
            {
               // System.out.println("A matricula não esta cadastrada!!!!!!!");
                codigoPergunta++;
            }
        }
        if (mostroRespostas == false)
        {
                Utilitarios.mostraNaTela("A matricula não esta cadastrada ou o Entrevistado não respondeu nenhuma Pergunta!!!!!!!");
        }
    }
}