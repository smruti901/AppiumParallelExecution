package JAVAprograms;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class HealthAndGlow {
	@Test
	  public void brokenImages() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://healthandglow.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Search...\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"SEARCH\"]")).sendKeys("eyeliner");
		driver.findElement(By.xpath("//img[@src=\"https://ik.imagekit.io/hng/ic-search_3_x4XDEKX_.svg?updatedAt=1625739269912\"]")).click();
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//h1[@title=\"Eyeliner - Eyes Products\"]")).getText();
		String expected="Eyeliner";
		Assert.assertTrue(actual.contains(expected), "not same");
		driver.findElement(By.xpath("//h3[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='Lakme']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//p[@class=\"ellipsis product-card-title\"]"));
		for (int i = 0; i < 10; i++) {
			Thread.sleep(3000);
			System.out.println(list.get(i).getText());
			list.get(0).click();
			
		}
		
		String actualProductName = driver.findElement(By.xpath("//h1[@class=\"product-title\"]")).getText();
		driver.findElement(By.xpath("//div[@id=\"PDP-AddToBag\"]/button")).click();
		driver.findElement(By.xpath("//a[@class=\"cart-icon-container\"]/img[@class=\"svg-icon\"]")).click();
		String expectedProductName = driver.findElement(By.xpath("//p[@class=\"title\"]")).getText();
		Assert.assertEquals(actualProductName, expectedProductName, "Not valid product");
}
}
