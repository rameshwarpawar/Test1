package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class spicejetflightbooking {
	
	public static void main(String args[]) throws InterruptedException
	{
		            System.setProperty("webdriver.edge.driver",
				"C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		            
		            WebDriver driver = new EdgeDriver();
		            
		            driver.manage().window().maximize();
		            driver.get("https://www.spicejet.com/");
		            
		            Thread.sleep(5000);
		             
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

				            driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
			                Thread.sleep(2000);
			        driver.findElement(By.xpath("//div[text()=\"CNY\"]")).click();

				            
		             
	}

}
