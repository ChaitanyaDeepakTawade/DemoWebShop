package com.StepDefinations;

import com.actions.Categories_Apparels_Actions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApparelsStepDefination {
	Categories_Apparels_Actions objCategories_Apparels_Actions;
	@When("I select APPAREL & SHOES > Green and blue Sneaker > Email to Friend")
	public void i_select_apparel_shoes_green_and_blue_sneaker_email_to_friend() {
		objCategories_Apparels_Actions = new Categories_Apparels_Actions();
		objCategories_Apparels_Actions.clickOnApparels();
		objCategories_Apparels_Actions.clickOnSneakers();
		objCategories_Apparels_Actions.clickOnEmail2Friend();
	}

	@When("I enter {string} as the friends email address")
	public void i_enter_as_the_friends_email_address(String email) {
		objCategories_Apparels_Actions = new Categories_Apparels_Actions();
		objCategories_Apparels_Actions.friendsEmail(email);
		objCategories_Apparels_Actions.clearEmail();
	}

	@When("I enter {string} as your email address")
	public void i_enter_as_your_email_address(String myemail) {
		objCategories_Apparels_Actions = new Categories_Apparels_Actions();
		objCategories_Apparels_Actions.MyEmail(myemail);
	}

	@When("I click Send email")
	public void i_click_send_email() {
		objCategories_Apparels_Actions = new Categories_Apparels_Actions();
		objCategories_Apparels_Actions.clickOnSendemail();
	}

	@Then("I verify the product is sent to swarali@gmail.com from aditya@gmail.com successfully")
	public void i_verify_the_product_is_sent_to_swarali_gmail_com_from_aditya_gmail_com_successfully() {
		objCategories_Apparels_Actions = new Categories_Apparels_Actions();
		objCategories_Apparels_Actions.assertmessage();
	}

}
