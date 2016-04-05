import java.io.*;
import javax.swing.*;
public class revert
 {
    public static void main (String texto[])
    {
		String per = "";
		do
		{
			String text = JOptionPane.showInputDialog("Entre com o texto");
			JOptionPane.showMessageDialog(null, new StringBuffer(text).reverse());
			per = JOptionPane.showInputDialog("Deseja inverter outro?\n s ou n");
		}while(per.equals("s"));
   	}
}
