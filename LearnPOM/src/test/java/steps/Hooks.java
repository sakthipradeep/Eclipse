package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{
	@Before
	public void precondition() {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");

	}
	@After
	public void postcondition() {
		driver.close();
	}
	}


