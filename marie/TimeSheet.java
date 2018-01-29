import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeSheet {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://resolvit.bbo.bullhornstaffing.com/Login/" ;
		driver.get(baseUrl);
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		
		username.sendKeys("mlarco@resolvit.com");
		pass.sendKeys("C0ctem0n5");
		
		WebElement botonLogIn = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[6]/input"));
		botonLogIn.click();
		
		
		
		WebElement tooltip = driver.findElement(By.xpath("/html/body"));
		String text = tooltip.getAttribute("title");
		//tampoco tiene nada String text = tooltip.getText();
		System.out.println("El texto de tooltip es: " + text);
		
	
		for (int i=0;i<10;i++){
			driver.navigate().refresh();
			WebElement copyLastWraper = driver.findElement(By.id("CopyLastWrapper"));
			if (copyLastWraper.isDisplayed()){
				System.out.println("Esta visible en ciclo: " + i);
				copyLastWraper.click();
				i=10;
			}
			else System.out.println("Nada aun en el ciclo " + i);
			Thread.sleep(100000);	
		}
		
			
		driver.close();
	
	}

}
