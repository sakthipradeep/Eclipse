package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTestNg  {
	WebDriver driver;
	
	@BeforeSuite
public void driver() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	long currentTime= System.currentTimeMillis();
	driver.get("https://www.google.com/aclk?sa=l&ai=DChcSEwibv_vO9Zv7AhXikmYCHf7DAO4YABAAGgJzbQ&sig=AOD64_2pfUSI7YJtVXFy-djb3-xSpprxcw&q&adurl&ved=2ahUKEwiv9fDO9Zv7AhXTUGwGHehQBrEQ0Qx6BAgHEAE");
	driver.manage().window().maximize();

}	

	@Test(priority=0)
    public void mobiles() {
		WebElement menu=driver.findElement(By.linkText("Mobiles"));
		menu.click();
	}
-
	@Test(priority=1)
    public void tvs() {			
		WebElement menu1=driver.findElement(By.linkText("Television & Soundbar"));
		menu1.click();

	}


}


