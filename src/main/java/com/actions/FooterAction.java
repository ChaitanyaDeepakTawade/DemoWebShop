package com.actions;

import org.openqa.selenium.JavascriptExecutor;

import com.utils.HelperClass;

public class FooterAction {
	
	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		
	}

}
