package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class navigate_Method {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		
		     WebDriver driver = new EdgeDriver();
		     
		     driver.manage().window().maximize();
		     driver.navigate().to("https://www.amdocs.com/search?Search=testing");
		     
		     driver.get("https://www.flipkart.com/");
		     driver.get("https://www.amazon.in/");
		     driver.get("https://www.facebook.com/");
		     
		     Thread.sleep(5000);
		     
		     driver.navigate().back();
		     Thread.sleep(5000);
		     driver.navigate().back();
		     driver.navigate().back();
		     
		    Thread.sleep(5000);
		    
		    driver.navigate().forward();
		    Thread.sleep(5000);
		    
		    driver.navigate().refresh();
		    Thread.sleep(5000);
		    
		    driver.quit();
		     
	}
}
