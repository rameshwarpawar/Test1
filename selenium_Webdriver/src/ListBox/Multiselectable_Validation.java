package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable_Validation {

	
	 public static void main(String args[]) throws InterruptedException
	  {
		           System.setProperty("webdriver.edge.driver",
				  "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		  
		            WebDriver driver = new EdgeDriver();
		            
		            driver.manage().window().maximize();
		            driver.get("https://www.facebook.com/");
		        
		    	
		            driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		    		Thread.sleep(5000);
		    		
		    		//Step1: Identify listbox element
		    		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		    		//Step2
		    		Select d= new Select(day);
		    		//Step3
		    		boolean output=d.isMultiple();
		    		if(output==true)
		    		{
		    			System.out.println("Test case passed: listbox is multiselectable");
		    		}
		    		else
		    		{
		    			System.out.println("test case fail: listbox is single selectable");
		            }
}
}
