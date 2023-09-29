package com.actions;

<<<<<<< HEAD
=======
import java.time.Duration;

>>>>>>> e249c5eeca257b1ad942cde0f67ed978789d08d9
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
<<<<<<< HEAD
=======
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
>>>>>>> e249c5eeca257b1ad942cde0f67ed978789d08d9
		searchlocators.SearchBox.sendKeys(SearchBox,Keys.ENTER);
	}
	
	public void pressSearch() {
		searchlocators.SearchBtn.click();
	}
	
<<<<<<< HEAD
	public void dropdown() {
=======
	public void dropdown(){
		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
>>>>>>> e249c5eeca257b1ad942cde0f67ed978789d08d9
		Select DropdwnSortBy = new Select(searchlocators.Dropdown);
		DropdwnSortBy.selectByIndex(3);
	}
	
<<<<<<< HEAD
=======
	
	
>>>>>>> e249c5eeca257b1ad942cde0f67ed978789d08d9

	
}
