package cucumber.stepdefinition;

import org.hamcrest.Matchers;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApiStepDefinition {
	Response response = null;
	RequestSpecification requestSpecification = null;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Start");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("End");
	}
	@Before
	public void beforeEach() {
	}
	@After
	public void afterEach() {
		response = null;
		requestSpecification = null;
	}

	@Given("Request base url is {string}")
	public void request_base_url_is(String baseUrl) {
		RestAssured.baseURI = baseUrl;
		requestSpecification = RestAssured.given();
	}
	@Given("Request body format is {string}")
	public void request_body_format_is(String requestFormat) {
		requestSpecification.contentType(requestFormat);
	}
	@Given("Request body is {string}")
	public void request_body_is(String body) {
		requestSpecification.body(body);

	}
	@When("the POST request is sent to path {string}")
	public void the_post_request_is_sent(String path) {
		response = requestSpecification.when().post(path);

	}
	@Then("Response status should be {int}")
	public void response_status_should_be(int responseStatus) {
		response.then().statusCode(responseStatus);
		System.out.println(response.getStatusCode() + response.getBody().asString());

	}
	
	@Then("Response body should have field {string} with length {int}")
	public void response_body_should_have_field_with_length(String field, int length) {
		response.then().body(field, Matchers.hasLength(length));
	}
	@Then("Response body should have null field {string}")
	public void response_body_should_have_null_field(String field) {
		response.then().body(field, Matchers.nullValue());
	}
	
	@Then("Response body should have field {string} with value {string}")
	public void response_body_should_have_field_with_value(String field, String value) {
		response.then().body(field, Matchers.equalTo(value));
	}

}
