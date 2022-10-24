package BigBasketObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class OrderPage {
	
	public OrderPage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc='Retry']") private WebElement TryAgain;
	@FindBy(xpath = "//android.widget.Button[@text='OK']") private WebElement OkBtn;
	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc='bigbasket']") private WebElement bigBasketIcon;
	@FindBy(xpath = "//android.widget.TextView[@text='Explore Bangalore Store']") private WebElement BangaloreStore;
	@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Product Image\"])[5]") private WebElement ShopByCategory;
	@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Product Image\"])[2]") private WebElement ShopByCategory2;
	@FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]") private WebElement ShopByCategory3;
	@FindBy(xpath = "//android.widget.TextView[@bounds='[763,976][1052,1072]']") private WebElement AddBtn;
	
	//business logics
	public void orderpage() throws InterruptedException {
		TryAgain.click();
		OkBtn.click();
		bigBasketIcon.click();
		BangaloreStore.click();
		Thread.sleep(2000);
		ShopByCategory.click();
		Thread.sleep(2000);
		ShopByCategory2.click();
		Thread.sleep(2000);
		ShopByCategory3.click();
		Thread.sleep(2000);
		AddBtn.click();
	}

}
