class ex7
{
public static void main (String args[])
{
int num1,num2;
System.out.println("Digite o primeiro numero");
num1 = Input.readInteiro();
System.out.println("Digite o segundo numero");
num2 = Input.readInteiro();
if (num1 > num2){
System.out.println("O primeiro valor e maior: "+ num1);
}else{
System.out.println("O segundo valor e maior: "+ num2);
int valor = num1 % num2;
if (valor == 0){
System.out.println("numero par: "+ num1);
}else{
System.out.println("o numero: "+ num1 +"nao e par");
}
}
}
}