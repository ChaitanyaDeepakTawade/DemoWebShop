package com.actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.utils.HelperClass;

import com.locators.RegisterPageLocators;
import org.testng.Assert;

/*
 * This Action methods for Registration Page .
 * @author chaitanya Deepk Tawade(expleo Pune)
 * @sign 23/09/2023 
*/
public class RegisterPageActions {
	RegisterPageLocators objRegisterPageLocators;
	
	Logger log;
	public RegisterPageActions() {
		
		this.objRegisterPageLocators =new RegisterPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objRegisterPageLocators );
	    log.info("open Rgistration Page");
  	}
	public void selectGender(String gender) {
        
	    if(gender.equals("M")) {
	    	objRegisterPageLocators.Male.click();
		}else {
			objRegisterPageLocators.feMale.click();
		}
	    log.info("Select gender");
	}
	public void setFname(String fName) {

		objRegisterPageLocators.fName.sendKeys(fName);
		log.info("write first name");
	}
	public void setLname(String lName) {

		objRegisterPageLocators.lName.sendKeys(lName);
		log.info("write last name");
	}
	public void setEmail(String Email) {

		objRegisterPageLocators.Email.sendKeys(Email);
		log.info("write email");
	}
	public void Password(String Pass) {
		
		objRegisterPageLocators.Password.sendKeys(Pass);
		log.info("Enter Password");
	}
	public void confPassword(String confPass) {
		
		objRegisterPageLocators.confPassword.sendKeys(confPass);
		log.info("Enter Confirm Password");
	}
	public void clickRegister() {
		
		objRegisterPageLocators.registerButton.click();
		log.info("click register button");
	}
	
	public void assertMessage() {
		if(objRegisterPageLocators.emailWorning.getText().equals("Wrong email")) {
			//Email is not registered.
			try{
				Assert.assertEquals(objRegisterPageLocators.emailWorning.getText(), "Wrong email");
			}catch (Exception e) {
				e.printStackTrace();
				log.error("Error Occured.. , user not login");
			}
			
		}else if(objRegisterPageLocators.Message.getText().equals("Your registration completed")) {
		   try {
			Assert.assertEquals(objRegisterPageLocators.Message.getText(), "Your registration completed");
		    
		   }catch (Exception e) {
				e.printStackTrace();
				log.error("Error Occured.. not login");
			}
		//Clear Form for new Entry 
		   objRegisterPageLocators.fName.clear();
			objRegisterPageLocators.lName.clear();
			objRegisterPageLocators.Email.clear();
			objRegisterPageLocators.Password.clear();
			objRegisterPageLocators.confPassword.clear();
		
		}
	}
	
	public void fillData(String Gender, String FName,String LName, String email, String Password,String ConfPassword) {
		log.info("Fill data");
		this.selectGender(Gender);
		this.setFname(FName);
		this.setLname(LName);
		this.setEmail(email);
		this.Password(Password);
		this.confPassword(ConfPassword);
		
	}

}
