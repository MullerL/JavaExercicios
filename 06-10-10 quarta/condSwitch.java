class condSwitch{
public static void main (String args[])
{
String valor;
char resp;

System.out.println("Digite uma Letra");

valor= Input.readString();

resp= valor.charAt(0);

switch(resp){
case 'a':System.out.println("Voce digitou a letra A");
break;
case 'b':System.out.println("Voce digitou a letra B");
break;
case 'c':System.out.println("Voce digitou a letra C");
break;
default:System.out.println("Nao e nenhuma das letras");
break;
}
}
}
