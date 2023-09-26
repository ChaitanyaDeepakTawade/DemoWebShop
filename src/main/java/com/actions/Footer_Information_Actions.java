package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.Footer_Information_Locators;
import com.utils.HelperClass;

public class Footer_Information_Actions {
 
	Footer_Information_Locators objFooterInfoLocators;
	public Footer_Information_Actions(){
		objFooterInfoLocators = new Footer_Information_Locators();
		PageFactory.initElements(HelperClass.getDriver(), objFooterInfoLocators);

	}
	public void click_Sitemap() {
		objFooterInfoLocators.Sitmap.click();
		
	}
	public void click_ShippingAndReturns() {
		objFooterInfoLocators.ShippingAndReturns.click();
		
	}
    public void click_PrivacyNotice() {
		
		objFooterInfoLocators.PrivacyNotice.click();
		
	}
    public void click_AboutUs() {
		objFooterInfoLocators.AboutUs.click();
		
	}
    public void click_ContactUs() {
		objFooterInfoLocators.ContactUs.click();
		
	}
	public void click_ConditionsofUse() {
		objFooterInfoLocators.ConditionsofUse.click();
		
	}
	
}
