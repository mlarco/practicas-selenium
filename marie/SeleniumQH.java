import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.base.Verify;


public class SeleniumQH 
{
	@Test(description = "This TC verify the title of the home page", priority = 1)
	public static void main(String[] args) throws Exception 
	{
		String baseUrl = "http://www.seleniumhq.org/";
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// open | / | 
		driver.get(baseUrl + "/");
		// click | link=Projects | 
		driver.findElement(By.linkText("Projects")).click();
		String title = driver.getTitle();
		String expected = "Selenium Projects";
		// el ASSERT DETIENE EJECUCION SI FALLA 
		assertEquals(title, expected);
		//ABSOLUTE AND RELATIVE XPATH (WITH DOUBLE //)
		driver.findElement(By.xpath("//li[4]/a")).click();
		driver.findElement(By.xpath("//li[4]/a")).click();
		//driver.findElement(By.xpath("//div[1]/ul/li[4]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/ul/li[4]/a")).click();
		System.out.println("After Clicking on xpath: "+ driver.getTitle());
		if (driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/input[4]")).isDisplayed())
			{
			String text =  driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div/input[4]")).getText();
			System.out.println("Is displayed: "+ text); //NO TEXT
			}
		
		String url = "http://toolsqa.wpengine.com/Automation-practice-form/";
		driver.get(url);
		
		Select continents = new Select(driver.findElement(By.id("continents")));
		continents.selectByVisibleText("Africa");
		
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("Africa Selected");
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.navigate().back();
				
		driver.close();
	}
}
