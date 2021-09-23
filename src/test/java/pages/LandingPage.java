package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//section[@id='header-top__cta']//li[2]")
	public WebElement signIn;

	@FindBy(xpath = "//a[@data-location='VA']")
	public WebElement virginia;

	@FindBy(xpath = "//a[@data-location='NC']")
	public WebElement northCarolina;

}
