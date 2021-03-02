package AmazonTest.StepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import AmazonTest.PageObjects.HomePage;
import AmazonTest.PageObjects.SearchedObjectPage;
import AmazonTest.PageObjects.SelectedProductPage;
import AmazonTest.Utility.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver = BrowserFactory.getDriver("Chrome");
	HomePage homePage = new HomePage(driver);
	SearchedObjectPage searchedObjectPage = new SearchedObjectPage(driver); 
	SelectedProductPage selectedProductPage = new SelectedProductPage(driver);
	
	@Before
	public void openMainPage() {
		homePage.openHomePage();
	}
	
	@When("^I enter (.*?) in search box$")
	public void enterProduct(String product) {
		homePage.enterSearchItem(product);
	}
	
	@When("^I click on submit$")
	public void clickSubmit() {
		homePage.clickSearch();
		System.out.println("Search Success!!");
	}
	
	@Then("^Page showing product type (.*?) is opened$")
	public void validatePage(String product) {
		Assert.assertTrue(searchedObjectPage.validatePage(product));
	}
	
	@When("^I click first product in list$")
	public void selectFirstItem() {
		searchedObjectPage.clickProduct();
	}
	
	@When("^I click add to cart$")
	public void addToCart() {
		selectedProductPage.clickAddToCart();
	}
	
	@Then("^Product should get added to cart$")
	public void validateProductIsAdded() {
		Assert.assertTrue(selectedProductPage.validateAddedToCart());
	}
	
	@After
	public void afterStep() {
		driver.quit();
	}
}
