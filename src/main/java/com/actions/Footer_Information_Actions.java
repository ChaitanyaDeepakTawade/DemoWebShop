package com.actions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.locators.Footer_Information_Locators;
import com.utils.HelperClass;


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
   // @Test(dataProvider = "datapro")
    public void ContactUsForm() {
    	
    	System.out.println();
    	
    	
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
//	@DataProvider(name="datapro")
//	String[][] credential() throws BiffException, IOException
//	{   
//		String[][] data = readExcel();
//		return data;
//	}
//	
//    String[][] readExcel() throws BiffException, IOException
//
//    {    //input stream object creation
//        FileInputStream excel= new FileInputStream("src/main/java/com/TestingData.xls");
//        //getting workbook,sheet,rows and col
//        Workbook workbook= Workbook.getWorkbook(excel);
//        Sheet sheet=workbook.getSheet(0);
//        int row_count=sheet.getRows();
//        int col_count=sheet.getColumns();
//        //create 2d array
//        String[][] data1=new String[row_count-1][col_count];
//        for(int i=1;i<row_count;i++)//row iteration
//        {
//            for(int j=0;j<col_count;j++)//column iteration
//            {
//            	data1[i-1][j]=sheet.getCell(j,i).getContents();//getcell(columns,row)
//                 System.out.println(data1[i-1][j]);
//            }
//        }
//        return data1;  
//
//    }
}
