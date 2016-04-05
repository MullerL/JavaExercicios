/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafabra;

/**
 *
 * @author Aluno
 */import java.io.*;

class Utilitarios{
public static int lerInteiro(){
try{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine ();
    return Integer.parseInt(s);
    }catch (IOException e) {
     return 0;
    }catch (NumberFormatException e) {
return 0;
      }
  }
public static String lerString(){
   try{

   BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
   String s = br.readLine ();
   return s;
} catch(IOException e) {
  return "Erro ao ler o Texto";
         }

}public static void exibir(String texto){
System.out.println(texto);

     }

public static void somar(int valor1, int valor2){
System.out.println(valor1+valor2);
 }
public static void versao(){
  exibir("A versao do Sistema e 01.01.01");

}
public static void repitir(){
 exibir("Exibir o numero ");

}

public static void exibirMenu(){
        limpatela();
exibir(" Sistema de pesquisa fabra \n \n");
exibir("Selecione: \n");
exibir("1 - Cadastrar Perguntas");
exibir("2 - Realisar Perguntas");
exibir("3 - Apagar Pergunta");

}




 public static void limpatela(){
     for(int i= 0; i<=100; i++){
     exibir("");
     }
 }
     public static void sair() {
         exibir( "Obrigado por usar nosso Sistema! \n Pressione enter para sair");
         lerString();
         System.exit(0);
     }
     public static boolean validarlogin(String usuario, String senha){
         String user = "fabra",
         password = "123456";
         
        if ((user.equals(usuario))&& (password.equals(senha))){
            return true;
        }else{
            return false;
        }         
         
     }
 }

