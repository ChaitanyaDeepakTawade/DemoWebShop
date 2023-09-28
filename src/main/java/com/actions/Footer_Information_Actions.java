package com.actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.locators.Footer_Information_Locators;
import com.utils.HelperClass;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Footer_Information_Actions {
 
	Footer_Information_Locators objFooterInfoLocators;
	Logger log;
	public Footer_Information_Actions(){
		log = LogManager.getLogger(Footer_Information_Actions.class);

		objFooterInfoLocators = new Footer_Information_Locators();
		PageFactory.initElements(HelperClass.getDriver(), objFooterInfoLocators);

	}
	public void click_Sitemap() {
		log.info("------------Openeing Sitemap----------------");
		objFooterInfoLocators.Sitmap.click();
		
		
	}
	
	public void assert_Sitemap() {
		try {
	    	Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/sitemap");
		}catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}
	}
	
	public void click_ShippingAndReturns() {
		log.info("------------Openeing Shipping And Returns----------------");
		objFooterInfoLocators.ShippingAndReturns.click();
		
	}
	
	public void assert_ShippingAndReturns() {
		try {
			Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/shipping-returns");
	
		}catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}
	}
    public void click_PrivacyNotice() {
    	log.info("------------Openeing Privacy Notice----------------");
		objFooterInfoLocators.PrivacyNotice.click();
		
	}
    
    public void assert_PrivacyNotice() {
    	try {
		   Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/privacy-policy");
    	}
    	catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}

	}
    
    public void click_AboutUs() {
    	log.info("------------Openeing About Us----------------");
		objFooterInfoLocators.AboutUs.click();
		
	}
    
    public void assert_AboutUs() {
    	try { 
    		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/about-us");
    	}
    	catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}
    }
    
    public void click_ContactUs() {
    	log.info("------------Openeing Contact Us----------------");
		objFooterInfoLocators.ContactUs.click();
		
	}
    
    public void assert_ContactUs() {
    	try {
    		Assert.assertEquals(HelperClass.getDriver().getCurrentUrl(), "https://demowebshop.tricentis.com/contactus");
    	}
    	catch (Exception e) {
			e.printStackTrace();
			log.error("Error Occured.. Page is not opened");
		}
	}
    public void ContactUsForm(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	
    ExcelReader excelReader = new ExcelReader();

		List<Map<String,String>> ContactUsData =excelReader.getData("src/main/java/com/TestingData/ContactUsData.xls", sheetname);
		objFooterInfoLocators.fullName.sendKeys(ContactUsData.get(rownumber).get("name"));
		objFooterInfoLocators.email.sendKeys(ContactUsData.get(rownumber).get("email"));
		objFooterInfoLocators.enquiry.sendKeys(ContactUsData.get(rownumber).get("enquiry"));
		objFooterInfoLocators.submit.submit();
    }
    

    
	public void click_ConditionsofUse() {
		log.info("------------Openeing Conditions of Use Page----------------");
		objFooterInfoLocators.ConditionsofUse.click();
		
	}
	
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
