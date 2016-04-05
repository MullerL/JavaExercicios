class vetorr
{
public static void main (String args[])
{
int idade[]=new int[5];
int c;
int maior = 0;
int menor = 0;
for(c=0;c<5;c++)
{
System.out.println("digite a sua idade");
idade[c]=Input.readInteiro();
}
maior = idade[0];
menor = idade[0];
for(c=1;c<=4;c++)
{
if (idade[c] < menor)
{
menor = idade[c];
}
}
System.out.println("a maior idade e: "+ maior);
System.out.println("a menor idade e: "+menor);
}
}