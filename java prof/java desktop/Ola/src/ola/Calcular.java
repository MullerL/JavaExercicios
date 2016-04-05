/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author aluno
 */
public class Calcular 
{
    public static String lerString()
    {
        try
        {
             BufferedReader numero = new BufferedReader (new InputStreamReader(System.in));
             String numString = numero.readLine();
             return numString;
        }   
        catch (IOException erro)
        {
             return "Erro ao ler o texto";
        }
    }
    public static void main (String args[])
    {
        System.out.println("Entre com o nome\n");
        String nome = lerString();
        //joao String letra = nome.charAt(0));
        System.out.println("O nome é = " + nome );
        System.out.println("\nO nome tem " + nome.length() + " caracteres");
        System.out.println("O segundo caracter é = " + nome.charAt(1));
        System.out.println("O nome em letras MAIUSCULAS = " + nome.toUpperCase());
        System.out.println("O nome em letras MINUSCULAS = " + nome.toLowerCase());
        System.out.println("O conteudo da letra 2 a letra 4 = " + nome.substring(0,1));//começa com 0
        System.out.println("Removendo os caracteres em branco = " + nome.trim());
        System.out.println("O nome formatado = " + nome.toUpperCase().charAt(0)+ nome.substring(1, nome.length()));
        System.out.println("O letra do meio = " +  nome.charAt(nome.length() /2));//retorna int arredondado para baixo
        System.out.println("O ultima letra  = " +  nome.charAt(nome.length() -1));
        
        System.out.println((nome.length() < 3) ? "Nome com 0, 1 ou 2 letras" : nome);
    }
}
