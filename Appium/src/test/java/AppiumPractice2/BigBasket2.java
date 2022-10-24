package AppiumPractice2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BigBasketObjectRepository.CancelOrderPage;
import BigBasketObjectRepository.OrderPage;
import BigBasketObjectRepository.PaymentPage;
import GenericUtility.MobileBigBasketBaseClass;
@Listeners(GenericUtility.MobileListenersImplementation.class)
public class BigBasket2 extends MobileBigBasketBaseClass {

	@Test
	public void bigBasket() throws InterruptedException, IOException {
		OrderPage orderPage= new OrderPage(driver);
		PaymentPage paymentPage= new PaymentPage(driver);
		CancelOrderPage cancelOrderPage= new CancelOrderPage(driver);
		orderPage.orderpage();
		paymentPage.paymentPage();
		
		paymentPage.cashOnDelivery(driver);
		paymentPage.placeOrder(driver);
		cancelOrderPage.cancelOrder();
		
		WebDriver driver= new ChromeDriver();
		driver.close();
		driver.getCurrentUrl();
		
		
		
		
		
		
}
	
}
