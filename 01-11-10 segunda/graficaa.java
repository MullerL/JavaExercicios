import javax.swing.JOptionPane;
class graficaa
{
public static void main (String args[])
{
String nome = JOptionPane.showInputDialog(null,"Entre com seu nome");
String end = JOptionPane.showInputDialog(null,"Entre com seu endereco");
String cont = JOptionPane.showInputDialog(null,"Entre com seu contato");
JOptionPane.showMessageDialog(null,"nome: "+nome+" estuda JAVA ?"+ "\n"+"Endereco: "+end+"\n"+"contato: "+cont);
}
}
