package pkg3edicaojavacomoprogramar;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 * @author Müller
 */
public class Smiley8EdicaoJavaComoProgramar extends JPanel
{
    public void paint(Graphics g)
    {
        //desenha rosto
        g.setColor(Color.yellow);
        g.fillOval(10, 10, 200, 200);
        
        //desenha olhos
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        //desenha boca
        g.fillOval(50, 110, 120, 60);
        
        //retocando boca criando sorriso
        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
