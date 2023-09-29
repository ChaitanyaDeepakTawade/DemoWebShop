/*
 * A simple locater file for Footer Follow Us Section.
 * 
 * @author Devansh M (Expleo Group)
 * since JDK17 9/26/2023
 */

package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer_Follow_Us_Locators {
	
	@FindBy(xpath = "//a[@href='http://www.facebook.com/nopCommerce' and @target='_blank']")
	public WebElement FacebookLink;
	
	@FindBy(xpath = "//a[@href='https://twitter.com/nopCommerce' and @target='_blank']")
	public WebElement TwitterLink;
}
