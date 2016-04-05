/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafabra;


//<editor-fold defaultstate="collapsed" desc="comment">
public class Sistemafabra extends Utilitarios {

    public static void main(String[] args) {
       char execucao = 'S',
               opcao,
               opcao2= 'N' ;
       String usuario = "" ,
               
               senha = "" ;
       boolean usuarioLogado = false;
       
       limpatela();
       exibir("Sistema de pesquisa FABRA \n \n");
       
       exibir("Digite Usuario");
       usuario = lerString();
       
       exibir("digite sua senha");
       senha = lerString ();
       
       usuarioLogado = validarlogin(usuario,senha);
       
       if(usuarioLogado == false){
           exibir("Usuario nao logado no sistema");
           System.exit(0);
       }else{
       
       
           while (execucao == 'S'){
               exibirMenu();
               
               opcao = lerString().toUpperCase().charAt(0);
               
               switch (opcao){
               case'1':{
                   limpatela();
                   Cadastrar.cadastrar();
                   exibir("Desejar Sair do Sistema? S ou N");
                   if(opcao2 == 's'){
                       
                       sair();
                   } else{
                       execucao = emExecução();
                       }
                   break;
                   }     
                   case'2':{
                       limpatela();
                       exibir("Desenvolver opção 02");
                       exibir("Desejar Sair do Sistema");
                      
                       
                   }
               }
               
           }
               
           }
       
               
       
       
       
       
       
               
    }
}
