package com.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.locators.Footer_CustomerService_Locators;
import com.utils.HelperClass;

public class FooterCustomerService_Actions {

	Footer_CustomerService_Locators objFooter_CustomerService_Locators;
	Logger log;
	public FooterCustomerService_Actions(){
		log = LogManager.getLogger(FooterCustomerService_Actions.class);

		objFooter_CustomerService_Locators = new Footer_CustomerService_Locators();
		PageFactory.initElements(HelperClass.getDriver(), objFooter_CustomerService_Locators);
		
		//Search Footer Action
	}
	public void clickOnSearch() {
		log.info("------------Opening Search----------------");
		objFooter_CustomerService_Locators.SearchFooterClick.click();	
	}
	public String enterFooterSearchKeywords(String search) {
		objFooter_CustomerService_Locators.SearchFooterText.sendKeys("HandyCam");
	return search;
}
	public void clicksearchfooter() {
		objFooter_CustomerService_Locators.Footersearchbutton.click();
	}
	public void assertfootersearch() {
	    String actualMessage = objFooter_CustomerService_Locators.verifyfootersearch.getText();
	    String expectedMessage = "1MP 60GB Hard Drive Handycam Camcorder";

	    Assert.assertEquals(expectedMessage, actualMessage);
	    
	    // If the assertion passes, print a success message.
	    System.out.println("Assertion Passed: Product is as expected.");
	}
	//News Footer
	public void clickOnNewsFooter() {
		log.info("------------Openeing Footer----------------");
		objFooter_CustomerService_Locators.NewsFooterClick.click();
		
	}
	public void assertfooterNews() {
	    String actualMessage1 = objFooter_CustomerService_Locators.NewsFooterVerify.getText();
	    String expectedMessage1 = "New online store is open!";

	    Assert.assertEquals(expectedMessage1, actualMessage1);
	    
	    // If the assertion passes, print a success message.
	    System.out.println("Assertion Passed: News Feeds are Displayed.");
	}
	//Blog Footer
	public void clickOnBlogFooter() {
		log.info("------------Openeing Blog----------------");
		objFooter_CustomerService_Locators.BlogFooterClick.click();
		
	}
	public void assertfooterBlog() {
	    String actualMessage2 = objFooter_CustomerService_Locators.BlogFooterVerify.getText();
	    String expectedMessage2 = "Customer Service - Client Service";

	    Assert.assertEquals(expectedMessage2, actualMessage2);
	    
	    // If the assertion passes, print a success message.
	    System.out.println("Assertion Passed: WebShop Blogs are Displayed.");
	}
	//Recently Viewed Products Footer
	public void clickOnRecentlyViewedFooter() {
		log.info("------------Openeing Recently Viewed Products----------------");
		objFooter_CustomerService_Locators.RecentlyViewedProductsClick.click();
		
	}
	
	public void assertfooterRecentlyViewedProducts() {
	    String actualMessage3 = objFooter_CustomerService_Locators.RecentlyViewedProductsVerify.getText();
	    String expectedMessage3 = "Recently viewed products";

	    Assert.assertEquals(expectedMessage3, actualMessage3);
	    
	    // If the assertion passes, print a success message.
	    System.out.println("Assertion Passed: Recently Viewed Products are Displayed.");
	}
	//Compare Product List  Footer
	public void clickOnCompareProductListFooter() {
		log.info("------------Openeing Compare Product List----------------");
		objFooter_CustomerService_Locators.CompareProductListFooterClick.click();
			
	}
		
	public void assertCompareProductList() {
		 String actualMessage4 = objFooter_CustomerService_Locators.CompareProductListFooterVerify.getText();
		 String expectedMessage4 = "You have no items to compare.";

		 Assert.assertEquals(expectedMessage4, actualMessage4);
		    
		 // If the assertion passes, print a success message.
		 System.out.println("Assertion Passed: Compare Product List are Displayed.");
		}
	public void clickOnNewProducts() {
		log.info("------------Openeing New Products----------------");
		objFooter_CustomerService_Locators.NewProductsFooterClick.click();
			
	}
		
	public void assertNewProducts() {
		 String actualMessage4 = objFooter_CustomerService_Locators.NewProductsFooterVerify.getText();
		 String expectedMessage4 = "New products";

		 Assert.assertEquals(expectedMessage4, actualMessage4);
		    
		 // If the assertion passes, print a success message.
		 System.out.println("Assertion Passed: New products are Displayed.");
		}
}
