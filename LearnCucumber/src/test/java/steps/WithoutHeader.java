package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutHeader {

	public static ChromeDriver driver;
		
		@Given("checkss the browser")
		public void check_the_browser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
		  
		}
		@When("enterrrr credentials")
		public void enter_username(DataTable dataTable) {
		List<String> credentials=dataTable.transpose().asList(String.class);
			String username=credentials.get(0);
			String pword=credentials.get(1);
			
			driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(pword);
		}
		@When("loginnnn button")
		public void login_button() {
			driver.findElement(By.className("decorativeSubmit")).click();
		}
		
		

	}

//	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//driver.findElement(By.id("password")).sendKeys("crmsfa");
//driver.findElement(By.className("decorativeSubmit")).click();

