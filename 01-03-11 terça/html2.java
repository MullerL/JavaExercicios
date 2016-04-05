import javax.swing.*;
class html2
{
	public static void main (String args[])
	{
		char letra[]=new char[100];
		int n[]=new int[100];
		String resp;
		String l="";
		short y=0;
		resp = JOptionPane.showInputDialog(null,"cole o texto");
		do
				{
					letra[y]=resp.charAt(y);
					y++;
				}while (y<101);

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