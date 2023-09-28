package com.actions;

import java.time.Duration;

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
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}
	
	public void addToCart() {
		shoppingcartlocators.AddToCart.click();
	}
	
	public void goToCart() {
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		shoppingcartlocators.ShoppingCart.click();
	}
	
	public void selectCheckbox() {
		shoppingcartlocators.Checkbox.click();
	}
	
	public void selectCheckout() {
		shoppingcartlocators.CheckoutBtn.click();
	}
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

}
