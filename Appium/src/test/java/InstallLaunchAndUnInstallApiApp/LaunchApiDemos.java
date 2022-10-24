package InstallLaunchAndUnInstallApiApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApiDemos {
	@Test
	public void launchApp() throws MalformedURLException {
		
		
		
		//Launch and close the ApiDemos Apk In Emulator
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc1.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		
		dc1.setCapability("appPackage","io.appium.android.apis");
		dc1.setCapability("appActivity",".ApiDemos");
		URL url=new URL("http://localhost:4724/wd/hub");
		AndroidDriver driver1= new AndroidDriver(url, dc1);
		
		
	}

}
