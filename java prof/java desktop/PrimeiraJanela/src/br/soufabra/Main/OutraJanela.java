package br.soufabra.Main;

import java.awt.event.*;
import javax.swing.*;
/**
 * @author aluno
 */
public class OutraJanela //extends Janela
{
    public static void main(String[] args)
    {
        JFrame objeto = new Janela();
        objeto.show();
        WindowListener fechaJanela = new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        };  
        objeto.addWindowListener(fechaJanela);
    }
}
