package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDropApk {


	@Test
	public void DragAndDrop() throws MalformedURLException {
		DesiredCapabilities dc1= new DesiredCapabilities();
		dc1.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc1.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc1.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc1.setCapability("appPackage","dragdrop.stufflex.com.dragdrop");
		dc1.setCapability("appActivity",".splash");
		dc1.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url=new URL("http://localhost:4724/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/btn_football")).click();
		WebElement src = driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/chooseA"));
		WebElement trg = driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/answer"));
		TouchAction ta= new TouchAction(driver);
		ta.longPress(src).waitAction().moveTo(trg).release().perform();
		driver.navigate().back();
		Alert alt= driver.switchTo().alert();
		alt.accept();
		driver.closeApp();
		
		
		
}
}
