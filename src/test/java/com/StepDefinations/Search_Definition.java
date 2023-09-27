package com.StepDefinations;

import com.actions.SearchActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Definition {
SearchActions searchactions;
	

	@Given("User is on the Home Page")
	public void user_is_on_the_home_page() {
		searchactions = new SearchActions();
		System.out.println("User is on home page");
	 	}
	
	@When("User Enters the keyword {string}")
	public void user_enters_the_keyword(String string) {
		searchactions.setkeyword(string);
	}

	@Then("user should be able to see products")
	public void user_should_be_able_to_see_products() {
		System.out.println("Product Displayed");
	}

	@When("user Enters invalid Keyword {string}")
	public void user_enters_invalid_keyword(String string) {
		searchactions.setkeyword(string);
	}

	@Then("Products will not be displayed")
	public void products_will_not_be_displayed() {
	   System.out.println("Product not Displayed");
	}




}
