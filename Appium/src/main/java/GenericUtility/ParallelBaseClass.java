package GenericUtility;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelBaseClass {

	protected AppiumDriver<MobileElement> driver;
	@Parameters({"device","apppackage","activity","version","appiumServer"})
	@BeforeClass
	public void launch(String device,String apppackage,String activity, String version, String appiumServer) throws MalformedURLException {
		System.out.println("****************************************");
		System.out.println("Setting up device and desired capabilities");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		cap.setCapability(MobileCapabilityType.UDID, device);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,apppackage);
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,activity);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.VERSION, version);
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url= new URL(appiumServer);
		driver= new AndroidDriver<>(url, cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown()
	{
		if(driver!=null) {
			System.out.println("**************************************");
			System.out.println("Destroying test environment");
			driver.quit();
		}
		
	}
	

	
}
