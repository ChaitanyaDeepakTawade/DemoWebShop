package com.StepDefinations;

import com.actions.CategoriesBooksActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesBookStepDefination {

	CategoriesBooksActions objActions;
	
	@Given("User is Logged in")
	public void user_is_logged_in() {
		
		objActions = new CategoriesBooksActions();
		
		objActions.verifyUserLogged();
		
	}

	@When("select book option from nav bar")
	public void select_book_option_from_nav_bar() {
		
		objActions.navBarBookBtnClick();
	}

	@When("select sort by Price Low to High")
	public void select_sort_by_price_low_to_high() {
		objActions.SortByDropDwn();
	}

	@When("select view as a list")
	public void select_view_as_a_list() {
		objActions.ViewAsDropDwn();
	}

	@Then("verify displayed product is in sorted order or not")
	public void verify_displayed_product_is_in_sorted_order_or_not() {
		objActions.verifyDisplayedProductInOrderOrNot();
	}


}
