package Methods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class quit {
	
	  
	  public static void main(String args[]) throws InterruptedException
	  {
			
			  System.setProperty("webdriver.edge.driver",
			  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe"
			  );
			  
			  WebDriver driver = new EdgeDriver();
			 
			/* * driver.get("https://astromedicomp.org/");
			 * 
			 * 
			 * driver.get("https://vsiedu.com/");
			 * 
			 * Thread.sleep(5000); driver.quit() ;
			 */
		  
			// driver.navigate().to("https://www.simplilearn.com/tutorials/selenium-tutorial/selenium-interview-questions-and-answers");
			driver.get("https://www.google.com/");
			//driver.switchTo().newWindow("https://www.flipkart.com/");
			driver.get("https://www.facebook.com/");
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			/*
			 * driver.navigate().back(); driver.navigate().back(); Thread.sleep(2000);
			 * driver.navigate().forward(); Thread.sleep(2000); driver.navigate().refresh();
			 * Thread.sleep(2000);
			 */
			driver.quit();
	  }

}
