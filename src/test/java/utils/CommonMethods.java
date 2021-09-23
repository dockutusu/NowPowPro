package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	private WebDriver driver;

	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}

	public void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

}
