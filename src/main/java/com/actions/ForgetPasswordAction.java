package com.actions;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.locators.ForgetPasswordLocators;
import com.locators.LoginPageLocators;
import com.utils.HelperClass;

/*
 * This Action methods for Forget Password Page.
 * @author chaitanya Deepk Tawade(expleo Pune)
 * @sign 24/09/2023 
*/
public class ForgetPasswordAction {
         
	ForgetPasswordLocators objLocators;
    Logger log;
	public ForgetPasswordAction(){	
		
		this.objLocators = new 	ForgetPasswordLocators();	
		PageFactory.initElements(HelperClass.getDriver(), objLocators );
		
	}
	//click forget password link on login page.
	public void openForgetPasswordLink(){
		log.info("Open forget password page");
		objLocators.forgetPassword.click();
		
	}
	//enter data in email input field
	public void enterEmail(String email) {
		log.info("pass data to email input ");
		objLocators.EmailBox.sendKeys(email);	
		
	}
	
	//click recover button after that clear email box for next email
	public void cilckRecoverBtn() {
		log.info("click recover button");
		objLocators.Recover.click();
		objLocators.EmailBox.clear();
	}
	
	public void assertMessage() {
		log.info("Verify warning message");
		if(objLocators.Message.getText().equals("Email not found.")) {
			//Email is not registered.
			Assert.assertEquals(objLocators.Message.getText(), "Email not found.");
			log.warn("Enterd Email not found");
		}else if(objLocators.Message.getText().equals("Email with instructions has been sent to you.")) {
			//Right Email
			Assert.assertEquals(objLocators.Message.getText(), "Email with instructions has been sent to you.");
			log.info("Enter Right Email");
		}
		else {
			//Wrong email 
			Assert.assertEquals(objLocators.Worning.getText(), "Wrong email"); 
		    log.error("Enterd wrong email");
		}
		
	}
         
         
}
