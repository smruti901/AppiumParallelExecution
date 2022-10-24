package JAVAprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//String wb = driver.findElement(By.xpath("//div[@class=\"orangehrm-container\"]")).getText();
	//	System.out.println(wb);
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']/following-sibling::div/div"));
for(int i=1;i<=10;i++)
{
	System.out.println(lists.get(i).getText());
}
	}

}
