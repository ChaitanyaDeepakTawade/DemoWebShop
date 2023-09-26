package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer_Information_Locators {
	
	@FindBy(linkText="Sitemap")
	public WebElement Sitmap;
	
	@FindBy(linkText="Shipping & Returns")
	public WebElement ShippingAndReturns;
	
	@FindBy(linkText="Privacy Notice")
	public WebElement PrivacyNotice;
	
	@FindBy(linkText="Conditions of Use")
	public WebElement ConditionsofUse;
	
	@FindBy(linkText="About us")
	public WebElement AboutUs;
	
	@FindBy(linkText="Contact us")
	public WebElement ContactUs;

}
