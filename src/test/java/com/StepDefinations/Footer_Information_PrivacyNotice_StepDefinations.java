package com.StepDefinations;

import org.testng.Assert;

import com.actions.Footer_Information_PrivacyNotice_Actions;
import com.actions.Footer_Information_Sitemap_Actions;
import com.utils.HelperClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_Information_PrivacyNotice_StepDefinations {
	Footer_Information_PrivacyNotice_Actions objPrivacyNoticeActions;
	@When("click Privacy Notice Link")
	public void click_privacy_notice_link() {
		objPrivacyNoticeActions = new Footer_Information_PrivacyNotice_Actions();
		objPrivacyNoticeActions.click_PrivacyNotice();
		
	}

	@Then("validate Privacy Notice Page is Open or not")
	public void validate_privacy_notice_page_is_open_or_not() {
		
		 Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/privacy-policy");
	
	}

}
