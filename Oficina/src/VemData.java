
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Müller
 */
public class VemData {

    public static void main(String args[]) 
    {
        //System.out.println(carregaParametrosNumeroDaUltimaPergunta("tt"));
        NumberFormat formatador = new DecimalFormat("00");

        String formatado = formatador.format(9);
        //System.out.println(formatado);
        VemData.carregaParametrosTodasRespostasEntrevistado("999");

    }

    public static void carregaParametrosTodasRespostasEntrevistado(String sMatricula) // mostra dados do entrevistado
    {
        boolean mostroRespostas = false;
        short codigoPergunta = 1;
        while (codigoPergunta < 100)
        {            
            try 
            {
                Properties config = new Properties();
                String arquivo = "C:\\Users\\Müller\\Desktop\\desktop...desktop\\java!!!!!!!\\TrabalhoIndividualProgramação3\\respostas\\" + sMatricula + "+"+ String.valueOf(codigoPergunta) +".txt";
                BufferedReader input = new BufferedReader(new FileReader(arquivo));//new FileReader(arquivo
                config.load(new FileInputStream(arquivo));
                //Properties config = new Properties();
                /*String sKdMatricula = config.getProperty("[MATRICULA]");// pega oq esta na ffrente de [MATRICULA]
                String sKdNome = config.getProperty("[NOME]");// pega oq esta na ffrente de [NOME]
                String sKdTelefone = config.getProperty("[TELEFONE]");// pega oq esta na ffrente de [TELEFONE]
                String sKdEmail = config.getProperty("[EMAIL]");// pega oq esta na ffrente de [EMAIL]
                Utilitarios.mostraNaTela(sKdNome);*/
                String sDadosGravados = "";
                while(input.ready())
                {                            
                    sDadosGravados = input.readLine();
                    Utilitarios.mostraNaTela(sDadosGravados);
                    mostroRespostas = true;
                }
                input.close();
                codigoPergunta++;
            }
            catch (IOException eeerro) 
            {
               // System.out.println("A matricula não esta cadastrada!!!!!!!");
                codigoPergunta++;
            }
        }
        if (mostroRespostas == false)
        {
                System.out.println("A matricula não esta cadastrada!!!!!!!");
        }
    }    
}
