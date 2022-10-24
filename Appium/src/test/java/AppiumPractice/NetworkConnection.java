package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class NetworkConnection {
	@Test
	public void connection() throws MalformedURLException {
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc1.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc1.setCapability("appPackage","io.appium.android.apis");
		dc1.setCapability("appActivity",".ApiDemos");
		dc1.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url=new URL("http://localhost:4724/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Connection connect= driver.getConnection();
		System.out.println(connect);
		driver.setConnection(connect.AIRPLANE);
		//driver.setConnection(connect.WIFI);
		//driver.setConnection(
	}

}
