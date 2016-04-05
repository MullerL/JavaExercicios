class repeticaoWhile
{
public static void main (String args[])
{
char resp = 's';
while(resp=='s')
{
System.out.println("Digite o numero: ");
int num1 = Input.readInteiro();
System.out.println("O numero digitado foi:"+num1);
System.out.println("Deseja continuar");
String count = Input.readString();
//Count variavel que declarei do tipo string.
resp=count.charAt(0);
}
}
}