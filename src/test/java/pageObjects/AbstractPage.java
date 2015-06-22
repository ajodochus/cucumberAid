package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;




public class AbstractPage {

	protected RemoteWebDriver driver;
	
	public AbstractPage (RemoteWebDriver driver){
		this.driver = driver;
		

//TODO New url benötigt throws malexcpetion
		
	}
	
	
	public WebElement link_MainMenu_Home(){
		WebElement link_Home = null;
		link_Home = driver.findElement(By.xpath("//ul[@class='nav menu']/li/a[contains(text(), 'Home')]"));
		return link_Home;
	}
	
	public WebElement link_MainMenu_Login(){
		WebElement link = null;
		link = driver.findElement(By.xpath("//ul[@class='nav menu']/li/a[contains(text(), 'Login')]"));
		return link;
	}
	

}
