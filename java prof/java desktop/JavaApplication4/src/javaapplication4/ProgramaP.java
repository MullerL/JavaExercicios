/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Aluno
 */
public class ProgramaP extends Util
{
    public static void main(String[] args)
    {
      String vetor[] = new String[10];
      exibe("Bem vindo\n\n"+"Entre com o usuario");
      String peg = lerOpcao();
      exibe("Entre com a senha");
      String sen = lerOpcao();
      validar(peg, sen);//confere o usuario
      String opc = lerOpcao();// opção do menu
      if (opc.equals("1"))
      {
        cadastrar();
      }
      else if (opc.equals("2"))
      {
          exibe("Perguntas cadastradas");
      }
      else
      {
          sair();
      }
    }
}

    

