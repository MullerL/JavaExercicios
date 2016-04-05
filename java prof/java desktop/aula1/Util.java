/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soufabra.aula1;

/**
 *
 * @author aluno
 */
public class Util
{
    public static void exibir(String texto)
    {
        String txt;
        txt = texto;
        System.out.println(texto);
    }
    public static void exibir(int numero)
    {
        int num;
        num = numero;
        System.out.println(num);
    }
    public static void exibeMenu()
    {
        Util.exibir("Opção 1");
        Util.exibir("Opção 2");
        Util.exibir("Opção 3");
    }
}
