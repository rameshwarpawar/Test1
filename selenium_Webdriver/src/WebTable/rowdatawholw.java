package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class rowdatawholw {

	

	  public static void main(String args[]) throws InterruptedException
	  {
		  System.setProperty("webdriver.edge.driver", 
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		  
		    WebDriver driver =new EdgeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.get("file:///C:/Users/VSI/Desktop/share/Webtable.html");
		    
		      Thread.sleep(5000);
		      
		  	for(int i=1;i<=3;i++)
			{																			//tr[2]/td[3]
				String rowdata=driver.findElement(By.xpath("//table[@id=\"’1234’\"]//tr[2]/td["+i+"]")).getText();
				System.out.print(rowdata+"  ");
	
	
	
}
	  }
}
