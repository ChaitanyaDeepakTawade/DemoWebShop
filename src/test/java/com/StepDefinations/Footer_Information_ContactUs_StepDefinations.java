package com.StepDefinations;

import com.actions.Footer_Information_Sitemap_Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_Information_ContactUs_StepDefinations {
	Footer_Information_Sitemap_Actions objSitemapActions;
	@When("click Contact us Link")
	public void click_contact_us_link() {
		objSitemapActions = new Footer_Information_Sitemap_Actions();
		objSitemapActions.click_Sitemap();
	}

	@Then("validate Contact us Page is Open or not")
	public void validate_contact_us_page_is_open_or_not() {
	    
	}
	
}
