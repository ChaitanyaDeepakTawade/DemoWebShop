package com.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.locators.Categories_Computers_Locators;
import com.utils.HelperClass;

public class Categories_Computers_Actions {
Categories_Computers_Locators objCategories_Computers_Locators;
	
	
	public Categories_Computers_Actions() {
		
		this.objCategories_Computers_Locators =new Categories_Computers_Locators();
		PageFactory.initElements(HelperClass.getDriver(), objCategories_Computers_Locators );
	}
	
	public void hoverondesktop() {
		objCategories_Computers_Locators.hoverOnDesktop.click();
}	
	public void clickondesktop() {
		objCategories_Computers_Locators.desktop.click();
}	
	public void clickonsortby() {
	objCategories_Computers_Locators.sortBy.click();
	Select DropdwnSortBy = new Select(objCategories_Computers_Locators.sortBy);
			DropdwnSortBy.selectByIndex(3);
}
	public float compareItemPrices() {
        String priceText1 = objCategories_Computers_Locators.itemPrice1.getText();
        String priceText2 = objCategories_Computers_Locators.itemPrice2.getText();
        
        // Remove leading and trailing whitespace and convert to floats
        float price1 = Float.parseFloat(priceText1.trim());
        float price2 = Float.parseFloat(priceText2.trim());

        if (price1 > price2) {
            return price1;
        } else {
            return price2;
        }
        
        
    }	
	public void clickonDesktop2() {
		objCategories_Computers_Locators.clickOnDesktop1.click();
    }
	public void clickonaccessories1() {
		objCategories_Computers_Locators.accessories1.click();;
    }
}
