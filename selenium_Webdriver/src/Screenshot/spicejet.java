package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class spicejet {

	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException, IOException
	{
		            System.setProperty("webdriver.edge.driver",
				"C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		            
		            driver = new EdgeDriver();
		            
		            driver.manage().window().maximize();
		            driver.get("https://www.spicejet.com/");
		            
		            Thread.sleep(5000);
		             Screenshot("websiteopen");
		             driver.findElement(By.xpath("//div[text()=\"From\"]")).click();
		             
		             driver.findElement(By.xpath("//div[text()=\"Pune\"]")).click();
		             
		             Thread.sleep(5000);

		            
		             
		             
		             driver.findElement(By.xpath("//div[text()=\"SAG\"]")).click();
		             Thread.sleep(5000);
		             
		             driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1loqt21 r-1otgn73\"])[1]")).click();
		     		Thread.sleep(2000);
		             
		             driver.findElement(By.xpath("//div[text()=\"Passengers\"]")).click();
			           
				      WebElement adult=    driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]"));
				          
				          int i=1;
				          while(i<5)
				          {
				        	  adult.click();
				        	  i++;
				          }
				          
				          WebElement child =driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]"));
				          
				          for (int j=1;j<4;j++)
				          {
				        	  child.click();
				        	  
				          }

				          
				          WebElement infant=driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]"));
				            for (int k=1;k<=3;k++)
				            {
				            	infant.click();
			}
					           Thread.sleep(5000);

				            driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();
				            Thread.sleep(5000);

				            Screenshot("Passenger");
				            driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
			                Thread.sleep(2000);
			        driver.findElement(By.xpath("//div[text()=\"CNY\"]")).click();
			        Screenshot("currencyselected");
				            
		             
	}
	
	               public static void Screenshot (String filename) throws IOException
	               {
	            	   TakesScreenshot screen = (TakesScreenshot)driver;
	            	 
	                   
	                   screen.getScreenshotAs(OutputType.FILE);
	                   
	                   File src = screen.getScreenshotAs(OutputType.FILE);
	                   
	                   File dest = new File("C:\\Users\\VSI\\Desktop\\share\\Screenshot\\"+filename+" .jpg");
	                   
	                   FileHandler.copy(src, dest);
	                   
	               }
}

