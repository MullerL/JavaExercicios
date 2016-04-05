import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel 
{
    public static void main(String[] args) 
    throws BiffException, IOException 
    {
        /**
        * Carrega a planilha
        */
        Workbook workbook = Workbook.getWorkbook(new File("exemplo.xls"));
        /**
        * Aqui é feito o controle de qual aba do xls 
        * será realiza a leitura dos dados
        */
        Sheet sheet = workbook.getSheet(0);

        /**
        * Numero de linhas com dados do xls
        */
        int linhas = sheet.getRows();
		
        for(int i = 0; i < linhas; i++)
        {
            Cell celula1 = sheet.getCell(0, i);
            Cell celula2 = sheet.getCell(1, i);
            Cell celula3 = sheet.getCell(2, i);
            Cell celula4 = sheet.getCell(3, i);
            Cell celula5 = sheet.getCell(4, i);
            Cell celula6 = sheet.getCell(5, i);
            Cell celula7 = sheet.getCell(6, i);
			
            System.out.println("Conteúdo da célula 1: " + celula1.getContents());
            System.out.println("Conteúdo da célula 2: " + celula2.getContents());
            System.out.println("Conteúdo da célula 3: " + celula3.getContents());
            System.out.println("Conteúdo da célula 4: " + celula4.getContents());
            System.out.println("Conteúdo da célula 5: " + celula5.getContents());
            System.out.println("Conteúdo da célula 6: " + celula6.getContents());
            System.out.println("Conteúdo da célula 7: " + celula7.getContents());
        }
    }
}

