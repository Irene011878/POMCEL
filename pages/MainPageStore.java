package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageStore {
WebDriver driver;
WebDriverWait wait;

public MainPageStore(WebDriver driver) {
	this.driver = driver;
	wait = new WebDriverWait(driver,30);
	PageFactory.initElements(driver, this);
}
@FindBy(linkText ="Samsung galaxy s6")  //una vez que encuentra el texto dar click
public WebElement samsungGalaxyLink;

public void clickSamsumgLink() {
	wait.until(ExpectedConditions.visibilityOf(samsungGalaxyLink));
	samsungGalaxyLink.click();
}
}
