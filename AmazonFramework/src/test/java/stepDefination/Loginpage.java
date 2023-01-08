package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage
{
	@Given("Browser should be installed and Driver must configured")
	public void browser_should_be_installed_and_driver_must_configured() {
	  System.out.println("haiia");
	}
	@When("open url")
	public void open_url() {
	   System.out.println("hi");
	}
	
	@When("click signin")
	public void click_signin() {
		 System.out.println("hi");
	}
	@When("enter phonnumber")
	public void enter_phonnumber() {
		 System.out.println("hi");
	}
	@When("click continue buton")
	public void click_continue_buton() {
		 System.out.println("hi");
	}
	@When("Enter password")
	public void enter_password() {
		 System.out.println("hi");
	}
	@When("click login")
	public void click_login() {
		 System.out.println("hi");
	}
	@Then("hompage should be dipslaed.")
	public void hompage_should_be_dipslaed() {
		 System.out.println("hi");
	}

}
