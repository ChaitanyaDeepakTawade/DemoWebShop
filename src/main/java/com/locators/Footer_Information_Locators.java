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
	
	//contact us form Locators
	@FindBy(id="FullName")
	public WebElement fullName;
	
	@FindBy(id="Email")
	public WebElement email;
	
	@FindBy(id="Enquiry")
	public WebElement enquiry;
	
	@FindBy(xpath="//input[@name=\"send-email\"]")
	public WebElement submit;
	
	@FindBy(xpath="//div[@class=\"result\"]") //after submit form message comming
	public WebElement message;
 
}
