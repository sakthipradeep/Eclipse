package testcase.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Boss {
	RemoteWebDriver driver;
	 // INHERIT data CLASS WITH dataProviderClass METHOD
	
	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		/*
		 * driver.findElement(By.id("createLeadForm_companyName")).sendKeys("namee");
		 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fname");
		 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lname");
		 * driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("ph")
		 * ; driver.findElement(By.name("submitButton")).click(); driver.close();
		 * 
		 */



	}
}
