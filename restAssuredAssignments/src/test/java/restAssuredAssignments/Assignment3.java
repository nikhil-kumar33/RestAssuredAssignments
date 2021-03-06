package restAssuredAssignments;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment3 {
	Response response;
	String url;
	@Given("Assignment3_Latest Foreign exchange rates")
	public void assignment3_latest_Foreign_exchange_rates() {
	  url = "https://api.ratesapi.io/api/";  
	}

	@When("Assignment3_Incorrect URL is provided")
	public void assignment3_incorrect_URL_is_provided() {
	  response = RestAssured.get(url); 
	}

	@Then("Assignment3_assert the response")
	public void assignment3_assert_the_response() {
	   System.out.println(response.getStatusCode()); 
	   Assert.assertTrue(response.getStatusCode()>=400);
	}
}
