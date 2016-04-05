import javax.swing.JOptionPane;


class valornovo
	{
public static void main (String args[])
	{

	String valor = JOptionPane.showInputDialog(null,"Forneca um valor numerico 0 a 10");
	if (valor != null);
	{
	try
	{
	float numero = Float.parseFloat(valor);

	if(numero >= 6)

	JOptionPane.showMessageDialog(null, "O valor de entrada e = " + numero +" APROVADO");

	else

	JOptionPane.showMessageDialog(null,"O valor de entrada e =" + numero+ "REPROVADO");
	}
	catch(NumberFormatException e)
	{
	JOptionPane.showMessageDialog (null," Houve erro na conversao , digite apenas caractreres numericos abensoado!! " ) ;
		}
	}
		System.exit(0);
	}

	}
