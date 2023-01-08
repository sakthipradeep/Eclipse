package steps;


//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.CommonConstants;
import drivers.DriverManager;
import io.cucumber.java.Before;
import utills.CommonUtills;

public class StepDefination {

	

	

	
	
	@Before
	public void beforeScenario() {
	
		try {
			CommonUtills obj=new CommonUtills();
			obj.loadProperties();
			if(DriverManager.getDriver()==null) {
				DriverManager.launchBrowser();
			obj.initWebelements();
			}
		  
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	
	
		
}
