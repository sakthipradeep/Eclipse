package steps;



import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static ChromeDriver driver;
	//driver=new ChromeDriver();

	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		driver=new ChromeDriver(); 
	 driver.get("http://leaftaps.com/opentaps/");
		/*
		 * @After public void postCondition() { driver.close(); }
		 */
}

	private void postCondition() {
		driver.close();
		// TODO Auto-generated method stub
		
	}
}