package AppiumPractice2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InspectBrowser {
	
	@Test
	public void BrowserSiteInspect() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.meesho.com");
		driver.swipe(427, 1284, 600, 650, 500);
		
		
		
	}

}
