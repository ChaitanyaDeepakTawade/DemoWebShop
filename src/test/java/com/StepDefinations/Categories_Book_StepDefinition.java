package com.StepDefinations;

import com.actions.Categories_Books_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
 * Action methods for login Page step defination file.
 * @author chaitanya Deepk Tawade(expleo Pune)
 * @sign 24/09/2023 
*/
public class Categories_Book_StepDefinition {

	Categories_Books_Actions objActions;
	
	@Given("User is Logged in")
	public void user_is_logged_in() {
		
		objActions = new Categories_Books_Actions();
		
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
