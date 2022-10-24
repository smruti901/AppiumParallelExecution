package InstallLaunchAndUnInstallApiAppInRealDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApiDemosApp {
	@Test
	public void launchApp() throws MalformedURLException {
		
		//Install the ApiDemos Apk In RealDevice
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
		driver.installApp("C:\\Users\\DELL\\Downloads\\ApiDemos-debug.apk");
		
	}

}