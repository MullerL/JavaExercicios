public class metodo2{
static metodo2 w = new metodo2();
public static void main (String args[]){
w.exibemsg("Tese de metodo");
w.msgerro();

}

public void msgerro(){
w.exibemsg("TESTE");

}

public void exibemsg(String msg){
System.out.println(msg);
}
}