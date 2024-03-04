package ListBox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Example1 {
	
	  public static void main(String args[]) throws InterruptedException
	  {
		           System.setProperty("webdriver.edge.driver",
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		  
		            WebDriver driver = new EdgeDriver();
		            
		            driver.manage().window().maximize();
		            driver.get("https://www.facebook.com/");
		            
		            driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		            Thread.sleep(8000);
		            
		          //Step1: Identify listbox element
		            
		            WebElement day =driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		            WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		            day.click();
		            month.click();
		            
		          //Step2: Create object of Select Class
		            
		            Select se=new Select(day);
		            Select m=new Select(month);
		            se.selectByValue("18");
		            Thread.sleep(2000);
		           m.selectByVisibleText("Feb");
		   		se.selectByIndex(11);
		            ;
	  }

}
