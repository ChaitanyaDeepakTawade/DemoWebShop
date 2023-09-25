package com.StepDefinations;

import java.util.List;

import org.testng.Assert;

import com.utils.HelperClass;
import com.actions.LoginPageActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageStepDefination {
	String username;
	@Given("user should be on {string}")
	public void user_should_be_on(String url) {
		HelperClass.openPage(url);     
	}

	@When("enter")
	public void enter(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.cells();

		
		this. username = data.get(1).get(0);
		String password = data.get(1).get(1);
		
		LoginPageActions obj = new LoginPageActions();
		
		obj.setemail(username);
		obj.setpass(password);
		
		
	}

	@When("entern")
	public void entern(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.cells();
		String username = data.get(1).get(0);
		String password = data.get(1).get(1);
		
		LoginPageActions obj = new LoginPageActions();
		
		obj.setemail(username);
		obj.setpass(password);

	}

	@When("click Login button")
	public void click_login_button() {
		LoginPageActions obj = new LoginPageActions();
		obj.ClickLogin();
		
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		LoginPageActions obj = new LoginPageActions();
		obj.AssertMessage(username);
	}

	@Then("User should not be logged in successfully")
	public void user_should_not_be_logged_in_successfully() {
		LoginPageActions obj = new LoginPageActions();
		
		obj.AssertMessageNegative();
	}



}
