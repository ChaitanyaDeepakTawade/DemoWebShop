#Author: devansh.mahindrakar@expleogroup.com
#sign : 25/09/2023
#Add to compare functionality for camera, photo section in electronics tab for demowebshop ecommerce website.


Feature: Add, display & remove functionality for camera, photo section in electronics tab for demowebshop ecommerce website.
  
  User want to be able to compare prices of cameras and add or remove cameras from the price comparison.

	Background:

   Given user should be on " https://demowebshop.tricentis.com/login"

    When enter

       | email               | password   |

      | Exampale123456@gmail.com    | 123456 |

    And click Login button
		
  
  Scenario: Navigate to camera, photo section in electronics tab.
    Given User is on demo web shop main page
    When user clicks on electronics tab 
    And user clicks on camera, photo option.
    Then Verify User is on camera, photo section web page.
    And user clicks on first camera.
    And user clicks Add to compare list.
    And user clicks on Electronics option again.
    And user clicks on camera, photo option again.
    And user clicks on second camera.
    And user clicks Add to compare list for second camera.
    Then Verify comparison list is visible to the User.
    
    
