package com.actions;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utils.HelperClass;

import io.cucumber.java.Scenario;

import com.locators.LoginPageLocators;
import io.cucumber.java.Scenario;
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

		 Assert.assertEquals(objlocators.MessageNeg.getText(), "Login was unsuccessful. Please correct the errors and try again.");
		 
	}	
	public void takeScreenshot(Scenario scenario) throws IOException{
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) HelperClass.getDriver();
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"image/png","Screenshot");
 
		}else {
			TakesScreenshot ts = (TakesScreenshot) HelperClass.getDriver();
			byte[] scr = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr,"image/png","Screenshot");
		}
	}

}
