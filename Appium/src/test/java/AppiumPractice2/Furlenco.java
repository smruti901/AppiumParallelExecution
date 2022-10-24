package AppiumPractice2;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

import GenericUtility.MobileUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Furlenco extends MobileUtility {
	
	@Test
	public void furlenco() throws InterruptedException, IOException {
		
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc.setCapability("appPackage","com.furlenco.android");
		dc.setCapability("appActivity",".ui.activity.SplashActivity");
		URL url=new URL("http://localhost:4724/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bengaluru']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.furlenco.android:id/iv_buy_furniture']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sofa']")).click();
		scrolltoElement(driver, "text","[Brand New] Flex Leatherette 2-Seater Sofa - Tan Brown");
		String actual=driver.findElement(By.xpath("//android.view.View[@text='₹ 11,998']")).getText();
		driver.findElement(By.xpath("//android.widget.TextView[@text='[Brand New] Flex Leatherette 2-Seater Sofa - Tan Brown']")).click();
		Thread.sleep(10000);
		scrolltoElement(driver,"text","WE ACCEPT");
		driver.tap(1, 946, 2140, 500);
//		driver.swipe(916, 1788, 953, 1159, 500);
//		String expected = driver.findElement(By.xpath("//android.view.View[@text='₹ 11,998 ']")).getText();
//		assertEquals(actual, expected, "Not equal");
		
		

}
}
