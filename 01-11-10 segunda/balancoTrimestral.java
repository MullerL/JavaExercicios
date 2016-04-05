class balancoTrimestral
{
public static void main (String args[])
{
int gastosJaneiro = 15000;
int gastosFevereiro = 23000;
int gastosMarco = 17000;
int gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);
System.out.println (gastosTrimestre);
int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco) / 3;
System.out.println ("Valor da media mensal = "+ mediaMensal);
int somaBimestral = (gastosJaneiro + gastosFevereiro);
System.out.println ("Valor da soma bimestral "+ somaBimestral);

for(int a= 150;a<=300;a++)
System.out.println (a);

for (int x = 1;x<=1000;x++)
System.out.println (+x);
}
}