package tests;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Base;
import utils.ConfigReader;
import utils.Constants;

public class PracticeTest {

	WebDriver driver;
	
	//Making changes for kerim branch
	//Making changes for kerim branch


	@Test
	public void m1() {
		driver = Base.driverSetUp();
		driver.get("https://www.google.com/");
		driver.get("https://www.cnn.com/");
		Base.close(driver);

	}
	
	@Test
	public void m2() {
		driver.get("https://www.etsy.com/");
		Base.tearUp(driver);

	}
	
	@Test
	public void m3() {
		driver.get("https://www.udemy.com/");
		Base.close(driver);

	}

}
