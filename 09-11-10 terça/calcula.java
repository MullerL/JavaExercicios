//calculadora com JOptionPane, e tratamento de erro
import javax.swing.JOptionPane;
class calcula{
public static void main (String args[])
{
float num1 = 0,num2 = 0;
String a="";
try // tente
{
a = JOptionPane.showInputDialog(null,"Digite o primeiro valor");
num1 = Float.parseFloat(a);

a = JOptionPane.showInputDialog(null,"MENU DE OP��ES"+"\n"+
" Digite 1 para: + somar dois valores"+"\n"+
" Digite 2 para: - subtrair dois valores "+"\n"+
" Digite 3 para: * multiplicar dois valores"+"\n"+
" Digite 4 para: / dividir dois valores");
int opc = Integer.parseInt(a);

a = JOptionPane.showInputDialog(null,"O 1� valor �: "+num1+"\n"+" Entre com o segundo valor");
num2 = Float.parseFloat(a);

switch(opc)
{
case 1:
JOptionPane.showMessageDialog(null, "A soma �: "+num1+" + "+num2+" = "+(num1+num2));

break;

case 2:
JOptionPane.showMessageDialog(null,"A subtra��o �: "+num1+" - "+num2+" = "+(num1-num2));

break;

case 3:
JOptionPane.showMessageDialog(null,"A multiplica��o �: "+num1+" * "+num2+" = "+(num1*num2));

break;
case 4:
JOptionPane.showMessageDialog(null,"A divis�o �: "+num1+" / "+num2+" = "+(num1/num2));

break;
}
}
catch (NumberFormatException e) // se a tentativa n�o der certo ir� aparecer a msg de erro
{
JOptionPane.showMessageDialog(null, "A op��o digitada foi invalida!!!");
}
}
}



