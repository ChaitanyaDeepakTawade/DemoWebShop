package com.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountFooterLocators {

	@FindBy(linkText="My account")
	public WebElement MyAccount;
	
	@FindBy(linkText="Exampale123456@gmail.com")
	public WebElement registeredemail;
	
	@FindBy(xpath="//input[@id=\"Email\"]")
	public WebElement Dispalyedemail; 
	
	@FindBy(linkText="Orders")
	public WebElement orders;
	
	@FindBy(xpath="//div[@class=\"title\"]//strong")
	public List<WebElement> orderlist;
	
	@FindBy(linkText="Addresses")
	public WebElement Addresses;
	
	@FindBy(xpath="//input[@class=\"button-2 edit-address-button\"]")
	public WebElement editAddress;
	
	@FindBy(id="Address_ZipPostalCode")
	public WebElement changeZipcode;
	
	@FindBy(linkText="Shopping cart")
	public WebElement Shoppingcart;
	
	@FindBy(id="termsofservice")
	public WebElement agreeToCheckout;
	
	@FindBy(id="checkout")
	public WebElement checkout;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//h1")
	public WebElement checkoutText;
	
	@FindBy(linkText="Wishlist")
	public WebElement Wishlist;
	
	@FindBy(xpath="//div[@class=\"wishlist-content\"]")
	public WebElement Wishlistcontent;
}
