package com.StepDefinations;

import com.actions.FooterAction;

import io.cucumber.java.en.Given;
/*
 * This File for scroll to Footer Information section.
 * @author chaitanya Deepk Tawade(expleo Pune)
 * @sign 25/09/2023 
*/
public class Footer {
	
	@Given("Scroll Down to footer")
	public void scroll_down_to_footer() {
		
		FooterAction objFooterAction = new FooterAction();
		objFooterAction.scrolldown();
	}


}
