package MeeshoObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.MobileUtility;
import io.appium.java_client.android.AndroidDriver;

public class PaymentPage extends MobileUtility{
	
	public PaymentPage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='CONTINUE']") private WebElement BasketBtn;
	@FindBy(xpath = "//android.widget.Button[@text='Go to Cart']") private WebElement LoginBtn;
	@FindBy(xpath = "//android.widget.Button[@text='Continue']") private WebElement ContinueIcon;
	@FindBy(xpath = "//android.widget.Button[@text='Deliver to this Address']") private WebElement ChechOutbtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Cash on Delivery']") private WebElement ProccedToPayBtn;
	@FindBy(xpath = "//android.widget.Button[@text='Continue']") private WebElement CashOnDeliveryBtn;
	@FindBy(xpath = "//android.widget.Button[@text='Place Order']") private WebElement PlaceOrderBtn;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.meesho.supply:id/iv_icon']") private WebElement CrossBtn;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.meesho.supply:id/iv_icon']") private WebElement CloseBtn;
	
	
	//business logic
	
	public void paymentPage() {
		BasketBtn.click();
		LoginBtn.click();
		ContinueIcon.click();
		ChechOutbtn.click();
		ProccedToPayBtn.click();
	}
	
	public void cashOnDelivery(AndroidDriver driver) {
		scrolltoElement(driver, "text", "Cash on Delivery");
		CashOnDeliveryBtn.click();
	}
	
	public void placeOrder(AndroidDriver driver) {
		scrolltoElement(driver, "text", "Place Order");
		PlaceOrderBtn.click();
		CrossBtn.click();
		CloseBtn.click();
	}

}
