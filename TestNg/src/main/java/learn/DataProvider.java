package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider{
//extends DPSubclass {
@Test(dataProvider ="hi",dataProviderClass = DPSubclass.class)
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

	
	  @org.testng.annotations.DataProvider(name="hi")
	   public String[][] testData(){
	  String[][]values=new String[2][4];
	   values[0][0]="testleaf";
	  values[0][1]="hari"; 
	  values[0][2]="r";
	   values[0][3]="99";
	  
	  values[1][0]="testleaf";
	   values[1][1]="vidya";
	    values[1][2]="r";
	  values[1][3]="909";
	  
	  
	  return values; }
	 


}



