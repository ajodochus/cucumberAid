package testDefinitionSteps;

import java.net.URL;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;



public class LoginTests {

	
	//LandingPage landingPage = new LandingPage(driver);
	RemoteWebDriver driver = Util.getDriver();
	
	LandingPage landingPage;
	

	
	@Given("^Landing Page is loaded$")
	public void Landing_Page_is_loaded() throws Throwable {
		LandingPage.landingPage_load(driver);
		landingPage = new LandingPage(driver);
	}

	@Then("^Link exists \"([^\"]*)\"$")
	public void Link_exists(String arg1) throws Throwable {
	    WebElement link_Home = landingPage.link_MainMenu_Home();
	    WebElement link_Login = landingPage.link_MainMenu_Login();
	    link_Login.click();
	}


}
