package com.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		 js.executeScript("window.scrollBy(0,1050)");
	 }
	
	 public void clickMyAccount() {
		 HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 myaccountFooterLocators.MyAccount.click();
	 }
	 
	 public String getEmail() {
		return myaccountFooterLocators.registeredemail.getText();
	 }
	 
	 public String getEmail1() {
		 return myaccountFooterLocators.Dispalyedemail.getText();
	 } 
	 
	 public void clickorders() {
		 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Orders")));
		 myaccountFooterLocators.orders.click();
	 }
	 
	 public void printList_Orders() {
		 for(int i=1; i<myaccountFooterLocators.orderlist.size(); i++ ) {
			 System.out.println(myaccountFooterLocators.orderlist.get(i).getText());
		 }
	 }
	
	 public void clickAddresses() {
		 myaccountFooterLocators.Addresses.click();
	 }
	 
	 public void editAddress() {
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		 myaccountFooterLocators.editAddress.click();
		 myaccountFooterLocators.changeZipcode.clear();
	 }
	 
	 public void changeAddress(String zipcode) {
		  myaccountFooterLocators.changeZipcode.sendKeys(zipcode,Keys.ENTER);	
		  String s1 = zipcode;
	 }
	 
	 public void clickShoppingCart() {
		 myaccountFooterLocators.Shoppingcart.click();
	 }
	 
	 public void clickCheckbox() {
		 WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("termsofservice")));
		 myaccountFooterLocators.agreeToCheckout.click();
	 }
	 
	 public void clickCheckOut() {
		 myaccountFooterLocators.checkout.click();
	 }
	 
	 public String checkouttext() {
		 return myaccountFooterLocators.checkoutText.getText();
	 }
	 
	 public void clickWishlist() {
		 myaccountFooterLocators.Wishlist.click();
	 }
	 
	 public String wishlistContent() {
		return myaccountFooterLocators.Wishlistcontent.getText();
	 }
}

