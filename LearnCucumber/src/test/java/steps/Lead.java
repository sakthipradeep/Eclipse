
  package steps;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver;
  
  import com.github.dockerjava.api.model.Driver;
  
  import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
  io.cucumber.java.en.When; import io.github.bonigarcia.wdm.WebDriverManager;
  
  public class Lead extends BaseClass{ 
	  
  //public static ChromeDriver driver;
 
  @When("clicks the button") public void buttons() {
	  driver.findElement(By.name("submitButton")).click();
	  
 
  }
  
  }	/*
	 * * public static ChromeDriver driver; public void driver() {
	 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); }
	 * 
	 * 
	 * @When("click on create link") public void createLead() {
	 * driver.findElement(By.linkText("Create Lead")).click(); }
	 * 
	 * @Given("Enter companyname as {string} ") public void companyName(String svs)
	 * { driver.findElement(By.id("createLeadForm_companyName")).sendKeys(svs); }
	 * 
	 * @Given("Enter first name as {string}") public void firstName(String fname) {
	 * driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	 * 
	 * }
	 * 
	 * @Given("Enter last name as {string}") public void lastName(String ini) {
	 * driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ini); }
	 * 
	 * @Given("Enter number as {string}") public void number(String number) {
	 * driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(
	 * number); }
	 * 
	 * @When("clicks the button") public void button() {
	 * driver.findElement(By.name("submitButton")).click(); }
	 * 
	 * }
	 */
	