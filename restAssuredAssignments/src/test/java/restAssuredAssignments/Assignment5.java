package restAssuredAssignments;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Assignment5 {
	Response response;
	String url;
	@Given("Assignment5_Specific Date exchange rates URI")
	public void assignment5_specific_Date_exchange_rates_URI() {
		 url= "https://api.ratesapi.io/api/2010-01-12"; 
	}

	@When("Assignment5_the API is available")
	public void assignment5_the_API_is_available() {
		 response= RestAssured.get(url);
	}

	@Then("Assignment5_assert the response")
	public void assignment5_assert_the_response() {
	 Assert.assertFalse(response.getBody().asString().isEmpty());
	 JsonPath jsonPathEvaluator= response.jsonPath();
	 Assert.assertTrue(jsonPathEvaluator.get("rates.INR").toString().contains("66.21"));
	}

}
