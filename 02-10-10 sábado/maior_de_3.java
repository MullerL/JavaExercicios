import java.util.Scanner;

class maior_de_3 {

public static void main(String args[])
{
Scanner s = new Scanner(System.in);

System.out.println("digite o primeiro numero: ");

int a = s.nextInt();

System.out.println("digite o segundo numero: ");

int b = s.nextInt();

System.out.println("digite o terceiro numero: ");

int c = s.nextInt();

if ((a>b) && (a>c)){

System.out.println("A e maior : "+a);

}else if ((b>a) && (b>c)){

System.out.println("B e maior : "+b);

}else{

System.out.println("C e maior ; "+c);
}
}
}