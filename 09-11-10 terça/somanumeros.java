import javax.swing.*;
class somanumeros{
public static void main (String args[]){

String x= JOptionPane.showInputDialog(null, "Entre com o primeiro numero");
int num1=Integer.parseInt(x);

x = JOptionPane.showInputDialog(null, "Entre com o segundo numero");
int num2 = Integer.parseInt(x);
int total = num1 + num2;
JOptionPane.showMessageDialog(null, num1 + num2);
}
}