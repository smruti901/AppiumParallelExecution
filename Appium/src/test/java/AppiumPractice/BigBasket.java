package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigBasket {
	
	@Test
	public void bigBasket() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity", ".activity.DeepLinkDispatcherActivity");
		dc.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Retry").click();
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='bigbasket']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Explore Bangalore Store']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]")).click();
		Thread.sleep(3000);
//		List<WebElement> list = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']")));
//		List<WebElement> list2 = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']")));
//		Iterator<WebElement> itr = list.iterator();
//		Iterator<WebElement> itr2 = list2.iterator();
//		while(itr.hasNext() && itr2.hasNext()) {
//			System.out.println(itr.next().getText()+ itr2.next().getText());
//		}
		
		
		
		
		
	}

}
