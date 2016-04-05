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
      validar(peg, sen);//confere o usuario
      exibe (validar(peg, sen));
      {

      }
    }

}
