import java.io.*;
public class Util
{
    public static void exibe (String texto)
    {
        System.out.println(texto);
    }
    public static String lerOpcao()
    {
           try
           {
             BufferedReader msg = new BufferedReader(new InputStreamReader(System.in));
             String pega = msg.readLine();
             return pega;
           }
           catch (IOException e)
           {
                return "Erro ao ler o texto!";
           }
    }
    public static boolean verificar(String pass, String senha)
    {
        String nome = "MMMM";
        String chave = "123";
        if ((pass.equals(nome))&& (senha.equals(chave)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void menu()
    {

        exibe("Digite 1 para CADASTRAR \n"+
                "Digite 2 para VISUALIZAR \n"+
                "Digite 3 para SAIR");

    }
    public static void usar (boolean ret)
    {
        String nome = "MMMM";
        String chave = "123";
       if (ret == true)
       {
           for (short i=0;i<10;i++)
           {
               exibe ("");
           }
           exibe ("Bem vindo\n"+ nome);
           menu();
       }
       else
       {
           for (short i=0;i<10;i++)
           {
               exibe ("");
           }
           exibe ("Usuario ou senha incorreto(s)");
           System.exit(0);
       }
    }
    public static String opcaoMenu (String opc)
	{
	        short cont = 0, escolha = Short.parseShort (opc);
	        String[] nome = new String[10];
	        String perg;
	        switch (escolha)
	        {
	            case 1:
	                do
	                {
	                    exibe ("Entre com o nome do usu�rio");
	                    nome [cont] = lerOpcao();
	                    cont++;
	                    exibe ("Deseja cadastrar mais um usuario \n Sim ou N�o");
	                    perg = lerOpcao();
	                }
	                while (perg.equals ("S"));
	                return "1";
	              //break;
	            case 2:

	                exibe (nome[cont]);
	                cont++;
	                return "2";
	               //break;
	            case 3:

	                return "3";
	               //break;
	        }
	}
}