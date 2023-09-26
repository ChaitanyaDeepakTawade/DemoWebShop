package com.StepDefinations;

import org.testng.Assert;

import com.actions.Categories_Camera_Actions;
import com.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Category_Camera_StepDefination {
	
	Categories_Camera_Actions objActions ;
	
	@Given("User is on demo web shop main page")
	public void user_is_on_demo_web_shop_main_page() {
		objActions = new Categories_Camera_Actions();
	}

	@When("user clicks on electronics tab")
	public void user_clicks_on_electronics_tab() {
		
	    objActions.ElectronicsTabClick();
	}

	@When("user clicks on camera, photo option.")
	public void user_clicks_on_camera_photo_option() {
	    
		objActions.CameraClick();
	}
	
	@Then("Verify User is on camera, photo section web page.")
	public void verify_user_is_on_camera_photo_section_web_page() {
		Assert.assertTrue(objActions.AssertCameraPage().contains("Camera, photo"));
		
	}

	@Then("user clicks on first camera.")
	public void user_clicks_on_first_camera() {
	    // Write code here that turns the phrase above into concrete actions
	    objActions.FirstCamera();
	}

	@Then("user clicks Add to compare list.")
	public void user_clicks_add_to_compare_list() {
	    // Write code here that turns the phrase above into concrete actions
	    objActions.AddFirstCameraToCompareList();
	}
	
	@Then("user clicks on Electronics option again.")
	public void user_clicks_on_Electronics_option_again() {
	    
		objActions.ClickElectronicsOption();
	}
	
	@Then("user clicks on camera, photo option again.")
	public void user_clicks_on_camera_photo_option_again() {
	    
		objActions.ClickCameraOptionAgain();
	}

	@Then("user clicks on second camera.")
	public void user_clicks_on_second_camera() {
	    
		objActions.SecondCameraClick();
	}
	
	@Then("user clicks Add to compare list for second camera.")
	public void user_clicks_add_to_compare_list_for_second_camera() {
	    
		objActions.AddSecondCameraToCompareList();
	}

	@Then("Verify comparison list is visible to the User.")
	public void verify_comparison_list_is_visible_to_the_user() {
	    
		Assert.assertTrue(objActions.AssertCompareList().contains("Compare products"));
	}
}