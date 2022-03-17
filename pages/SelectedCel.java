package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectedCel {
	WebDriver driver;
	WebDriverWait wait;
	
public SelectedCel(WebDriver driver) {
	this.driver = driver;
	wait = new WebDriverWait(driver,30);
	PageFactory.initElements(driver, this);
}
@FindBy(css = "a[class='btn btn-success btn-lg']")
public WebElement addToCarSamsung; 

//agrega al carrito
@FindBy(xpath ="//a[@id='cartur']")
public WebElement goToCart;

public void addToCarSamsung() {
	wait.until(ExpectedConditions.visibilityOf(addToCarSamsung));
	addToCarSamsung.click();
}
public void goToCart() {
	wait.until(ExpectedConditions.visibilityOf(goToCart));
	goToCart.click();
}
}
