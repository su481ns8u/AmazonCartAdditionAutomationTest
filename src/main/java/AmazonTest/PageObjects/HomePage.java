package AmazonTest.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	private static WebElement searchBox;
	
	@FindBy(id = "nav-search-submit-button")
	private static WebElement submitSearch;
	
	public void openHomePage() {
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
	}
	
	public void enterSearchItem(String item) {
		searchBox.clear();
		searchBox.sendKeys(item);
	}
	
	public void clickSearch() {
		submitSearch.click();
	}
}
