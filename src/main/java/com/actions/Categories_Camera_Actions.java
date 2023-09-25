package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.Categories_Camera_Locators;
import com.utils.HelperClass;

public class Categories_Camera_Actions {
     
	Categories_Camera_Locators categories_Camera_Locators;
	//Linking Action to Locators
	public Categories_Camera_Actions() {

			categories_Camera_Locators = new Categories_Camera_Locators();
			PageFactory.initElements(HelperClass.getDriver(), categories_Camera_Locators);

		}

        public void ElectronicsTabClick() {
        	
			categories_Camera_Locators.ElectronicsTab.click();

        }
        public void CameraClick() {
        	
			categories_Camera_Locators.CameraPhotoOption.click();

        }
        
        public String AssertCameraPage() {
        	
			return categories_Camera_Locators.AssertCameraPage.getText();

        }
        
        public void FirstCamera() {
        	
        	categories_Camera_Locators.ClickFirstCamera.click();

        }
        
        public void AddFirstCameraToCompareList() {
        	
        	categories_Camera_Locators.AddFirstCameratoCompare.click();

        }
        
        public void ClickElectronicsOption() {
        	
        	categories_Camera_Locators.ClickElectronicsAgain.click();

        }
        
        public void ClickCameraOptionAgain() {
        	
        	categories_Camera_Locators.ClickCameraPhotoOptionAgain.click();

        }
        
        public void SecondCameraClick() {
        	
        	categories_Camera_Locators.ClickSecondCamera.click();

        }
        
        public void AddSecondCameraToCompareList() {
        	
        	categories_Camera_Locators.AddSecondCameraToCompare.click();

        }
        
        public String AssertCompareList() {
        	
        	return categories_Camera_Locators.AssertCompare.getText();

        }
	}

