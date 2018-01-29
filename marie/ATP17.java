

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ATP17 {
	
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://vhhsconxas202.mrli.ppdi.com";
        driver.get(baseUrl + "/gclportal/portlets/com/gcl/myaccount/myaccountController.jpf?npl=login_login#");
        
        
        driver.findElement(By.id("login_login.username")).clear();
        driver.findElement(By.id("login_login.username")).sendKeys("larcom9c");
        driver.findElement(By.name("{actionForm.password}")).clear();
        driver.findElement(By.name("{actionForm.password}")).sendKeys("C0ctem0n5");
        driver.findElement(By.cssSelector("a.button-left > span")).click();
        driver.findElement(By.cssSelector("#menu-0-item-5 > a")).click();
        driver.findElement(By.linkText("Routing")).click();
        driver.findElement(By.id("slc_routing.barcode")).clear();
        driver.findElement(By.id("slc_routing.barcode")).sendKeys("K4825202180");
        
        
        /*
        if ( Existen los campos y tienen los siguientes valores
 
         	Route: Aliquot: PD Blood Nucleic Acid 1 Aliquot
         	){
            System.out.println("no Aliquot Type selected!");
        } else {
            System.out.println("Aliquot Type selected");
        }
       */
        driver.findElement(By.cssSelector("#menu-0-item-1 > a")).click();
        driver.findElement(By.xpath("//a[@id='study_manager_study_manager.studySearch']/span")).click();
        driver.findElement(By.id("studyCode")).clear();
        driver.findElement(By.id("studyCode")).sendKeys("ESAI0040");
        driver.findElement(By.cssSelector("a.button > span")).click();
        driver.findElement(By.linkText("Specimen Service")).click();
        driver.findElement(By.cssSelector("a > span.table-cell > b")).click();
        new Select(driver.findElement(By.name("wlw-select_key:{actionForm.aliquotType}"))).selectByVisibleText("Super Special");
        driver.findElement(By.cssSelector("a.button.single-click > span")).click();
        driver.findElement(By.cssSelector("#menu-0-item-5 > a")).click();
        driver.findElement(By.id("slc_routing.barcode")).clear();
        driver.findElement(By.id("slc_routing.barcode")).sendKeys("K4825202180");
      
        /*
        if ( Existen los campos y tienen los siguientes valores
   
         	Route: Aliquot: Super Special
         	){
            System.out.println("Aliquot Type selected: Test Passed!");
        } else {
            System.out.println("NO Aliquot Type selected: Test Failed");
        }
       */
     
        //ROLLBACK
        
        driver.get(baseUrl + "/gclportal/portlets/com/gcl/routing/routingSampleSubmit.do#");
        driver.findElement(By.cssSelector("#menu-0-item-1 > a")).click();
        driver.findElement(By.cssSelector("a > span.table-cell > b")).click();
        new Select(driver.findElement(By.name("wlw-select_key:{actionForm.aliquotType}"))).selectByVisibleText("");
        driver.findElement(By.cssSelector("a.button.single-click > span")).click();
        
        
        driver.close();
       
    }

}