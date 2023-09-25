package com.StepDefinations;

import java.util.List;

import com.actions.ForgetPasswordAction;
import com.actions.LoginPageActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageForgetPasswordStepDefination {
	ForgetPasswordAction obj;
	@When("click forget password link")
	public void click_forget_password_link() {
		
		obj=new ForgetPasswordAction();
		
		obj.openForgetPasswordLink();
		
         
	}
     
	@When("enter email address")
	public void enter_email_address(io.cucumber.datatable.DataTable dataTable) {
        
		
		List<List<String>> email = dataTable.cells();
		int rows = dataTable.height();
		int col = dataTable.width();
		 for (int i=1; i< rows ; i++) {
			obj.enterEmail(email.get(i).get(0));
			click_recover_button();
		 }
		 
	}

	@When("click Recover button")
	public void click_recover_button() {
		ForgetPasswordAction obj=new ForgetPasswordAction();
		obj.cilckRecoverBtn();

	}

	@Then("Assert Message")
	public void assert_message() {
	   
		
		obj.assertMessage();
	}


}
