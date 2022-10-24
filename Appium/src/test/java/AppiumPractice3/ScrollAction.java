package AppiumPractice3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollAction {

	@Test
	public  void Scroll() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity", ".activity.DeepLinkDispatcherActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("Retry").click();
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='bigbasket']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Explore Bangalore Store']")).click();
		scrolltoElement(driver);
		
	
	}
	
	
	public void scrolltoElement(AndroidDriver driver) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]\").instance(0))");
	}

}
