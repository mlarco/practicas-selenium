import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ej2ToolsQA {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //conviene maximizar para asegurarse de encontrar los elementos
        driver.manage().window().maximize();
        //explicit wait me hace esperar 20 de cada elemento
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        String url = "http://demoqa.com/frames-and-windows/";
        driver.get(url);
        
        
    	driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
        
        driver.quit();
        //driver.close();      

	}

}
