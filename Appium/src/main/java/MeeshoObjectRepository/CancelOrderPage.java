package MeeshoObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CancelOrderPage {
	
	public CancelOrderPage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.Button[@text='Continue Shopping']") private WebElement DrawerBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='My Orders']") private WebElement CustomerServiceBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Cancel Order']") private WebElement EnterCancel;
	@FindBy(xpath = "//android.widget.TextView[@text='Select reason for cancellation']") private WebElement CancelOrder;
	@FindBy(xpath = "//android.widget.RadioButton[@text='Need to change Size']") private WebElement EnterCancel2;
	@FindBy(xpath = "//android.widget.Button[@text='Cancel Product']") private WebElement AdditionalInformationRadioBtn;
	
	
	
	//business logics
	
	public void cancelOrder(AndroidDriver driver) throws InterruptedException {
		DrawerBtn.click();
		CustomerServiceBtn.click();
		Thread.sleep(2000);
		EnterCancel.click();
		//driver.tap(1, 747,1458, 500);
		CancelOrder.click();
		Thread.sleep(2000);
		EnterCancel2.click();
		AdditionalInformationRadioBtn.click();
		
	}
	

}
