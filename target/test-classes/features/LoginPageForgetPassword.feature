#Author: chaitanya tawade(expleo pune).
#sign : 23/09/2023
#This feature file for forget password page .

Feature: Forget Password using Email
  Scenario Outline: Forget Password With Valid Email Verification
    Given user should be on " https://demowebshop.tricentis.com/login"
    When click forget password link
    When enter email address
       | email |
      | ff |
      | chaitanyatawade@gamil.com|
      | cta@gmail.com |
    And click Recover button
    Then Assert Message

 