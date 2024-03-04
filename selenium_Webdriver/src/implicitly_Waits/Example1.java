package implicitly_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Example1 {
	

	   public static void main(String args[])
	   {
		   System.setProperty("webdriver.edge.driver",
				   "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		   
		   WebDriver driver = new EdgeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.flipkart.com/");
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.findElement(By.xpath("//div[text()='Non-Geared Cycles']")).click();
		   
		   
	   }
}
