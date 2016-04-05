import javax.swing.JOptionPane;


class entradaGraficaDados
	{
public static void main (String args[])
	{

	String entrada =" " ;

	float nota1 = 0, nota2=0,nota3=0,media=0 ;
	try
	{
	entrada = JOptionPane.showInputDialog(null," Entre com a nota1");
	nota1 = Float.parseFloat(entrada);

	entrada = JOptionPane.showInputDialog(null," Entre com a nota2");
	nota2 = Float.parseFloat(entrada);

	entrada = JOptionPane.showInputDialog(null," Entre com a nota3");
	nota3 = Float.parseFloat(entrada);

	media= ( nota1 + nota2 + nota3) / 3 ;

	JOptionPane.showMessageDialog(null," media: " + media );

	}
	catch ( NumberFormatException e )

	{
		JOptionPane.showMessageDialog (null," Houve erro na conversao , digite apenas caractreres numericos abensoado!! " ) ;
	}
	System.exit(0);
}

}







