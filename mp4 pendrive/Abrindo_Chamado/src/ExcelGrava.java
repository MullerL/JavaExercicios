/**
 *
 * @author Müller
 */
import java.io.File; 
import java.io.IOException;
import java.util.Date; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jxl.*; 
import jxl.write.*;
import jxl.write.biff.RowsExceededException;

public class ExcelGrava 
{
    public static void main (String coco[])
    {
        WritableWorkbook  work = null; 
        try 
        {
            work = Workbook.createWorkbook(new File ("gravando.xls"));
        } 
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(null, "Não criou o arquivo excel.xls...Talvez o arquivo esteje aberto");
            Logger.getLogger(ExcelGrava.class.getName()).log(Level.SEVERE, null, ex);
        }
        WritableSheet folha = work.createSheet ("Nome da aba", 0);
        try 
        {
            // String nome = new String(0,0,"ggg");
             //folha.addCell(nome);
             Label label = new Label (0, 0, "jh22222222j"); 
            try 
            {
                folha.addCell(label); 
                //Number numero = new (3, 4, 3,1459); 
                //sheet.addCell (numero); */
                //folha.addCell(numero);
                //folha.addCell(numero);
            }
            catch (WriteException ex) 
            {
                Logger.getLogger(ExcelGrava.class.getName()).log(Level.SEVERE, null, ex);
            }
             work.write();
        } 
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro na hora de gravar os dados no arquivo excel");
            Logger.getLogger(ExcelGrava.class.getName()).log(Level.SEVERE, null, ex);
        }            
        try 
        {
            work.close();     
        } 
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro na hora do fechar excel (close)");
            Logger.getLogger(ExcelGrava.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (WriteException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro na gravação?!");
            Logger.getLogger(ExcelGrava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
