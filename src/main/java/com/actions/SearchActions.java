package com.actions;

import java.time.Duration;


import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.locators.SearchLocators;
import com.utils.HelperClass;

public class SearchActions {

SearchLocators searchlocators;
	
	public SearchActions() {
	this.searchlocators = new SearchLocators();
	PageFactory.initElements(HelperClass.getDriver(), searchlocators);
	}
	
	public void setkeyword(String SearchBox) {

		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		searchlocators.SearchBox.sendKeys(SearchBox,Keys.ENTER);
	}
	
	public void pressSearch() {
		searchlocators.SearchBtn.click();
	}
	


	public void dropdown(){
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		Select DropdwnSortBy = new Select(searchlocators.Dropdown);
		DropdwnSortBy.selectByIndex(3);
	}


	
}
