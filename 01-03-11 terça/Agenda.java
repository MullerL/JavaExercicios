import java.util.*;//



import javax.swing.JOptionPane;//importando o pacote grafico swing


public class Agenda {//nome do programa e abertura do programa ({)

		public static void main(String[] args) {//ativação do programa

		String[] nome= new String[10];//declarando vetor nome como String com 10 posições

		String[] numeros=new String [10];//declarando vetor numeros como String com 10 posições

		String[] end=new String [30];//declarando vetor end como String com 30 posições

		int opt,cont=0;//declarando opt como int e cont como int e atribuindo 0

		do{//inicio do comando repetição do while {



		opt= Integer.parseInt(JOptionPane.showInputDialog("(1) Adicionar contato\n" +"(2) Pesquisar contato\n" +"(3) Mostra lista de contatos"));//pegando o numero escolido e transformando em inteiro dentro de opt



		switch(opt){//começando o switch e pegando o numero dentro de opt



		case 1://funciona caso o usuario tenha escolido 1

			//adicionar contatos.



			nome[cont]=JOptionPane.showInputDialog("Informe o nome que deseja adicionar");//pega o nome q o usuario digitou e armazena na posição 0 no vetor nome

			numeros[cont]=JOptionPane.showInputDialog("Informe o numero do telefone");//pega o numero q o usuario digitou e armazena na posição 0 no vetor nomeros

			end[cont]=JOptionPane.showInputDialog("Digite o end.");//pega o endereço q o usuario digitou e armazena na posição 0 no vetor end

			cont++;//conta começando do 0 para pegar todas as posições dos vetores

			break;//para o case 1

		case 2://funciona caso o usuario tenha escolido 2

			pesquisa(nome,numeros,end);//

			break;//para o case 2

		case 3://funciona caso o usuario tenha escolido 3

			exibir(nome,numeros,end);//

			break;//para0 case 3

		default://caso o usuario digite uma opção invalida aparecera a mensagem de erro

			JOptionPane.showMessageDialog(null,"ERRO "+"Opcao invalida");//mensagem de erro

		}//finaliza o switch

		}while (opt!='S');//finaliza o do while caso opt seja diferente de S





	}//finaliza a ativação do programa



	public static void  pesquisa(String[]nome,String[]numeros,String[]end){//ativação



		String pesq;//declarando pesq como String

		boolean aux=false;//declarando aux como boolean ja recebendo false

		pesq=JOptionPane.showInputDialog("Informe o nome do contato que deseja pesquisar :");//pegando o nome do contato e jogando em pesq



		for(int j=0;j<nome.length;j++){//contando j de 0 a 10

			if(pesq.equals(nome[j])){//se o que estiver em pesq for = ao que esta em um dos vetores de nome, sera mostrado o contato


				JOptionPane.showMessageDialog(null,"CONTATO "+"\n"+  "NOME : "+nome[j]+

						"| Tel : "+ numeros[j]+ "| End : "+end[j]+"\n\t");//impressão do contato caso exista

				aux=true;//atribuindo true a aux se o contato existir

			}//fechando o if

		}//fechando o for

		if(aux!=true)//se o comando acima der falso sera mostrado a mensagem do banco

			JOptionPane.showMessageDialog(null, "ERRO!! " +"\n"+ "Este contato nao consta em nosso banco de dados");//mensagem de que o contato não esta cadastrado



		aux=false;//atribuindo false a aux



	}//finalizando a ativação

	public static void exibir(String[] nome,String[] numeros,String[] end ){//ativação

		String imp="";//daclarando imp como String



		for(int j=0;j<nome.length;j++){//contando j de 0 a 10

			if(nome[j]==null){//se o q estiver no vetor nome = vazio, sera preenchido com o nome vazio

				nome[j]="<vazio>";//sera colocado o nome vazio caso não tenha nada no vetor

				numeros[j]="<vazio>";//sera colocado o nome vazio caso não tenha nada no vetor

				end[j]="<vazio>";//sera colocado o nome vazio caso não tenha nada no vetor

			}//finalizando o se

			imp+=nome[j]+"     |   "+numeros[j]+"    |     "+end[j]+"\n\n";//jogando os dados dos vetores dentro de imp



		}//finalizando o for

		JOptionPane.showMessageDialog(null,"Lista De Clientes"+"\n"+ "Nomes      |    Tel            |  End\n\t"+imp+"\t");//impressão dos vetores



	}//finalizando a ativação





}//finalizando o programa
