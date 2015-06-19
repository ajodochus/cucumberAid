package pageObjects;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.jasper.tagplugins.jstl.core.Url;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;








public class AbstractPage {

	protected RemoteWebDriver driver;
	
	public AbstractPage (RemoteWebDriver driver){
		this.driver = driver;
		DesiredCapabilities capability;
	
		
		capability = DesiredCapabilities.firefox();
		capability.setJavascriptEnabled(true);
		capability.setBrowserName("firefox");
		capability.setVersion("FF_LocalHost_W7");
		capability.setPlatform(Platform.WINDOWS);

//TODO New url benötigt throws malexcpetion
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);	
		driver.get("http://localhost/joomla/index.php");
		driver.manage().window().maximize();
	}
	
	public LandingPage navigateToLandingPage() throws MalformedURLException {
		driver.navigate().to("http://localhost/joomla");
		return new LandingPage(driver);		
	}
}
