import javax.swing.*;
class arranjoJOpP
{
public static void main (String args[])
{
char letra[]=new char[3];
String resp = JOptionPane.showInputDialog(null,"digite uma vogal");
//resp = Input.readString();
letra[0]=resp.charAt(0);
 resp = JOptionPane.showInputDialog(null,"digite uma vogal");
//resp = Input.readString();
letra[1]=resp.charAt(0);
resp = JOptionPane.showInputDialog(null,"digite uma vogal");
//resp =Input.readString();
letra[2]=resp.charAt(0);

JOptionPane.showMessageDialog(null,letra [0]+"\n"+letra [1]+"\n"+letra [2]);
//JOptionPane.showMessageDialog(null,letra [1]);
//JOptionPane.showMessageDialog(null,letra [2]);
}
}