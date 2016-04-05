/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class CarregaArquivo
{
    public static void main (String args[])
    {
        Utilitarios.carregaParametros();
        Utilitarios.criarDiretorio("novo pasta pelo java");
        Utilitarios.renomeiaDiretorio("novo pasta pelo java", "renomeiandolherei novo pasta pelo java");
    }
}
