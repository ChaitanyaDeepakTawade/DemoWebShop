package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchLocators {

	
	@FindBy(id="small-searchterms")
	public WebElement SearchBox;
	
	@FindBy(xpath="//input[@class=\"button-1 search-box-button\"]")
	public WebElement SearchBtn;
	
	@FindBy(id="products-orderby")
	public WebElement Dropdown;
	
	@FindBy(xpath="//div[@class=\"search-results\"]//following-sibling::strong")
	public WebElement InvalidData;
	
}
