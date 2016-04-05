import javax.swing.*;
class q1
{
	public static void main (String args[])
	{
		int nome[]=new int[5];

			for (int i = 0;i<nome.length;++i)
			{
				nome[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero"));
			}
				JOptionPane.showMessageDialog(null,nome[0]+" + "+nome[1]+" + "+nome[2]+" + "+nome[3]+
				" + "+nome[4]+" = "+(nome[0]+nome[1]+nome[2]+nome[3]+nome[4]));
	}
}