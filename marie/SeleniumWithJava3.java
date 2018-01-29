import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWithJava3 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		/*
		
		//Radio Button Sex y Years of experiencie
		
		//List radio button
		
		List <WebElement> radioButtons =  driver.findElements(By.name("sex"));
		
		radioButtons.get(1).click();
		Thread.sleep(2000);
		
		for (WebElement radioButton : radioButtons) {
			if (radioButton.isSelected())
					System.out.println(radioButton.getAttribute("value"));
		}
		
		// checkbox
		List <WebElement> checkboxes =  driver.findElements(By.name("profession"));
		checkboxes.get(0).click();
		Thread.sleep(2000);
		
		//drop-down
		WebElement dropdown = driver.findElement(By.name("continents"));
		Select continents = new Select(dropdown);
		continents.selectByVisibleText("Africa");
		Thread.sleep(4000);
		
		//table
		driver.get("http://toolsqa.com/automation-practice-table/");
		WebElement row = driver.findElement(By.xpath("//tbody/tr/td"));
		System.out.println(row.getText());
		
		WebElement elem = driver.findElement(By.cssSelector(".tsc_table_s13 > tbody:nth-child(4) > tr:nth-child(1) > td:nth-child(3)"));
		System.out.print(elem.getText());
	*/
		//links
		driver.get("http://toolsqa.wpengine.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement wE:links){
			if (wE.getAttribute("title")!=""){
				System.out.println("El link a: " + wE.getAttribute("href"));
			}
		}
		
		driver.close();

	}

}
