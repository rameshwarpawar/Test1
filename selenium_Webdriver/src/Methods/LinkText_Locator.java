package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkText_Locator {

	  
	public static void main(String args[])
	{
		          System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		          
		          WebDriver driver =new EdgeDriver();
		          
		          driver.manage().window().maximize();
		          
		          driver.get("https://www.facebook.com/");
		          
		          driver.findElement(By.linkText("Create a Page")).click();
		          
		          
	}
}
