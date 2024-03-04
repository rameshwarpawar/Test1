package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class framedemo1 {

	
	      public static void main(String args[]) throws InterruptedException
	      {
	    	  System.setProperty("webdriver.edge.driver", 
	    			  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
	    	  
	    	  
	    	          WebDriver driver = new EdgeDriver();
	    	          
	    	          driver.manage().window().maximize();
	    	          driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_post");
	    	          
	    	          Thread.sleep(1000);
	    	  		
	    	  		//Step1:Shift focus of selenium from main webpage to iframe
	    	  		//Method1:id attribute value
	    	  		//driver.switchTo().frame("iframeResult");
	    	  		
	    	  		//Method2:name attribute value
	    	  		//driver.switchTo().frame("iframeResult");
	    	  		
	    	  		//Method3:using index
	    	  		//driver.switchTo().frame(1);
	    	  		
	    	  		//Method4:using direct xpath
	    	  		//WebElement e=driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));
	    	  		//driver.switchTo().frame(e);
	    	  		//OR
	    	  	
	    	      	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]")));
	    			
	    	  
	    	  Thread.sleep(5000);
	    	  
	    	  driver.findElement(By.xpath("//input[@id=\"fname\"]")).clear();
	   

	    	 driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("hello");
	  		
	  		driver.findElement(By.xpath("//input[@id=\"lname\"]")).clear();
	  		driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("hello");
	  		
	  		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
	    	  
	      }
}
