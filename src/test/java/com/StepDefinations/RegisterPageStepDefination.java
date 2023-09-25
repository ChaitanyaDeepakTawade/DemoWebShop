package com.StepDefinations;



import java.util.List;

import com.actions.LoginPageActions;
import com.actions.RegisterPageActions;
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
	public void fill_out_the_registration_form(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> data = dataTable.cells();
		int rows = dataTable.height();
		 for (int i=0; i< rows ; i++) {
			 String Gender = data.get(1).get(0);
			 String FName = data.get(1).get(1);
			 String LName = data.get(1).get(2);
			 String email = data.get(1).get(2);
			 String Password =data.get(1).get(2);
			 String ConfPassword =data.get(1).get(2);
			 obj.fillData(Gender, FName ,LName , email, Password, ConfPassword);
		 }
	}

	@When("Click Register button")
	public void click_register_button() {
		
		//obj.clickRegister();
		
	}

	@Then("Validate whether user is registered successfully")
	public void validate_whether_user_is_registered_successfully() {
	
		//obj.assertMessage();
		
	}


}
