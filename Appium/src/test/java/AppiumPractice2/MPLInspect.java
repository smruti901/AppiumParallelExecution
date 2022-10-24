package AppiumPractice2;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MPLInspect {

	@Test
	public void mpl() throws InterruptedException, IOException {
		
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc.setCapability("appPackage","com.mpl.androidapp");
		dc.setCapability("appActivity",".MPLSplashActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='English']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Set Language to English']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Mobile Number']")).sendKeys("8328988852");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Get OTP and Login']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[929,298][1039,408]']")).click();
		
		
		
		
}
}
