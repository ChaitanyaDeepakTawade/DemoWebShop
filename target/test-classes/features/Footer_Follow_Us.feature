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
		
  
  @Footer_Follow_Us_Facebook

  Scenario: Open Facebook page

    Given Scroll Down to footer

    When click Facebook link

    Then validate Facebook Page is Open or not

 

  @Footer_Follow_Us_Twitter

  Scenario: Open Twitter page

    Given Scroll Down to footer

    When click Twitter link

    Then validate Twitter Page is Open or not

  

  
    