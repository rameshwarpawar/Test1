package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class rowsize {

	public static void main(String args[])
	{
		        System.setProperty("webdriver.edge.driver",
				"C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
	
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/VSI/Desktop/share/Webtable.html");
		
		List <WebElement> row = driver.findElements(By.xpath("//table[@id=\"’1234’\"]//tr"));
		
		int sizeofrow=row.size();
		
		System.out.println("No. of rows present in table are: "+sizeofrow);
	}
}

