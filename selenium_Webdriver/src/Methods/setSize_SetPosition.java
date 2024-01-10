package Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setSize_SetPosition {
	
	  public static void main(String args[])
	  {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
			
		   WebDriver driver = new EdgeDriver();
		   
		   driver.get("https://epsstable.revbits-eps.com/");
		   
		   Dimension d = new Dimension(1000,500);
		   driver.manage().window().setSize(d);
		   System.out.println(driver.manage().window().getSize());
		   
		   Point p= new Point(400,400);
		   driver.manage().window().setPosition(p);
		   System.out.println(p);
		   System.out.println(driver.manage().window().getPosition());
	  }

}
