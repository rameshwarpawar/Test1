package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class By_class {
    
	  public static void main(String args[]) throws InterruptedException
	  {
		  System.setProperty("webdriver.edge.driver", 
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		  
		    WebDriver driver = new EdgeDriver();
		    
		    driver.manage().window().maximize();
		    driver.get("https://epsstable.revbits-eps.com/auth/login");
		    
		    Thread.sleep(5000);
		    
		    driver.findElement(By.className("entered-email")).sendKeys("abdullah@eps-stable.com");
		    driver.findElement(By.className("mat-button-wrapper")).click();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.className("mat-form-field-infix ng-tns-c109-2"))
		    .sendKeys("Pa$$W0rd@360");
		    
		    driver.findElement(By.className("mat-button-wrapper")).click();
		    
		    
		    
	  }
}
