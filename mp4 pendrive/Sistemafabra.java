/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafabra;

/**
 *
 * @author Aluno
 */
public class Sistemafabra extends Util 
{
    public static void main(String[] args) 
    {
        exibir("Bem vindo\n"+"Entre com o login");
        String nomelogin = lertexto();
        exibir("Entre com a senha");
        String loginsenha = lertexto();
        login(nomelogin, loginsenha);
        boolean resp = login(nomelogin, loginsenha );
        if (resp == true)
        {
            exibir("Usuario autorizado!!!!!!!!");
        }
        else
        {
            exibir("Usuario não autorizado");
        }
    }
}
