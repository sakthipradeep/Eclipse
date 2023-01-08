package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	public static ChromeDriver driver;

	@Given("open Browser")
	public void openBroser() {
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		driver=new ChromeDriver(); }
	  
	
	@Given("load url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	@Given("Enter username as {string}")
	public void userName(String name) {
		driver.findElement(By.id("username")).sendKeys(name);
	}
	@Given("Enter password as {string}")
	public void passWord(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@When("Click button")
	public void button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("User page should be dispayed")
	public void homePage() {
		driver.findElement(By.linkText("CRM/SFA")).click();}
		//driver.findElement(By.)
		/*
		 * boolean display=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		 * if(display) { System.out.println("yes"); }else { System.out.println("no"); }
		 */
		@When("Click lead button")
		public void lead() {
			driver.findElement(By.linkText("Leads")).click();

	}

		@When("click on create link")
		public void createLead() {
			driver.findElement(By.linkText("Create Lead")).click();	
			}
		@Given("Enter companyname as {string}")
		public void companyName(String cname) {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
		@Given("Enter first name as {string}")
		public void firstName(String fname) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

		}
		@Given("Enter last name as {string}")
		public void lastName(String ini) {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ini);
	}
		@Given("Enter number as {string}")
		public void number(String number) {
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(number);
	}
	/*
	 * @When("clicks the button") public void buttons() {
	 * driver.findElement(By.name("submitButton")).click(); }
	 */
		
	}	
	









	//driver.findElement(By.linkText("Leads")).click();



