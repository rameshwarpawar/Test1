package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gettitle_Method {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		// driver.get("https://www.google.com/");
		driver.get("https://www.voidstarindia.com/");

		String title = driver.getTitle();
		System.out.println(title);

	
		  if(title.equalsIgnoreCase("VoidStarIndia Official Site")) {
		  System.out.println("Test case is Passed"); } 
		  else {
		  System.out.println("Test case is failed"); }
		  
		  Thread.sleep(5000);
          driver.close();
		  
		 
	}

}