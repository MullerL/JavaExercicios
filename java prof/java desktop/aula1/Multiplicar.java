/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soufabra.aula1;

/**
 *
 * @author aluno
 */
public class Multiplicar
{
    public static void Multiplicar (int valor1, int valor2)
    {
        int vl1 = 0,vl2 = 0,resultado = 0;
        vl1 = valor1;
        vl2 = valor2;
        resultado = vl1*vl2;
        Util.exibir("O valor da multiplicação e");
        Util.exibir(resultado);

    }
}
