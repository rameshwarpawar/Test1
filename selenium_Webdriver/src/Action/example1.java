package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1 {
	
	
	         public static void main(String args[]) throws InterruptedException
	         {
	        	 System.setProperty("webdriver.edge.driver",
	        			 "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
	        	 
	        	   WebDriver driver = new EdgeDriver();
		            
		            driver.manage().window().maximize();
		            driver.get("https://www.flipkart.com/");
		            
		            Thread.sleep(5000);
		            
		            driver.findElement(By.xpath("//a[@aria-label=\"Mobiles & Tablets\"]")).click();
		            
		            WebElement e=driver.findElement(By.xpath("//span[text()=\"Men\"]"));
		            
		            Actions act = new Actions(driver);
		            
		            act.moveToElement(e).perform();
		            
		            Thread.sleep(2000);

		            
		            WebElement fo=driver.findElement(By.xpath("//a[@title=\"Fossil\"]"));
		            
		            act.moveToElement(fo).click().perform();
	         }

}
