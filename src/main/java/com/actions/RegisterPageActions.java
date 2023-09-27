package com.actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.utils.HelperClass;

import com.locators.RegisterPageLocators;
import org.testng.Assert;
public class RegisterPageActions {
	RegisterPageLocators objRegisterPageLocators;
	
	
	public RegisterPageActions() {
		
		this.objRegisterPageLocators =new RegisterPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), objRegisterPageLocators );
	}
	public void selectGender(String gender) {
        
	    if(gender.equals("M")) {
	    	objRegisterPageLocators.Male.click();
		}else {
			objRegisterPageLocators.feMale.click();
		}
	}
	public void setFname(String fName) {

		objRegisterPageLocators.fName.sendKeys(fName);

	}
	public void setLname(String lName) {

		objRegisterPageLocators.lName.sendKeys(lName);

	}
	public void setEmail(String Email) {

		objRegisterPageLocators.Email.sendKeys(Email);

	}
	public void Password(String Pass) {
		
		objRegisterPageLocators.Password.sendKeys(Pass);
	}
	public void confPassword(String confPass) {
		
		objRegisterPageLocators.confPassword.sendKeys(confPass);
	}
	public void clickRegister() {
		objRegisterPageLocators.registerButton.click();
	}
	
	public void assertMessage() {
		if(objRegisterPageLocators.emailWorning.getText().equals("Wrong email")) {
			//Email is not registered.
			Assert.assertEquals(objRegisterPageLocators.emailWorning.getText(), "Wrong email");
			
		}else if(objRegisterPageLocators.Message.getText().equals("Your registration completed")) {
		 Assert.assertEquals(objRegisterPageLocators.Message.getText(), "Your registration completed");
		}
		//Clear Form for new Entry 
		objRegisterPageLocators.fName.clear();
		objRegisterPageLocators.lName.clear();
		objRegisterPageLocators.Email.clear();
		objRegisterPageLocators.Password.clear();
		objRegisterPageLocators.confPassword.clear();
		
	
	}
	
	public void fillData(String Gender, String FName,String LName, String email, String Password,String ConfPassword) {
		
		this.selectGender(Gender);
		this.setFname(FName);
		this.setLname(LName);
		this.setEmail(email);
		this.Password(Password);
		this.confPassword(ConfPassword);
		
	}

}
