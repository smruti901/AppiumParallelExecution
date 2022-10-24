package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebSwitchApp {

	@Test
	public void webSwitchApp() throws MalformedURLException {
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
		
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[540,1076][1002,1114]']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[540,1891][1002,1929]']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//		String rate = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
//		System.out.println(rate);
//		Assert.assertTrue(rate.contains("280"),"not validate");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
		Set<String> windows= driver.getContextHandles();
		for(String window:windows){
		System.out.println("Active windows"+window);
		driver.context("WEBVIEW_appPackage");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("TestYantra");
		}
		
	}
}
