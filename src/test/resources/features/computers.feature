Feature: Computers and Accessories

  Background:
   Given user should be on " https://demowebshop.tricentis.com/login"
    When enter
       | email               | password   |
      | Exampale123456@gmail.com    | 123456 |
    And click Login button

  @TC_Category_Computers_5.1
  Scenario: Sort Desktop Products by Price Low to High
    When I select COMPUTERS > Desktop > Sort by > Price: Low to High
    Then I verify products are displayed in ascending price order
    And I compare prices of at least two products

  @TC_Category_Computers_5.2
  Scenario: Display Four Accessories Products and Verify
    When I select COMPUTERS > Accessories > Display > "4"
    Then I verify the number of products is four
    And products are displayed as expected

  @TC_Category_Computers_5.3
  Scenario: Display Twelve Accessories Products and Verify
    When I select COMPUTERS > Accessories > Display > "12"
    Then I verify the number of products is not twelve
    And the system should display twelve accessories products
