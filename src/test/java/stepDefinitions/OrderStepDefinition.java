package stepDefinitions;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchResultPage;

public class OrderStepDefinition extends TestBase {
	
	HomePage homepage;
	SearchResultPage searchResultPage;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page()  {
	   initialize();
	   homepage = new HomePage();
	   Assert.assertEquals(homepage.getPageTitle(), "Your Store");
	}
	
//	@When("User Search an {String}")
//	public void user_search_an_item(String strItem) {
//	  homepage.searchProduct(strItem);
//	}
	
	@When("User Search {string} in Search Product")
	public void user_search_in_search_product(String searchItem) {
		homepage = new HomePage();
		homepage.searchProduct(searchItem);
		
	}
	
//	@Then("Should display search results")
//	public void should_display_search_results() {
//		
//	}
	
	@Then("Should display search results for {string}")
	public void should_display_search_results_for(String searchItem) {
		searchResultPage = new SearchResultPage();
		String searchHeader = searchResultPage.searchResultHeader(searchItem);
		Assert.assertEquals(searchHeader, "Search - "+searchItem);
	}

// Cucumber is not checking for keywords, Given , When and Then it only checks if Step Implementation is there or not	
//	@Given("Should display search results")
//	public void should_display_search_results() {
//	    
//	}
	
	@When("User add Item to Cart")
	public void user_add_item_to_cart() {
		searchResultPage.addItemToCart();
	}
	
	@Then("Item must be available in Cart")
	public void item_must_be_available_in_cart() {
	   
	}

}
