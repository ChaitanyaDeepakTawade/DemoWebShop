package com.StepDefinations;

import org.testng.Assert;

import com.actions.Footer_Information_ShippingAndReturns_Actions;
import com.actions.Footer_Information_Sitemap_Actions;
import com.utils.HelperClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Footer_Information_ShippingAndReturns {

	Footer_Information_ShippingAndReturns_Actions objShippingAndReturns;
@When("click Shipping & Returns Link")
public void click_shipping_returns_link() {
	objShippingAndReturns = new Footer_Information_ShippingAndReturns_Actions();
	objShippingAndReturns.click_ShippingAndReturns();
}

@Then("validate Shipping & Returns Page is Open or not")
public void validate_shipping_returns_page_is_open_or_not() {
    Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/shipping-returns");

}

}
