/*
 * A simple step definition file for Footer Follow Us.
 * 
 * @author Devansh M (Expleo Group)
 * since JDK17 9/26/2023
 */

package com.StepDefinations;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.actions.CategoriesCameraActions;
import com.actions.Footer_Follow_Us_Actions;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_Follow_Us_StepDefinition {
	
	Footer_Follow_Us_Actions FooterObj = new Footer_Follow_Us_Actions();
	
	WebDriver my_driver = HelperClass.getDriver();
	
	@When("click Facebook link")
	public void click_facebook_link() {

		FooterObj.clickFacebookLink();
	}

	@Then("validate Facebook Page is Open or not")
	public void validate_facebook_page_is_open_or_not() {
		//get window handlers as list
		
				List<String> browserTabs = new ArrayList<String> (my_driver.getWindowHandles());
				//switch to new tab
				my_driver.switchTo().window(browserTabs.get(1));
				
				String expectedUrlforFacebook = "https://www.facebook.com/nopCommerce";
				String actualUrlforFacebook = my_driver.getCurrentUrl();
				//check is it correct page opened or not (e.g. check page's title)
				Assert.assertEquals(actualUrlforFacebook, expectedUrlforFacebook);
				//then close tab and get back
				System.out.println("URL of Facebook is correct & verified & asserted correctly");
				my_driver.switchTo().window(browserTabs.get(0));
				
	}

	@When("click Twitter link")
	public void click_twitter_link() {
	    
		FooterObj.clickTwitterLink();
	}

	@Then("validate Twitter Page is Open or not")
	public void validate_twitter_page_is_open_or_not() {
	    
		//get window handlers as list
		List<String> browserTabs = new ArrayList<String> (my_driver.getWindowHandles());
		//switch to new tab
		my_driver.switchTo().window(browserTabs.get(1));
		
		String expectedUrlforTwitter = "https://twitter.com/nopCommerce";
		String actualUrlforTwitter = my_driver.getCurrentUrl();
		//check is it correct page opened or not (e.g. check page's title)
		Assert.assertEquals(actualUrlforTwitter, expectedUrlforTwitter);
		//then close tab and get back
		System.out.println("URL of Twitter is correct & verified & asserted correctly");
		my_driver.close();
		my_driver.switchTo().window(browserTabs.get(0));

	}
	
}
