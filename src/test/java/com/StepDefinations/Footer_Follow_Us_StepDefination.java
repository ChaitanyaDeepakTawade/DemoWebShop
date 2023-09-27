package com.StepDefinations;

import com.actions.Categories_Camera_Actions;
import com.actions.Footer_Follow_Us_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_Follow_Us_StepDefination {
	
	Footer_Follow_Us_Actions FooterObj = new Footer_Follow_Us_Actions();;
	
	@Given("user scrolls down on webpage to the bottom.")
	public void user_scrolls_down_on_webpage_to_the_bottom() {
	    
		FooterObj.ScrollToTheBottom();
	}

	@When("user clicks on Facebook under Follow Us.")
	public void user_clicks_on_facebook_under_follow_us() {
	    
	}

	@Then("Verify whether Facebook web page is opened under new tab.")
	public void verify_whether_facebook_web_page_is_opened_under_new_tab() {
	    
	}
}
