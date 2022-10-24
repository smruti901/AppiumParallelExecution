package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GenericUtility.ParallelBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumClick extends ParallelBaseClass{
	@Test
	public void ApiDemos() throws MalformedURLException {
		
		driver.findElementByAccessibilityId("Views").click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")).sendKeys("hi");
		
		driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]")).click();
		driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 2\"]")).click();
		driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"RadioButton 1\"]")).click();
		driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Star\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
		driver.hideKeyboard();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Jupiter']")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		List<MobileElement> list = driver.findElements(By.className("android.widget.CheckedTextView"));
		Iterator<MobileElement> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
//		List<LogEntry> logEntries = driver.manage().logs().get("logcat").getAll();
//		for (LogEntry logEntry : logEntries) {
//		        System.out.println(logEntry);
//		        
//		}
		
		
		
		
	}

}
