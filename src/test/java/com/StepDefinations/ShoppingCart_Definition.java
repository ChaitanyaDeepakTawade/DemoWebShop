package com.StepDefinations;

<<<<<<< HEAD
public class ShoppingCart_Definition {
=======
import java.time.Duration;

import com.actions.ShoppingCartActions;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCart_Definition {
	ShoppingCartActions shoppingcartactions;

	@Given("User is on home page")
	public void user_is_on_home_page() {
		shoppingcartactions = new ShoppingCartActions();
	   System.out.println("Currently on home page");
	}

	@When("User selects any item")
	public void user_selects_any_item() {
		shoppingcartactions.clickJewelry();
		shoppingcartactions.selectJewelry();
	}

	@When("add to cart")
	public void add_to_cart() {
		shoppingcartactions.addToCart();
	}

	@Then("user clicks on shopping cart")
	public void user_clicks_on_shopping_cart() {
		shoppingcartactions.goToCart();
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		shoppingcartactions.selectCheckbox();
		shoppingcartactions.selectCheckout();	
	}

	@Then("Enters the details")
	public void enters_the_details() {
		/*
		 * shoppingcartactions.selectCountry(); shoppingcartactions.enterCity("Indore");
		 * shoppingcartactions.enterAddress1("123 ABC");
		 * shoppingcartactions.enterAddress2("Dash Colony");
		 * shoppingcartactions.enterZipCode("12345");
		 * shoppingcartactions.enterPhoneno("987654321");
		 */	}

	@Then("click on continue button")
	public void click_on_continue_button() {
		shoppingcartactions.clickContinue1();
		shoppingcartactions.clickContinue2();
		shoppingcartactions.clickContinue3();
		shoppingcartactions.clickContinue4();
		shoppingcartactions.clickContinue5();
	}

	@Then("check out")
	public void check_out() {
		shoppingcartactions.clickConfirmn();
	}

	@Then("Order placed Successfully")
	public void order_placed_successfully() {
		System.out.println("Order placed Successfully");
	}
>>>>>>> e249c5eeca257b1ad942cde0f67ed978789d08d9

}
