package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.Footer_Information_Locators;
import com.utils.HelperClass;

public class Footer_Information_AboutUs_Actions {
	Footer_Information_Locators objFooterInfoLocators;
    
	void Footer_Information_AboutUs_Actions() {
    	objFooterInfoLocators = new Footer_Information_Locators();
		PageFactory.initElements(HelperClass.getDriver(), objFooterInfoLocators);
    }
    
	public void click_AboutUs() {
		objFooterInfoLocators.AboutUs.click();
		
	}
}
