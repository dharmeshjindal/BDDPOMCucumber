package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class SearchResultPage extends TestBase{

	@FindBy(xpath="(//div[@class='product-thumb'])[1]")
	WebElement item;
	
	@FindBy(xpath = "(//button[@title='Add to Cart'])[1]")
	WebElement addToCartBtn;
	
	@FindBy(css = "h1.h4")
	WebElement header;
	
	public  SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String searchResultHeader(String searchItem) {
		return header.getText();
	}
	
	//Action
	public void addItemToCart() {
		Actions actions = new Actions(driver);
		actions.moveToElement(item).click(addToCartBtn).perform();
	}
	
	
}
