import java.util.Scanner;
/**
 * @author Müller
 */
public class NumerosIVXLCDM 
{
    public static void main (String args[])
    {   
        Scanner pegaValor = new Scanner(System.in);
        int numero = 0;
        String algarismo = "";
        System.out.println("Digite um numero");
        numero = pegaValor.nextShort();
        while (numero/1000 >= 1) 
        {
            algarismo = algarismo + "M"; 
            numero = numero-1000;
        }
        while (numero/900 >= 1) 
        {
            algarismo = algarismo + "CM"; 
            numero = numero-900;
        }
        while (numero/500 >= 1)
        {
            algarismo = algarismo + "D";
            numero = numero-500;
        }
        while (numero/400 >= 1) 
        {
            algarismo = algarismo + "CD";
            numero = numero-400;
        }
        while (numero/100 >= 1) 
        {
           algarismo = algarismo + "C";
           numero = numero-100;
        }
        while (numero/90 >= 1) 
        {
            algarismo = algarismo + "XC"; 
            numero = numero-90;
        }
        while (numero/50 >= 1) 
        {
            algarismo = algarismo + "L"; 
            numero = numero-50;
        }
        while (numero/40 >= 1) 
        {
            algarismo = algarismo + "XL"; 
            numero = numero-40;
        }
        while (numero/10 >= 1) 
        {
            algarismo = algarismo + "X"; 
            numero = numero-10;
        }
        while (numero/9 >= 1) 
        {
            algarismo = algarismo + "IX"; 
            numero = numero-9;
        }
        while (numero/5 >= 1) 
        {
            algarismo = algarismo + "V";
            numero = numero-5;
        }
        while (numero/4 >= 1) 
        {
            algarismo = algarismo + "IV";
            numero = numero-4;
        }
        while (numero >= 1) 
        {
            algarismo = algarismo + "I"; 
            numero = numero-1;
        }
        System.out.println(algarismo);
    }
}