package InstallLaunchAndUnInstallGeneralStApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallGeneralStore {
	@Test
	public void launchApp() throws MalformedURLException, InterruptedException {
		
		//Install the GeneralStore Apk In Emulator
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
		driver.installApp("C:\\Users\\DELL\\Downloads\\General-Store.apk");
		
		
		
	}


}
