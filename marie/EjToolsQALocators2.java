/*
 * Practice Exercise 2

Launch new Browser
Open URL http://toolsqa.wpengine.com/automation-practice-form/
Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
Identify Submit button with ‘tagName’, convert it in to string and print it on the console
Click on the Link “Link Test” (Use ‘linkTest’ locator)
 * 
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjToolsQALocators2 {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //conviene maximizar para asegurarse de encontrar los elementos
        driver.manage().window().maximize();
        //explicit wait me hace esperar 20 de cada elemento
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        String url = "http://toolsqa.wpengine.com/Automation-practice-form/";
        driver.get(url);
        
        driver.findElement(By.partialLinkText("Partial")).click();


        String tagName = driver.findElements(By.tagName("button")).toString();
        System.out.println("El boton tagName dice: " + tagName);
        
        
        driver.findElement(By.linkText("Link Test")).click();
        
        //Close every associated window.
        driver.quit();
        
        
        

	}

}
