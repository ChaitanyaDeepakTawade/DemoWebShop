package com.locators.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(name="Email")
	public WebElement email;
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(name="RememberMe")
	public WebElement RememberMe;
	

	@FindBy(xpath ="//input[@value=\"Log in\"]")
	public WebElement loginBtn;
	
	
	@FindBy(xpath ="//div[@class=\"validation-summary-errors\"]/span")
	public WebElement MessageNeg;
	
	@FindBy(xpath ="//a[@class=\"account\"]")
	public WebElement Message;
}
