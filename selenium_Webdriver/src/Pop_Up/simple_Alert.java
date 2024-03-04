package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class simple_Alert {

	
	 public static void main(String args[]) throws InterruptedException
	 {
	 		   
	 		   System.setProperty("webdriver.edge.driver", 
	 				   "C:\\Users\\VSI\\Desktop\\share\\edgedriver_win64\\msedgedriver.exe");
	 		   
	 		   WebDriver driver = new EdgeDriver();
	 		   
	 		   
	 		   driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	 		   
	 		   driver.manage().window().maximize();
	 		   
	 		       Thread.sleep(5000);
	 		       
	 		       driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
	 		       
	 		       Thread.sleep(2000);

	 		       
	 		       Alert alt =driver.switchTo().alert();
	 		       
	 		       System.out.println(alt.getText());
	 		       
	 		       alt.accept();
	 		       
	 		       
	 		       driver.findElement(By.xpath("//button[@id=\"confirmBox\"]")).click();
	 		      Thread.sleep(2000);
	 		       
	 		       System.out.println(alt.getText());
	 		      Thread.sleep(2000);
	 		       
	 		       alt.dismiss();
	 		       
	 		       WebElement output = driver.findElement(By.xpath("//div[@id=\"output\"]"));
	 		       
	 		       System.out.println(output.getText());
	 		       
	 		       driver.findElement(By.xpath("//button[@id=\"promptBox\"]")).click();
	 		       
	 		       Thread.sleep(5000);

	 		     
	 		       alt.sendKeys("Hello");
	 		       
	 		       System.out.println(alt.getText());
	 		       
	 		       alt.accept();
	 		       
	 		       
	 		      WebElement output1 = driver.findElement(By.xpath("//div[@id=\"output\"]"));
	 		       
	 		       System.out.println(output1.getText());
	 		       
	 		       
}
}