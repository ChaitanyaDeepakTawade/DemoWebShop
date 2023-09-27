package com.actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utils.HelperClass;
import com.locators.LoginPageLocators;

public class LoginPageActions {
	
	LoginPageLocators objlocators;
	
	
	public LoginPageActions() {
		
		this.objlocators =new LoginPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), objlocators);
		
	}
	
	public void setemail(String email) {
		
		objlocators.email.sendKeys(email);
	
	}
	
	public void setpass(String password) {
		
		objlocators.password.sendKeys(password);
	
	}

	public void ClickLogin() {
		
		objlocators.RememberMe.click();
		objlocators.loginBtn.click();
		
	}
	public void AssertMessage(String email) {
		 Assert.assertEquals(objlocators.Message.getText(),email);
		
	}
	public void AssertMessageNegative() {

		 Assert.assertNotEquals(objlocators.MessageNeg.getText(), "Login was unsuccessful. Please correct the errors and try again.");
		
	}

}
