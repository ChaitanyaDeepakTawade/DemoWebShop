#Author: chaitanya tawade(expleo pune).
#sign : 24/09/2023
#This feature file for Verifing footer informations links .
@Footer_Information_Module
Feature: Verifing footer informations links working or not

Background:
Given user should be on " https://demowebshop.tricentis.com/" 

  @Footer_Information_Module_Sitemap
  Scenario: Sitemap Page opening
    Given Scroll Down to footer
    When click Sitemap Link
    Then validate Sitemap Page is Open or not 

  @Footer_Information_Shipping&Returns
  Scenario: Shipping & Returns Page opening
    Given Scroll Down to footer
    When click Shipping & Returns Link
    Then validate Shipping & Returns Page is Open or not 
  
  @Footer_Information_PrivacyNotice
  Scenario: Privacy Notice Page opening
    Given Scroll Down to footer
    When click Privacy Notice Link
    Then validate Privacy Notice Page is Open or not 
  
  @Footer_Information_ConditionsofUse
  Scenario: Conditions of Use Page opening
    Given Scroll Down to footer
    When click Conditions of Use Link
    Then validate Conditions of Use Page is Open or not 
  
  @Footer_Information_Aboutus
  Scenario: About us Page opening
    Given Scroll Down to footer
    When click About us Link
    Then validate About us Page is Open or not 
  
  @Footer_Information_Contactus
  Scenario: About us Page opening
    Given Scroll Down to footer
    When click Contact us Link
    Then validate Contact us Page is Open or not 
    
  
