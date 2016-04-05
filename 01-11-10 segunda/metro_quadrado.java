import javax.swing.JOptionPane;
class metro_quadrado
{
public static void main (String args[])
{
String a="";
float alt=0,lar=0, metro=0;
try // tente
{
a=JOptionPane.showInputDialog(null, "Entre com a altura");
alt=Float.parseFloat(a);

a=JOptionPane.showInputDialog(null, "Entre com a largura");
lar=Float.parseFloat(a);

metro = (alt*lar);
JOptionPane.showMessageDialog(null,metro+" : metro(s) quadrado(s) : ");

if(metro>500){
JOptionPane.showMessageDialog(null,"Esta venda pertence ao vendedor x");
}else{
	JOptionPane.showMessageDialog(null,"Esta venda pertence ao vendedor y");
}
}
catch (NumberFormatException e)
{
JOptionPane.showMessageDialog(null,"ocorreu um erro");
}
System.exit(0); // para de usar a memoria
}
}