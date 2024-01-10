package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ID_Locator {

	 public static void main(String args[]) throws InterruptedException
	 {
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			WebElement ele=driver.findElement(By.id("txtUsername"));
			Thread.sleep(2000);
			ele.sendKeys("Admin");
			Thread.sleep(1000);
			
			WebElement pass=driver.findElement(By.id("txtPassword"));
			Thread.sleep(2000);
			pass.sendKeys("admin123");
			Thread.sleep(1000);
			
			WebElement login=driver.findElement(By.id("btnLogin"));
			Thread.sleep(2000);
			login.click();
			
			Thread.sleep(2000);
			driver.quit();
		}
	 }

