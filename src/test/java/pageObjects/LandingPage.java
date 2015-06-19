package pageObjects;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LandingPage extends AbstractPage {

	public LandingPage(RemoteWebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public LoginPage navigate_to_LoginPage(String link) {
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		return new LoginPage(driver);
	}



}
