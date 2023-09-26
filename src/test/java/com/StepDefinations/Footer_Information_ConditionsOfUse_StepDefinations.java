package com.StepDefinations;

import org.testng.Assert;

import com.actions.Footer_Information_ConditionsofUse_Actions;
import com.actions.Footer_Information_Sitemap_Actions;
import com.utils.HelperClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_Information_ConditionsOfUse_StepDefinations {
	Footer_Information_ConditionsofUse_Actions objConditionsOfUseActions;
	@When("click Conditions of Use Link")
	public void click_conditions_of_use_link() {
		objConditionsOfUseActions = new Footer_Information_ConditionsofUse_Actions();
		objConditionsOfUseActions.click_ConditionsofUse();
	}

	@Then("validate Conditions of Use Page is Open or not")
	public void validate_conditions_of_use_page_is_open_or_not() {
		 Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/conditions-of-use");
	}


}
