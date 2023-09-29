package com.actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.Categories_Computers_Locators;
import com.utils.HelperClass;

public class Categories_Computers_Actions {
Categories_Computers_Locators objCategories_Computers_Locators;
	
	
	public Categories_Computers_Actions() {
		
		this.objCategories_Computers_Locators =new Categories_Computers_Locators();
		PageFactory.initElements(HelperClass.getDriver(), objCategories_Computers_Locators );
	}
	
	public void hoverondesktop() {
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10));

		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Computers")));
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
	//second scenario to assert accessories
	public void clickonDesktop2() {

		objCategories_Computers_Locators.clickOnDesktop1.click();
    }
	public void clickonaccessories1() {
		objCategories_Computers_Locators.accessories1.click();;
    }
	public void displaysortby1() {
		Select DropdwnSortBydisplay1 = new Select(objCategories_Computers_Locators.displaysortby1);
		DropdwnSortBydisplay1.selectByIndex(0);
    }
	public void assert4products() {
	    WebElement productGrid = objCategories_Computers_Locators.assert4products;

	    // Locate the product items within the product grid
	    List<WebElement> productItems = productGrid.findElements(By.className("product-item"));

	    // Assert that there are exactly 4 product items
	    if (productItems.size() == 4) {
	        System.out.println("Assertion: There are 4 products.");
	    } else {
	        System.out.println("Assertion: There are NOT 4 products. Found " + productItems.size() + " products.");
	    }
	}
	
	//Third Scenario for accessories
	public void clickonDesktop3() {

		objCategories_Computers_Locators.clickOnDesktop2.click();;
    }
	public void clickonaccessories2() {
		objCategories_Computers_Locators.accessories2.click();;
    }
	public void displaysortby2() {
		Select DropdwnSortBydisplay2 = new Select(objCategories_Computers_Locators.displaySize2);
		DropdwnSortBydisplay2.selectByIndex(2);	
}
	public void assert12products() {
    WebElement productGrid1 = objCategories_Computers_Locators.displayVerify2;

    // Locate the product items within the product grid
    List<WebElement> productItems2 = productGrid1.findElements(By.className("product-item"));

    // Assert that there are exactly 12 product items
    if (productItems2.size() == 12) {
        System.out.println("Assertion: There are 12 products.");
    } else {
        System.out.println("Assertion: There are NOT 12 products. Found " + productItems2.size() + " products.");
    }
}
}
