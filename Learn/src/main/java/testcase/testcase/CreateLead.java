package testcase.testcase;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import readexcell.Excell;

public class CreateLead {
	@Test(dataProvider="hi")
	public void main(String name,String fname,String ini,String number) {
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ini);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(number);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	}
	@DataProvider(name="hi")
public String[][] testdata() throws IOException{
	String[][] callldata=Excell.calldata();
	return callldata;	}}


