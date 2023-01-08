package drivers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.CommonConstants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
private static WebDriver driver=null;


public   void launchBrowser() {
	

	try {
	switch (CommonConstants.browser) {
	

	
	case "chrome":
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
	case "gecko":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	
			

	default:
		System.setProperty(CommonConstants.chromedriver,CommonConstants.Chrome_driver_location);
		driver=new ChromeDriver();
		break;
	}
}
	catch (Exception e) {

		e.printStackTrace();
	}
}


public static WebDriver getDriver() {
	return driver;
}


/*
 * public static void setDriver(WebDriver driver) { DriverManager.driver =
 * driver; }
 */


}