package JAVAprograms;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

public class AppiumPractice {

	final int x=5;
	int y=6;
	@Test
	public void UiAutomator() throws MalformedURLException {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability(MobileCapabilityType.APP, ".apk path");
		dc.setCapability(MobileCapabilityType.FULL_RESET, true);
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		dc.setCapability("appPackage", "package");
		dc.setCapability("appActivity", "activity");
		URL url= new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url, dc);
		driver.swipe(123,456, 234, 678, 500);
		
		
	}
	
	@Test
	public void comparison() {
		int expected = 2932;
		String actual = "2,392.00";
		String actual1 = actual.split(",")[0];
		String actual2 = actual.split(",")[1];
		String actual3 = actual2.split(".")[1];
		System.out.println(actual3);
		String actu = actual1+actual3;
		int actual4 = Integer.parseInt(actu);
		if(actual4==expected) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}

		
		
	}
	
	@Test
	public void arra() {
		System.out.println(x+y);
	}
}
