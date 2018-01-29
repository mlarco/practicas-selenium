
/*
Practice Exercise

Launch new Browser
Open “http://toolsqa.wpengine.com/automation-practice-form/“
Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
 */

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjToolsQACheckbox {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //conviene maximizar para asegurarse de encontrar los elementos
        driver.manage().window().maximize();
        //explicit wait me hace esperar 20 de cada elemento
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        String url = "http://toolsqa.wpengine.com/Automation-practice-form/";
        driver.get(url);
        
        /*
         * List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
		
		// Create a boolean variable which will hold the value (True/False)
		boolean bValue = false;
		
		// This statement will return True, in case of first Radio button is selected
		bValue = rdBtn_Sex.get(0).isSelected();
		
		// This will check that if the bValue is True means if the first radio button is selected
		if(bValue == true){
			// This will select Second radio button, if the first radio button is selected by default
			rdBtn_Sex.get(1).click();
		}else{
			// If the first radio button is not selected by default, the first will be selected
			rdBtn_Sex.get(0).click();
		}
         */
        
        boolean femSeleccionado = driver.findElement(By.id("sex-1")).isSelected();
        if (!femSeleccionado){
        	System.out.println("Sexo femenino no seleccionado, procedo a seleccionar");
        	driver.findElement(By.id("sex-1")).click();
        }
        
        driver.findElement(By.id("exp-2")).click();
        
        
        /*
         * </strong>
<input id="profession-0" name="profession" value="Manual Tester" type="checkbox">
Manual Tester   
<input id="profession-1" name="profession" value="Automation Tester" type="checkbox">
<label class="checkbox" for="profession-1"> Automation Tester </label>
         */
        List<WebElement> profesiones = driver.findElements(By.name("profession"));
        int sizeProf = profesiones.size();
        for (int i=0; i<sizeProf; i++){
        	String value =profesiones.get(i).getAttribute("value");

        	if (value.equalsIgnoreCase("Automation Tester")){
        		profesiones.get(i).click();
        		System.out.println("Automation Tester seleccionado");
        		break;
        	}
        	
        }
        
        /*
         * <strong>
<label>Automation Tool</label>
</strong>
<input id="tool-0" name="tool" value="QTP" type="checkbox">
  QTP
<input id="tool-1" name="tool" value="Selenium IDE" type="checkbox">
  Selenium IDE
<input id="tool-2" name="tool" value="Selenium Webdriver" type="checkbox">
  Selenium Webdriver
         */
      
        
        //driver.findElement(By.cssSelector("#input[value='Selenium IDE']")).click();

        driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();;
        System.out.println("Selenium IDE seleccionado");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        //Close every associated window.
        driver.quit();
    

	}

}
