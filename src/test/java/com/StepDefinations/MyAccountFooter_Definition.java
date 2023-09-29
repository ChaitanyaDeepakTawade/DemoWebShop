package com.StepDefinations;

import org.testng.Assert;

import com.actions.MyAccountFooterActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountFooter_Definition {
	 MyAccountFooterActions myaccountFooterDef = new MyAccountFooterActions(); 

	@When("user goes to bottom")
	public void user_goes_to_bottom() {
		myaccountFooterDef = new MyAccountFooterActions(); 
		myaccountFooterDef.scrollDown();
	}

	@When("clicks on option MyAccount")
	public void clicks_on_option_my_account() {
		//selects MyAccount
		myaccountFooterDef.clickMyAccount();		
	}

	@Then("MyAccount details are displayed")
	public void my_account_details_are_displayed() {
		String s1 = myaccountFooterDef.getEmail();
		//Assert the email
	Assert.assertEquals(s1, "Exampale123456@gmail.com");
	System.out.println(s1 +" EmailId Verified Successfully");
		
			}

	@When("Again user goes to bottom")
	public void again_user_goes_to_bottom() {
		myaccountFooterDef.scrollDown();

	}

	@When("clicks on option orders")
	public void clicks_on_option_orders() {
		//select orders option
		myaccountFooterDef.clickorders();
	}

	@Then("Odrer details are displayed")
	public void odrer_details_are_displayed() {
		//prints list of orders
		myaccountFooterDef.printList_Orders();
	}

	@When("click on option Addresses")
	public void click_on_option_addresses() {
		//selects address option
		myaccountFooterDef.clickAddresses();
	}

	@Then("Address to be displayed")
	public void address_to_be_displayed() {
		myaccountFooterDef.editAddress();
		//Calling change address method
		myaccountFooterDef.changeAddress("452012");
		System.out.println("Address zipCode Changed");
	}

	@When("click on option shoppingCart")
	public void click_on_option_shopping_cart() {
		myaccountFooterDef.scrollDown();
		//To select the shoppingCart  
		myaccountFooterDef.clickShoppingCart();
	}

	@Then("ShoppingCart orders are displayed")
	public void shopping_cart_orders_are_displayed() {
		//clicks checkbox and checkout
		myaccountFooterDef.clickCheckbox();
		myaccountFooterDef.clickCheckOut();
		String text = myaccountFooterDef.checkouttext();
		String actualtext = "Checkout";
		//Assert the text
		Assert.assertEquals(text, actualtext);
		System.out.println("Cart Checked out Successfully");
	}
	
	@When("click on option wishlist")
	public void click_on_option_wishlist() {
		//clicks on Wishlist option 
		myaccountFooterDef.clickWishlist();
	}

	@Then("Wishlist items are displayed")
	public void wishlist_items_are_displayed() {
	//Takes wishlist content
	myaccountFooterDef.wishlistContent();
	//Assert content
	Assert.assertEquals(myaccountFooterDef.wishlistContent() , "The wishlist is empty!");
	//If the assertion passes, print a success message
	System.out.println("The wishlist is empty!");
	}


	
}
