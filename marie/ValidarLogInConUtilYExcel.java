/*
 Verificar LOG IN (user/pass) 
 ss1: valido/valido
 ss2: invalido/valido
 ss3: valido/invalido
 ss4: invalido/invalido
 
 ss1 : LOGIN OK
 ss2,ss3 y ss4: pop up indicando "User or Password is not valid"
 
 
One approach to automate this is to record separate script for all the above test cases. But this defeats the very purpose of automation.
The best technique to automate the above test suite  is to parametrize the script.
The most famous tool store data for parametrization is MS Excel.
Go ahead and create a script to read test-data from an Excel and execute Webdriver test cases

USAR APACHE POI
https://www.guru99.com/all-about-excel-in-selenium-poi-jxl.html


 */

package marie;

import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarLogInConUtilYExcel {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = misael.Utils.initialize();

		// explicit wait me hace esperar 20 de cada elemento
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String uid = "mngr98967";
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(uid);

		String password = "ynytehY";
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.name("btnLogin")).click();

		// Verify that the title is equal to a Welcome title and print it to screen
		String title = driver.getTitle();
		assertEquals("Guru99 Bank Manager HomePage", title);
		System.out.println("* * * Login successful * * *");
		System.out.println("Title of the HomePage: " + title);

		driver.close();
	}

}
