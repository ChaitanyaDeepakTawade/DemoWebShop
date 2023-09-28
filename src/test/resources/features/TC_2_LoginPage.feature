#Author: chaitanya tawade(expleo pune).
#sign : 23/09/2023
#This feature file for validate login page with Positive & Negative Test Data.
@LoginPage
Feature: Login Page Validatiion With Positive Negative credential
  @TC_2.1_LoginPage
  @Positive
  Scenario Outline: login with valid credentials
    Given user should be on " https://demowebshop.tricentis.com/login"
    When enter 
       | email               | password   |
      | Exampale123456@gmail.com    | 123456 |
    And click Login button
    Then User should be logged in successfully
 
   

  @Negative
  Scenario Outline: login with invalid credentials
    Given user should be on "https://demowebshop.tricentis.com/login"
    When entern 
    | email               | password   |
       | 123@gmail.com    | a@20022 |
    And click Login button
    Then User should not be logged in successfully
      

 