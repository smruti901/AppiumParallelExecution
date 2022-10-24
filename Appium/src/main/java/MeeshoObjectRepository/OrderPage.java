package MeeshoObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.MobileUtility;
import io.appium.java_client.android.AndroidDriver;

public class OrderPage {
	public OrderPage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.ImageView[@bounds='[567,519][1014,695]']") private WebElement TryAgain;
	@FindBy(xpath = "//android.widget.ImageView[@bounds='[53,1046][363,1356]']") private WebElement OkBtn;
	@FindBy(xpath = "//android.widget.ImageView[@bounds='[22,346][518,842]']") private WebElement bigBasketIcon;
	@FindBy(xpath = "//android.widget.TextView[@text='New Arrival']") private WebElement BangaloreStore;
	@FindBy(xpath = "//android.widget.TextView[@text='Stylish Fashionable Men Tshirts']") private WebElement ScrollAction;
	@FindBy(xpath = "//android.widget.TextView[@text='Stylish Fashionable Men Tshirts']") private WebElement ShopByCategory;
	//@FindBy(xpath = "//android.widget.ImageView[@bounds='[3,695][537,1229]']") private WebElement ShopByCategory1;
	@FindBy(xpath = "//android.widget.Button[@text='Add to Cart']") private WebElement ShopByCategory2;
	@FindBy(xpath = "//android.widget.CompoundButton[@text='L']") private WebElement ShopByCategory3;
	@FindBy(xpath = "//android.widget.Button[@text='Add to Cart']") private WebElement AddBtn;
	
	//business logics
	public void orderpage() throws InterruptedException {
		TryAgain.click();
		OkBtn.click();
		bigBasketIcon.click();
		BangaloreStore.click();
		
	}
	
	public void addToCart(MobileUtility mobileUtility, AndroidDriver driver) {
		//mobileUtility.explicitWait(ShopByCategory);
		mobileUtility.scrolltoElement(driver,"text","Stylish Fashionable Men Tshirts" );
		ShopByCategory.click();
		
		ShopByCategory2.click();
		
		ShopByCategory3.click();
		
		AddBtn.click();
	}


}
