// celcius para fire
import javax.swing.*;
class visualizacao
{
public static void main (String args[])
{
String aux = JOptionPane.showInputDialog(null,"MENU DE OPÇÕES"+"\n"+"DIGITE 1 PARA CONVERTER CELCIUS PARA FIRENHEIT"+"\n"+"DIGITE 2 PARA CONVERTER DE CELCIUS PARA KELVIN");
int a = Integer.parseInt(aux);


switch (a)
{
	case 1:
	aux = JOptionPane.showInputDialog(null,"Digite a temperatura em celcius");
	float b = Float.parseFloat(aux);
	JOptionPane.showMessageDialog(null, "O valor em celcius e : " + (b * 1.8 + 32));
break;

case 2:
	aux = JOptionPane.showInputDialog(null,"Digite a temperatura em celcius");
	b = Float.parseFloat(aux);
	JOptionPane.showMessageDialog(null, "O valor em Kelvin e : " +( b + 273.15));
	break;
}
}
}