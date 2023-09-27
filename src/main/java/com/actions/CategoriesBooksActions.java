package com.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.locators.Categories_Books_Locators;
import com.locators.LoginPageLocators;
import com.utils.HelperClass;

public class CategoriesBooksActions {
	
	Categories_Books_Locators objBooksPageLocators;
	public CategoriesBooksActions() {
		
		this.objBooksPageLocators =new Categories_Books_Locators();
		
		PageFactory.initElements(HelperClass.getDriver(), objBooksPageLocators );
		
	}
	
	//verifyUserLogged method is for verify user is long in or not
	public void verifyUserLogged() {
		
		Assert.assertEquals(objBooksPageLocators.AccName.getText(), "Exampale123456@gmail.com");
	}
	
	//Category book option is selected from side navBar;
	public void navBarBookBtnClick() {

		objBooksPageLocators.BookNavBtn.click();
	}
	
	//select Price: High to Low option from Sort By drop down 
	
	public void SortByDropDwn() {
		
		Select DropdwnSortBy = new Select(objBooksPageLocators.DropdwnSortBy);
		DropdwnSortBy.selectByIndex(3);
		
	}
	
	//Select view as List drop down options
	public void ViewAsDropDwn() {
		
		Select DropdwnSortBy = new Select(objBooksPageLocators.DropdwnViewAs);
		DropdwnSortBy.selectByIndex(0);
		
	}
	// verifyDisplayedProductInOrderOrNot Method use for verify product order is in price Low to High or not

	public void verifyDisplayedProductInOrderOrNot() {
	   
		 List<String>list=new ArrayList<>();
		 for(int i =0;i<objBooksPageLocators.price.size();i++)
		 { 
			 list.add(objBooksPageLocators.price.get(i).getText());
			 
		 }
		 Collections.sort(list);
		 
		 for(int i =0;i<objBooksPageLocators.price.size();i++)
		 {
			 
		  if(objBooksPageLocators.price.get(i).getText().equals(list.get(i)));
		  {
			  Assert.assertTrue(true);
		  }
		 }
		 
	}
	

}
