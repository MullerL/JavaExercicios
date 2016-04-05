package pkg3edicaojavacomoprogramar;
import java.awt.Graphics;
import javax.swing.JApplet;
/**
 * @author Müller
 */
public class  WhileCounter extends JApplet 
{
    //@Override
    public void paint(Graphics g) 
    {
        int counter = 1;
        while (counter <= 50)
        {
            g.drawLine(10, 10, 250, counter * 10);
            ++counter;
        }
    }
}
