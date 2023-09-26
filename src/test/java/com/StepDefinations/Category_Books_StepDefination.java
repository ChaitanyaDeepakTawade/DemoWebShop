package com.StepDefinations;

import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Category_Books_StepDefination {
	
	@Given("open link {string}")
	public void open_link(String url) {
		HelperClass.openPage(url); 
	}

	@When("select book option from nav bar")
	public void select_book_option_from_nav_bar() {
	    
	}

	@When("select sort by Price Low to High")
	public void select_sort_by_price_low_to_high() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("select view grid")
	public void select_view_grid() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify displayed product is in sorted order or not")
	public void verify_displayed_product_is_in_sorted_order_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
