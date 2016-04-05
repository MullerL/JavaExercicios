import javax.swing.*;
class q2
{
	public static void main (String args[])
	{
		String letra[]=new String[]{"A","M", "O", "R", "A"};

			JOptionPane.showMessageDialog(null,letra[3]+letra[2]+letra[1]+letra[0]+"\n"+
			letra[0]+letra[1]+letra[2]+letra[3]+"\n"+letra[1]+letra[2]+letra[3]+letra[4]+letra[3]+"\n"+
			letra[3]+letra[4]+letra[1]+letra[2]+"\n"+letra[2]+letra[1]+letra[4]+letra[3]);
	}
}