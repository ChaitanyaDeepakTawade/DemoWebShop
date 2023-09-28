/*
 * A simple action file for categories camera section.
 * 
 * @author Devansh M (Expleo Group)
 * since JDK17 9/25/2023
 */

package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.CategoriesCameraLocators;
import com.utils.HelperClass;

public class CategoriesCameraActions {
     
	CategoriesCameraLocators cameraLocatorsObj;
	//Linking Action to Locators
		public CategoriesCameraActions() {

			cameraLocatorsObj = new CategoriesCameraLocators();
			PageFactory.initElements(HelperClass.getDriver(), cameraLocatorsObj);
		}

        public void electronicsTabClick() {
        	
			cameraLocatorsObj.electronicsTab.click();
        }
        
        public void cameraClick() {
        	
			cameraLocatorsObj.cameraPhotoOption.click();
        }
        
        public String assertCameraPage() {
        	
			return cameraLocatorsObj.assertCameraPage.getText();
        }
        
        public void firstCamera() {
        	
        	cameraLocatorsObj.clickFirstCamera.click();
        }
        
        public void addFirstCameraToCompareList() {
        	
        	cameraLocatorsObj.addFirstCameraToCompare.click();
        }
        
        public void clickElectronicsOption() {
        	
        	cameraLocatorsObj.clickElectronicsAgain.click();
        }
        
        public void clickCameraOptionAgain() {
        	
        	cameraLocatorsObj.clickCameraPhotoOptionAgain.click();
        }
        
        public void SecondCameraClick() {
        	
        	cameraLocatorsObj.clickSecondCamera.click();
        }
        
        public void addSecondCameraToCompareList() {
        	
        	cameraLocatorsObj.addSecondCameraToCompare.click();
        }
        
        public String assertCompareList(){
        	
        	return cameraLocatorsObj.assertCompare.getText();
        }
        
	}

