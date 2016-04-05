/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.soufabra.aula1;

/**
 *
 * @author aluno
 */
public class Divisao {

    public static void Divisao(int valor1, int valor2) {
        int vl1 = 0, vl2 = 0, resultado = 0;
        vl1 = valor1;
        vl2 = valor2;


        if (vl1 > 0 && vl2 > 0) {
            Util.exibir("O valor da soma e");
            Util.exibir(vl1 / vl2);
        } else {
            Util.exibir("Erro na divisao");

        }
    }
}


