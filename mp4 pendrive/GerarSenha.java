/**
 *
 * @author Müller
 */
public class GerarSenha
{
    public static void main(String args[])
    {
        String retornoSenha = geraSenha("kakekikoku");
        System.out.println(retornoSenha);
    }
    public static String geraSenha(String senha)// metodo que retorna String
    {
        String sSenha = "";
        char cLetra = '1';
        int tamanhoSenha = senha.length();
        for (int contador = 0; contador < tamanhoSenha; contador++)
        {
            cLetra = senha.charAt(contador);
            if (cLetra == 'a')
            {
                sSenha = sSenha + "1";
            }
            else if (cLetra == 'e')
            {
                sSenha = sSenha + "2";
            }
            else if (cLetra == 'i')
            {
                sSenha = sSenha + "3";
            }
            else if (cLetra == 'o')
            {
                sSenha = sSenha + "4";
            }
            else if (cLetra == 'u')
            {
                sSenha = sSenha + "55";
            }
            else
            {
                sSenha = sSenha + cLetra;//senão tiver nenhuma vogal a letra vai para sSenha
            }
            return sSenha;
        }
        return sSenha;
    }
}