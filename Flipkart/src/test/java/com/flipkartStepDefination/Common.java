package com.flipkartStepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Commonstepdefination.CommonUtils;
import constants.Constants;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {

	//LAUNCH BROWSER
	public static WebDriver driver;






	@Before	
	public void beforescenario() {
		try {
			CommonUtils.loadProperties();



			if(driver==null) {
				launchBrowser();
			}
		}
		catch (Exception e) {
			e.printStackTrace(); 
		}

	}

	public void launchBrowser() {                    
		try {
			switch (Constants.BROWSER) {
			case "chrome":
				System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_LOCATION);

				driver=new ChromeDriver();
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();

			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();

			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();	
		}
	}	
}





