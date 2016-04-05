
package javaapplication3;

import javax.swing.*;

public class Restaurante
{

    public static void main(String[]args)
    {



         String [] credito  = new String[10];
         String [] nome     = new String[10];
         String [] gasto    = new String[10];
         String [] deposito = new String[10];
         String [] mesa     = new String[10];

         String pesq="" ,resp = "s";

         short i ,opc , cont=0 ;

   do
   {


           opc=Short.parseShort(JOptionPane.showInputDialog(null,"\tPrograma"+"\n\n"+ "RestandrMuller O Melhor para o seu RESTAURANTE "+"\n\n"+
           "Digite 1 para Inserir cliente   \n"+
           "Digite 2 para Localizar mesa VAZIA \n"+
           "Digite 3 para Fechar a conta do cliente \n"+
           "Digite 4 para Inserir produtos consumidos pelo Cliente" ));

       try
       {

           switch(opc)
           {
               case 1:
                   nome[cont]=JOptionPane.showInputDialog(null,"Digite o nome do cliente.");
                   mesa[cont]=JOptionPane.showInputDialog(null,"Digite o numero da mesa.");
               //  gasto[cont]=JOptionPane.showInputDialog(null,"Digite o nome do cliente.");

               cont++;
               break;

               case 2:

                   for(i=0;i<mesa.length;i++)
                   {
                      if(mesa[i]==null)
                      {
                        mesa[i]="VAZIO";
                        nome[i]="VAZIO";
                      }
                      pesq+="Nomes | "+nome[i]+"\n"+ "Mesas |"+mesa[i]+"\n\n" ;




                   
                   }
                   JOptionPane.showMessageDialog(null, pesq);

           }

       } catch (NumberFormatException erro)
       {
           JOptionPane.showMessageDialog(null,"Digite apenas numeros");
       }

       

   }while (resp =="s");




    }


}
