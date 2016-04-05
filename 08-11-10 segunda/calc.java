//calculadora com JOptionPane, e tratamento de erro
import javax.swing.JOptionPane;
class calc{
public static void main (String args[])
{
float num1 = 0,num2 = 0;
String a="",b="";
try // tente
{
a = JOptionPane.showInputDialog(null,"MENU DE OPCOES"+"\n"+
" Digite 1 para somar dois valores"+"\n"+
" Digite 2 para subtrair dois valores "+"\n"+
" Digite 3 para multiplicar dois valores"+"\n"+
" Digite 4 para dividir dois valores");
int opc = Integer.parseInt(a);
switch(opc)
{
case 1:
b = JOptionPane.showInputDialog(null,"Digite primeiro valor");
num1 = Float.parseFloat(b);
b = JOptionPane.showInputDialog(null,"Entre com o segundo valor");
num2 = Float.parseFloat(b);
JOptionPane.showMessageDialog(null, num1+num2);
break;
case 2:
b = JOptionPane.showInputDialog(null,"Digite primeiro valor");
num1 = Float.parseFloat(b);
b = JOptionPane.showInputDialog(null,"Entre com o segundo valor");
num2 = Float.parseFloat(b);
JOptionPane.showMessageDialog(null, num1-num2);
break;
case 3:
b = JOptionPane.showInputDialog(null,"Digite primeiro valor");
num1 = Float.parseFloat(b);
b = JOptionPane.showInputDialog(null,"Entre com o segundo valor");
num2 = Float.parseFloat(b);
JOptionPane.showMessageDialog(null, num1*num2);
break;
case 4:
b = JOptionPane.showInputDialog(null,"Digite primeiro valor");
num1 = Float.parseFloat(b);
b = JOptionPane.showInputDialog(null,"Entre com o segundo valor");
num2 = Float.parseFloat(b);
JOptionPane.showMessageDialog(null, num1/num2);
break;
}
}
catch (NumberFormatException e) // se a tentativa não der certo irá aparecer a msg de erro
{
JOptionPane.showMessageDialog(null, "A opção digitada foi invalida!!!");
}
}
}



