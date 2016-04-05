
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */

public class Nomes
{
    public static void main (String args[])
    {
        Scanner pegaInf = new Scanner(System.in);
        
        Validacao.exibir("Para utilizar o programa de comparar nome tecle 1\nPara utilizar o programa de comparar numeros tecle 2");
        String opcao = pegaInf.next();
        if (opcao.equals("1"))
        {
            Validacao.exibir("Opção 1");
            Validacao.exibir("Digite o 1° nome");
            String nome = pegaInf.next();
            Validacao.exibir("Digite o 2° nome");
            String nome2 = pegaInf.next();
            Validacao.verificaNomes(nome, nome2);

            boolean resultadoNomes = Validacao.verificaNomes(nome, nome2);
        
                
            if (resultadoNomes == true)
            {
                Validacao.exibir("Nomes iguais");
            }
            else
            {
                Validacao.exibir("Nomes diferentes");
            }
        }
        else 
        {
            Validacao.exibir("Opção 2");
            Validacao.exibir("Digite o 1° numero");
            int numero1 = pegaInf.nextInt();
            Validacao.exibir("Digite o 2° numero");
            int numero2 = pegaInf.nextInt();

            boolean resultoNumeros = Validacao.verificaNumero(numero1, numero2);

            if (resultoNumeros == true)
            {
                Validacao.exibir("Numeros iguais");
            }
            else
            {
                Validacao.exibir("Numeros diferentes");
            }
        }
    }
}
