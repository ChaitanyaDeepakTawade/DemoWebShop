package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer_Follow_Us_Locators {
	
	@FindBy(xpath = "//li[@class='facebook']/a/text()")
	public WebElement FacebookLink;
	
	@FindBy(xpath = "//li[@class='facebook']/a/text()")
	public WebElement TwitterLink;
}
