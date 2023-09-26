#Author: chaitanya tawade(expleo pune).
#sign : 24/09/2023
#This feature file for Sort the Product by price in asscending order and Display as a grid view in Category_BOOKS Page.

Feature: Category_BOOKS Page Sort the Product in asscending order and Display as a grid view.
Background:
   Given user should be on " https://demowebshop.tricentis.com/login"
    When enter 
       | email               | password   |
      | Exampale123456@gmail.com    | 123456 |
    And click Login button


Scenario: Sort the Product in asscending order and Display as in grid view.
Given User is Logged in
When select book option from nav bar
And select sort by Price Low to High
And select view as a list
Then verify displayed product is in sorted order or not
