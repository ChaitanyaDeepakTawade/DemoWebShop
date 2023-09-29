package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class Categories_Computers_Locators {

		@FindBy(xpath = "//div[@class = 'header-menu']/descendant::li[2]/child::a")
	    public WebElement hoverOnDesktop;

	    @FindBy(xpath = "//a[@href='/desktops' and @title='Show products in category Desktops']")
	    public WebElement desktop;

	    @FindBy(name = "products-orderby")
	    public WebElement sortBy;

	    @FindBy(xpath = "//span[@class='price actual-price' and text()='500.00']")
	    public WebElement itemPrice1;

	    @FindBy(xpath = "//span[@class='price actual-price' and text()='800.00']")
	    public WebElement itemPrice2;
	    
	    //Scenario Second
	    @FindBy(xpath = "//a[@href=\"/computers\"]")
	    public WebElement clickOnDesktop1;
	    
	    @FindBy(xpath = "//a[@href=\"/accessories\" and @title=\"Show products in category Accessories\"]")
	    public WebElement accessories1;

	    @FindBy(xpath = "//*[@id=\"products-pagesize\"]")
	    public WebElement displaysortby1;

	    @FindBy(xpath = "//div[@class='product-grid'][count(.//div[@class='product-item']) = 4]")
	    public WebElement assert4products;
	    
	    
	    //Third scenario for accessories
	    @FindBy(xpath = "//a[@href=\"/computers\"]")
	    public WebElement clickOnDesktop2;
	    
	    @FindBy(xpath = "//a[@href=\"/accessories\" and @title=\"Show products in category Accessories\"]")
	    public WebElement accessories2;

	    @FindBy(xpath = "//select[@id='products-pagesize']")
	    public WebElement displaySize2;

	    @FindBy(xpath = "//div[@class='product-grid']")
	    public WebElement displayVerify2;

}
