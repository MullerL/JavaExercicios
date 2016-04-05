import java.io.*;
class Utilitarios
{
	public static int lerInteiro()
	{
		try
		{
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			String s = br.readLine();
			return Integer.parseInt(s);
		}
		catch (IOException e)
		{
			return 0;
		}
		catch (NumberFormatException e)
		{
			return 0;
		}
	}
	public static String lerString()
	{
		try
		{
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			String s = br.readLine();
			return s;
 		}
		catch (IOException e)
		{
			return "eRRO AO LER O TEXTO!";
		}
	}
	public static void exibir (String texto)
	{
		System.out.println(texto);
	}
	public static void Somar(int valor1, int valor2)//método
	{
		System.out.println(valor1+valor2);
	}
	public static void versao()
	{
		Utilitarios.exibir ("Aversão do sistema e :0101");
	}
	public static void repetir(int quantidade)
	{
		for (int i=1;i<=quantidade;i++)
		{
			exibir("exibindo o numero "+ i);
		}
	}
	public static void sair ()
	{

	}
}
