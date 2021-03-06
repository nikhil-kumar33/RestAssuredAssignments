package restAssuredAssignments;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

public class Assignment6 {
	Response response1,response2;
	String url1,url2;
	 
	
	@Given("Assignment6_Specific Date exchange rates URI")
	public void assignment6_specific_Date_exchange_rates_URI() {
		 url1 = "https://api.ratesapi.io/api/2022-01-01"; 
		 url2 = "https://api.ratesapi.io/api/latest";
	}

	@When("Assignment6_the API is available with future date url")
	public void assignment6_the_API_is_available_with_future_date_url() {
	  response1= RestAssured.get(url1);
	  response2= RestAssured.get(url2);
	}

	@Then("Assignment6_assert the response for the prsence of current date")
	public void assignment6_assert_the_response_for_the_prsence_of_current_date() {
     JsonPath jsonPath1 = response1.jsonPath();
     JsonPath jsonPath2= response2.jsonPath();
     
    Assert.assertTrue(jsonPath1.get("date").equals(jsonPath2.get("date")));
   
	}
}
