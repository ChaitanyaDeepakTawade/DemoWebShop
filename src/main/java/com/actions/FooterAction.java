package com.actions;

import org.openqa.selenium.JavascriptExecutor;

import com.utils.HelperClass;
/*
 * Action methods for Scroll for footer .
 * @author chaitanya Deepk Tawade(expleo Pune)
 * @sign 25/09/2023 
*/
public class FooterAction {
	
	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		
	}

}
