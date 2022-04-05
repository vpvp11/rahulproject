package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	@Given("Add place payload")
	public void add_place_payload() {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("This is done");
	}

	@When("user calls {string} with post http request")
	public void user_calls_with_post_http_request(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is done");
	}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is done");
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is1(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is done");
	}

	@Then("{string}	in response body is {string}")
	public void in_response_body_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is done");
	}



	
}
