package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class example_Hidden_popup {

	
	   public static void main(String args[]) throws InterruptedException
{
		   
		   System.setProperty("webdriver.edge.driver", 
				   "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		   
		   WebDriver driver = new EdgeDriver();
		   
		   driver.get("https://www.flipkart.com/");
		   
		       Thread.sleep(5000);
		       
		       WebElement e=driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]"));
		       Actions act = new Actions(driver);
		       
		       act.moveToElement(e).perform();
		       
		       driver.findElement(By.xpath("//a[@href=\"/account/?rd=0&link=home_account\"]")).click();
		       
		       driver.findElement(By.xpath("//div[@class=\"IiD88i _351hSN\"]")).sendKeys("8668552994");
		       
		       
}
}