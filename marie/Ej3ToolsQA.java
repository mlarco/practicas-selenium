import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ej3ToolsQA {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //conviene maximizar para asegurarse de encontrar los elementos
        driver.manage().window().maximize();
        //explicit wait me hace esperar 20 de cada elemento
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.navigate().to("http://demoqa.com/frames-and-windows/");
        System.out.println("Primer pantalla: " + driver.getTitle());
        driver.navigate().to("http://www.google.com");
        System.out.println("Segunda pantalla: " + driver.getTitle());
        driver.navigate().back();
        System.out.println("Primer pantalla usando back: " + driver.getTitle());
        driver.navigate().forward();
        System.out.println("Segunda pantalla usando forward: " + driver.getTitle());
        
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("test");

        driver.navigate().refresh();
        
        driver.findElement(By.name("btnI")).click();
       
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.quit();
        //driver.close();      

	}

}