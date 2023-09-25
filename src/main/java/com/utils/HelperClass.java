package com.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	private static HelperClass helperclass;
	private static WebDriver driver;
	public final static int TIMEOUT =5;
	
	public HelperClass(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public static void openPage(String url) {
		System.out.println("-------Loading Url-----");
		driver.get(url);
	
	}
	public static WebDriver getDriver() {
		return driver;
		
	}
	public static void setUpDriver() {
		if(helperclass==null) {
			helperclass =new HelperClass();
		}
	}
	public static void tearDown() {
		
		if(driver != null) {
			driver.close();
			driver.quit();
		}
		helperclass=null;
	}

}
