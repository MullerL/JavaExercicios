import java.util.*;
class ContaString
{
	public static void main (String args[])
	{
		String perg = "";
		do
		{
			System.out.println("voce vai saber quantas letras tem a palavra");
			Scanner vari = new Scanner (System.in);
			String pal = vari.next();
			int mostra = pal.length();
			System.out.println(mostra);
			System.out.println("denovo?\n sim \n não");
			Scanner var = new Scanner (System.in);
			perg = var.next();
		}while (perg.equals("s"));
	}
}