package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Maximum_Minimum_Window {

	
	  public static void main(String args[]) throws InterruptedException
	  {
		  System.setProperty("webdriver.edge.driver", 
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		  
		  WebDriver driver =new EdgeDriver();
		  
		  driver.get("https://www.voidstarindia.com/");
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  driver.manage().window().minimize();
		  
		  Thread.sleep(5000);
		  
		  driver.quit();
		  
	  }
}
