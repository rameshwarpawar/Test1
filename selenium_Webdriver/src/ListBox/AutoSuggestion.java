package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestion {

	
	  public static void main(String args[]) throws InterruptedException
	   {
		                System.setProperty("webdriver.edge.driver",
				   "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		                
		                WebDriver driver =new EdgeDriver();
		                
		                driver.manage().window().maximize();
		                driver.get("https://www.google.com/");
		                
		                driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]")).sendKeys("cybersecurity");
		                
		              //Step2: retrive all Webelements
		                
		                List <WebElement> ele = driver.findElements(By.xpath("//div[@class=\"aajZCb\"]"));
		                
		                Thread.sleep(2000);
		        		//step3: visit element one by one if match is there click on that webelement
		        		
		                String expected="cybersecurity salary";
		        		for(WebElement s:ele)
		        		{
		        			String actual=s.getText();
		        			System.out.println(actual);
		        			if(expected.equalsIgnoreCase(actual))
		        			{
		        				s.click();
		        				break;
		        			}
		                
}
		        		driver.close();
}
}