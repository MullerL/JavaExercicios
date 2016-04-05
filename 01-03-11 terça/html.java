import javax.swing.*;
class html
{
	public static void main (String args[])
	{
		char letra[]=new char[100];
		String resp;
		String l="";
		//short y=0;
		resp = JOptionPane.showInputDialog(null,"cole o texto");
			for(int y=0;y<letra.length;y++)
				{
					letra[y]=resp.charAt(y);
				}

		//letra[1]=resp.charAt(1);

		//letra[2]=resp.charAt(2);

			for(int i=0;i<100;i++)
			{
				l += letra[i];
			}
			JOptionPane.showMessageDialog(null,l);
		//System.out.println(letra [1]);
		//System.out.println(letra [2]);
	}
}//roda mas naofunciona