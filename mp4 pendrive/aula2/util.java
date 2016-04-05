/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula2;

/**
 *
 * @author Müller
 */
public class util
{
    public static void exibir (String texto)
    {
        System.out.println(texto);
    }

    public static void repeticao (int quan)
    {
        for (int i = 1; i<= quan;i++)
        {
            exibir("Exibindo o numero " + i);
        }
    }
     public static void versao (String versao)
    {
        if (versao.equals("versao"))
        {
            exibir( "a versao do sistema e 01.01.01");
        }else{
            exibir( "a versao é incompativel");
        }
             
        
 }
}

