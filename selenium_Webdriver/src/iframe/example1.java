package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(5000);
		
		driver.switchTo().frame("frame1");
		Thread.sleep(5000);

		driver.switchTo().frame("frame3");
		
		driver.findElement(By.xpath("//input[@id=\"a\"]")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).sendKeys("hello");
		Thread.sleep(5000);

		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement an=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		an.click();
		Thread.sleep(5000);

		Select s= new Select(an);
		s.selectByValue("big baby cat");
		Thread.sleep(5000);

		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).clear();
}
}
