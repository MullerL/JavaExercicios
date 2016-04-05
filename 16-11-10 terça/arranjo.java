class arranjo
{
public static void main (String args[])
{
char letra[]=new char[3];
String resp;
System.out.println("digite uma vogal");
resp = Input.readString();
letra[0]=resp.charAt(0);
System.out.println("digite uma vogal");
resp = Input.readString();
letra[1]=resp.charAt(0);
System.out.println("digite uma vogal");
resp =Input.readString();
letra[2]=resp.charAt(0);

System.out.println(letra [0]);
System.out.println(letra [1]);
System.out.println(letra [2]);
}
}