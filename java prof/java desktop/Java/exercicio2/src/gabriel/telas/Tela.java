package gabriel.telas;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Tela {
	
	Scanner entrada = new Scanner (System.in);
	
	public void exibirMensagem(String mensagem){
		System.out.println(mensagem);
	}
	
	public String getInfoString(){
		return entrada.next();
	}

	public int getInfoInt(){
		return entrada.nextInt();
	}
	
	public float getInfoFloat(){
		return entrada.nextFloat();
	}

}
