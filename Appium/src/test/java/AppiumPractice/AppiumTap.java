package AppiumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GenericUtility.ParallelBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTap extends ParallelBaseClass {
	
	@Test
	public void ApiDemos() throws MalformedURLException {
		
		driver.findElementByAccessibilityId("Views").click();
		WebElement control = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]"));
		driver.tap(1, control, 500);
		WebElement theme = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]"));
		driver.tap(1, theme, 500);
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")).sendKeys("hi");
		
		WebElement checkbox1 = driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]"));
		driver.tap(1, checkbox1, 500);
		WebElement checkbox2 = driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 2\"]"));
		driver.tap(1, checkbox2, 500);
		WebElement radiobutton = driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"RadioButton 1\"]"));
		driver.tap(1, radiobutton, 500);
		WebElement star = driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Star\"]"));
		driver.tap(1,star, 500);
		WebElement toggle1 = driver.findElement(By.id("io.appium.android.apis:id/toggle1"));
		driver.tap(1,toggle1, 500);
		WebElement toggle2 = driver.findElement(By.id("io.appium.android.apis:id/toggle2"));
		driver.tap(1,toggle2, 500);
		driver.hideKeyboard();
		WebElement dropdown = driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		driver.tap(1,dropdown, 500);
		WebElement planet = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Jupiter']"));
		driver.tap(1,planet, 500);
		WebElement dropdown1 = driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		driver.tap(1,dropdown1, 500);
		List<MobileElement> list = driver.findElements(By.className("android.widget.CheckedTextView"));
		Iterator<MobileElement> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}

}
}
