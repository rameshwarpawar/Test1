package WebDriver_Methods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getmethod {

	
	  public static void main(String args[])
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\VSI\\Desktop\\share\\geckodriver-v0.34.0-win64\\geckodriver.exe");  
		  
	                WebDriver driver=new FirefoxDriver();
	                
	               driver.get("https://www.voidstarindia.com/");
	                
	                
	  }
}
 