package AppiumPractice2;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZoomInZoomOut {
	
	@Test
	public void zoomfunction() throws InterruptedException, IOException {
		
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
//		dc.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity",".MainActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Basic features']")).click();
		//driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView")).click();
		
		WebElement ss = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		driver.zoom(ss);
		
		Thread.sleep(3000);
		
		driver.pinch(ss);
		Thread.sleep(3000);

}
}
