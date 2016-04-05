import javax.swing.*;
class Principal
{
	public static void main (String args[])
	{
	  do
	  {
		Utilitarios.exibir("digite um numero");
		int numero = Utilitarios.lerInteiro();

		Utilitarios.exibir("digite outro numero");
		int numero1 = Utilitarios.lerInteiro();

		Utilitarios.exibir("O valor da soma e; ");
		Utilitarios.Somar(numero,numero1);

		Utilitarios.exibir("digite um nome");
		String nome = Utilitarios.lerString();
		Utilitarios.exibir("O nome digitado foi: "+nome);
		Utilitarios.versao();
		Utilitarios.exibir("Digite 1 para exibir versao\n"+"Digite 2 para exibir nome");
		int opc = Utilitarios.lerInteiro();
		if (opc == 1)
		{
			Utilitarios.versao();
		}
		if (opc == 2)
		{
			Utilitarios.exibir(nome);
		}
		Utilitarios.exibir("digite a quantidade de vezes q deseja repetir");
		int quantidade = Utilitarios.lerInteiro();
		Utilitarios.repetir(quantidade);
		Utilitarios.exibir("deseja sair? sim ou não");
		String op = Utilitarios.lerString();
	   }while (op.equals("s"));

	}
}