#Author: devansh.mahindrakar@expleogroup.com
#sign : 25/09/2023
#Add to compare functionality for camera, photo section in electronics tab for demowebshop ecommerce website.

Feature: Add to compare functionality for camera, photo section in electronics tab for demowebshop ecommerce website.
  
  User want to be able to compare prices of cameras from the price comparison.

	Background:

   Given user should be on " https://demowebshop.tricentis.com/login"

    When enter

       | email               | password   |

      | Exampale123456@gmail.com    | 123456 |

    And click Login button
		
  
  Scenario: Navigate to camera, photo section in electronics tab.
    Given User is on demo web shop main page
    And user scrolls down on webpage to the bottom.
    When user clicks on Facebook under Follow Us.
    Then Verify whether Facebook web page is opened under new tab.
    
    