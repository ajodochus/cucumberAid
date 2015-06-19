package testDefinitionSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import org.openqa.selenium.remote.RemoteWebDriver;



public class LoginTests {
	
	RemoteWebDriver driver;
	LandingPage landingPage = new LandingPage(driver);
	
	@Given("^navigate to \"([^\"]*)\"$")
	public void go_to(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("goto");
		
		landingPage.navigate_to_LoginPage("Login");
	}

	@Given("^validate Page loaded \"([^\"]*)\"$")
	public void validate_Page_loaded(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("page loaded");
	}

	@When("^login as user \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_as_user_and_password(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("validate page loaded");
	}


	@Then("^validate message shown \"([^\"]*)\"$")
	public void validate_message_shown(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("validate message");
	}
}
