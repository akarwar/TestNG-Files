package ExcelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class orangeHRMLoging {
	FileInputStream fis;
	XSSFWorkbook xlbook;
	XSSFSheet xlSheet;
	
	
	public void ExcelBook() throws IOException {
		
		 fis = new FileInputStream ("C:\\Users\\ahsan\\Desktop");
		 xlbook = new XSSFWorkbook(fis);
		
	}
	
	public String excel(int SheetNumber,int row, int cell) throws IOException {

	 xlSheet = xlbook.getSheetAt(0);
	String xlValue = xlSheet.getRow(0).getCell(0).getStringCellValue();
	return xlValue;
	
}
	
	public int rowCount(int SheetNumber) {
		
		int rows = xlbook.getSheetAt(SheetNumber).getLastRowNum();
		return rows;
		
		
	}
}
