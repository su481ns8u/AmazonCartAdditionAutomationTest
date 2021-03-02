package AmazonTest.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	public static WebDriver getDriver(String browser) {
		WebDriver driver = null;

		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			Duration timeDuration = Duration.ofSeconds(100);
			driver.manage().timeouts().implicitlyWait(timeDuration);

		}
		return driver;
	}
}
