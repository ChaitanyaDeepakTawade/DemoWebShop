#Author: Chaitanya Tawade (expleo pune)
#sign:23/09/2023
#This feature file for validate Register Page
Feature: Validate Registor Page

  @tag1
  Scenario: Validate Registor Page
    Given Open This URL "https://demowebshop.tricentis.com/register"
    When Fill out the registration form
    And Click Register button
    Then Validate whether user is registered successfully
