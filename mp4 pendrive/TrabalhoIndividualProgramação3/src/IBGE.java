/*O programa cadastra usuarios, perguntas e pessoas para realização das entrevistas.
 Os usuarios cadastrados, são responsaveis por todo os cadastros necessarios para a entrevista, desde as perguntas ao 
 cadastro da pessoa que sera entrevistada, feito os cadastros, o usuario realiza a entrevista digitando a matricula da
 pessoa a ser entrevistada, seguido do codigo da entrevista, feito isso o entrevistado responde as perguntas, e suas respostas
 são salvas no programa.
 Depois de respondidas as perguntas, o usuario tambem pode ir ao menu relatorios, onde onde alem de ver os dados cadastrais do
 entrevistado, pode verificar todas as perguntas respondidadas por ele, e suas respostas*/
import java.util.Scanner;
/*
 * @author Müller
 */
public class IBGE
{
    public static void main(String[] args) 
    {
        boolean confirmacaoErrada = true;
            Scanner pegaInformacao = new Scanner(System.in);
            boolean retornoUsuario = Utilitarios.criarDiretorio("usuarios");// cria pasta usuarios senão existir
            boolean retornoPerguntas = Utilitarios.criarDiretorio("perguntas");// cria pasta perguntas senão existir
            boolean retornoEntrevistados = Utilitarios.criarDiretorio("pessoasEntrevistadas");// cria pasta pessoasEntrevistadas senão existir
            boolean retornoRespostas = Utilitarios.criarDiretorio("respostas");// cria pasta respostas senão existir
            System.out.println((retornoUsuario == true && retornoPerguntas == true && retornoEntrevistados == true &&
                    retornoRespostas == true) ? "Pastas criadas (Banco de dados)" : "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            do
            {
                    Utilitarios.mostraNaTela("Digite o nome do usuario CADASTRADO"); // e ja verifica se o usuario existe
                    String sNomeUsuario = pegaInformacao.nextLine();
                    boolean existeS_N = Utilitarios.carregaParametros(sNomeUsuario); // existe arquivo de usuarios SIM NÂO
                    String sSenha = "", sConfirmaSenha = "";

                    if (existeS_N == false)
                    {
                        Utilitarios.mostraNaTela("O usuario >> " + sNomeUsuario + " << ainda não esta cadastrado");
                        do
                        {
                            //Utilitarios.mostraNaTela("Digite o nome do usuario para realiazar o Cadastro SEM ESPAÇOS");
                            //sNomeUsuario = pegaInformacao.nextLine();

                            Utilitarios.mostraNaTela("Digite a senha para realizar o cadastro");
                            sSenha = pegaInformacao.nextLine();

                            Utilitarios.mostraNaTela("Digite a senha novamente SEM ESPAÇOS");
                            sConfirmaSenha = pegaInformacao.nextLine();
                            if(sConfirmaSenha.equals(sSenha))
                            {
                                Utilitarios.gravaArquivo(sNomeUsuario, sSenha, sConfirmaSenha);//grava os dados do novo usuario
                                //sNomeUsuario = pegaInformacao.next();
                                //sSenha = pegaInformacao.next();
                                //sConfirmaSenha = pegaInformacao.next();
                                confirmacaoErrada = true; // se não receber true nessa linha corre o risco de a variavel esta com
                                //false, mesmo quando era para estar com true
                                Utilitarios.mostraNaTela("Usuario: " + sNomeUsuario + "\nSenha: " + sConfirmaSenha + 
                                        "\nCadastrado!!! Parabens");
                                //Utilitarios.mostraMenuDe5opcoes();// mostra o menu do sistema
                                //byte sMenuOpcao = pegaInformacao.nextByte();//pega a opção do usuario em byte
                                Menu1a5.opcoes(sNomeUsuario);// mostra o menu do sistema
                            }
                            else
                            {
                                Utilitarios.mostraNaTela("Confirmação de senha errada \nTente Novamente");
                                confirmacaoErrada = false;
                            }
                        
                        }while(confirmacaoErrada == false);
                    }
                    else//O USUARIO JA EXISTE logo sua senha e a mesma coisa q a confirmação da senha, metodo gravarArquivo
                    {
                        Utilitarios.mostraNaTela("Digite a senha");
                            sSenha = pegaInformacao.nextLine();
                            boolean senhaCorreta = Utilitarios.carregaParametros(sNomeUsuario, sSenha);
                            if (senhaCorreta == true)
                            {
                                System.out.print("Seu ultimo acesso foi: ");
                                Utilitarios.carregaParametrosDataHora(sNomeUsuario); //mostra ultimo acesso
                                Utilitarios.gravaArquivo(sNomeUsuario, sSenha, sSenha);//grava usuario senha confirmação da senha
                                // e ultimo acesso
                                //Utilitarios.mostraMenuDe5opcoes();// mostra o menu do sistema
                                //byte sMenuOpcao = pegaInformacao.nextByte(); // pega a opção de 1 a 5
                                Menu1a5.opcoes(sNomeUsuario); // joga a opção para o metodo
                                confirmacaoErrada = true; 
                            }
                            else
                            {
                                Utilitarios.mostraNaTela("Senha Incorreta \nTente Novamente");
                                confirmacaoErrada = false;
                            }
                    }
            }while(confirmacaoErrada == false);
                /*Utilitarios.mostraNaTela("Digite o nome do usuario");
                    sNomeUsuario = pegaInformacao.next();

                    Utilitarios.mostraNaTela("Digite a senha");
                    sSenha = pegaInformacao.next();
                    String sUsuarioJaCadastrado = Utilitarios.carregaParametros(sNomeUsuario, sSenha);
                    if(sSenha == sUsuarioJaCadastrado)
                    {
                        
                    }*/
                //Utilitarios.mostraNaTela("Digite a senha");
                //String sValidaUsuario = pegaInformacao.next();
    }
}
