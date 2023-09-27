#Author: chaitanya tawade(expleo pune).
#sign : 23/09/2023
#This feature file for forget password page .

Feature: Forget Password using Email
  Scenario Outline: Forget Password With Email 
    Given user should be on " https://demowebshop.tricentis.com/login"
    When click forget password link
    When enter email address
       | email |
      | chaitanyatawade|
      | chaitanya@gamil.com|
      | chaitanyatawade@gamil.com|
    And click Recover button
    Then Assert Message

 