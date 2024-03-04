package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class dynamic_dropdown_Example3 {
	

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.edge.driver", 
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		  
		         WebDriver driver=new EdgeDriver();
		          driver.manage().window().maximize();
		          
		        driver.get("https://www.spicejet.com/");
		              Thread.sleep(5000);
		              
		            driver.findElement(By.xpath("//div[text()=\"Currency\"]")).click();
		                Thread.sleep(2000);
		        driver.findElement(By.xpath("//div[text()=\"CNY\"]")).click();

	}

}
