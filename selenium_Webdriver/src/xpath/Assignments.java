package xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Assignments {

	
	       public static void main(String args[]) throws InterruptedException
	       {
	    	   System.setProperty("webdriver.edge.driver",
	    	  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
	    	   
	    	   WebDriver driver = new EdgeDriver();
	    	   
	    	   driver.manage().window().maximize();
	    	   driver.get("https://www.amazon.in/");
	    	   
	    	   Thread.sleep(5000);
	    	   
	    	   driver.findElement(By.xpath("//a[contains(@href,\"nav_cs_best\")]")).click();
	    	   
	    	   Thread.sleep(2000);
	    	   
	    	   driver.findElement(By.xpath("//a[text()=\"Gift Ideas	\"]	")).click();
	    	   
	    	   
	    	   
	       }
}
