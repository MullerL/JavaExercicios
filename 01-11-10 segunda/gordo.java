import javax.swing.JOptionPane;
class gordo
{
	public static void main (String args[])
	{
		String a="";
		float pes = 0,alt = 0, imc = 0;
		try
		{
			a = JOptionPane.showInputDialog(null,"Informe seu peso");
			pes = Float.parseFloat(a);

			a = JOptionPane.showInputDialog(null,"Informe sua altura");
			alt = Float.parseFloat(a);

			imc = pes / (alt * alt);

			if (imc < 18.5)
			{
				JOptionPane.showMessageDialog(null, "Magro");
			}

			if (imc>18.5 && imc<24.9 )
			{
				JOptionPane.showMessageDialog(null, "Peso Normal");
			}
			if  (imc>25 && imc<29.9 )
			{
				JOptionPane.showMessageDialog(null, "Sober Peso");
			}
			if (imc>30 && imc<34.9 )
			{
				JOptionPane.showMessageDialog(null, "Obesidade 1");
			}
			if (imc>35 && imc<39.9 )
			{
				JOptionPane.showMessageDialog(null, "Obesidade 2");
			}
			else if (imc>40 )
			{
				JOptionPane.showMessageDialog(null, "Obesidade 3");
			}
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null,"ocorreu um erro");
		}
		System.exit(0); // para de usar a memoria
	}
}