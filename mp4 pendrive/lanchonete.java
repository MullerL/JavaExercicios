import javax.swing.*;
class lanchonete
{
	public static void main (String args[])
	{
		String nome[] = new String[10];
		String valor[] = new String[10];
		String quantidade[] = new String[10];
		short opc;
		do
		{
			 opc = Short.parseShort(JOptionPane.showInputDialog(null, "Digite 1 para adicionar produto no estoque\n"+
			"Digite 2 para pesquisar produto dentro do estoque pelo nome"+
			"\n"+"Digite 3 para excluir produto do estoque"+"\n"+
			"Digite 4 para visualizar estoque completo"));
			short i = 0;
			String m;
			switch (opc)
			{
				case 1:
				do
				{
					nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do produto");
					valor[i] = JOptionPane.showInputDialog(null, "Digite o valor do produto");
					quantidade[i] = JOptionPane.showInputDialog(null, "Digite a quantidade do produto");
					i++;
					m = JOptionPane.showInputDialog(null, "Deseja continuar?\n sim ou não");
				}while (m.equals("s"));
					break;
				case 2:
				String pesq = JOptionPane.showInputDialog(null,"Digite o nome do produto");
				for (short p = 0;p<nome.length;p++)
				{
					if (pesq.equals(nome[p]))
					{
						JOptionPane.showMessageDialog(null,"NOME: "+nome[p]+"    |    "+"VALOR: "+
						valor[p]+"    |    "+"QUANTIDADE: "+quantidade[p]);
						break;
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Esse produto não existe no estoque");
						break;
					}
				}
				break;
				case 3:
				pesq = JOptionPane.showInputDialog(null,"Digite o nome do produto");
					for(short p = 0;p<nome.length;p++)
					{
						if(pesq.equals(nome[p]))
						{
						 	m = JOptionPane.showInputDialog(null, "Este produto existe no estoque"+"\n"+
						 	"NOME: "+nome[p]+"    |    "+"VALOR: "+valor[p]+"    |    "+"QUANTIDADE: "
							+quantidade[p]+"\n Deseja deletar esse item\n sim ou não");
							if (m.equals("s"))
							{
								nome[p]=null;valor[p]=null;quantidade[p]=null;
								JOptionPane.showMessageDialog(null, "Produto excluido com sucesso");
								break;
							}
							else if(m.equals("n"))
							{
								JOptionPane.showMessageDialog(null,"O produto não foi excluido");
								break;
							}
							break;
						}

						else
						{
							JOptionPane.showMessageDialog(null,"Esse produto não existe no estoque");
							break;
						}
					}
					break;
					case 4:
					String h;
					for(short p =0;p<nome.length;p++)
					{
						if(nome[p]==null)
						{
							nome[p]="vazio";valor[p]="vazio";quantidade[p]="vazio";
						}
						valor[10]+="\n"+"NOME: "+nome[p]+"    |    "+"VALOR: "
						+valor[p]+"    |    "+"QUANTIDADE: "+quantidade[p];
					}
					JOptionPane.showMessageDialog(null,(valor[10]));
					for(short p =0;p<nome.length;p++)
					{
						if(nome[p]!=null)
						{
							valor[10]=null;
						}
					}
					break;
					default:JOptionPane.showMessageDialog(null,"Opção invalida");
			}
		}while (opc != 's');
	}
}
