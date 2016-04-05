import javax.swing.*;
class usaproduto3
{
public static void main (String args[])
{
produto3 produto = new  produto3();
//produto.preco = 100.00;
String x = JOptionPane.showInputDialog(null, "Digite o preco");
produto.preco = Float.parseFloat(x);
System.out.println ("Preço inicial = "+ produto.preco);
produto.atualizaPreco(20); //20% sobre o produto
System.out.println ("Preço com aumento = "+ produto.preco);
}
}