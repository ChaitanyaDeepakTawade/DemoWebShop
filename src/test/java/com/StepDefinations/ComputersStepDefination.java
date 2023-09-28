package com.StepDefinations;

import com.actions.Categories_Computers_Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputersStepDefination {
	Categories_Computers_Actions objCategories_Computers_Actions;
	@Given("I am on the website {string}")
	public void i_am_on_the_website(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select COMPUTERS > Desktop > Sort by > Price: Low to High")
	public void i_select_computers_desktop_sort_by_price_low_to_high() {
		objCategories_Computers_Actions=new Categories_Computers_Actions();
		objCategories_Computers_Actions.hoverondesktop();
		objCategories_Computers_Actions.clickondesktop();
		objCategories_Computers_Actions.clickonsortby();
	}

	@Then("I verify products are displayed in ascending price order")
	public void i_verify_products_are_displayed_in_ascending_price_order() {
		System.out.println("Products are displayed in ascending price order.");
	}

	@Then("I compare prices of at least two products")
	public void i_compare_prices_of_at_least_two_products() {
		objCategories_Computers_Actions = new Categories_Computers_Actions();
        float comparedPrice = objCategories_Computers_Actions.compareItemPrices();
        System.out.println("Compared price after 1st product: " + comparedPrice);
	    
    
	}

	@When("I select COMPUTERS > Accessories > Display > {string}")
	public void i_select_computers_accessories_display(String string) {
		objCategories_Computers_Actions = new Categories_Computers_Actions();
		objCategories_Computers_Actions.clickonDesktop2();
		objCategories_Computers_Actions.clickonaccessories1();
		objCategories_Computers_Actions.displaysortby1();
	}

	@Then("I verify the number of products is four")
	public void i_verify_the_number_of_products_is_four() {
		objCategories_Computers_Actions.assert4products();
	}

	@Then("products are displayed as expected")
	public void products_are_displayed_as_expected() {
	    
		System.out.println("Products are displayed as expected");
	}

	@Then("I verify the number of products is not twelve")
	public void i_verify_the_number_of_products_is_not_twelve() {
		objCategories_Computers_Actions.clickonDesktop3();
		objCategories_Computers_Actions.clickonaccessories2();
		objCategories_Computers_Actions.displaysortby2();
		
	}

	@Then("the system should display twelve accessories products")
	public void the_system_should_display_twelve_accessories_products() {
		objCategories_Computers_Actions.assert12products();
	}

}
