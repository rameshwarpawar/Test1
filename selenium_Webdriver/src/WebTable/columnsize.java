package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class columnsize {

	  public static void main(String args[]) throws InterruptedException
	  {
		  System.setProperty("webdriver.edge.driver", 
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		  
		    WebDriver driver =new EdgeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.get("file:///C:/Users/VSI/Desktop/share/Webtable.html");
		    
		      Thread.sleep(5000);
		      
		      List <WebElement> column= driver.findElements(By.xpath("//table[@id=\"’1234’\"]//tr[2]//td"));
		      
		      int columnsize=column.size();
		      
		      System.out.println("No. of columns presnt are: "+columnsize);
		    
	  }
}
