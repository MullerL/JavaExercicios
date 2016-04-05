import javax.swing.*;

class Visualizacao3
{

	public static void main (String args[])
	{
	String aux=JOptionPane.showInputDialog(null,"Menu de Opções" + "\n" + "Digite 1 para converter Celcius para Firenheit" +  "\n" + "Digite 2 para converter de Celcius para Kelvin");
	int escolha =Integer.parseInt(aux);

	String c=JOptionPane.showInputDialog(null,"Entre com a temperatura em Celcius");
	float temp =Float.parseFloat(c);

		switch (escolha)
		{
		case 1:
		double opc1= (temp*1.8+32);
		//String Firenheit = String.valueOf(opc1);
		JOptionPane.showMessageDialog (null,"A conversão da temperatura de Celcius para Fireheint é :" + opc1);
		break;

		case 2:
		double opc2=(temp+273.15);
		//String Kelvin = String.valueOf(opc2);
		JOptionPane.showMessageDialog (null,"A conversão da temperatura de Celcius para Kelvin é :" + opc2);
		break;
	}

	}
}
