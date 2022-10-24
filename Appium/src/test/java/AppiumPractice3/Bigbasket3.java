package AppiumPractice3;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
@Listeners(GenericUtility.MobileListenersImplementation.class)
public class Bigbasket3 {
	@Test
	public void meesho() throws InterruptedException, IOException {
		
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11 RP1A.200720.011");
		dc.setCapability(MobileCapabilityType.UDID,"fd09ceee0407");
		dc.setCapability("appPackage","com.bigbasket.mobileapp");
		dc.setCapability("appActivity",".activity.DeepLinkDispatcherActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Retry']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='bigbasket']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Explore Bangalore Store']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[5]")).click();
		
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]")).click();
		for(int i=1; i<=5; i++) {
			swip(driver);
		}
		
		
	}
//	public void scrolltoElement(AndroidDriver driver, String an, String av) {
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
//		
//	}        
         public void swip(AndroidDriver driver) throws InterruptedException {
     		List<MobileElement> list = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']"));
     		List<MobileElement> list2 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']"));
     		Iterator<MobileElement> itr = list.iterator();
     		 Iterator<MobileElement> itr2 = list2.iterator();
     		 while(itr.hasNext() && itr2.hasNext())
     	         {
     	        	 String str=(itr.next().getText() + " "+ itr2.next().getText());
     	        	 
     	        	 String[] s = str.split("₹");
     	        	 double price = Double.parseDouble(s[1]);
     	       
     	        	 for (String string : s) {
     	        		 if(price>=300) {
     	        		 System.out.println(string);
     	        		 }
     	        	 }
     	        		 
     	        		 
     	    }
     		 Thread.sleep(2000);
     		driver.swipe(553, 2005, 520, 519, 544);
     	
     	}
         


}




