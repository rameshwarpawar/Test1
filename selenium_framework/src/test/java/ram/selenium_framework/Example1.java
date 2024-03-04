package ram.selenium_framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
public class Example1 {

	
	  public static void main(String args[])
	  {
		  System.setProperty("webdriver.edge.driver", 
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		  
		  WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://epsstable.revbits-eps.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("abdullah@eps-stable.com");
		  driver.findElement(By.xpath("//div[@class=\"form-links\"]")).click();
		  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("e41799LwBnI2=cp");
		  driver.findElement(By.xpath("//input[@id=\"iterations\"]")).sendKeys("1000");
		  driver.findElement(By.xpath("//div[@class=\"submit-buttons\"]")).click();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		  WebElement login = driver.findElement(By.xpath("//div[@class=\"user-email\"]"));
		  
		String  actualId = login.getText();
		
		System.out.println( actualId);
		String expectID =  "abdullah@eps-stable.com" ;
		if ( actualId.equalsIgnoreCase(expectID))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		  
	  }
}
