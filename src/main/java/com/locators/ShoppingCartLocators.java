package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartLocators {

	@FindBy(linkText="Jewelry")
	public WebElement Jewelry;
	
	@FindBy(linkText="Black & White Diamond Heart")
	public WebElement SelectJewelry;
	
	@FindBy(id="add-to-cart-button-14")
	public WebElement AddToCart;
	
	@FindBy(xpath="//a[@class='ico-cart' and span[@class='cart-label' and text()='Shopping cart']]")
	public WebElement ShoppingCart;
	
	@FindBy(id="termsofservice")
	public WebElement Checkbox;
	
	@FindBy(id="checkout")
	public WebElement CheckoutBtn;
	
	@FindBy(id="billing-address-select")
	public WebElement newAddress;
	
	@FindBy(id="BillingNewAddress_CountryId")
	public WebElement selectCountry;
	
	@FindBy(xpath="//input[@id=\"BillingNewAddress_City\"]")
	public WebElement enterCity;
	
	@FindBy(xpath="//input[@id=\"BillingNewAddress_Address1\"]")
	public WebElement enterAddress1;
	
	@FindBy(xpath="//input[@id=\"BillingNewAddress_Address2\"]")
	public WebElement enterAddress2;
	
	@FindBy(xpath="//input[@id=\"BillingNewAddress_ZipPostalCode\"]")
	public WebElement enterZipCode;
	
	@FindBy(xpath="//input[@id=\"BillingNewAddress_PhoneNumber\"]")
	public WebElement enterPhoneno;
	
	@FindBy(xpath="//*[@id=\"billing-buttons-container\"]/input")
	public WebElement continue1;
	
	@FindBy(xpath="//*[@id=\"shipping-buttons-container\"]/input")
	public WebElement continue2;
	
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/input")
	public WebElement continue3;
	
	@FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/input")
	public WebElement continue4;
	
	@FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/input")
	public WebElement continue5;
	
	@FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/input")
	public WebElement confirm;
	
	
	

	
}
