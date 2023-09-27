package com.actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.locators.MyAccountFooterLocators;
import com.utils.HelperClass;

public class MyAccountFooterActions {

	MyAccountFooterLocators myaccountFooterLocators;
	
	 public MyAccountFooterActions() {
		 this.myaccountFooterLocators = new MyAccountFooterLocators();
		 PageFactory.initElements(HelperClass.getDriver(), myaccountFooterLocators);
	 }
	 
	 public void scrollDown() {
		 JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
		 js.executeScript("window.scrollBy(0,250)");
	 }
	
	 public void clickMyAccount() {
		 myaccountFooterLocators.MyAccount.click();
	 }
	 
	 public String getEmail() {
		return myaccountFooterLocators.registeredemail.getText();
	 }
	 
	 public String getEmail1() {
		 return myaccountFooterLocators.Dispalyedemail.getText();
	 } 
	 
	 public void clickorders() {
		 myaccountFooterLocators.orders.click();
	 }
	 
	 public void printList_Orders() {
		// List<String>list = new ArrayList<>();
		 for(int i=1; i<myaccountFooterLocators.orderlist.size(); i++ ) {
			 System.out.println(myaccountFooterLocators.orderlist.get(i).getText());
		 }
	 }
	
	 public void clickAddresses() {
		 myaccountFooterLocators.Addresses.click();
	 }
	 
	 public void editAddress() {
		 myaccountFooterLocators.editAddress.click();
		 myaccountFooterLocators.changeZipcode.clear();
	 }
	 
	 public void changeAddress(String zipcode) {
		  myaccountFooterLocators.changeZipcode.sendKeys(zipcode,Keys.ENTER);	
	 }
	 
	 public void clickShoppingCart() {
		 myaccountFooterLocators.Shoppingcart.click();
	 }
	 
	 public void clickCheckbox() {
		 myaccountFooterLocators.agreeToCheckout.click();
	 }
	 
	 public void clickCheckOut() {
		 myaccountFooterLocators.checkout.click();
	 }
	 
	 public void clickWishlist() {
		 myaccountFooterLocators.Wishlist.click();
	 }
	 
	 public void wishlistContent() {
		  myaccountFooterLocators.WishlistContent.getText();
	 }
}

