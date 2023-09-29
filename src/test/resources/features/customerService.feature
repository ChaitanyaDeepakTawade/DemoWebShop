# Author: Aditya Ghorpade (Expleo Pune).
# Sign: 24/09/2023
# This feature file is for verifying footer information links.
@TC_CUSTOMER_SERVICE_10
Feature: Customer Service Features

  Background:

   Given user should be on " https://demowebshop.tricentis.com/login"
    When enter
       | email               | password   |
      | Exampale123456@gmail.com    | 123456 |
    And click Login button
    
	@Search
  Scenario: Search a Product
    Given Scroll Down to footer
    When I click on Search
    And I enter Handycam as the keywords of the product to be searched
    And I click Search
    Then I verify the relevant product Handycam is displayed in the search results

  @News
  Scenario: News of Store
    Given Scroll Down to footer     
    When I have navigated to the news page or section
    And I click on News
    Then I should be able to view and read the news related to the store on the news page

  @Blog
  Scenario: Blog
    Given Scroll Down to footer   
    When I have navigated to the blog page or section
    And I click on Blog
    Then I should be able to view and read the blog posts related to the store on the blog page

  @RecentlyViewed
  Scenario: Recently Viewed Products
    Given Scroll Down to footer
    When I have recently viewed some products on the website
    And I click on Recently Viewed Products
    Then I should see the list of recently viewed products on the webpage

  @CompareProducts
  Scenario: Compare Products List
    Given Scroll Down to footer
    When I already have added products to the compare list on the website
    And I click on Compare Products List
    Then I should see the list of products added for comparison on the webpage

  @NewProducts
  Scenario: New Products
    Given Scroll Down to footer
    When I am on the webpage
    And I click on New Products
    Then I should see the latest products added to the website in the New Products section
