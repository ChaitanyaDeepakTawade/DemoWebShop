package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(id="Email")
	public WebElement email;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy(id="RememberMe")
	public WebElement RememberMe;
	
	@FindBy(xpath ="//input[@value=\"Log in\"]")
	public WebElement loginBtn;
	
	
	@FindBy(xpath ="//div[@class=\"validation-summary-errors\"]/span")
	public WebElement MessageNeg;
	
	@FindBy(xpath ="//a[@class=\"account\"]")
	public WebElement Message;
}
