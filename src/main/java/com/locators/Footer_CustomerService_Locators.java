package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer_CustomerService_Locators {
	//Search Footer
	@FindBy(xpath="//a[text()='Search' and @href='/search']")
	public WebElement SearchFooterClick;
	
	@FindBy(xpath="//input[@class='search-text']")
	public WebElement SearchFooterText;
	
	@FindBy(xpath="//input[contains(@class, 'button-1 search-button')]")
	public WebElement Footersearchbutton;
	
	@FindBy(xpath="//a[text()='1MP 60GB Hard Drive Handycam Camcorder']")
	public WebElement verifyfootersearch;
	
	//News Footer	
	@FindBy(xpath="//a[text()='News' and @href='/news']")
	public WebElement NewsFooterClick;
	
	@FindBy(xpath="//a[@class='news-title']")
	public WebElement NewsFooterVerify;
	
	//Blog Footer
	@FindBy(xpath="//a[@href='/blog']")
	public WebElement BlogFooterClick;
	
	@FindBy(xpath="//a[@class='post-title' and @href='/customer-service-client-service']")
	public WebElement BlogFooterVerify;
	
	//Recently Viewed Products Footer
	@FindBy(xpath="//a[@href='/recentlyviewedproducts']")
	public WebElement RecentlyViewedProductsClick;
	
	@FindBy(xpath="//h1[text()='Recently viewed products']")
	public WebElement RecentlyViewedProductsVerify;
	
	//Compare Products List Footer
	@FindBy(xpath="//a[@href='/compareproducts']")
	public WebElement CompareProductListFooterClick;
	
	@FindBy(xpath="//div[@class='page-body']")
	public WebElement CompareProductListFooterVerify;
	
	//New Products Footer
	@FindBy(xpath="//a[@href='/newproducts']")
	public WebElement NewProductsFooterClick;
	
	@FindBy(xpath="//h1[text()='New products']")
	public WebElement NewProductsFooterVerify;
}
