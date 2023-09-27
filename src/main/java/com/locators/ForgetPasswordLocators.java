package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordLocators {
	
	@FindBy(linkText="Forgot password?")
	public WebElement forgetPassword;
	 
	@FindBy(id = "Email")
	public WebElement EmailBox;
	
	@FindBy(name="send-email")
	public WebElement Recover;
	
	@FindBy(className="result")
	public WebElement Message;
    
	@FindBy(xpath="//input[@name=\"Email\"]/following::span[@data-valmsg-for=\"Email\"]")
	public WebElement Worning;
}
