package com.flipkartStepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class VerifyLoginPage {
	@Given("open Browser")
	public void open_browser() {
	    System.out.println("open Browser");
	}

	@When("Enter number as")
	public void enter_number_as() {
	    System.out.println("Enter number as");
	}

	@When("Enter password as")
	public void enter_password_as() {
	   System.out.println("Enter password as");
	}

	@When("click login button")
	public void click_login_button() {
	    System.out.println("click login button");
	}

}
