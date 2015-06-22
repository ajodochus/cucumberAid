package testDefinitionSteps;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;





public class Util {
	
	public static RemoteWebDriver getDriver() {
		
		RemoteWebDriver driver;
	     
		DesiredCapabilities capability = getDesiredCapabilities();
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			driver = null;
			e.printStackTrace();
		}	
		driver.manage().window().maximize();
		//driver.get(host);
		return driver;
		
	}

	public static DesiredCapabilities getDesiredCapabilities () {
		
		DesiredCapabilities capability = null;
		

			capability = DesiredCapabilities.firefox();
			capability.setJavascriptEnabled(true);
			capability.setBrowserName("firefox");
			capability.setVersion("FF_LocalHost_W7");//registered on GridHub
			capability.setPlatform(Platform.WINDOWS);	
	

		
		
		return capability;
		
	}
	
	
	public static String getUrlLocalhost(){
		String getOwnIp = null;
		try{
				  InetAddress ownIP=InetAddress.getLocalHost();
				  getOwnIp = ownIP.getHostAddress();
				  System.out.println("IP of my system is := "+ownIP.getHostAddress());
		}catch (Exception e){
				  System.out.println("Exception caught ="+e.getMessage());
				 
		}
		
		return getOwnIp;
	}
}
