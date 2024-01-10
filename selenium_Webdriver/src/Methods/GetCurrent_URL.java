package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrent_URL {
	
	 public static void main(String args[]) throws InterruptedException
	 {
		 System.setProperty("webdriver.edge.driver", 
				 "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		 
		      WebDriver driver = new EdgeDriver();
		      
		      driver.get("https://www.voidstarindia.com/");
		      String URL =driver.getCurrentUrl();
		      
		      System.out.println(URL);
		      
		      if(URL.equalsIgnoreCase("https://www.voidstarindia.com/"))
		      {
		    	  System.out.println("Test case is passed");
		      }
		      else
		      {
		    	  System.out.println("Test case is Failed");
		      }
		   
		       Thread.sleep(5000);
		       driver.quit();
	 }

}
