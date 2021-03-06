
import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExerciceShop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//conviene maximizar para asegurarse de encontrar los elementos
		driver.manage().window().maximize();
		//explicit wait me hace esperar 20 de cada elemento
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String baseUrl = "http://shop.demoqa.com";
		driver.get(baseUrl);
		
	
		driver.findElement(By.cssSelector("#menu-item-2021 > a")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("mlarco@resolvit.com");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Reg1st#r");
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);
		
		//HOVER
		WebElement element = driver.findElement(By.cssSelector("#menu-item-2213 > a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
        driver.findElement(By.cssSelector("#menu-item-2219 > a")).click();
        
        
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'SAFI SEQUIN TUNIC DRESS')]")).click();
		System.out.println("detalle de vestido seleccionado");
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		System.out.println("pos-submit");
		driver.findElement(By.cssSelector("a.button.wc-forward")).click();
		driver.findElement(By.id("shipping_method_0_free_shipping14")).click();
		System.out.println("pos-seleccionar free shippingt");
		driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).click();

		//
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#terms")).click();

		//Thread.sleep(2000);
		driver.findElement(By.name("ship_to_different_address")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("payment_method_cod")).click();
		
		driver.findElement(By.name("woocommerce_checkout_place_order")).click();
		
		/*if (assertEquals(driver.findElement(By.cssSelector("td.product-total > span.woocommerce-Price-amount.amoun")).getAttribute("css=td.product-total > span.woocommerce-Price-amount.amount"), "�185.00"))
			System.out.println("Precio correcto");
*/
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		String expectedTitle = "Checkout � Demo Shopping site";
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Compra finalizada con exito");
		} else {
			System.out.println("Test Failed");
		}
		
		
		driver.close();
	}

}
