package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class attribute {
	
	           public static void main(String args[]) throws InterruptedException
	           {
	        	              System.setProperty("webdriver.edge.driver",
	        			   "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
	        	              
	        	              WebDriver driver = new EdgeDriver();
	        	              
	        	              driver.manage().window().maximize();
	        	              driver.get("https://epsstable.revbits-eps.com/");
	        	              
	        	              Thread.sleep(2000);
	        	              
	        	              driver.findElement(By.id("username")).sendKeys("abdullah@eps-stable.com");
	        	              
	        	 driver.findElement(By.xpath("//div[@class=\"submit-buttons\"]")).click();
	        	 
	        	 Thread.sleep(5000);
	        	 
	        	 driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("e41799LwBnI2=cp");
	        	 
	        	 Thread.sleep(5000);
	        	 
	        	 driver.findElement(By.xpath("//input[@id=\"iterations\"]")).sendKeys("1000");
	        	 
	        	 Thread.sleep(5000);
	        	 
	        	 driver.findElement(By.xpath("//div[@class=\"submit-buttons\"]")).click();
	           }

}