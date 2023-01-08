package testcase.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data { // INHERITED CLASSS
	@Test(dataProvider="high" )
	public void main(String namee,String fname,String lname,String Ph) {
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("namee");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fname");
		
		
	}
		@DataProvider(name="high")
	public String[][] getdata() throws IOException  {
		/*
		 * String[][]str=new String[2][4]; str[0][0]="sakthipradeep"; str[0][1]="sakth";
		 * str[0][2]="senthil"; str[0][3]="123456789";
		 * 
		 * str[1][0]="pavi"; str[1][1]="paavi"; str[1][2]="ravi"; str[1][3]="12356 ";
		 * 
		 */
		String[][] lead= ExcellRead.lead();
		return lead;
		
	}
		
	
}
