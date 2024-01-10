package Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getsize_getPosition {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		
		   WebDriver driver = new EdgeDriver();
		   
		   driver.get("https://epsstable.revbits-eps.com/");
		   Dimension d= driver.manage().window().getSize();
		   
		   System.out.println(d);
		   
		   
		   Point p = driver.manage().window().getPosition();
		   
		   System.out.println(p);
	}

}
