package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	//Modified by Dharmesh Jindal for the first time
	//New Change done
	
	@FindBy(name="search")
	WebElement searchBox;
	
	//Page Factory
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Registration
	
	//Login
	
	//Actions
	
	//select Category
	
	//searchProduct
	public void searchProduct(String productName) {
		searchBox.sendKeys(productName);
		searchBox.submit();
	}

	public String getPageTitle() {
		// TODO Auto-generated method stub
		
		return driver.getTitle();
	}
	
	//compare products
	//view wishlist
	//navigate to cart
	

}
