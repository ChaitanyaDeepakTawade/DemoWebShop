/*
 * A simple actions file for Footer Follow Us section.
 * 
 * @author Devansh M (Expleo Group)
 * since JDK17 9/26/2023
 */

package com.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.locators.CategoriesCameraLocators;
import com.locators.Footer_Follow_Us_Locators;
import com.utils.HelperClass;

import io.cucumber.messages.types.Duration;

public class Footer_Follow_Us_Actions {
	
	Footer_Follow_Us_Locators follow_us_locators;
	
	WebDriver my_driver = HelperClass.getDriver();
	
	JavascriptExecutor js = (JavascriptExecutor)my_driver;
	
	//Creating logger object
	Logger log;
	
	//Linking Action to Locators
		public Footer_Follow_Us_Actions() {
			
			//Setting up Logger
			log = LogManager.getLogger(Footer_Information_Actions.class);
			
			follow_us_locators = new Footer_Follow_Us_Locators();
			PageFactory.initElements(HelperClass.getDriver(), follow_us_locators);
		}
		
		public void clickFacebookLink() {
			
			//js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
			log.info("------------Opening Facebook link----------------");
			
			//follow_us_locators.FacebookLink.click();
			
			js.executeScript("follow_us_locators.FacebookLink.click()");
        }
		
		public void clickTwitterLink() {
			
			//js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
			log.info("------------Opening Twitter link----------------");
			
			follow_us_locators.TwitterLink.click();
			
			//js.executeScript("follow_us_locators.TwitterLink.click()");
        }
		
}
