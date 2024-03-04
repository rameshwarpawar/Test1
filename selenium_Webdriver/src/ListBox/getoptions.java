package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptions {

	
	   public static void main(String args[]) throws InterruptedException
	   {
		                System.setProperty("webdriver.edge.driver",
				   "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		                
		                WebDriver driver =new EdgeDriver();
		                
		                driver.manage().window().maximize();
		                driver.get("https://www.facebook.com/");
		                
		                Thread.sleep(5000);
		                

			            driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
			    		Thread.sleep(5000);
			    		
		                WebElement T =driver.findElement(By.xpath("//select[@id=\"month\"]"));
		                
		                Select month=new Select(T);
		                
		                List<WebElement> w=month.getOptions();
		                for (WebElement monthly:w)
		                {
		                	System.out.println(monthly.getText());
		                }
		                
	   }
}
