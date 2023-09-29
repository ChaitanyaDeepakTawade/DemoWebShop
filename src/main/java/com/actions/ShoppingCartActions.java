package com.actions;

<<<<<<< HEAD
=======
import java.time.Duration;

>>>>>>> e249c5eeca257b1ad942cde0f67ed978789d08d9
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.locators.ShoppingCartLocators;
import com.utils.HelperClass;

public class ShoppingCartActions {

ShoppingCartLocators shoppingcartlocators;
	
	public ShoppingCartActions() {
		this.shoppingcartlocators = new ShoppingCartLocators();
		PageFactory.initElements(HelperClass.getDriver(), shoppingcartlocators);
	}
	
	public void clickJewelry() {
		shoppingcartlocators.Jewelry.click();
	}
	
	public void selectJewelry() {
		shoppingcartlocators.SelectJewelry.click();
<<<<<<< HEAD
=======
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

>>>>>>> e249c5eeca257b1ad942cde0f67ed978789d08d9
	}
	
	public void addToCart() {
		shoppingcartlocators.AddToCart.click();
	}
	
	public void goToCart() {
<<<<<<< HEAD
=======
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
>>>>>>> e249c5eeca257b1ad942cde0f67ed978789d08d9
		shoppingcartlocators.ShoppingCart.click();
	}
	
	public void selectCheckbox() {
		shoppingcartlocators.Checkbox.click();
	}
	
	public void selectCheckout() {
		shoppingcartlocators.CheckoutBtn.click();
	}/*
		 * 
		 * public void addNewAddress() { Select DropdwnSortBy = new
		 * Select(shoppingcartlocators.newAddress); DropdwnSortBy.selectByIndex(2); }
		 * 
		 * public void selectCountry() { Select DropdwnSortBy = new
		 * Select(shoppingcartlocators.selectCountry); DropdwnSortBy.selectByIndex(10);
		 * }
		 * 
		 * public void enterCity(String city) {
		 * shoppingcartlocators.enterCity.sendKeys(city); }
		 * 
		 * public void enterAddress1(String address1) {
		 * shoppingcartlocators.enterAddress1.sendKeys(address1); }
		 * 
		 * public void enterAddress2(String address2) {
		 * shoppingcartlocators.enterAddress2.sendKeys(address2); }
		 * 
		 * public void enterZipCode(String zipcode) {
		 * shoppingcartlocators.enterZipCode.sendKeys(zipcode); }
		 * 
		 * public void enterPhoneno(String phonenumber) {
		 * shoppingcartlocators.enterPhoneno.sendKeys(phonenumber); }
		 */
	
	public void clickContinue1() {
		shoppingcartlocators.continue1.sendKeys(Keys.ENTER);
	}
	public void clickContinue2() {
		shoppingcartlocators.continue2.sendKeys(Keys.ENTER);
	}
	public void clickContinue3() {
		shoppingcartlocators.continue3.sendKeys(Keys.ENTER);
	}
	public void clickContinue4() {
		shoppingcartlocators.continue4.sendKeys(Keys.ENTER);
	}
	public void clickContinue5() {
		shoppingcartlocators.continue5.sendKeys(Keys.ENTER);
	}
	public void clickConfirmn() {
		shoppingcartlocators.confirm.sendKeys(Keys.ENTER);
	}

<<<<<<< HEAD
	
=======
>>>>>>> e249c5eeca257b1ad942cde0f67ed978789d08d9
}
