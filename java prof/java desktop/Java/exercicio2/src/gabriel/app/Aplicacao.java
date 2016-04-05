package gabriel.app;

import gabriel.modelo.Aluno;
import gabriel.telas.Tela;

public class Aplicacao {

	public static void main(String args[])
	{
		Tela t = new Tela();
		int numAlunos = 2;
		float media = 0 ;

		Aluno listaAlunos[] = new Aluno[numAlunos];
		
		for(int i=0;i<numAlunos;i++){
			Aluno a = new Aluno();

			//Obtendo nome do anulo
			t.exibirMensagem("Digite o nome do aluno.: ");
			a.nome = t.getInfoString();

			t.exibirMensagem("Digite o telefone.: ");
			a.tel = t.getInfoInt();


			t.exibirMensagem("Digite a Matricula.: ");
			a.matricula = t.getInfoInt();

			for (int j=0; j<10; j++)  
			{  
				System.out.println();  
			}  
			t.exibirMensagem("CADASTRO EFETUADO COM SUCESSO!\n\n");
		}

		for(int i=0;i<numAlunos;i++){
			Aluno a = new Aluno();

			t.exibirMensagem("Digite a nota do aluno.: "+ listaAlunos[i].nome);
			a.nota = t.getInfoFloat();
		}

		t.exibirMensagem("Média");
		
		float soma = 0;
		for(int i=0; i <numAlunos;i++){
			Aluno a = listaAlunos[i];
			soma += a.nota;
		}
		media = soma / numAlunos;
		t.exibirMensagem(media+"");
	}

}
