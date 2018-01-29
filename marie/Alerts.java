import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.cssSelector("body > form:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > input:nth-child(1)")).sendKeys("53920");
		driver.findElement(By.cssSelector("body > form:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(3000);
		alert.dismiss();
		//alert.accept();
		
		
		Thread.sleep(3000);
		
		*/
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.MILLISECONDS);
		
		//Define the timeout
		  String url = "http://www.clarin.com.ar";
		  driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MICROSECONDS);
		  // Use the timeout when navigating to a webpage
		  try {
		      driver.get(url);
		     
		  } catch (TimeoutException e) {
		      System.out.println("Page: " + url + " did not load within 1 MICRO seconds!");
		      // treat the timeout as needed
		  }
	
		driver.close();

	}

}
