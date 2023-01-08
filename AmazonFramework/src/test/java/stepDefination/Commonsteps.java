package stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.CommonConstants;
import io.cucumber.java.Before;
import utills.Commonutills;

public class Commonsteps {

	public static WebDriver driver;
	private static final Logger log=LogManager.getLogger(Commonsteps.class);
	 @Before
		public void BeforeScenario() {
		 log.info("execution started");
		 try {
		Commonutills obj=new Commonutills();
		obj.loadProperties();
		if(driver==null) {
			launchBrowser();
		}
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }}
	public void launchBrowser() {
		
		try {
			switch ("chrome") {
			case "chrome":
				System.setProperty(CommonConstants.chromedriver, CommonConstants.Chrome_driver_location);
				driver=new ChromeDriver();
				break;
				
			case "gecko":
				System.setProperty("WebDriver.firefox.driver", "D:\\automation\\drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
				break;
				

			default:
				System.setProperty("WebDriver.gecko.driver","C:\\Users\\welcome\\.cache\\selenium\\geckodriver\\win64\\0.31.0\\geckodriver.exe");
				driver=new FirefoxDriver();
				break;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
