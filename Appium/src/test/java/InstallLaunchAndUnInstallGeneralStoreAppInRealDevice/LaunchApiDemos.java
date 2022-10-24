package InstallLaunchAndUnInstallGeneralStoreAppInRealDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApiDemos {
	@Test
	public void launchApp() throws MalformedURLException {
		
		
		
		//Launch and close GeneralStoreApk In Real Device
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc1.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc1.setCapability("appPackage","com.androidsample.generalstore");
		dc1.setCapability("appActivity",".SplashActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver1= new AndroidDriver(url, dc1);
		
		
	}

}
