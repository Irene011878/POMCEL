package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrderPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public PlaceOrderPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,30);
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	public WebElement placeOrderBtn;
	
	@FindBy(id = "name")
	public WebElement nameInput;
	
	@FindBy(id = "card")
	public WebElement CreditCardInput;
	
	@FindBy(xpath = "//button[contains(text(),'Purchase')]")
	public WebElement purchaseBtn;
	
	//click in Place Order
	public void placeOrderClick() {
		wait.until(ExpectedConditions.visibilityOf(placeOrderBtn));
		placeOrderBtn.click();
	}
	//Input a name in the order
	public void setName(String name) {
		wait.until(ExpectedConditions.visibilityOf(nameInput));
		nameInput.sendKeys(name);
	}
	//Input Credit card in the order
	public void setCreditCard(String creditCard) {
		wait.until(ExpectedConditions.visibilityOf(CreditCardInput));
		CreditCardInput.sendKeys(creditCard);
	}
//click on purchase btn
	public void clickPurchaseBtn() {
		wait.until(ExpectedConditions.visibilityOf(purchaseBtn));
		purchaseBtn.click();
	}
}
