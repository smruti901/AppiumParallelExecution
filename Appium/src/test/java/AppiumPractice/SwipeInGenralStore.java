package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeInGenralStore {
	
	@Test
	public void GeneralStore() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1");
		dc1.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc1.setCapability("appPackage","com.androidsample.generalstore");
		dc1.setCapability("appActivity",".SplashActivity");
		dc1.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Smruti");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//driver.swipe(546, 1772,479,534,500);
		TouchAction ta= new TouchAction(driver);
		Thread.sleep(2000);
		ta.longPress(476, 1776).moveTo(518, 1092).release().perform();

}
}
