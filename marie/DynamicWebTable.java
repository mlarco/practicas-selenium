package marie;

/*
 * http://toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/
 * 	
 * 
Automation Tool	Licensing	Market response
Selenium	Free	In
QTP	Paid	Out
 * 
 * Para obtener el string de Selenium - fila 2, columna 1 --> /html/body/div[1]/div[2]/div/div[2]/article/div/table/tbody/tr[2]/td[1]
If we divide this xpath in to three different parts it will be like this

Part 1 – Location of the table in the webpage </html/body/div[1]/div[2]/div/div[2]/article/div/>
Part 2 – Table body (data) starts from here <table/tbody/>
Part 3 – It says table row 2 and table column 1 <tr[2]/td[1]>

Usando variables
String sRow = "2";
String sCol = "1";
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/article/div/table/tbody/tr["+sRow+"]/td["+sCol+"]")).getText();
 
Si conozco el contenido...
String sColValue = "Licensing";
 
	//First loop will find the 'ClOCK TWER HOTEL' in the first column
	for (int i=1;i<=3;i++){
		String sValue = null;
		sValue = driver.findElement(By.xpath(".//*[@id='post-2924']/div/table/tbody/tr[1]/th["+i+"]")).getText();
		if(sValue.equalsIgnoreCase(sColValue)){
			
			// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
			for (int j=1;j<=2;j++){
				String sRowValue= driver.findElement(By.xpath(".//*[@id='post-2924']/div/table/tbody/tr["+j+"]/td["+i+"]")).getText();
				System.out.println(sRowValue);
			}
		break;
	}
}

Practice Exercise 1

Launch new Browser
Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
Get the value from cell ‘Dubai’ and print it on the console
Click on the link ‘Detail’ of the first row and last column
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DynamicWebTable {

	
	
	@Test
	public void verifyDropDownSelection(){

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "http://toolsqa.wpengine.com/automation-practice-table";
		
		/*driver.get(url);
		WebElement element = driver.findElement(By.id("continents"));
		Select continents = new Select(element);
		continents.selectByIndex(1);
		System.out.println("Europa Selected");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.close();
	}
}