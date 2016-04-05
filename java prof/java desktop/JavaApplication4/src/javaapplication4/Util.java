/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Aluno
 */
import java.io.*;
public class Util 
{
    public static void exibe (String texto)
    {
        System.out.println(texto);
    }
    public static String lerOpcao()
    {
           try
           {
             BufferedReader msg = new BufferedReader(new InputStreamReader(System.in));
             String pega = msg.readLine();
             return pega;
           }
           catch (IOException e)
           {
                return "Erro ao ler o texto!";
           }
    }
    public static void validar(String pass, String senha)
    {
        String nome = "MMMM";
        String chave = "123";
        if ((pass.equals(nome))&& (senha.equals(chave)))
        {
            exibe("Bem vindo\n"+ nome);
            menu();
        }
        else
        {
            exibe("Usuario ou senha incorreto(s)");
        }
    }
    public static void menu()
    {
         exibe("Digite 1 para CADASTRAR \n"+
                "Digite 2 para VISUALIZAR \n"+
                "Digite 3 para SAIR");
    }
    public static void cadastrar ()
    { 
        exibe("Descreva a pergunta");
        String perg = lerOpcao();
    }
    public static void visualisar()
    {
        exibe("");
    }
    public static void sair()
    {
        exibe("Obrigado por usar o sistema\n"+"enter para sair");
        lerOpcao();
    }
}

    

