package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import base.Base;

public class PrTest extends Base {

	ThreadLocal<WebDriver> driverStorage = new ThreadLocal<>();

	@BeforeSuite
	void setUp() {

	}

	synchronized WebDriver getDriver() {
		WebDriver driver = driverSetUp();
		driverStorage.set(driver);
		return driverStorage.get();
	}

}
