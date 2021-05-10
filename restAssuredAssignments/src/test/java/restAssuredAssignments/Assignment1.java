package restAssuredAssignments;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment1 {
	Response response;
	String url;
	@Given("Assignment1_Latest Foreign exchange rates")
	public void assignment1_latest_Foreign_exchange_rates() {
	  url = "https://api.ratesapi.io/api/latest";  
	}

	@When("Assignment1_API is available")
	public void assignment1_api_is_available() {
	  response= RestAssured.get(url); 
	  
	}

	@Then("Assignment1_I validate the outcomes")
	public void assignment1_i_validate_the_outcomes() {
		Assert.assertFalse(response.getBody().asString().isEmpty());
	    Assert.assertTrue(response.getStatusCode()==200);
	}
}
