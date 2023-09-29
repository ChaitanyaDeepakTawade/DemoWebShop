package com.StepDefinations;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.actions.ShoppingCartActions;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCart_Definition {
	ShoppingCartActions shoppingcartactions;
	public static Logger log = LogManager.getLogger(ShoppingCart_Definition.class); 


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
		log.info("Item Added to Cart");
	}

	@Then("user clicks on shopping cart")
	public void user_clicks_on_shopping_cart() {
		shoppingcartactions.goToCart();
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		shoppingcartactions.selectCheckbox();
		shoppingcartactions.selectCheckout();	
		log.info("CheckBox Selected and Checked Out");
	}


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

}
