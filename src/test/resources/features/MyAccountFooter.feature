Feature: To check various functionalities of footer MyAccount

Background:

   Given user should be on " https://demowebshop.tricentis.com/login"
    When enter
       | email               | password   |
      | Exampale123456@gmail.com    | 123456 |
    And click Login button
    
Scenario: user checks MyAccount footer functionality
When user goes to bottom
And clicks on option MyAccount
Then MyAccount details are displayed 
When Again user goes to bottom 
And clicks on option orders
Then Odrer details are displayed
When Again user goes to bottom 
And click on option Addresses
Then Address to be displayed 
When Again user goes to bottom 
And click on option shoppingCart
Then ShoppingCart orders are displayed 
When Again user goes to bottom 
And click on option wishlist
Then Wishlist items are displayed


  