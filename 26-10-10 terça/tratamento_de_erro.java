import javax.swing.JOptionPane;
class tratamento_de_erro
{
public static void main (String args[])
{
String aux = "";
float nota1=0, nota2=0, trabalho=0;
try //tente
{
aux = JOptionPane.showInputDialog(null, "Entre com a nota 1: ");
nota1 = Float.parseFloat(aux);

aux = JOptionPane.showInputDialog(null, "Entre com a nota 2: ");
nota2 = Float.parseFloat(aux);

aux = JOptionPane.showInputDialog(null, "Entre com a nota do trabalho: ");
trabalho = Float.parseFloat(aux);

float media = (nota1+nota2+trabalho) / 3;
JOptionPane.showMessageDialog(null,"Media"+media);
}

catch (NumberFormatException e)
{
JOptionPane.showMessageDialog(null,"Houve erro de conversão, Digite apenas caracteres numericos");
}
System.exit(0);
}
}
