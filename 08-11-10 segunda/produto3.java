public class produto3
{
String nome;
float preco;
static float total;
public void atualizaPreco(float porc)
{
preco = preco + (preco * porc / 100);
}
}