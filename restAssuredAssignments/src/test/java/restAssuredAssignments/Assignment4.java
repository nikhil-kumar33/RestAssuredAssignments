package restAssuredAssignments;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment4 {
	Response response;
	String url;
	@Given("Assignment4_Specific Date exchange rates URI")
	public void assignment4_specific_Date_exchange_rates_URI() {
	   url= "https://api.ratesapi.io/api/2010-01-12"; 
	}

	@When("Assignment4_the API is available")
	public void assignment4_the_API_is_available() {
       response= RestAssured.get(url);
	}

	@Then("Assignment4_assert the response status")
	public void assignment4_assert_the_response_status() {
	    Assert.assertTrue(response.getStatusCode()==200);
	}
}
