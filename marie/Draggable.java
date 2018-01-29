//Print Screen y Subir archivo

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Draggable {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/droppable/");
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement Texto = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/header/h1"));
		action.doubleClick(Texto).perform();
		
		Thread.sleep(2000);
		
		WebElement SourceElement = driver.findElement(By.id("draggableview"));
		WebElement TargetElement = driver.findElement(By.id("droppableview"));
		
		System.out.println(SourceElement.getCssValue("color"));
		
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(SourceElement)
		.moveToElement(TargetElement)
		.release(TargetElement)
		.build();
		dragAndDrop.perform();
	
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
		
		Thread.sleep(2000);
		
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("c:\\tmp\\screenshot.png");
		
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);		
		
		driver.close();

	}

}
