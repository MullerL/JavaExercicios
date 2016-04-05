package pkg3edicaojavacomoprogramar;
import javax.swing.JFrame;
/**
 * @author Müller
 */
public class Smiley2
{
    public static void main (String args[])
    {
        Smiley8EdicaoJavaComoProgramar panel = new Smiley8EdicaoJavaComoProgramar();
        JFrame aplicacao = new JFrame();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(panel);
        aplicacao.setSize(230,250);
        aplicacao.setVisible(true);
    }
}
