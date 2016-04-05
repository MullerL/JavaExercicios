import javax.swing.*;
class idades
{
	public static void main (String args[])
	{
		String i = JOptionPane.showInputDialog(null, "ano de nascimento");
		short n = Short.parseShort(i);
		int idade = (2011 - n);
		if (idade >= 18)
		{
			JOptionPane.showMessageDialog(null,"Voce e maior de idade. Sua idade: " + idade);
		}
		else
		 {
			JOptionPane.showMessageDialog(null,"Voce nao e maior de idade Sua idade: " + idade);
		 }
	 }
}
