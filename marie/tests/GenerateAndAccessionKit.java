package marie.tests;

import java.util.ArrayList;

public class GenerateAndAccessionKit implements Utilities {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver.get(baseUrl);
		//driver.manage().window().maximize();
		Utilities.LoginConneXion();

		
		String KitAccessionNumber = Utilities.GenerateKitAccession("TKDA0027");
		
		java.util.List<String> sans = new ArrayList<String>();
		sans = Utilities.GetSANumbers();
		Utilities.AccessKit(KitAccessionNumber);
		//Utilities.AccessSamplesAmbient(sans);
		//Utilities.AccessSamplesFrozen(sans);
		Utilities.AccessSamplesRefrigerated(sans);
		driver.close();
	}
}
