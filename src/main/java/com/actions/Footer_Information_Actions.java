package com.actions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.locators.Footer_Information_Locators;
import com.utils.ExcelReader;
import com.utils.HelperClass;

/*
 * this Action methods for footer information section .
 * @author chaitanya Deepk Tawade(expleo Pune)
 * @sign 25/09/2023 
*/

public class Footer_Information_Actions {
 
	Footer_Information_Locators objFooterInfoLocators;
	Logger log;
	String currentURL ; // store current url of driver for validate right page is open or not
	
	//Validate Sitemap Page is Opened
	public Footer_Information_Actions(){
		log = LogManager.getLogger(Footer_Information_Actions.class);

		objFooterInfoLocators = new Footer_Information_Locators();
		PageFactory.initElements(HelperClass.getDriver(), objFooterInfoLocators);

	}
	public void click_Sitemap() {
		log.info("------------Openeing Sitemap----------------");
		objFooterInfoLocators.Sitmap.click();
		
		
	}

	@Test(description="Validate Sitemap Page is Opened")
	public void assert_Sitemap() {
		try {
			//java script executor for get current url from browser
			JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
			currentURL = (String) js.executeScript("return window.location.href;");
			
	    	Assert.assertEquals(currentURL, "https://demowebshop.tricentis.com/sitemap");
		}catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}
	}
	
	//Validate Shipping And Returns Page is Opened
	public void click_ShippingAndReturns() {
		log.info("------------Openeing Shipping And Returns----------------");
		objFooterInfoLocators.ShippingAndReturns.click();
		
	}
	

	@Test(description="Validate Shipping And Returns Page is Opened")
	public void assert_ShippingAndReturns() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
			currentURL = (String) js.executeScript("return window.location.href;");
			Assert.assertEquals(currentURL, "https://demowebshop.tricentis.com/shipping-returns");
	
		}catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}
	}
	
	//Validate Privacy Notice Page Opened
    public void click_PrivacyNotice() {
    	log.info("------------Openeing Privacy Notice----------------");
		objFooterInfoLocators.PrivacyNotice.click();
		
	}
    
	@Test(description="Validate Privacy Notice Page Opened")
    public void assert_PrivacyNotice() {
    	try {
		   Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/privacy-policy");
    	}
    	catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}

	}
	
    //Validate About Us Page is Opened
    public void click_AboutUs() {
    	log.info("------------Openeing About Us----------------");
		objFooterInfoLocators.AboutUs.click();
		
	}
    
	@Test(description="Validate About Us Page is Opened")
    public void assert_AboutUs() {
    	try { 
    		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/about-us");
    	}
    	catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}
    }
    
	//Validate ContactUs Page is Opened and data is submitted sucessfully
    public void click_ContactUs() {
    	log.info("------------Openeing Contact Us----------------");
		objFooterInfoLocators.ContactUs.click();
		
	}

    public void ContactUsForm(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	
    	ExcelReader excelReader = new ExcelReader();

		List<Map<String,String>> ContactUsData =excelReader.getData("src/main/java/com/TestingData/ContactUsData.xls", sheetname);
		objFooterInfoLocators.fullName.sendKeys(ContactUsData.get(rownumber).get("name"));
		objFooterInfoLocators.email.sendKeys(ContactUsData.get(rownumber).get("email"));
		objFooterInfoLocators.enquiry.sendKeys(ContactUsData.get(rownumber).get("enquiry"));
		objFooterInfoLocators.submit.submit();
    }
    
    
	@Test(description="Validate ContactUs Page is Opened and data is submitted sucessfully")
    public void assert_ContactUs() {
    	try {
    		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/contactus");
    	}
    	catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}
    	
    	try {
    		Assert.assertEquals(objFooterInfoLocators.ContactusDataSubmitMessage.getText(), "Your enquiry has been successfully sent to the store owner.");
    	}
    	catch (Exception e) {
			e.printStackTrace();
			log.error("Contact us data not submitted successfully...!");
		}
	}
	
	//Validate Coondition of Us Page Opened
	public void click_ConditionsofUse() {
		log.info("------------Openeing Conditions of Use Page----------------");
		objFooterInfoLocators.ConditionsofUse.click();
		
	}
	
	@Test(description="Validate Coondition of Us Page Opened")
	public void assert_ConditionsofUse() {
		try {
			Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/conditions-of-use");
		}
		catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}
	}
	
}
