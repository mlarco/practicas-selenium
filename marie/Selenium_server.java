import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium_server {

	public static void main(String[] args) {

		DesiredCapabilities capability = DesiredCapabilities.firefox();
        RemoteWebDriver driver = new RemoteWebDriver(capability);
        
	
        /*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //conviene maximizar para asegurarse de encontrar los elementos
        driver.manage().window().maximize();
        //explicit wait me hace esperar 20 de cada elemento
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        String url = "http://store.demoqa.com/";
        driver.get(url);
        
        String title = driver.getTitle();
        Integer titleLength = title.length();
        System.out.println("El titulo del site es: " + title + " y la longitud es: " + titleLength);
        
        String currentURL = driver.getCurrentUrl();
     
        
        if (currentURL.equals(url)){
			System.out.println("Verification Successful - The correct Url is opened.");
		}else{
			System.out.println("Verification Failed - An incorrect Url is opened.");
			//In case of Fail, you like to print the actual and expected URL for the record purpose
			System.out.println("Actual URL is : " + currentURL);
			System.out.println("Expected URL is : " + url);
		}
        
        //String pageSource = driver.getPageSource();
        //System.out.println("La Source Page es: " + pageSource);
        
        //Quit the browser if it’s the last window currently open.
        driver.close();
        
        //Close every associated window.
        driver.quit();
        
        */
        

	}

}
