#Author: Chaitanya Tawade (expleo pune)
#sign:23/09/2023
#This feature file for validate Register Page
Feature: Validate Registor Page

  @tag1
  Scenario: Validate Registor Page
    Given Open This URL "https://demowebshop.tricentis.com/register"
    When Fill out the registration form
     | gender               | fname   | lname | email | passowrd | confPassword |
       | M    | chaitanya | tawade | Exampale12345l.com | 123456 | 123456 |
       | M    | chaitanya | tawade | Exampale12345@gmail.com | 123456 | 123456 |
    And Click Register button
    Then Validate whether user is registered successfully
