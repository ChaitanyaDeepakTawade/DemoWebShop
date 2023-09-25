package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Camera_Locators {
	
	@FindBy(xpath = "//a[@href=\"/electronics\"]")
	public WebElement ElectronicsTab;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/h2/a")
	public WebElement CameraPhotoOption;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")
	public WebElement AssertCameraPage;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	public WebElement ClickFirstCamera;
	
	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[8]/input")
	public WebElement AddFirstCameratoCompare;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[3]/a")
	public WebElement ClickElectronicsAgain;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[3]/ul/li[1]/a")
	public WebElement ClickCameraPhotoOptionAgain;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a")
	public WebElement ClickSecondCamera;
	
	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[8]/input")
	public WebElement AddSecondCameraToCompare;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")
	public WebElement AssertCompare;
}

