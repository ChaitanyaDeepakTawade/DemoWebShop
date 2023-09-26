@TC_Category_Apparels_&_Shoes_7.1
Feature: Send Product to Friend via Email

  Background:
    Given I am on the website "https://demowebshop.tricentis.com/"

  Scenario: Send Green and Blue Sneaker to Friend via Email
    When I select APPAREL & SHOES > Green and blue Sneaker > Email to Friend
    And I enter "swarali@gmail.com" as the friends email address
    And I enter "aditya@gmail.com" as your email address
    And I click Send email
    Then I verify the product is sent to swarali@gmail.com from aditya@gmail.com successfully
