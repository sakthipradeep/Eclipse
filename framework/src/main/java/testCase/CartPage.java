package testCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CartPageObjects;
import pageObjects.LoginPageObjects;

public class CartPage {
	@Test
	public void search() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, LoginPageObjects.class);

		//LoginPageObjects objects=new LoginPageObjects();
		LoginPageObjects.username.sendKeys("6382150895");
		LoginPageObjects.password.sendKeys("sakthi555");
		LoginPageObjects.button.click();
		
		PageFactory.initElements(driver, CartPageObjects.class);
        CartPageObjects.searches.sendKeys("toys");
	

}
}