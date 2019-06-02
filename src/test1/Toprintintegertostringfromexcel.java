package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Toprintintegertostringfromexcel {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		
		String password=null;
	
		FileInputStream fi = new  FileInputStream("F:/bharath.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("login");
		int rc= sh.getLastRowNum();
		for (int i = 0; i <rc; i++)
		{
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			if(wb.getSheet("login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata = (int)sh.getRow(1).getCell(1).getNumericCellValue();
				password = String.valueOf(celldata);
				System.out.println(username+" "+password);

				
			}
			else
			{
				String data =sh.getRow(1).getCell(i).getStringCellValue();
				System.out.println(data);
			}
			
		}

	}

}
