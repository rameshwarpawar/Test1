package Methods;

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
	    	                driver.get("https://www.youtube.com/");
	    	                
	    	                Thread.sleep(3000);
	    	                
	    	                driver.findElement(By.name("search_query")).sendKeys("Voidstarindia solution");
	    	                driver.findElement(By.id("search-icon-legacy")).click();
	    	                
	    	                Thread.sleep(5000);
	    	                
	    	                driver.findElement(By.linkText("Realtime VFX 2")).click();
	    	                
	    	                Thread.sleep(50000);
	    	                
	    	                driver.navigate().back();
	    	                driver.findElement(By.name("search_query")).clear();
	    	                driver.findElement(By.name("search_query")).sendKeys("voidstarindia cybersecurity");
	    	                driver.findElement(By.id("search-icon-legacy")).click();
	    	                
	    	                Thread.sleep(5000);
	    	                driver.findElement(By.linkText("Xen hypervisor based DLP solution")).click();
	    	                
	    	                Thread.sleep(50000);
	    	                
	    	                driver.quit();
	    	                
	       }
}
