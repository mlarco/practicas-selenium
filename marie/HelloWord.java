package marie;

import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWord {

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	String url = "http://www.google.com/";
	
	driver.get(url);

}
