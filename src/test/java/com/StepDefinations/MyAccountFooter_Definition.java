package com.StepDefinations;

import org.testng.Assert;

import com.actions.MyAccountFooterActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountFooter_Definition {
	 MyAccountFooterActions myaccountFooterDef;

	@When("user goes to bottom")
	public void user_goes_to_bottom() {
		myaccountFooterDef = new MyAccountFooterActions(); 
		myaccountFooterDef.scrollDown();
	}

	@When("clicks on option MyAccount")
	public void clicks_on_option_my_account() {
		myaccountFooterDef.clickMyAccount();		
	}

	@Then("MyAccount details are displayed")
	public void my_account_details_are_displayed() {
		String s1 = myaccountFooterDef.getEmail();
		System.out.println(s1);
		String s2 = myaccountFooterDef.getEmail1();
		System.out.println(s2);
		Assert.assertEquals(s1, "Exampale123456@gmail.com");
	}

	@When("Again user goes to bottom")
	public void again_user_goes_to_bottom() {
		myaccountFooterDef.scrollDown();

	}

	@When("clicks on option orders")
	public void clicks_on_option_orders() {
		myaccountFooterDef.clickorders();
	}

	@Then("Odrer details are displayed")
	public void odrer_details_are_displayed() {
		myaccountFooterDef.printList_Orders();
	}

	@When("click on option Addresses")
	public void click_on_option_addresses() {
		myaccountFooterDef.clickAddresses();
	}

	@Then("Address to be displayed")
	public void address_to_be_displayed() {
		myaccountFooterDef.editAddress();
		myaccountFooterDef.changeAddress("452012");
		System.out.println("Address Changed");
	//	myaccountFooterDef.saveAddress();
	}

	@When("click on option shoppingCart")
	public void click_on_option_shopping_cart() {
		myaccountFooterDef.scrollDown();
		myaccountFooterDef.clickShoppingCart();
	}

	@Then("ShoppingCart orders are displayed")
	public void shopping_cart_orders_are_displayed() {
		myaccountFooterDef.clickCheckbox();
		myaccountFooterDef.clickCheckOut();
		System.out.println("Cart Done");
	}
	
	@When("click on option wishlist")
	public void click_on_option_wishlist() {
		myaccountFooterDef.clickWishlist();
	}

	@Then("Wishlist items are displayed")
	public void wishlist_items_are_displayed() {
	myaccountFooterDef.wishlistContent();
	System.out.println("Successfully implemented");
		//Assert.assertEquals(myaccountFooterDef.wishlistContent(), "The wishlist is empty!");
	}


	
}
