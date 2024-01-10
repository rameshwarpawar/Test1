package xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class xpath_Text {
	
	  public static void main(String args[]) throws InterruptedException
	  {
		          System.setProperty("webdriver.edge.driver",
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		          
		          WebDriver driver = new EdgeDriver();
		          
		          driver.manage().window().maximize();
		          driver.get("https://www.facebook.com/");
		          
		          Thread.sleep(5000);
		          
		          driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();;
		          
		          driver.navigate().back();
		          
	           driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		          
	  }

}
