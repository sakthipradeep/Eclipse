package readexcell;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcase.testcase.Boss;

public class ReadExcell {
	
@Test(dataProvider="hi")
	public  void main(String name,String nam) {
	
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(name);
	driver.findElement(By.id("password")).sendKeys(nam);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(nam);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		driver.close();
}
@DataProvider(name="hi")
public String[][]getdata() throws IOException{
	
	String[][] callldata=Excell.calldata();
	return callldata;
	
}
	
}
	
