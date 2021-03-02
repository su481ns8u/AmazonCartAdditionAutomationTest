package AmazonTest.PageObjects;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedProductPage {
	WebDriver driver;
	
	public SelectedProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
	WebElement addToCart;
	
	@FindBy(xpath = "//*[@id=\"huc-v2-order-row-confirm-text\"]/h1")
	WebElement addedConfirm;
	
	@FindBy(xpath = "//*[@id=\"btnVasModalSkip\"]/span/input")
	WebElement skipButton;
	
	public void clickAddToCart() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		addToCart.click();
		System.out.println(skipButton.isDisplayed());
		skipButton.click();
	}
	
	public Boolean validateAddedToCart() {
		if (addedConfirm.getText().equals("Added to Cart"))
			return true;
		return false;
	}
}
