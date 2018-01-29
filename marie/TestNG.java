package marie;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG {
	public static void main (String[] args) {
		ChromeDriver driver = misael.Utils.initialize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String uid = "mngr98967";
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(uid);

		String password = "ynytehY";
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.name("btnLogin")).click();

		//ESTO NO VALIDA, MEJOR FIJANDOSE QUE TIENE LOG OUT.
		//assertEquals(driver.findElement(By.partialLinkText("out")).getText(), "Log out");
		assertEquals(driver.findElement(By.partialLinkText("out")).getText().toString(), "Log out".toString());
		System.out.println("Log in successful");
		//assertEquals(driver.findElement(By.linkText("Log out")).getText(), "Log out");
		driver.close();
	}
}
