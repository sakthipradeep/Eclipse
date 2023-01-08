package steps;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Objects.ShoppingObjects;
import constants.CommonConstants;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utills.CommonUtills;

public class Signin {

	@Given("Browser should be installed and Driver must configured")
	public void browser_should_be_installed_and_driver_must_configured() {

	  	DriverManager.getDriver().get(CommonConstants.url);

	}
	@When("open url")
	public void open_url() {

	}

	@When("enter product")
	public void enter_product() {
		ShoppingObjects.searchbar.sendKeys(CommonConstants.product1);


	}
	@When("tabsearchbar") 
	public void tabsearchbar() {
		ShoppingObjects.maginfier.click();
	}

	@When("Selectproduct")
	public void Selectproduct() {
		ShoppingObjects.selectproductone.click();
	}


	@When("select color size")
	public void select_color_size() {
	//	DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     ShoppingObjects.sizeone.click();

		ShoppingObjects.colorone.click();
	}
	@When("add to cart")
	public void add_to_cart() {
		ShoppingObjects.addtocart.click();

	}

	@When("checkcarttotal")
	public void checkcarttotal() {
		//DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(07));
		ShoppingObjects.checkcarttotal.click();
		System.out.println("checkcarttoatakl");
	}

	@When("edit")
	public void edit() {

		//	DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(07));

		ShoppingObjects.edit.click();
		System.out.println("edit quantity");
	}


	@When("Update quantity")
	public void update_quantity() {
		ShoppingObjects.adquantity.clear();
		ShoppingObjects.adquantity.sendKeys(CommonConstants.quantity2);
		ShoppingObjects.updatecart.click();
		System.out.println("update Cart");

	}
	@When("enter product2")
	public void enter_product2() {
	//	DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(04));

		ShoppingObjects.searchbar.sendKeys(CommonConstants.product2);	
		ShoppingObjects.maginfier.click();
		ShoppingObjects.selectproductone.click();
		ShoppingObjects.sizeTwo.click();
		ShoppingObjects.colorTwo.click();
		ShoppingObjects.addtocart.click();
		System.out.println("product two added sucessfully");

	}
	@When("enter product3")
	public void enter_product3() {
		 //DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(07));
	ShoppingObjects.searchbar.sendKeys(CommonConstants.product3);
	ShoppingObjects.maginfier.click();
	ShoppingObjects.selectproductTwo.click();
	ShoppingObjects.addtocart.click();
	System.out.println("product three added successfully");
	ShoppingObjects.checkcarttotal.click();
	String total = ShoppingObjects.Checkcart.getText();
	System.out.println(total);
	ShoppingObjects.checkout.click();
	DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	ShoppingObjects.email.sendKeys(CommonConstants.email);
	ShoppingObjects.fname.sendKeys(CommonConstants.firstname);
	ShoppingObjects.lname.sendKeys(CommonConstants.lastname);
	ShoppingObjects.street0.sendKeys(CommonConstants.address1);
	ShoppingObjects.street1.sendKeys(CommonConstants.address2);
	ShoppingObjects.city.sendKeys(CommonConstants.city);
	
	Select ss=new Select(ShoppingObjects.country);
	ss.selectByValue("united kingdom");
	
	ShoppingObjects.phonenumber.sendKeys(CommonConstants.phonenumber);
	ShoppingObjects.postalcode.sendKeys(CommonConstants.postalcode);
	ShoppingObjects.radio.click();
	ShoppingObjects.button.click();
	 
	}
	@When("Fillingcredentials")
	public void fillingcredentials() {
		//DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ShoppingObjects.email.sendKeys(CommonConstants.email);
		ShoppingObjects.fname.sendKeys(CommonConstants.firstname);
		ShoppingObjects.lname.sendKeys(CommonConstants.lastname);
		ShoppingObjects.street0.sendKeys(CommonConstants.address1);
		ShoppingObjects.street1.sendKeys(CommonConstants.address2);
		ShoppingObjects.city.sendKeys(CommonConstants.city);
	}
		@When("checkcart")
		public void checkcart() {
		
	}

}
