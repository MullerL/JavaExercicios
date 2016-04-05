import java.util.*;



import javax.swing.JOptionPane;


public class Agenda {

		public static void main(String[] args) {

		String[] nome= new String[10];

		String[] numeros=new String [10];

		String[] end=new String [30];

		int opt,cont=0;

		do{



		opt= Integer.parseInt(JOptionPane.showInputDialog("(1) Adicionar contato\n" +"(2) Pesquisar contato\n"));// +"(3) Mostra lista de contatos"));



		switch(opt){



		case 1:

			//adicionar contatos.



			nome[cont]=JOptionPane.showInputDialog("Informe o nome que deseja adicionar");

			numeros[cont]=JOptionPane.showInputDialog("Informe o numero do telefone");

			end[cont]=JOptionPane.showInputDialog("Digite o end.");

			cont++;

			break;

		case 2:

			pesquisa(nome,numeros,end);

			break;

		case 3:

			exibir(nome,numeros,end);

			break;

		default:

			JOptionPane.showMessageDialog(null,"ERRO "+"Opcao invalida");

		}

		}while (opt!='S');





	}



	public static void  pesquisa(String[]nome,String[]numeros,String[]end){



		String pesq;

		boolean aux=false;

		pesq=JOptionPane.showInputDialog("Informe o nome do contato que deseja pesquisar :");



		for(int j=0;j<nome.length;j++){

			if(pesq.equals(nome[j])){





				JOptionPane.showMessageDialog(null,"CONTATO "+"\n"+  "NOME : "+nome[j]+

						"| Tel : "+ numeros[j]+ "| End : "+end[j]+"\n\t");

				aux=true;

			}

		}

		if(aux!=true)

			JOptionPane.showMessageDialog(null, "ERRO!! " +"\n"+ "Este contato nao consta em nosso banco de dados");



		aux=false;



	}

	public static void exibir(String[] nome,String[] numeros,String[] end ){

		String imp="";



		for(int j=0;j<nome.length;j++){

			if(nome[j]==null){

				nome[j]="<vazio>";

				numeros[j]="<vazio>";

				end[j]="<vazio>";

			}

			imp+=nome[j]+"     |   "+numeros[j]+"    |     "+end[j]+"\n\n";



		}

		JOptionPane.showMessageDialog(null,"Lista De Clientes"+"\n"+ "Nomes  |    Tel   |  End\n\t"+imp+"\t");



	}





}
