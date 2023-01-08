package dataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import learn.DPSubclass;

public class ExcellIntegation {
	@Test(dataProvider ="hi")
	public static String[][] method1 (Class<String[]> class1) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(class1[0]);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(class1[1]);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(class1[0]);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(class1[2]);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		return null;
	}
}
