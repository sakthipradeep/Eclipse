package dataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingDataProvider    {
	
	@Test(dataProvider ="hi")
	public void Login(String username,String password) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}
	
	
	/*
	 * @DataProvider(name="hi") public String[][] credentials(){
	 * String[][]values=new String[1][2];
	 * 
	 * values[0][0]="sakthipradeep555@gmail.com"; values[0][1]="6382150895"; return
	 * values; }
	 * 
	 */
}
