import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ej4ToolsQA {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //conviene maximizar para asegurarse de encontrar los elementos
        driver.manage().window().maximize();
        //explicit wait me hace esperar 20 de cada elemento
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        String URL = "http://www.google.com";
        driver.get(URL);
        
        if (driver.findElement(By.id("lst-ib")).isDisplayed()){
        	System.out.println("Elemento not hidden");
        	if (driver.findElement(By.id("lst-ib")).isEnabled()){
        		System.out.println("Elemento Enabled");
        	}
	        driver.findElement(By.id("lst-ib")).clear();
	        driver.findElement(By.id("lst-ib")).sendKeys("test");
	        driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	        System.out.println("Tag name: " + driver.findElement(By.id("lst-ib")).getTagName());
	        System.out.println("Size : " + driver.findElement(By.id("lst-ib")).getSize());
	        System.out.println("Location : " + driver.findElement(By.id("lst-ib")).getLocation());
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        }
        
        
        
        driver.quit();
        //driver.close();      

	}

}