public class metodo3{
public static void main (String args[]){
System.out.println("o total foi" + calc());
}
public static float calc(){
float x,y;
System.out.println("Entre com o valor de x");
x = Input.readFloat();
System.out.println("Entre com o valor de y");
y = Input.readFloat();
return(x*y);
}
public static void main (String args[]){
System.out.println("o total foi" + soma());
}
public static float soma(){
float x,y;
System.out.println("Entre com o valor de x");
x = Input.readFloat();
System.out.println("Entre com o valor de y");
y = Input.readFloat();
return(x+y);
}
}
