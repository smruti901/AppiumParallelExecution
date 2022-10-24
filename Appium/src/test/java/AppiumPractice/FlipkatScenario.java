package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FlipkatScenario {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
		dc1.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc1.setCapability("appPackage","com.flipkart.android");
		dc1.setCapability("appActivity",".SplashActivity");
		dc1.setCapability(MobileCapabilityType.NO_RESET, true);
		
		URL url=new URL("http://localhost:4724/wd/hub");

		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url, dc1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Search for products']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search for Products, Brands and More']")).sendKeys("winter heater");
		
		TouchAction tc= new TouchAction(driver);
		tc.tap(983, 2103).perform();
		String actualProduct = driver.findElement(By.xpath("//android.widget.TextView[@text='QAWACHH Winter Warmer Mini Wall 900 Watt Electric Heater for Home/Office (Black) Fan Room Heater']")).getText().trim();
		driver.findElement(By.xpath("//android.widget.TextView[@text='QAWACHH Winter Warmer Mini Wall 900 Watt Electric Heater for Home/Office (Black) Fan Room Heater']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add to cart']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Go to cart']")).click();
		String expectedProduct = driver.findElement(By.xpath("//android.widget.TextView[@text='QAWACHH Winter Warmer Mini Wall 900 Watt Electric Heater for Home/Office (Black) Fan Room Heater ']")).getText().trim();
		Assert.assertEquals(actualProduct, expectedProduct);
	}

}
