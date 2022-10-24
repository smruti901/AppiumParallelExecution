package AppiumPractice2;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class NotificationHandle {
	@Test
	public void launchApp() throws IOException {
		
		
		
		//Launch and close the ApiDemos Apk In RealDevice
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc1.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc1.setCapability("appPackage","io.appium.android.apis");
		dc1.setCapability("appActivity",".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc1);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.findElementByAccessibilityId("App").click();
		driver.findElementByAccessibilityId("Notification").click();
		driver.findElementByAccessibilityId("IncomingMessage").click();
		driver.findElementByAccessibilityId("Show App Notification").click();
		driver.openNotifications();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Joe']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./erroshots/notification.png");
		FileUtils.copyFile(src, trg);
		
		
		
		
	}
}
