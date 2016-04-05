class condesSwitchh{
public static void main (String args[])
{
int opc,num1,num2;
System.out.println("======================");
System.out.println("	MENU DE OPCOES    ");
System.out.println("======================");
System.out.println("Digite 1 para somar dois valores");
System.out.println("Digite 2 para subtrair dois valores para subtrair");
System.out.println("Digite 3 para multiplicar dois valores");
System.out.println("Digite 4 para dividir dois valores");
opc=Input.readInteiro();
switch(opc){
case 1:
System.out.println("Digite primeiro valor");
num1=Input.readInteiro();
System.out.println("Entre com o segundo valor");
num2= Input.readInteiro();
System.out.println(num1+num2);
break;
case 2:
System.out.println("Digite primeiro valor");
num1=Input.readInteiro();
System.out.println("Entre com o segundo valor");
num2= Input.readInteiro();
System.out.println(num1-num2);
break;
case 3:
System.out.println("Digite primeiro valor");
num1=Input.readInteiro();
System.out.println("Entre com o segundo valor");
num2= Input.readInteiro();
System.out.println(num1*num2);
break;
case 4:
System.out.println("Digite primeiro valor");
num1=Input.readInteiro();
System.out.println("Entre com o segundo valor");
num2= Input.readInteiro();
System.out.println(num1/num2);
break;
default:System.out.println("A opcao digitada foi invalida!!!");
break;
}
}
}