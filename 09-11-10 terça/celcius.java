// de celcius para farenheit
import javax.swing.*;
class celcius{
public static void main (String args[]){

String x= JOptionPane.showInputDialog(null, "Entre com celcius");
float num1=Float.parseFloat(x);
JOptionPane.showMessageDialog(null, "O valor em farenheit: " + (num1 * 1.8 + 32));
}
}