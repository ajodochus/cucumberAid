package pageObjects;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.net.MalformedURLException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.net.HostAndPort;

import testDefinitionSteps.Util;

public class LandingPage extends AbstractPage {
	
	static String host = "http://" + Util.getUrlLocalhost() + "/joomla";

	public LandingPage(RemoteWebDriver driver) {
		super(driver);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)  
		           .withTimeout(30, SECONDS)  
		           .pollingEvery(2, SECONDS);  
		  
		         wait.until(ExpectedConditions.titleIs("Home")); 
		         System.out.println("Landing page is loaded");
  
          
		
	}
	
	public static void landingPage_load(WebDriver driver) {
		driver.get(host);
	}
	




}
