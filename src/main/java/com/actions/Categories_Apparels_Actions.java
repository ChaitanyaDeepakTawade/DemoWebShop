package com.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.locators.Categories_Apparels_Locators;
import com.utils.HelperClass;

public class Categories_Apparels_Actions {
	Categories_Apparels_Locators objCategories_Apparels_Locators;


	public Categories_Apparels_Actions() {

		this.objCategories_Apparels_Locators =new Categories_Apparels_Locators();
		PageFactory.initElements(HelperClass.getDriver(), objCategories_Apparels_Locators );
	}
	public void clickOnApparels() {
		objCategories_Apparels_Locators.clickOnApparel.click();
	}	
	public void clickOnSneakers() {
		objCategories_Apparels_Locators.clickOnSneakers.click();
	}
	public void clickOnEmail2Friend() {
		objCategories_Apparels_Locators.clickOnEmail2Friend.click();
	}
	public String friendsEmail(String email) {
		objCategories_Apparels_Locators.friendEmail.sendKeys(email);
		return email;
	}
	public void clearEmail() {
		objCategories_Apparels_Locators.MyEmail.clear();
	}
	public String MyEmail(String myemail) {
		objCategories_Apparels_Locators.MyEmail.sendKeys(myemail);
		return myemail;
	}
	public void clickOnSendemail() {
		objCategories_Apparels_Locators.clickOnSendemail.click();
	}	

	public void assertmessage() {
		String actualMessage = objCategories_Apparels_Locators.assertmessage.getText();
		String expectedMessage = "Your message has been sent.";

		Assert.assertEquals(expectedMessage, actualMessage);

		// If the assertion passes, print a success message.
		System.out.println("Assertion Passed: Message is as expected.");
	}

}
