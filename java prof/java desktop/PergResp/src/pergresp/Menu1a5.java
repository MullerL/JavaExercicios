package pergresp;
import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 * @author Müller
 */
public class Menu1a5 
{
    public static void opcoes(String sNomeUsuario)
    {        
                         
            NumberFormat formatador = new DecimalFormat("00");//formata colocando 0 a esquerda até 09
            String perguntas[] = new String[100]; // cria vetor de 100 posições
            String sOutraPergunta = "x"; // x so para na comparação ficar != de n
            boolean sair = true;
            short numeroDaUltimaPergunta = 0;
            short codigoPergunta = 1;
            byte byOpcao = 0;
            do
            {
                try
                {       
                    //byOpcao = 0;
                    Object[] opcoes = { "Cadastrar Perguntas", "Cadastrar Entrevistado", "Realizar entrevista",
                        "Relatorios", "Sair" };

                    //resp tem a opção que o usuario escolheu no menu
                    char cResp = (char) JOptionPane.showOptionDialog(null,"Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null,opcoes,opcoes[0]);
                    sOutraPergunta = "z";// z so para na comparação ficar != de n. Z é necessario
                    switch(cResp)
                    {
                        case 0://cadastrar perguntas

                            //verifica numero do ultimo grupo de perguntas
                            codigoPergunta = Utilitarios.carregaParametrosNumeroDeGrupoPerguntas(sNomeUsuario);
                            Utilitarios.mostraNaTela("Atenção!!! O conjunto das perguntas cadastradas tera codigo = " +
                                    formatador.format(++codigoPergunta));

                            for (int contador = 0; contador < (contador+1) && !sOutraPergunta.equals("n") ; contador++)
                            {                                    
                                numeroDaUltimaPergunta = Utilitarios.carregaParametrosNumeroDaUltimaPergunta(numeroDaUltimaPergunta, formatador.format(codigoPergunta) + sNomeUsuario);
                                String pergunta = JOptionPane.showInputDialog("Digite a pergunta");

                                // ++ antes de converte em String. formatador colocando 0 a esquerda
                                //pega a pergunta concatena com numero coloca no vetor
                                perguntas[contador] =  String.valueOf(formatador.format(++numeroDaUltimaPergunta)) +" "+ pergunta;
                                Utilitarios.gravaPerguntas(numeroDaUltimaPergunta, Short.parseShort(formatador.format(codigoPergunta)) , sNomeUsuario, perguntas[contador]);//grava perguntas
                                char cCadastrarOutraPergunta = (char) JOptionPane.showConfirmDialog(null,"Deseja "
                                        + "cadastrar outra pergunta", "Outra Pergunta?", JOptionPane.YES_NO_OPTION,
                                        JOptionPane.QUESTION_MESSAGE);// ? verde
                                if(cCadastrarOutraPergunta == 0)
                                {
                                    //pega o numero da ultima pergunta
                                    numeroDaUltimaPergunta = Utilitarios.carregaParametrosNumeroDaUltimaPergunta(numeroDaUltimaPergunta, formatador.format(codigoPergunta) + sNomeUsuario); 
                                    continue;// volta no for                                         
                                }
                                else
                                {
                                    //pega o numero da ultima pergunta
                                   numeroDaUltimaPergunta = Utilitarios.carregaParametrosNumeroDaUltimaPergunta(numeroDaUltimaPergunta, formatador.format(codigoPergunta) + sNomeUsuario);
                                   sair = false;
                                   break; // sai do for
                                }                        
                                
                             }
                        break;
                        case 1://cadastrar entrevistado
                            do
                            {
                                String sMatricula = JOptionPane.showInputDialog("Digite a matricula da pessoa que sera entrevistada");
                                String sNome = JOptionPane.showInputDialog("Digite o nome da pessoa que sera entrevistada");
                                String sTelefone = JOptionPane.showInputDialog("Digite o telefone da pessoa que sera entrevistada");
                                String sEmail = JOptionPane.showInputDialog("Digite o e-mail da pessoa que sera entrevistada");
                                
                                //verifica se a matricula ja existe , telefone e email
                                boolean retornoEntrevistado = Utilitarios.carregaParametrosDadosEntrevistado(sMatricula);//, sTelefone, sEmail);
                                if (retornoEntrevistado == false)
                                {
                                    Utilitarios.gravaEntrevistados(sMatricula, sNome, sTelefone, sEmail);//grava entrevistado
                                }
                                else
                                {
                                    Utilitarios.mostraNaTela("Entrevistado ja existente no sistema verifique a matricula telefone e e-mail");
                                    sair = false;
                                    break;
                                }
                                char cOutroEntrevistado = (char) JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro pessoa para entrevistar",
                                        "aiaiaiaiaiaia",JOptionPane.YES_NO_OPTION);
                                if(cOutroEntrevistado == 0)
                                {
                                   sair = true;
                                }
                                else
                                {
                                   sair = false;
                                }                        
                            }
                            while(sair == true);                                
                        break;

                       /* case 2://realizar entrevista
                            String sMatriculaFornecida = JOptionPane.showInputDialog("Digite a matricula do entrevistado");
                            boolean bMatriculaExiste = Utilitarios.carregaParametrosDadosEntrevistado(sMatriculaFornecida);//, "", "");
                            if (bMatriculaExiste == true)
                            {
                                //quer dizer que a matricula existe
                                String sCodigoFornecido = JOptionPane.showInputDialog("Digite o codigo da entrevista");
                                //String sCodigoFornecido = pegaInformação.next();//não pego em short para poder tratar o erro no metodo
                                
                                //verifica codigo de pergunta e ja pega a respostas e grava por outro metodo
                                boolean bCodigoexiste = Utilitarios.carregaParametrosNumeroDeGrupoPerguntasExiste(sMatriculaFornecida, sCodigoFornecido, sNomeUsuario);
                                if (bCodigoexiste == true)
                                {
                                    //quer dizer q o grupo de perguntas existe
                                    Utilitarios.mostraNaTela("Entrevista realizada!!");
                                    sair = false;
                                }
                                else
                                {
                                    Utilitarios.mostraNaTela("Grupo de perguntas não existe, cadastre as perguntas para realizar a entrevista");
                                    sair = false;
                                }
                            }
                            else
                            {
                                Utilitarios.mostraNaTela("Matricula não existe, cadastre o entrevistado para realizar a entrevista");
                                sair = false;
                            }
                        break;*/

                        case 3://relatorios
                            do
                            {
                                Object[] opcoesRelatorios = { "Dados do entrevistado", "Respostas do entrevistado" };
                                char cRelatorios1_2 = (char) JOptionPane.showOptionDialog(null,"Escolha uma opção de Relatorio", "Sub-menu Relatorios", 
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,opcoesRelatorios,opcoesRelatorios[0]);
                                if(cRelatorios1_2 == 0)
                                {
                                    String sMatriculaDigitada = JOptionPane.showInputDialog("Digite a matricula do Entrevistado");
                                               
                                    //no metodo ja trato a matricula se existe ou não
                                    Utilitarios.carregaParametrosTodosDadosEntrevistado(sMatriculaDigitada);//mostra dados
                                    sair = false;
                                    break;//sai do do-while
                                }
                                else if (cRelatorios1_2 == 1)// respostas do entrevistado
                                {
                                    String sMatriculaDigitada2 = JOptionPane.showInputDialog("Digite a matricula do Entrevistado");
                                    Utilitarios.carregaParametrosTodasRespostasEntrevistado(sMatriculaDigitada2);// mostra respostas
                                    sair = false;
                                    break;//sai do do-while
                                }
                                else
                                {
                                    sair = true;
                                }
                            }
                            while(sair == true);
                        break;
                        case 4:// sai do sistema
                            char cResposta = (char) JOptionPane.showConfirmDialog(null, "Deseja finalizar o Programa?","Sair?????",
                                    JOptionPane.YES_NO_OPTION);
                            if(cResposta == 0)
                            {
                                   System.exit(0);//sai do sistema
                            }
                            else
                            {                            
                                  sair = false;
                            }                        
                            break;
                        default:
                                  System.exit(0);
                    }
                 }
                 catch(InputMismatchException erro)
                 {  
                    Utilitarios.mostraNaTela("Por favor, tecle 1, 2, 3, 4 ou 5, não é possivel usar letras no menu ");
                    sair = false;
                 }
                 catch(NumberFormatException errro)
                 {
                     Utilitarios.mostraNaTela("Por favor, tecle 1, 2, 3, 4 ou 5, não é possivel usar letras no menu ");
                     sair = false;
                 }
             }
             while(sair == false);        
    }
}