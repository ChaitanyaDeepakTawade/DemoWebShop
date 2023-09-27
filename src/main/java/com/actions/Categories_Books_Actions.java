package com.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.locators.Categories_Books_Locators;
import com.locators.LoginPageLocators;
import com.utils.HelperClass;

/*
 * Action methods for Categories_Books Page step definition file.
 * @author chaitanya Deepk Tawade(expleo Pune)
 * @sign 24/09/2023 
*/
public class Categories_Books_Actions {
	Logger log;
	Categories_Books_Locators objBooksPageLocators;
	public Categories_Books_Actions() {
		
		this.objBooksPageLocators =new Categories_Books_Locators();
		
		PageFactory.initElements(HelperClass.getDriver(), objBooksPageLocators );
		
	}
	
	//verifyUserLogged method is for verify user is long in or not
	public void verifyUserLogged() {
		log.info("----------verify User Logged or not ----------");
		try {
			Assert.assertEquals(objBooksPageLocators.AccName.getText(), "Exampale123456@gmail.com");
	        log.info("User is Logged.");
		}
		catch (Exception e) {
			e.printStackTrace();
			log.error("User is not log in.");
		}
	}
	
	//Category book option is selected from side navBar;
	public void navBarBookBtnClick() {
		log.info ("click on navbar book ");
		objBooksPageLocators.BookNavBtn.click();
	}
	
	//select Price: High to Low option from Sort By drop down 
	
	public void SortByDropDwn() {
		log.info ("Select sort by price low to high");
		Select DropdwnSortBy = new Select(objBooksPageLocators.DropdwnSortBy);
		DropdwnSortBy.selectByIndex(3);
		
	}
	
	//Select view as List drop down options
	public void ViewAsDropDwn() {
		log.info ("Select view as a grid");
		Select DropdwnSortBy = new Select(objBooksPageLocators.DropdwnViewAs);
		DropdwnSortBy.selectByIndex(0);
		
	}
	// verify Displayed Product InOrder Or Not Method use for verify product order is in price Low to High or not

	public void verifyDisplayedProductInOrderOrNot() {
	    log.info("verify Displayed Product Inorder Or Not");
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
			  try {
				  Assert.assertTrue(true);
				  log.error("Sequence of product is right ");
		  
			  }catch (Exception e) {
					e.printStackTrace();
					log.error("Sequence of product is wrong ");
				}
		  }
		 }
		 
	}
	

}
