Feature: Place Order Function

Scenario: Search Item
Given User is on Home Page
When User Search "Apple" in Search Product
Then Should display search results for "Apple"

Scenario: Add Item to Cart
#Given Should display search results
Given Should display search results for "Apple"
When User add Item to Cart
Then Item must be available in Cart 