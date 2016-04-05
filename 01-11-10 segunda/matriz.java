class matriz{
public static void main (String args[])
{
String dados[][]=new String[4][2]; // vetor com 4 linhas, comessando de 0a3, 2 colunas de 0a1.
//int cod = 0;
System.out.println("Digite o nome");
dados[0][0]=Input.readString();
//dados[0][1]=Integer.toString(cod);
//cod++;
System.out.println("nota");
dados[0][1]=Input.readString();
//dados[1][1]=Integer.toString(cod);
//cod++;
System.out.println("Digite o nome");
dados[1][0]=Input.readString();
//dados[2][1]=Integer.toString(cod);
//cod++;
System.out.println("nota");
dados[1][1]=Input.readString();
//dados[3][1]=Integer.toString(cod);
//cod++;
System.out.println("Digite o nome");
dados[2][0]=Input.readString();

System.out.println("nota");
dados[2][1]=Input.readString();

System.out.println("Digite o nome");
dados[3][0]=Input.readString();

System.out.println("nota");
dados[3][1]=Input.readString();
for (int i=0;i<4;i++){

	System.out.println(dados[i][1]+" - "+ dados[i][0]);
}
}
}