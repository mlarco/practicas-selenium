import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWord {

	@Test(description = "This TC verify the title of the home page", priority = 1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Hello Word");
		String actual = driver.getTitle();
		String expected = "Google";
		assertEquals(actual, expected);
		driver.close();
	}

}
