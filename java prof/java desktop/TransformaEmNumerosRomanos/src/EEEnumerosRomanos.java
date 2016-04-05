import java.util.Scanner;
/**
 * @author Müller
 */
public class EEEnumerosRomanos 
{
    public static void main (String args [])
    {
        Scanner absorvendoDigitado = new Scanner(System.in);
        System.out.println("Digite um numero que transformo para romano");
        int numero = absorvendoDigitado.nextInt();
        
        while(!(numero == 1))
        {           
           while((numero % 1000) == 0 && (!(numero == 1)))
           {
               System.out.print("M");
               numero /= 1000;
           }
           while((numero % 900) == 0 && (!(numero == 1)))
           {
               System.out.print("CM");
               numero /= 900;
           }
           while((numero % 500) == 0 && (!(numero == 1)))
           {
               System.out.print("D");
               numero /= 500;
           }
           while((numero % 400) == 0 && (!(numero == 1)))
           {
               System.out.print("CD");
               numero /= 400;
           }
           while((numero % 100) == 0 && (!(numero == 1)))
           {
               System.out.print("C");
               numero /= 100;
           }
           while((numero % 90) == 0 && (!(numero == 1)))
           {
               System.out.print("XC");
               numero /= 90;
           }
           while((numero % 50) == 0 && (!(numero == 1)))
           {
               System.out.print("L");
               numero /= 50;
           }
           while((numero % 40) == 0 && (!(numero == 1)))
           {
               System.out.print("XL");
               numero /= 40;
           }
           while((numero % 10) == 0 && (!(numero == 1)))
           {
               System.out.print("X");
               numero /= 10;
           }
           while((numero % 9) == 0 && (!(numero == 1)))
           {
               System.out.print("IX");
               numero /= 9;
           }
           while((numero % 5) == 0 && (!(numero == 1)))
           {
               System.out.print("V");
               numero /= 5;
           }
           while((numero % 4) == 0 && (!(numero == 1)))
           {
               System.out.print("IV");
               numero /= 4;
           }
           while((numero % 1) == 0 && (!(numero == 1)))
           {
               System.out.print("I");
               numero -= 1;
           }
        }
    }
}
