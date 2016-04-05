/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fabraprogramacao2;

import java.io.*;

/**
 *
 * @author msousa
 */
public class Utilitarios {

    public static void exibir(String texto) {
        System.out.println(texto);
    }

    public static double lerDouble() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            Double d = new Double(s);
            return d.doubleValue();
        } catch (IOException e) {
            return 0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int lerInteiro() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            return Integer.parseInt(s);
        } catch (IOException e) {
            return 0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static String lerString() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            return s;
        } catch (IOException e) {
            return "Erro ao ler o texto!";
        }
    }
    
    public static void exibirVersao(){
        exibir("Versao 01.01");
    }

    public static void exibirMenu(){
        limpaTela();
        exibir("Sistema de Pesquisas FABRA \n \n ");
        exibir("Selecione: \n");
        exibir("1 - Cadastrar Perguntas");
        exibir("2 - Realizar entrevista:");
        exibir("3 - Sair do Sistema");
    }

    public static void limpaTela(){
        for(int i = 0; i < 100; i++)
        System.out.println("");
    }
         
    
    public static void sair(){
            exibir("Obrigado por usar nosso sistema! \n Pressione Enter para Sair");
            lerString();
            System.exit(0);
    }

    public static boolean validarLogin(String usuario, String senha){
        String user = "fabra",
               password = "123456";
        
        if ((user.equals(usuario) ) && (password.equals(senha))){
            return true;
        }else{
            return false;
        }
    }

    public static char emExecucao(){
        return 'S';
    }
}
