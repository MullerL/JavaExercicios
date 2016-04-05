import java.util.Scanner;
class ScanearFinally
{
	public static void main (String args[])
	{
		try
		{
			System.out.println("Digite qualquer coisa");
			Scanner vari = new Scanner(System.in);
			String pega = vari.next();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n" + pega);
		}
		finally
		{
			System.out.println("Fim do Programa de Müller");
		}
	}
}