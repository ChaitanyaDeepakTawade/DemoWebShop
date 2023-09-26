Feature:  To verify the Search functionality 

Background:

   Given user should be on " https://demowebshop.tricentis.com/login"
    When enter
       | email               | password   |
      | Exampale123456@gmail.com    | 123456 |
    And click Login button

Scenario: Search using the right keyword 
Given User is on the Home Page
When User Enters the keyword 
Then user should be able to see products  

Scenario: Search using invalid Keyword
Given User is on the Home Page
When user Enters invalid Keyword
Then Products will not be displayed
