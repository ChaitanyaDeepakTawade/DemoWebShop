package com.StepDefinations;

import com.actions.FooterAction;

import io.cucumber.java.en.Given;

public class Footer {
	
	@Given("Scroll Down to footer")
	public void scroll_down_to_footer() {
		
		FooterAction objFooterAction = new FooterAction();
		objFooterAction.scrolldown();
	}


}
