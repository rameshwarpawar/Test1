package Screenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class facebook {

	  
	 public static void main(String args[]) throws InterruptedException, IOException
     {
    	 System.setProperty("webdriver.edge.driver",
    			 "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
    	 
    	   WebDriver driver = new EdgeDriver();
            
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            
            TakesScreenshot screen =  (TakesScreenshot) driver;
            
            
            File sec= screen.getScreenshotAs(OutputType.FILE);
            
        File dest = new File("C:\\Users\\VSI\\Desktop\\share\\Screenshot\\facebook.png");
            
            FileHandler.copy(sec, dest);
}
}