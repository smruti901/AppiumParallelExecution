package InstallLaunchAndUnInstallTouchScreenApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchTouchScree {

	
	@Test
	public void launchApp() throws MalformedURLException {
				
		//Launch and close the TouchScreen Apk In Emulator
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1");
		dc1.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc1.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc1.setCapability("appActivity",".TouchScreenTestActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver1= new AndroidDriver(url, dc1);
		

		
	}
}
