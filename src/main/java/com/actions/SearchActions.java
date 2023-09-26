package com.actions;

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
		searchlocators.SearchBox.sendKeys(SearchBox,Keys.ENTER);
	}
	
	public void pressSearch() {
		searchlocators.SearchBtn.click();
	}
	
	public void dropdown() {
		Select DropdwnSortBy = new Select(searchlocators.Dropdown);
		DropdwnSortBy.selectByIndex(3);
	}
	
	
	

	
}
