package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class By_Name {

	
	          public static void main(String args[]) throws InterruptedException
	          {
	        	  System.setProperty("webdriver.edge.driver",
	        			  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
	        	  
	        	  WebDriver driver = new EdgeDriver();
	        	  
	        	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        	  
	        	  Thread.sleep(5000);
	        	  driver.findElement(By.name("username")).sendKeys("admin");
	        	  
	        	  Thread.sleep(2000);
	        	  
	        	  driver.findElement(By.name("password")).sendKeys("admin123");
	        	  

	      		driver.findElement(By.tagName("button")).click();
	        	  
	          }
}
