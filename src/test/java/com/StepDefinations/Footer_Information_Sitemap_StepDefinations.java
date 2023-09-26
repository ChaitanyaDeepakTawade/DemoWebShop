package com.StepDefinations;

import org.testng.Assert;

import com.actions.Footer_Information_Sitemap_Actions;
import com.locators.Footer_Information_Locators;
import com.utils.HelperClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_Information_Sitemap_StepDefinations {
    
	Footer_Information_Sitemap_Actions objSitemapActions;
	@When("click Sitemap Link")
	public void click_sitemap_link() {
		objSitemapActions = new Footer_Information_Sitemap_Actions();
		objSitemapActions.click_Sitemap();
	}

	@Then("validate Sitemap Page is Open or not")
	public void validate_sitemap_page_is_open_or_not() {
		
	    Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/sitemap");
	
	}
}
