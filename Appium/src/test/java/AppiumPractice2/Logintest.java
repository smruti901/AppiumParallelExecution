package AppiumPractice2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import PomClasses.LoginGenral;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Logintest {
	@Test
	public void login() throws MalformedURLException {
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc1.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc1.setCapability("appPackage","com.androidsample.generalstore");
		dc1.setCapability("appActivity",".SplashActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginGenral lp=new LoginGenral(driver);
		lp.login();
		//lp.login("keer");
	}

}
