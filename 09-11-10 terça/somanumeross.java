import javax.swing.*;
class somanumeross{
public static void main (String args[]){

String x= JOptionPane.showInputDialog(null, "Entre com o primeiro numero");
float num1=Float.parseFloat(x);

x = JOptionPane.showInputDialog(null, "Entre com o segundo numero");
float num2 = Float.parseFloat(x);
float total = num1 + num2;
JOptionPane.showMessageDialog(null, num1 + num2);
}
}