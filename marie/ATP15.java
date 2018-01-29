


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ATP15 {


	
	
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://vhhsconxas202.mrli.ppdi.com";
        driver.get(baseUrl + "/gclportal/portlets/com/gcl/myaccount/myaccountController.jpf?npl=login_login#");
        
        
        driver.findElement(By.id("login_login.username")).sendKeys("larcom9c");
        driver.findElement(By.name("{actionForm.password}")).clear();
        driver.findElement(By.name("{actionForm.password}")).sendKeys("Phenopath5");
        driver.findElement(By.cssSelector("a.button-left > span")).click();
        
        driver.findElement(By.cssSelector("#menu-0-item-5 > a")).click();
        driver.findElement(By.linkText("Routing")).click();
        driver.findElement(By.id("slc_routing.barcode")).clear();
        driver.findElement(By.id("slc_routing.barcode")).sendKeys("W1300000018"+Keys.ENTER);
        
  

        WebElement location = driver.findElement(By.xpath("//form[@id='slc_routing.routingForm']/table/tbody/tr[2]/td"));
        String expectedField = location.getText();
        WebElement locationB = driver.findElement(By.xpath("//form[@id='slc_routing.routingForm']/table/tbody/tr[2]/td[2]"));
        String actualBarcode = locationB.getText();
      if ((expectedField.contains("Sample Barcode")) && (actualBarcode.contains("W1300000018"))) {
    	  System.out.println("Test Passed!");
		
	} else {
		System.out.println("Test Failed!");
	}
        /*
        if ( Existen los campos y tienen los siguientes valores
         	Sample Barcode: W1300000018
         	Sample Name: PBMC 1
         	Study: JBTS0027 (W13)
         	Route: PBMC (Daily)
         	){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       */
     
        
        
        driver.close();
       
    }

}