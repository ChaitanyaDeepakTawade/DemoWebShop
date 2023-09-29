Feature: Check for Shopping Cart 

Background:
  Given user should be on " https://demowebshop.tricentis.com/login"
    When enter 
       | email               | password   |
      | Exampale123456@gmail.com    | 123456 |
    And click Login button
    
Scenario: Add item to cart and place order
Given User is on home page
When User selects any item
And add to cart 
Then user clicks on shopping cart 
And Enters the details 
Then click on continue button 
And check out
Then Order placed Successfully 