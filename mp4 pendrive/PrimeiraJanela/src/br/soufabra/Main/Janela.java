package br.soufabra.Main;
//import java.awt.*;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;
/**
 * @author aluno
 */
public class Janela extends JFrame
{    
    Janela()
    {
        setTitle("MInha primera janela");//titulo da janela
        setSize(400, 400);
        setLocation(300, 50);
        setResizable(false);
        getContentPane().setBackground(Color.BLUE);
        JLabel texto = new JLabel("Faculdade Fabra",JLabel.CENTER);
        JLabel texto2 = new JLabel("Faculdade",JLabel.RIGHT);
        JLabel texto3 = new JLabel("Fabra",JLabel.LEFT);
        getContentPane().add(texto);
        getContentPane().add(texto2);
        getContentPane().add(texto3);
        getContentPane().setLayout(new GridLayout(2, 2));
    }
}
