package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.Categories_Camera_Locators;
import com.locators.Footer_Follow_Us_Locators;
import com.utils.HelperClass;

public class Footer_Follow_Us_Actions {
	
	Footer_Follow_Us_Locators follow_us_locators;
	
	//Linking Action to Locators
		public Footer_Follow_Us_Actions() {

			follow_us_locators = new Footer_Follow_Us_Locators();
			PageFactory.initElements(HelperClass.getDriver(), follow_us_locators);
			
		}
		
		public void clickFacebookLink() {
 
			follow_us_locators.FacebookLink.click();
        }
		
		public void clickTwitterLink() {
			 
			follow_us_locators.TwitterLink.click();
        }
		
}
