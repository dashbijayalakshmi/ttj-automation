package cucumber.stepdefinition;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationBarStepDefinition {
	
	private WebDriver driver = null;

	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Start");
		System.setProperty("webdriver.edge.driver", "C:/Users/ruby/Downloads/edgedriver_win64/msedgedriver.exe");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("End");
	}
	@Before
	public void beforeEach() {
		driver = new EdgeDriver();
	}
	@After
	public void afterEach() {
		driver.quit();
	}
	
	@Given("Edge browser is launched")
	public void edge_browser_is_launched() {
		
	}
	@When("User go to url {string}")
	public void user_go_to_url(String url) {
		 driver.get(url); 
	   
	}
	@Then("Home link should display {string}")
	public void home_link_should_display(String expectedLinkText) {
	   WebElement link=driver.findElement(By.xpath("//*[@id='root']/div/nav/ul/li[1]/a"));
	   String actualLinkText= link.getText();
	   Assertions.assertEquals(expectedLinkText, actualLinkText);
	   
	}
	@Then("Services link should display {string}")
	public void servics_link_should_display(String expectedLinkText) {
	   WebElement link=driver.findElement(By.xpath("//*[@id='root']/div/nav/ul/li[2]/a"));
	   String actualLinkText= link.getText();
	   Assertions.assertEquals(expectedLinkText, actualLinkText);
	}
	@Then("Products link should display {string}")
	public void products_link_should_display(String expectedLinkText) {
	   WebElement link=driver.findElement(By.xpath("//*[@id='root']/div/nav/ul/li[3]/a"));
	   String actualLinkText= link.getText();
	   Assertions.assertEquals(expectedLinkText, actualLinkText);
	}
	
	@Then("About Us link should display {string}")
	public void about_us_link_should_display(String expectedLinkText) {
	   WebElement link=driver.findElement(By.xpath("//*[@id='root']/div/nav/ul/li[4]/a"));
	   String actualLinkText= link.getText();
	   Assertions.assertEquals(expectedLinkText, actualLinkText);
	}
	@Then("Login link should display {string}")
	public void login_link_should_display(String expectedLinkText) {
	   WebElement link=driver.findElement(By.xpath("//*[@id='root']/div/nav/a[2]/button"));
	   String actualLinkText= link.getText();
	   Assertions.assertEquals(expectedLinkText, actualLinkText);
	}
	
	

}
