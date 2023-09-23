package com.StepDefinations;



import com.actions.Registration.RegisterPageActions;
import com.utils.HelperClass;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStepDefination {
	RegisterPageActions obj=new RegisterPageActions();
	@Given("Open This URL {string}")
	public void open_url(String url) {
	System.out.println(url);
	   HelperClass.openPage(url);         
	}

	@When("Fill out the registration form")
	public void fill_out_the_registration_form() {
		
		obj.fillData();
		
	}

	@When("Click Register button")
	public void click_register_button() {
		
		obj.clickRegister();
		
	}

	@Then("Validate whether user is registered successfully")
	public void validate_whether_user_is_registered_successfully() {
	
		obj.assertMessage();
		
	}


}
