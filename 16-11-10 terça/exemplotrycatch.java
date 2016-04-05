import javax.swing.JOptionPane;
class exemplotrycatch
{
public static void main (String args[])
{
String aux = JOptionPane.showInputDialog(null,"Forneça um valor numerico entre 0 e 10");
	if (aux != null)
	{
	try
	{
	float x = Float.parseFloat(aux);
	if (x >=0 && x<= 10)
	{
	JOptionPane.showMessageDialog(null,"Nota ="+ x + " valor valido!!!!!!");
	}else{
	JOptionPane.showMessageDialog(null, "Nota = "+ x+ " valor invalido" );
	}
	}
	catch(NumberFormatException erro)
	{
	JOptionPane.showMessageDialog(null, "Digite apenas valores numericos");
	}
	}
	System.exit(0);
	}
	}