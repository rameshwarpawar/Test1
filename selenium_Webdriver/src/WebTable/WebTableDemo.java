package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableDemo {
	
	  
	  public static void main(String args[]) throws InterruptedException
	  {
		  System.setProperty("webdriver.edge.driver", 
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		  
		    WebDriver driver =new EdgeDriver();
		    
		    driver.manage().window().maximize();
		    
			driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/directory");
			Thread.sleep(1000);
			
			//get no of rows present in table
			List<WebElement> row=driver.findElements(By.xpath("//table[@class=\"table\"]//tr"));
			int rowsize=row.size();
			System.out.println(rowsize);
			
			//get no of columns present in table
			List<WebElement> column=driver.findElements(By.xpath("//table[@class=\"table\"]//tr[2]/td"));
			int colsize=column.size();
			System.out.println(colsize);
			
			//Get table heading
			for(int k=1;k<=5;k++)
			{
				String data1=driver.findElement(By.xpath("//table[@class=\"table\"]//thead/tr/th["+k+"]")).getText();
				System.out.print(data1+" ");
				

}
}
}