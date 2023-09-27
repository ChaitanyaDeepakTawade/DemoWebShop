package com.StepDefinations;

import org.testng.Assert;

import com.actions.Categories_Camera_Actions;
import com.actions.Footer_Follow_Us_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_Follow_Us_StepDefinition {
	
	Footer_Follow_Us_Actions FooterObj = new Footer_Follow_Us_Actions();;
	
	@When("click Facebook link")
	public void click_facebook_link() {
		FooterObj = new Footer_Follow_Us_Actions();
		FooterObj.();
	}

	@Then("validate Facebook Page is Open or not")
	public void validate_facebook_page_is_open_or_not() {
		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/sitemap");
		
	}

	@When("click Twitter link")
	public void click_twitter_link() {
	    
	}

	@Then("validate Twitter Page is Open or not")
	public void validate_twitter_page_is_open_or_not() {
	    
	}
	
}
