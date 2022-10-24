package JAVAprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartSortPrice {
	@Test
	public void flipkartSortPrices() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphon 13",Keys.ENTER);
		LinkedList<String> list= new LinkedList<String>();
		//ArrayList<String> alist= new ArrayList<String>();
		List<WebElement> listPrice = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]/ancestor::div[@class=\"col col-7-12\"]/following-sibling::div/div[1]/div[1]/div"));
		Iterator<WebElement> itr = listPrice.iterator();
		while(itr.hasNext()) {
			String s = itr.next().getText().split("₹")[1];
			String s1 = s.split(",")[0];
			String s2 = s.split(",")[1];

			String s4 = s1+s2;
			//System.out.println(s4);
			list.add(s4);
			
			
		}
		Collections.sort(list);
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
	}

	

}
