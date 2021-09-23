package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ConfigReader;
import utils.Constants;

public class Base {

	static ThreadLocal<WebDriver> driverStorage = new ThreadLocal<>();

	public synchronized static WebDriver driverSetUp() {
		WebDriver driver = null;
		ConfigReader cr = new ConfigReader(Constants.CONFIG_FILE_PATH);

		switch (cr.getProperty("browser")) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
			driver = new ChromeDriver();
			driverStorage.set(driver);
			break;
		case "firefox":
		default:
			break;
		}

		return driverStorage.get();

	}

	public static void tearUp(WebDriver driver) {
		driver.quit();
	}
	
	public static void close(WebDriver driver) {
		driver.close();
	}

}
