// Conversor de Temperaturas
import javax.swing.*;
class conversoes
{
public static void main (String args[])
{
try
{
String aux = JOptionPane.showInputDialog(null,"MENU DE OPÇÕES"+"\n"+
"Digite 1 para converter Celsius para Firenheit"+"\n"+
"Digite 2 para converter de Celsius para Kelvin"+"\n"+
"Digite 3 para converter de Fahrenheit para Celsius"+"\n"+
"Digite 4 para converter de Kelvin para Celsius"+"\n"+
"Digite 5 para converter de Celsius para Rankine"+"\n"+
"Digite 6 para converte de Rankine para Celsius ");

int a =Integer.parseInt(aux);

switch (a)
{
case 1:
aux = JOptionPane.showInputDialog(null,"Entre com Celsius para a conversão em Firenheit");
float temp = Float.parseFloat(aux);
JOptionPane.showMessageDialog(null, temp +" Celsius "+" = "+ (temp * 1.8 + 32)+ " em Firenheit");
break;

case 2:
aux = JOptionPane.showInputDialog(null,"Entre com Celsius para a conversão em Kelvin");
temp = Float.parseFloat(aux);
JOptionPane.showMessageDialog (null, temp +" Celsius "+" = "+ (temp + 273.15)+ " em Kelvin");
break;

case 3:
aux = JOptionPane.showInputDialog(null,"Entre com Fahrenheit para a conversão em Celsius");
temp = Float.parseFloat(aux);
JOptionPane.showMessageDialog (null, temp +" Fahrenheit "+" = "+ ((temp - 32) / 1.8)+ " em Celsius");
break;

case 4:
aux = JOptionPane.showInputDialog(null,"Entre com Kelvin para a conversão em Celsius");
temp = Float.parseFloat(aux);
JOptionPane.showMessageDialog (null, temp +" Kelvin "+" = "+ (temp - 273.15)+ " em Celsius");
break;

case 5:
aux = JOptionPane.showInputDialog(null,"Entre com Celsius para a conversão em Rankine");
temp = Float.parseFloat(aux);
JOptionPane.showMessageDialog (null, temp +" Celsius "+" = "+ ((temp + 273.15) * 1.8) + " em Rankine");
break;

case 6:
aux = JOptionPane.showInputDialog(null,"Entre com Rankine para a conversão em Celsius");
temp = Float.parseFloat(aux);
JOptionPane.showMessageDialog (null, temp +" Rankine "+" = "+ ((temp / 1.8) - 273.15) + " em Celsius");
break;
}
}
catch (NumberFormatException e)
{
	JOptionPane.showMessageDialog (null, "Por favor utilize números");
	}
}
}
