/*
 * package steps;
 * 
 * import org.openqa.selenium.By;
 * 
 * import io.cucumber.java.en.Then; import io.cucumber.java.en.When;
 * 
 * public class CreateLead extends BaseClass {
 * 
 * @When("Click on {string} link") public void hyperLink(String text) {
 * driver.findElement(By.linkText(text)).click(); }
 * 
 * @Then("{string} Page should be displayed") public void pageverify(String
 * page) { boolean
 * displayed=driver.findElement(By.xpath("//div[text()='"+page+"']")).
 * isDisplayed(); boolean dispalyed = false; if(dispalyed) {
 * System.out.println(page+"dispaly"); }else { System.out.println("no"); }
 * 
 * }
 * 
 * }
 */