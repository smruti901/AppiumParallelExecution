package BigBasketObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.MobileUtility;
import io.appium.java_client.android.AndroidDriver;

public class PaymentPage extends MobileUtility{
	
	public PaymentPage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='Basket']") private WebElement BasketBtn;
	@FindBy(xpath = "//android.widget.Button[@text='Login / Signup']") private WebElement LoginBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='CONTINUE']") private WebElement ContinueIcon;
	@FindBy(xpath = "//android.widget.Button[@text='Checkout']") private WebElement ChechOutbtn;
	@FindBy(xpath = "//android.widget.Button[@text='PROCEED TO PAY']") private WebElement ProccedToPayBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Cash on Delivery']") private WebElement CashOnDeliveryBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Place Order']") private WebElement PlaceOrderBtn;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.bigbasket.mobileapp:id/imgBtnClose']") private WebElement CrossBtn;
	@FindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.bigbasket.mobileapp:id/closeButtonView']") private WebElement CloseBtn;
	
	
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
