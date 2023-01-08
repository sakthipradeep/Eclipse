package steps;

import io.cucumber.java.en.Given;

public class RegularExpressio {

	@Given("i have (\\d+) laptop$")
	public void i_have_1_laptop(Integer int1) {
	   System.out.println("int is"+int1);
	}
	@Given("^i have a (\\d+\\.\\d+) cgpa$")
	public void i_have_a_cgpa(Double double1) {
	    System.out.println(double1);
	}
	@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String string, String string2,String string3) {
	    System.out.printf(string+string2+string3);
	}
	
}
/*
 * @Given("{string} is elder to {string} and {string}") public void
 * is_elder_to_and(String string, String string2, String string3) { // Write
 * code here that turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 */


