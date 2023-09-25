#Author: chaitanya tawade(expleo pune).
#sign : 24/09/2023
#This feature file for Sort the Product by price in asscending order and Display as a grid view in Category_BOOKS Page.

Feature: Category_BOOKS Page Sort the Product in asscending order and Display as a grid view.

Scenario: Sort the Product in asscending order and Display as in grid view.
Given open link " https://demowebshop.tricentis.com/"
When select book option from nav bar
And select sort by Price Low to High
And select view grid
Then verify displayed product is in sorted order or not
