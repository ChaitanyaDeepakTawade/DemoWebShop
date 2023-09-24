package com.locators.Registration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
	@FindBy(xpath="//input[@value=\"M\"]")
	public WebElement Male;
	
	@FindBy(xpath="//input[@value=\"F\"]")
	public WebElement feMale;
	
	@FindBy(name="FirstName")
	public WebElement fName;
	
	@FindBy(name="LastName")
	public WebElement lName;
	
	@FindBy(name="Email")
	public WebElement Email;
	
	@FindBy(xpath="//input[@name=\"Email\"]/following::span[@data-valmsg-for=\"Email\"]")
	public WebElement emailWorning;
	
	@FindBy(name="Password")
	public WebElement Password;
	
	@FindBy(name="ConfirmPassword")
	public WebElement confPassword;
   
	@FindBy(name="register-button")
	public WebElement registerButton;
	
	@FindBy(xpath ="//div[@class=\"result\"]")
	public WebElement Message;
	
 
}
