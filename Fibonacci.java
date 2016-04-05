import java.util.Scanner;
class Fibonacci
{
	public static void main (String args[])
	{
		Scanner pegaInf = new Scanner(System.in);
		System.out.println("Digite um numero");
		int iNumeroDigitado = pegaInf.nextInt();

		double resultado = 0;

		double current, prev = 1, prevprev = 0;
		for(double i = 0;i<iNumeroDigitado-1;i++)
		{
			current = prev + prevprev;
			resultado = current;
			prevprev = prev;
			prev = current;
		}
			System.out.println(resultado);
	}
}