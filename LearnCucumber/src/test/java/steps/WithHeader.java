package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WithHeader {
	public static ChromeDriver driver;
	
	@Given("check the browser")
	public void check_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
	  
	}
	@When("enter credentials")
	public void enter_username(DataTable dataTable) {
	List<Map<String,String> >keyvalue=dataTable.asMaps(String.class, String.class);
		String username=keyvalue.get(0).get("username");
		String password=keyvalue.get(0).get("password");
		
		driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("login button")
	public void login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	



	}

