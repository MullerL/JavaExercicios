
import javax.swing.JOptionPane;

/*
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Müller
 */
/*public class OK_cancel 
{
    public static void main (String args[])
    {
        int confirmacao = JOptionPane.showConfirmDialog(null, "mensagem!???", "titulo", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);//mostra o ? verde
        JOptionPane.showMessageDialog(null, confirmacao);
    }
}*/
//import javax.swing.*;

/**
 * JOptionPane showInputDialog example #3.
 * Using a combo box in an input dialog (showInputDialog).
 * 
 * @author alvin alexander, devdaily.com.
 */
/*public class OK_cancel
{
  public static final String[] pizzas = { "Cheese", "Pepperoni", "Sausage", "Veggie" };

  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Input Dialog Example 3");
    String favoritePizza = (String) JOptionPane.showInputDialog(frame, "What is your favorite pizza?","Favorite Pizza",
        JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
    
    int resp = JOptionPane.showConfirmDialog(frame, "procegue", "escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas,pizzas[0]);

    // favoritePizza will be null if the user clicks Cancel
    System.out.printf("Favorite pizza is %s.\n", favoritePizza);
    System.exit(0);
  }

}*/
/*import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class OK_cancel 
{
  public static void main(String[] args) 
  {
    JDialog.setDefaultLookAndFeelDecorated(true);
    Object[] selectionValues = { "cadastrar usua", "cadastrar perg", "cad entrev", "verificar dados cadastrais", "verif respost" };
    String initialSelection = "cadastrar usua";
    Object selection = JOptionPane.showInputDialog(null, "Escolha uma opção",
        "Menu", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
    
    int resp = JOptionPane.showOptionDialog(null,"procegue", "escolha", JOptionPane.QUESTION_MESSAGE,
            selectionValues, selectionValues[0]);
    
    int a = Integer.parseInt(selection.toString());
    System.out.println(a);
  }
}*/
/*import javax.swing.JOptionPane;

public class OK_cancel 
{
  public static void main(String[] args) 
  {
    Object[] opcoesRelatorios = { "Dados do entrevistado", "Respostas do entrevistado" };
    char respRelatorios = (char) JOptionPane.showOptionDialog(null,"Escolha uma opção de Relatorio", "Sub-menu Relatorios", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,opcoesRelatorios,opcoesRelatorios[0]);
    JOptionPane.showMessageDialog(null, respRelatorios);
  }
  
          
}*/
public class OK_cancel 
{
  public static void main(String[] args) 
  {
      String a = JOptionPane.showInputDialog("gkfkfk","Digite sua senha");
      //String b = JOptionPane.showInputDialog("ffff","fff");
  }
}
