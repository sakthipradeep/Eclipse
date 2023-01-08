package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	WebDriver driver;
	@Given("open th chromebrowser")
	public void open_th_chromebrowser() {
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
	}
	@Given("load url")
	public void load_url() {
		driver.get("http://www.amazon.com");
		
	}
	@When("login button")
	public void login_button() {
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div")).click();
	
	}
	@Given("enter username as {string}")
	public void enter_username(String name) {
		driver.findElement(By.id("ap_email")).sendKeys(name);
	}
	@When("continue button")
	public void continue_button() {
		driver.findElement(By.id("continue")).click();
	}
	@Given("enter password as {string}")
	public void enter_password(String password) {
		driver.findElement(By.id("ap_password")).sendKeys(password);
	}
	@When("click signin")
	public void click_signin() {
		driver.findElement(By.id("signInSubmit")).click();
	}
	@Then("homepage should be displayed")
	public void homepage_should_be_displayed() {
	    
	}



	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 * @Given("open th chromebrowser") public void open_th_chromebrowser() { //
	 * Write code here that turns the phrase above into concrete actions
	 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); }
	 * 
	 * @Given("load url") public void load_url() { // Write code here that turns the
	 * phrase above into concrete actions
	 * driver.get("http://www.amazon.com");//_2IX_2- VJZDxU //_2IX_2- _3mctLh VJZDxU
	 * 
	 * }
	 * 
	 * @When("login button") public void login_button() { // Write code here that
	 * turns the phrase above into concrete actions
	 * driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div")).click()
	 * ;
	 * 
	 * //throw new io.cucumber.java.PendingException(); } //id="ap_password"
	 * //id="signInSubmit"
	 * 
	 * @When("enter username") public void enter_username() {
	 * driver.findElement(By.id("ap_email")).sendKeys("6382150895"); }
	 * 
	 * @When ("continue button") public void continue_button() {
	 * driver.findElement(By.id("continue")).click(); }
	 * 
	 * @Given("enter password") public void enter_password() {
	 * driver.findElement(By.id("ap_password")).sendKeys("sakthi555");
	 * 
	 * }
	 * 
	 * @When("click signin button") public void click_signin_button() {
	 * driver.findElement(By.id("signInSubmit")).click(); }
	 * 
	 * @Then("homepage should be displayed") public void
	 * homepage_should_be_displayed() { // Write code here that turns the phrase
	 * above into concrete actions }
	 * 
	 */


		
		
		
		
		
		
}
