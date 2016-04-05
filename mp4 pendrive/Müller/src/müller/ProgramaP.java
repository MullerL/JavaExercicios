/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package müller;

/**
 *
 * @author Müller
 */
public class ProgramaP extends Util
{
    public static void main(String[] args)
    {
      exibe("Bem vindo\n\n"+"Entre com o usuario");
      String peg = lerOpcao();
      exibe("Entre com a senha");
      String sen = lerOpcao();
      verificar(peg, sen);//confere o usuario
      boolean ret = verificar(peg, sen);
      usar (ret);
      String opc = "";
      String op = "";
      //opc = lerOpcao(); 
      //opcaoMenu(opc);
      //op = opcaoMenu(opc);
      do
      {  
         opc = lerOpcao();
         opcaoMenu(opc);
         op = opcaoMenu(opc);
         //menu();
      }
      while(!op.equals("3") );
    }
}
