import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;
/**
 *
 * @author Müller
 */
public class Menu1a5 
{
    public static void opcoes(String sNomeUsuario)
    {        
                         
            NumberFormat formatador = new DecimalFormat("00");//formata colocando 0 a esquerda até 09
            String perguntas[] = new String[100]; 
            String sOutraPergunta = "x"; // x so para na comparação ficar != de n
            boolean sair = true;
            short numeroDaUltimaPergunta = 0;
            short codigoPergunta = 1;
            Scanner pegaInformação = new Scanner(System.in);
            byte byOpcao = 0;
            do
            {
                try
                {       
                    byOpcao = 0;
                    Utilitarios.mostraMenuDe5opcoes(); // menu Principal do sistema
                    byOpcao = Byte.parseByte(pegaInformação.next());
                    sOutraPergunta = "z";// z so para na comparação ficar != de n. Z é necessario
                    switch(byOpcao)
                    {
                        case 1://cadastrar perguntas
                            //verifica numero do ultimo grupo de perguntas
                            codigoPergunta = Utilitarios.carregaParametrosNumeroDeGrupoPerguntas(sNomeUsuario);
                            Utilitarios.mostraNaTela("Atenção!!! O conjunto das perguntas cadastradas tera codigo = " +
                                    formatador.format(++codigoPergunta));

                            for (int contador = 0; contador < (contador+1) && !sOutraPergunta.equals("n") ; contador++)
                            {                                    
                                numeroDaUltimaPergunta = Utilitarios.carregaParametrosNumeroDaUltimaPergunta(numeroDaUltimaPergunta, formatador.format(codigoPergunta) + sNomeUsuario);
                                Utilitarios.mostraNaTela("Digite a pergunta e pressione enter");
                                // ++ antes de converte em String. formatador colocando 0 a esquerda
                                perguntas[contador] =  String.valueOf(formatador.format(++numeroDaUltimaPergunta)) +" "+ pegaInformação.next() + pegaInformação.nextLine();
                                Utilitarios.gravaPerguntas(numeroDaUltimaPergunta, Short.parseShort(formatador.format(codigoPergunta)) , sNomeUsuario, perguntas[contador]);//grava perguntas
                                Utilitarios.mostraNaTela("Deseja cadastrar outra pergunta \nResponda: \nTecle (s) para Sim ou "
                                    + "\nTecle (n) para Não?");
                                sOutraPergunta = pegaInformação.nextLine();
                                if(sOutraPergunta.equals("s"))
                                {
                                    //pega o numero da ultima pergunta
                                    numeroDaUltimaPergunta = Utilitarios.carregaParametrosNumeroDaUltimaPergunta(numeroDaUltimaPergunta, formatador.format(codigoPergunta) + sNomeUsuario); 
                                    continue;// volta no for                                         
                                }
                                else if (sOutraPergunta.equals("n"))
                                {
                                    //pega o numero da ultima pergunta
                                   numeroDaUltimaPergunta = Utilitarios.carregaParametrosNumeroDaUltimaPergunta(numeroDaUltimaPergunta, formatador.format(codigoPergunta) + sNomeUsuario);
                                   sair = false;
                                   break; // sai do for
                                }                        
                                else
                                {
                                    while(!(sOutraPergunta.equals("s")) || (sOutraPergunta.equals("n")))
                                    {
                                        Utilitarios.mostraNaTela("ATENÇÃO!!! \nDeseja cadastrar outra pergunta \nResponda:"
                                                + " \nTecle (s) para Sim ou \nTecle (n) para Não?");
                                        sOutraPergunta = pegaInformação.next().toLowerCase();
                                        if(sOutraPergunta.equals("s"))
                                        {
                                            //pega o numero da ultima pergunta
                                            numeroDaUltimaPergunta = Utilitarios.carregaParametrosNumeroDaUltimaPergunta(numeroDaUltimaPergunta, formatador.format(codigoPergunta) + sNomeUsuario);
                                            break; // sai so while cai no for
                                            //sair = false;
                                        }
                                        else if (sOutraPergunta.equals("n"))
                                        {
                                            //pega o numero da ultima pergunta
                                            numeroDaUltimaPergunta = Utilitarios.carregaParametrosNumeroDaUltimaPergunta(numeroDaUltimaPergunta, formatador.format(codigoPergunta) + sNomeUsuario);
                                            sOutraPergunta = "n";
                                            sair = false;
                                            break; // sai do while
                                        }
                                    }
                                }
                            }
                        break;
                        case 2://cadastrar entrevistado
                            do
                            {
                                Utilitarios.mostraNaTela("Digite a matricula da pessoa que sera entrevistada");
                                String sMatricula = pegaInformação.next() + pegaInformação.nextLine();
                                Utilitarios.mostraNaTela("Digite o nome da pessoa que sera entrevistada");
                                String sNome = pegaInformação.nextLine();
                                Utilitarios.mostraNaTela("Digite o telefone da pessoa que sera entrevistada");
                                String sTelefone = pegaInformação.nextLine();
                                Utilitarios.mostraNaTela("Digite o e-mail da pessoa que sera entrevistada");
                                String sEmail = pegaInformação.nextLine();
                                //verifica se a matricula ja existe , telefone e email
                                boolean retornoEntrevistado = Utilitarios.carregaParametrosDadosEntrevistado(sMatricula, sTelefone, sEmail);
                                if (retornoEntrevistado == false)
                                {
                                    Utilitarios.gravaEntrevistados(sMatricula, sNome, sTelefone, sEmail);//grava entrevistado
                                }
                                else
                                {
                                    Utilitarios.mostraNaTela("Usuario ja existente no sistema verifique a matricula telefone e e-mail");
                                    sair = false;
                                    break;
                                }
                                Utilitarios.mostraNaTela("Deseja cadastrar outro pessoa para entrevistar \nResponda:"
                                        + " \nTecle (s) para Sim ou \nTecle (n) para Não?");
                                String sOutroEntrevistado = pegaInformação.nextLine();
                                if(sOutroEntrevistado.equals("s"))
                                {
                                   sair = true; 
                                }
                                else if (sOutroEntrevistado.equals("n"))
                                {

                                   sair = false;
                                   //break; // sai do for
                                }                        
                                else
                                {
                                    while(!(sOutroEntrevistado.equals("s")) || (sOutroEntrevistado.equals("n")))
                                    {
                                        Utilitarios.mostraNaTela("ATENÇÃO!!! \nDeseja cadastrar outro pessoa para entrevistar \nResponda: "
                                                + "\nTecle (s) para Sim ou \nTecle (n) para Não?");
                                        sOutroEntrevistado = pegaInformação.nextLine().toLowerCase();
                                        if(sOutroEntrevistado.equals("s"))
                                        {
                                            //pega o numero da ultima pergunta

                                            //break; // sai so while cai no for
                                            sair = true;
                                        }
                                        else if (sOutroEntrevistado.equals("n"))
                                        {
                                            //pega o numero da ultima pergunta
                                            sair = false;
                                            break; // sai do while
                                        }
                                    }
                                }
                            }
                            while(sair == true);                                
                        break;

                        case 3://realizar entrevista
                            Utilitarios.mostraNaTela("Digite a matricula do entrevistado");
                            String sMatriculaFornecida = pegaInformação.next();
                            boolean bMatriculaExiste = Utilitarios.carregaParametrosDadosEntrevistado(sMatriculaFornecida, "", "");
                            if (bMatriculaExiste == true)
                            {
                                //quer dizer que a matricula existe
                                Utilitarios.mostraNaTela("Digite o codigo da entrevista");
                                String sCodigoFornecido = pegaInformação.next();//não pego em short para poder tratar o erro no metodo
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
                        break;

                        case 4://relatorios
                            do
                            {
                                Utilitarios.mostraNaTela("Tecle (1) Listagem do Usuário \nTecle (2) Listagem da pergunta");
                                String sRelatorios1_2 = pegaInformação.next();
                                if(sRelatorios1_2.equals("1"))
                                {
                                    Utilitarios.mostraNaTela("Digite a matricula do Entrevistado");
                                    String sMatriculaDigitada = pegaInformação.next();
                                    //no metodo ja trato a matricula se existe ou não
                                    Utilitarios.carregaParametrosTodosDadosEntrevistado(sMatriculaDigitada);//mostra dados
                                    sair = false;
                                    break;//sai do do-while
                                }
                                else if (sRelatorios1_2.equals("2"))
                                {
                                    Utilitarios.mostraNaTela("Digite a matricula do Entrevistado");
                                    String sMatriculaDigitada2 = pegaInformação.next();
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
                        case 5:
                            Utilitarios.mostraNaTela("Deseja finalizar o Programa? \nResponda: \nTecle (s) para Sim ou "
                                    + "\nTecle (n) para Não?");
                            String resposta = pegaInformação.next().toLowerCase();
                            if(resposta.equals("s"))
                            {
                                   System.exit(0);//sai do sistema
                            }
                            else if (resposta.equals("n"))
                            {                            
                                  sair = false;
                            }                        
                            else
                            {
                                while(!(resposta.equals("s")) || !(resposta.equals("n")))
                                {
                                    Utilitarios.mostraNaTela("ATENÇÃO!!! \nDeseja finalizar o Programa? \nResponda: \nTecle (s) para Sim ou "
                                    + "\nTecle (n) para Não?");
                                    resposta = pegaInformação.next().toLowerCase();
                                    if(resposta.equals("s"))
                                    {
                                        System.exit(0);
                                    }
                                    else if (resposta.equals("n"))
                                    {                            
                                        sair = false;
                                        break; // <-- necessario pora sair do while
                                    }                                
                                }
                            }
                            break;
                            default:
                            System.out.println("O menu so vai de 1 a 5 \nDigite 1, 2, 3, 4 ou 5 !");
                            sair = false;
                    }
                 }
                 catch(InputMismatchException erro)
                 {  
                    System.out.println("Por favor, tecle 1, 2, 3, 4 ou 5, não é possivel usar letras no menu ");
                    sair = false;
                 }
                 catch(NumberFormatException errro)
                 {
                     System.out.println("Por favor, tecle 1, 2, 3, 4 ou 5, não é possivel usar letras no menu ");
                     sair = false;
                 }
             }
             while(sair == false);        
    }
}