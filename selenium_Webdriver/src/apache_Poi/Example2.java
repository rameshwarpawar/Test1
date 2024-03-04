package apache_Poi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example2 {

	
	public static void main(String args[]) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\VSI\\Desktop\\share\\Revbits EPS Impelmented Features.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet s = book.getSheet("sheet1");
		
		double value=s.getRow(4).getCell(2).getNumericCellValue();
		
		System.out.println(value);
		
}
}

