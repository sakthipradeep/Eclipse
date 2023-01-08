/*
 * package steps;
 * 
 * import org.openqa.selenium.By; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.en.But; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class StepDefinitions extends BaseClass { public ChromeDriver driver;
 * 
 * @Given("open the chrome browser") public void openBrowser() {
 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
 * 
 * @Given("load application") public void loadApplicationUrl() {
 * driver.get("http://leaftaps.com/opentaps/"); }
 * 
 * @Given("Enter username as {string}") public void enterusername(String uname)
 * { driver.findElement(By.id("username")).sendKeys(uname); }
 * 
 * @Given("enter password as {string}") public void enterpassword(String pass) {
 * driver.findElement(By.id("password")).sendKeys(pass);
 * 
 * }
 * 
 * @When("click login button") public void clicklogin() {
 * driver.findElement(By.className("decorativeSubmit")).click();
 * 
 * }
 * 
 * @Then("homepageshould be displayed") public void verifyhomepage() {
 * driver.findElement(By.linkText("CRM/SFA")).click(); }}
 * 
 * @When("Click lead button") public void Clicklead() { driver. }
 * 
 * @Then("homepageshould be displayed") public void verifyhomepage() { boolean
 * display=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
 * 
 * if(display) { System.out.println("yes"); }else { System.out.println("no"); }
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * @But("error is dipalyed") private void checkCredentials() { // TODO
 * Auto-generated method stub System.out.println("error"); }
 * 
 */