 package AppiumPractice2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import GenericUtility.MobileMeeshoBaseClass;
import MeeshoObjectRepository.CancelOrderPage;
import MeeshoObjectRepository.OrderPage;

public class Meesho extends MobileMeeshoBaseClass {
	
	
	@Test
	public void meesho() throws InterruptedException, IOException {
		OrderPage orderPage= new OrderPage(driver);
		MeeshoObjectRepository.PaymentPage paymentPage= new MeeshoObjectRepository.PaymentPage(driver);
		CancelOrderPage cancelOrderPage= new CancelOrderPage(driver);
		orderPage.orderpage();
			
		
		orderPage.addToCart(mobileUtility, driver);
		paymentPage.paymentPage();
		paymentPage.cashOnDelivery(driver);
		paymentPage.placeOrder(driver);
		
		cancelOrderPage.cancelOrder(driver);
		
			
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("./erroshots/messho3.png");
		FileUtils.copyFile(src, trg);
		
		
		
		
		
			
		
	}

}
