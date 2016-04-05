import javax.swing.*;
class programa
{
	public static void main (String args[])
	{
		String nome[] = new String[10];
		for (int i = 0; i< 10;i++)
		{
			nome[i] = JOptionPane.showInputDialog(null, "entre com o nome");
		}
		JOptionPane.showMessageDialog(null,nome[0]+"\n"+nome[1]+"\n"+nome[2]+"\n"+nome[3]+"\n"+nome[4]+"\n"+nome[5]+"\n"+nome[6]+"\n"+nome[7]+"\n"+
		"\n"+nome[8]+"\n"+nome[9]);
	}
}
/*faça umm pgm que solicite um valor
menu de opções de pagamento avista /a prazo + 10% solicite a quantidade de mes/ cartão debito + 5% valor

1.05
meses*/