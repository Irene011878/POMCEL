package steps;

import org.openqa.selenium.WebDriver;

import pages.MainPageStore;
import pages.PlaceOrderPage;
import pages.SelectedCel;

public class StoreSteps {
	
	WebDriver driver;
	MainPageStore mainPage;
	SelectedCel selectedCel;
	PlaceOrderPage placeOrder;
	
	public StoreSteps(WebDriver driver) {
		this.driver = driver;
		this.mainPage = new MainPageStore(driver);
		this.selectedCel = new SelectedCel(driver);
		this.placeOrder = new PlaceOrderPage(driver);
	}
	public void buySamsungGalaxyS6(String name, String creditCard) {
		mainPage.clickSamsumgLink();
		selectedCel.addToCarSamsung();
		selectedCel.goToCart();
		placeOrder.placeOrderClick();
		placeOrder.setName(name);
		placeOrder.setCreditCard(creditCard);
		placeOrder.clickPurchaseBtn();
		
	}

}
