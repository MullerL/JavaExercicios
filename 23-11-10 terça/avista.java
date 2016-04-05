import javax.swing.*;
class avista
{
	public static void main (String args[])
	{
		String a = JOptionPane.showInputDialog(null, "Entre com o valor");
		short val = Short.parseShort(a);
		a = JOptionPane.showInputDialog(null, "Menu"+"\n"+"digite 0 para pagamento avista"+"\n"+
		"digite 1 para pagamento a prazo"+"\n"+"digite 2 para pagamento com cartão de debito");
		int opc = Integer.parseInt(a);
		switch (opc)
		{
			case 0:
			JOptionPane.showMessageDialog(null,"valor a pagar: "+val);
			break;
			case 1:
			a = JOptionPane.showInputDialog(null,"Entre com a quantidade de mes(es)");
			short mes = Short.parseShort(a);
			JOptionPane.showMessageDialog(null,"valor a pagar: "+((mes*0.1)+val));
			case 2:
			JOptionPane.showMessageDialog(null,"valor a pagar: "+(1.05*val));

		}
	}
}