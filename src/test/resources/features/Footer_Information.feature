#Author: chaitanya tawade(expleo pune).
#sign : 24/09/2023
#This feature file for Verifing footer informations links .
@Footer_Information_Module
Feature: Verifing footer informations links working or not

Background:
Given user should be on " https://demowebshop.tricentis.com/" 
 # @Sitemap
  Scenario: Sitemap Page opening
    Given Scroll Down to footer
    When click Sitemap Link
    Then validate Sitemap Page is Open or not 

 # @Shipping&Returns
    Given Scroll Down to footer
    When click Shipping & Returns Link
    Then validate Shipping & Returns Page is Open or not 
  
  
