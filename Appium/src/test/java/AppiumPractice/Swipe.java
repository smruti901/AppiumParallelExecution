package AppiumPractice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Swipe {
	@Test
	public void swipeAction() throws MalformedURLException {
//		AppiumDriverLocalService serice= AppiumDriverLocalService.buildDefaultService();
//		serice.start();
//		
//		AppiumDriverLocalService service= AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
//				.usingPort(4723).withLogFile(new File("./New/log.text")));
//		service.start();
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc1.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc1.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc1.setCapability("appActivity",".TouchScreenTestActivity");
		dc1.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.swipe(320, 433, 336, 1646, 500);
//		driver.swipe(44, 1177, 979, 1133, 500);
		Dimension value = driver.manage().window().getSize();
		int ht = value.getHeight();
		int wd=value.getWidth();
		
		
		//Vertical swipe
		driver.swipe(wd/2, (int)(ht*0.25), wd/2, (int)(ht*0.80), 1000);
		driver.swipe((int)(wd*0.1), (int)(ht*0.2), (int)(wd*0.1), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.5), (int)(ht*0.2), (int)(wd*0.5), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.9), (int)(ht*0.2), (int)(wd*0.9), (int)(ht*0.8), 500);
		
		//Horizontal swipe
		driver.swipe((int)(wd*0.25), ht/2, (int)(wd*0.80), ht/2, 1000);
		driver.swipe((int)(wd*0.1), (int)(ht*0.8), (int)(wd*0.9), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.1), (int)(ht*0.2), (int)(wd*0.9), (int)(ht*0.2), 500);
		driver.swipe((int)(wd*0.1), (int)(ht*0.5), (int)(wd*0.9), (int)(ht*0.5), 500);
		
		
		
		
		
	}
}
