/*
 * 
 */

package com.StepDefinations;

import java.util.List;

import com.actions.LoginPageActions;
import com.actions.RegisterPageActions;
import com.utils.HelperClass;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStepDefination {
	RegisterPageActions objRegisterPageActions;
	@Given("Open This URL {string}")
	public void open_url(String url) {
	   HelperClass.openPage(url);   
	   
	}

	@When("Fill out the registration form")
	public void fill_out_the_registration_form(io.cucumber.datatable.DataTable dataTable) {
		objRegisterPageActions=new RegisterPageActions();
		List<List<String>> data = dataTable.cells();
		int rows = dataTable.height();
		 for (int i=1; i< rows ; i++) {
			 String Gender = data.get(i).get(0);
			 String FName = data.get(i).get(1);
			 String LName = data.get(i).get(2);
			 String email = data.get(i).get(3);
			 String Password =data.get(i).get(4);
			 String ConfPassword =data.get(i).get(5);
			 objRegisterPageActions.fillData(Gender, FName ,LName , email, Password, ConfPassword);
			 click_register_button();
			 validate_whether_user_is_registered_successfully();
		 }
	}

	@When("Click Register button")
	public void click_register_button() {
		
		    objRegisterPageActions.clickRegister();
		
	}

	@Then("Validate whether user is registered successfully")
	public void validate_whether_user_is_registered_successfully() {
	
		objRegisterPageActions.assertMessage();
		
	}


}
