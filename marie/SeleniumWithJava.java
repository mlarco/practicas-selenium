

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWithJava {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.xcasa.com.ar");
		String title = driver.getTitle();
		System.out.println("El titulo de la pagina es: "+ title);
		Thread.sleep(5000);
		/*
		// open | http://www.seleniumhq.org/ | 
		driver.get("http://www.seleniumhq.org/");
		// click | link=About | 
		driver.findElement(By.linkText("About")).click();
		// click | css=h3 > a | 
		driver.findElement(By.cssSelector("h3 > a")).click();
		// click | link=Hacking with IntelliJ | 
		driver.findElement(By.linkText("Hacking with IntelliJ")).click();
		// click | link=Jetbrains | 
		driver.findElement(By.linkText("Jetbrains")).click();
		// assertTitle | exact:JetBrains: Developer Tools for Professionals and Teams | 
		assertEquals(driver.getTitle(), "JetBrains: Developer Tools for Professionals and Teams");
		// verifyText | css=div.home-page-header__pre-text | The drive to develop
		try {
		  assertEquals(driver.findElement(By.cssSelector("div.home-page-header__pre-text")).getText(), "The drive to develop");
		  System.out.println("Esta presente el texto: --- > " + driver.findElement(By.cssSelector("div.home-page-header__pre-text")).getText() + "  S I !!! ");
		} catch (Error e) {
		  System.out.println(e.toString());
		}
		*/
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(5000);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String url = "http://toolsqa.wpengine.com/Automation-practice-form/";
        driver.get(url);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Partial"))).perform();
		act.contextClick().perform();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
