package com.actions;
import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utils.HelperClass;

import io.cucumber.java.Scenario;
import jdk.internal.org.jline.utils.Log;

import com.locators.LoginPageLocators;
import io.cucumber.java.Scenario;

/*
 * Action methods for login Page step defination file.
 * @author chaitanya Deepk Tawade(expleo Pune)
 * @sign 23/09/2023 
*/

public class LoginPageActions {
	
	LoginPageLocators objlocators;
	Logger log;
	
	public LoginPageActions() {
		
		this.objlocators =new LoginPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), objlocators);
		 log.info("Login Page Open");
	}
	
	public void setemail(String email) {
	     log.info("enter email");
		objlocators.email.sendKeys(email);
	
	}
	
	public void setpass(String password) {
		 log.info("enter password");
		objlocators.password.sendKeys(password);
	
	}

	public void ClickLogin() {
		log.info("Click on login button");
		objlocators.RememberMe.click();
		objlocators.loginBtn.click();
		
	}
	public void AssertMessage(String email) {
		try {
		 Assert.assertEquals(objlocators.Message.getText(),email);
	   }catch (Exception e) {
			e.printStackTrace();
			log.error("Not Login sucessfully ");
		}
	}
	public void AssertMessageNegative() {
         try {
        	 Assert.assertNotEquals(objlocators.MessageNeg.getText(), "Login was unsuccessful. Please correct the errors and try again.");
         }catch (Exception e) {
				e.printStackTrace();
				log.error("Incorrect credentials");
			}
	}	

}
