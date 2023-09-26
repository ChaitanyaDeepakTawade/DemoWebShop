package com.StepDefinations;

import org.testng.Assert;

import com.actions.Footer_Information_Actions;
import com.utils.HelperClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_Information {
    
	Footer_Information_Actions objActions;
	@When("click Sitemap Link")
	public void click_sitemap_link() {
		objActions = new Footer_Information_Actions();
		objActions.click_Sitemap();
	}

	@Then("validate Sitemap Page is Open or not")
	public void validate_sitemap_page_is_open_or_not() {
		
	    Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/sitemap");
	
	}
	
	@When("click Shipping & Returns Link")
	public void click_shipping_returns_link() {
		objActions = new Footer_Information_Actions();
		objActions.click_ShippingAndReturns();
	}

	@Then("validate Shipping & Returns Page is Open or not")
	public void validate_shipping_returns_page_is_open_or_not() {
	    Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/shipping-returns");

	}
	@When("click Privacy Notice Link")
	public void click_privacy_notice_link() {
		
		objActions = new Footer_Information_Actions();
		objActions.click_PrivacyNotice();
		
	}

	@Then("validate Privacy Notice Page is Open or not")
	public void validate_privacy_notice_page_is_open_or_not() {
		
		 Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/privacy-policy");
	
	}
	@When("click Contact us Link")
	public void click_contact_us_link() {
		objActions = new Footer_Information_Actions();
		objActions.click_ContactUs();
	}

	@Then("validate Contact us Page is Open or not")
	public void validate_contact_us_page_is_open_or_not() {
		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/contactus");
	}
	
	@When("click Conditions of Use Link")
	public void click_conditions_of_use_link() {
		objActions = new Footer_Information_Actions();
		objActions.click_ConditionsofUse();
	}

	@Then("validate Conditions of Use Page is Open or not")
	public void validate_conditions_of_use_page_is_open_or_not() {
		 Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/conditions-of-use");
	}
	
	@When("click About us Link")
	public void click_about_us_link() {	   
		objActions = new Footer_Information_Actions();
		objActions.click_AboutUs();
	}

	@Then("validate About us Page is Open or not")
	public void validate_about_us_page_is_open_or_not() {
		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/about-us");

	}

	
}
