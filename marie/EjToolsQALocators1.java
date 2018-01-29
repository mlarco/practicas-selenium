/*
 * Practice Exercise 1

Launch new Browser
Open URL http://toolsqa.wpengine.com/automation-practice-form/
Type Name & Last Name (Use Name locator)
Click on Submit button (Use ID locator)

 */


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjToolsQALocators1 {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //conviene maximizar para asegurarse de encontrar los elementos
        driver.manage().window().maximize();
        //explicit wait me hace esperar 20 de cada elemento
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        String url = "http://toolsqa.wpengine.com/Automation-practice-form/";
        driver.get(url);
        
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Name");
       
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("lastName");
        
        driver.findElement(By.id("submit")).click();
        
        
        //Close every associated window.
        driver.quit();
        
        
        

	}

}
