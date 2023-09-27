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
    
 @Add_Gift_Card_To_Cart
  Scenario: Adding Gift Card to cart
    Given Scroll Down t
    When click Sitemap Link
    Then validate Sitemap Page is Open or not 


  @Footer_Information_Shipping&Returns
  Scenario: Shipping & Returns Page opening
    Given Scroll Down to footer
    When click Shipping & Returns Link
    Then validate Shipping & Returns Page is Open or not 
    
