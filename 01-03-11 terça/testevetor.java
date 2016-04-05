import javax.swing.*;
class testevetor
{
	public static void main (String args[])
	{
		String numero[]=new String[5];
		for (short i = 0;i<numero.length;i++)
		{
			numero[i] = JOptionPane.showInputDialog(null, "digite um numero e de ok...");

		}
		short a = Short.parseShort (numero[0]);
		short b = Short.parseShort (numero[1]);
		short c = Short.parseShort (numero[2]);
		short d = Short.parseShort (numero[3]);
		short e = Short.parseShort (numero[4]);
			JOptionPane.showMessageDialog(null, (a)+" - "+(b)+" - "+(c)+" - "+(d)+" - "+(e));
	}
}