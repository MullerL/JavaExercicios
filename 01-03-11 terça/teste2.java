import javax.swing.*;
class teste2
{
	public static void main (String args[])
	{
		String numero[]=new String[5];
		short num[]=new short[5];
			for (short i = 0;i<numero.length;++i)
			{
				numero[i] = JOptionPane.showInputDialog(null,"Digite um numero");
				num[i] = Short.parseShort(numero[i]);
			}
						JOptionPane.showMessageDialog(null,num[0]+num[1]+num[2]+num[3]+num[4]);
	}
}