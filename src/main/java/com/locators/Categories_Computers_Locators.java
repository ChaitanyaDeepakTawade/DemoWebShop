package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class Categories_Computers_Locators {

		@FindBy(xpath = "//a[@href=\"/computers\" and normalize-space(.)=\"Computers\"]")
	    public WebElement hoverOnDesktop;

	    @FindBy(xpath = "//a[@href='/desktops' and @title='Show products in category Desktops']")
	    public WebElement desktop;

	    @FindBy(name = "products-orderby")
	    public WebElement sortBy;

	    @FindBy(xpath = "//span[@class='price actual-price' and text()='500.00']")
	    public WebElement itemPrice1;

	    @FindBy(xpath = "//span[@class='price actual-price' and text()='800.00']")
	    public WebElement itemPrice2;
	    
	    @FindBy(xpath = "//a[@href=\"/computers\" and normalize-space(.)=\"Computers\"]")
	    public WebElement clickOnDesktop1;
	    
	    @FindBy(xpath = "//a[@href=\"/accessories\" and normalize-space(.)=\"Accessories\"]")
	    public WebElement accessories1;

	    @FindBy(xpath = "//option[@value=\"https://demowebshop.tricentis.com/accessories?pagesize=4\" and text()=\"4\"]")
	    public WebElement displaySize;

	    @FindBy(xpath = "//span[text()='Display']")
	    public WebElement displayVerify;
	    
	    @FindBy(xpath = "//a[@href=\"/computers\" and normalize-space(.)=\"Computers\"]")
	    public WebElement clickOnDesktop2;
	    
	    @FindBy(xpath = "//a[@href=\"/accessories\" and normalize-space(.)=\"Accessories\"]")
	    public WebElement accessories2;

	    @FindBy(xpath = "//*[@id=\"products-pagesize\"]")
	    public WebElement displaySize2;

	    @FindBy(xpath = "//span[text()='Display']")
	    public WebElement displayVerify2;

}
