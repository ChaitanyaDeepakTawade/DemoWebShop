package com.actions.Registration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utils.HelperClass;

import com.locators.Registration.RegisterPageLocators;
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
		
		 Assert.assertEquals(objRegisterPageLocators.Message.getText(), "Your registration completed");
	}
	public void fillData() {
		Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/Properties/RegisterData.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		  ;
		this.selectGender(properties.getProperty("Gender"));
		this.setFname(properties.getProperty("FName"));
		this.setLname(properties.getProperty("LName"));
		this.setEmail(properties.getProperty("email"));
		this.Password(properties.getProperty("Password"));
		this.confPassword(properties.getProperty("ConfPassword"));
		
	}

}
