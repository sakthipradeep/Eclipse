package pagefactory
;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactory1   {

	@Test
public void drivers() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");

	
	PageFactory.initElements(driver,PageFactory2.class);
	PageFactory2.username.sendKeys("6382150895");
	PageFactory2.password.sendKeys("sakthi555");
	PageFactory2.button.click();
}

}