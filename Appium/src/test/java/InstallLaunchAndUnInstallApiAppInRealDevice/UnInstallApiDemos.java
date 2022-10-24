package InstallLaunchAndUnInstallApiAppInRealDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class UnInstallApiDemos {
	@Test
	public void launchApp() throws MalformedURLException {
		
		
		
		//UnInstall the ApiDemos Apk In RealDevice
		DesiredCapabilities dc2= new DesiredCapabilities();
		dc2.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc2.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc2.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc2);
		driver.removeApp("io.appium.android.apis");
		
		
	}

}
