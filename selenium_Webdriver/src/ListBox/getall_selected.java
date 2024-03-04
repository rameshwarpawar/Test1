package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class getall_selected {

	
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
		    		WebElement day=driver.findElement(By.tagName("select"));
		    		//Step2
		    		Select d= new Select(day);
		      
		    		  for (int i=0;i<d.getOptions().size();i++)
		    		  {
		    			  d.selectByIndex(i);
		    			  
		    		  }
		 
		    		
		    		List<WebElement>  sel=d.getAllSelectedOptions();
		    		for(WebElement w:sel)
		    		{
		    			System.out.println(w.getText());
		    		}
		    		
}
}