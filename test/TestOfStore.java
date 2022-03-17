package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MainPageStore;
import pages.PlaceOrderPage;
import pages.SelectedCel;
import steps.StoreSteps;


public class TestOfStore {
	public WebDriver driver;
	public MainPageStore mainPage;
	public StoreSteps storeSteps;
	
	public final String baseUrl="https://www.demoblaze.com/";
	public final String driverPath = "src/test/resources/chromedriver";
	public final String nameInput = "Irene Aguilar";
	public final String creditCard = "4152 1234 5678 8397";
	
	@BeforeMethod
	private void startDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		driver.get(baseUrl);
		storeSteps = new StoreSteps(driver);
		
	}
	@Test
	private void SamsumgGalaxys6Test() {
		storeSteps.buySamsungGalaxyS6(nameInput, creditCard);
			
	}
	
	@AfterMethod
	private void endTest() {
		driver.close();
		driver.quit();
	}
	
}
