package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class close {
	
	   public static void main(String args[]) throws InterruptedException
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\VSI\\Desktop\\share\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		   
		   WebDriver driver = new FirefoxDriver();
		   
		   
		   driver.get("https://www.redbus.com/");
		   
		   Thread.sleep(5000);
		   driver.close();
	   }

}
