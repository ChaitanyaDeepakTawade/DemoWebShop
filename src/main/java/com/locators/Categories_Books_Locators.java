package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import com.utils.HelperClass;

public class Categories_Books_Locators {
	
	@FindBy(xpath="//*[@class=\"account\"]")
	public WebElement AccName;
	
	@FindBy(linkText="Books")
	public WebElement BookNavBtn;
	
	@FindBy(id ="products-orderby")
	public WebElement DropdwnSortBy; 
	
	@FindBy(id ="products-viewmode")
	public WebElement DropdwnViewAs;
	
	@FindBy(xpath="//span[@class=\"price actual-price\"]")
	public List<WebElement> price;
	
	@FindBy(xpath="//span[@class=\"price actual-price\"]")
	public List<WebElement> Sort; //Use for Sorting
}
