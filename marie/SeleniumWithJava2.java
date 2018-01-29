import static org.testng.AssertJUnit.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWithJava2 {

	public static void main(String[] args) throws Exception {
	
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement field = driver.findElement(By.id("lst-ib"));
		field.sendKeys("Hello Word");
		field.submit();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Imágenes")));
		
		
		WebElement imag = driver.findElement(By.linkText("Imágenes"));
		imag.click();
		
		WebElement imageElement = driver.findElement(By.cssSelector("a[class = rg_l]"));
		WebElement imageLink = imageElement.findElement(By.tagName("img"));
		imageLink.click();
	
		
		/*driver.get("http://www.clarin.com.ar");
		//driver.getPageSource().contains("Whatever String you want to search for");
		Thread.sleep(3000);
		
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText.contains("Noticias"));
		
		// SI EJECUTO ESTO SE CORTA PORQUE NO ENCUENTRA !!!
		//Assert.assertTrue("Text not found!", bodyText.contains("Not4444cias"));
		*/
		//driver.close();
		
	}

}
