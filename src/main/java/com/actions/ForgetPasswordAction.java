package com.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.locators.ForgetPasswordLocators;
import com.locators.LoginPageLocators;
import com.utils.HelperClass;

public class ForgetPasswordAction {
         
	ForgetPasswordLocators objLocators;
    
	public ForgetPasswordAction(){	
		
		this.objLocators =new 	ForgetPasswordLocators();	
		PageFactory.initElements(HelperClass.getDriver(), objLocators );
		
	}
	//click forget password link on login page.
	public void openForgetPasswordLink(){
		
		objLocators.forgetPassword.click();
		
	}
	//enter data in email input field
	public void enterEmail(String email) {
		
		objLocators.EmailBox.sendKeys(email);	
		
	}
	
	//click recover button after that clear email box for next email
	public void cilckRecoverBtn() {
		objLocators.Recover.click();
		objLocators.EmailBox.clear();
	}
	
	public void assertMessage() {
		
		if(objLocators.Message.getText().equals("Email not found.")) {
			//Email is not registered.
			Assert.assertEquals(objLocators.Message.getText(), "Email not found.");
			
		}else if(objLocators.Message.getText().equals("Email with instructions has been sent to you.")) {
			//Right Email
			Assert.assertEquals(objLocators.Message.getText(), "Email with instructions has been sent to you.");
			
		}
		else {
			//Wrong email 
			Assert.assertEquals(objLocators.Worning.getText(), "Wrong email"); 
		}
		
	}
         
         
}
