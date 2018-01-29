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



import static org.testng.AssertJUnit.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import readWriteExcel.ExcelReader;

public class ValidarLogInConUtilYExcel {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = Utils.initialize();
		// explicit wait me hace esperar 20 de cada elemento
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Create an object of ExcelReader class
	    ExcelReader objExcelFile = new ExcelReader();
	    //Prepare the path of excel file
	    String filePath = System.getProperty("user.dir")+"\\src\\readWriteExcel";
	    //Call read file method of the class to read data
	    try {
	    	//RECORRO LA MATRIZ
	    	objExcelFile.readExcel(filePath,"LogInCases.xlsx","Sheet1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		driver.close();
	}

}
