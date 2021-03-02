package AmazonTest.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchedObjectPage {
	WebDriver driver;
	
	public SearchedObjectPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]")
	WebElement product;
	
	public Boolean validatePage(String product) {
		String pageTitle = driver.getTitle();
		if (pageTitle.contains(product))
			return true;
		return false;
	}
	
	public void clickProduct() {
		product.click();
	}
}
