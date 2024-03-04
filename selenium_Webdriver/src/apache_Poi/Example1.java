package apache_Poi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Example1 {

	
	  public static void main(String args[]) throws IOException
	  {
		  FileInputStream file =new FileInputStream("C:\\Users\\VSI\\Desktop\\share\\Revbits EPS Impelmented Features.xlsx");
		  
		//Step4: create new object of XSSFWorkbook and provide above file variable as input.
		  
			       XSSFWorkbook book= new XSSFWorkbook(file);
			       
			     //Step 5: To navigate on particular sheet use method get sheet(“Sheet Name”). 
			       
			       XSSFSheet sheet = book.getSheet("sheet1");
			       

					//Step 6: to go to particular row use method getRow(int value)
			       
			       XSSFRow row = sheet.getRow(4);
		  
			     //Step 7: To go to particular column use method getCell(int value) 
					XSSFCell col=row.getCell(0);
					
					//Step 8: To get string value present in sheet use method getStringCellValue(). 
					String str=col.getStringCellValue();
					
					System.out.println(str);
					
		  
	  }
}
