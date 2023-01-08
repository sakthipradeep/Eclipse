package steps;

import io.cucumber.java.en.Given;

public class Parametrization {
	@Given("enter name as {string}")
	public void enter_name_as(String string) {
	   System.out.println(string);
	}
	@Given("enter initial {string}")
	public void enter_initial(String string) {
	   
	}
	@Given("enter phonenumber {string}")
	public void enter_phonenumber(String string) {
	    
	}



}
