package AppiumPractice3;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Meesho2  {
	
	
	@Test
	public void meesho() throws InterruptedException, IOException {
		
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc.setCapability("appPackage","com.meesho.supply");
		dc.setCapability("appActivity",".main.MainActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[567,519][1014,695]']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[53,1046][363,1356]']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[22,346][518,842]']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='New Arrival']")).click();
		for(int i=1; i<=5; i++) {
			swip(driver);
		}
		
		
			
		
	}
	public void scrolltoElement(AndroidDriver driver, String an, String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		
	}
	public void swip(AndroidDriver driver) {
		List<MobileElement> list = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.meesho.supply:id/catalog_name']"));
		Iterator<MobileElement> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		driver.swipe(508, 2075, 520, 390, 500);
	}

}
