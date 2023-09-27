package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Camera_Locators {
	
	@FindBy(xpath = "//a[@href=\"/electronics\"]")
	public WebElement ElectronicsTab;
	
	@FindBy(xpath = "//a[@href=\"/camera-photo\" and @title=\"Show products in category Camera, photo\"]")
	public WebElement CameraPhotoOption;
	
	@FindBy(xpath = "//h1[text()='Camera, photo']")
	public WebElement AssertCameraPage;
	
	@FindBy(xpath = "//a[text()='1MP 60GB Hard Drive Handycam Camcorder']")
	public WebElement ClickFirstCamera;
	
	@FindBy(xpath = "//input[@type='button' and @value='Add to compare list']")
	public WebElement AddFirstCameratoCompare;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[3]/a")
	public WebElement ClickElectronicsAgain;
	
	@FindBy(xpath = "//a[@href='/camera-photo' and @title='Show products in category Camera, photo']")
	public WebElement ClickCameraPhotoOptionAgain;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a")
	public WebElement ClickSecondCamera;
	
	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[8]/input")
	public WebElement AddSecondCameraToCompare;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")
	public WebElement AssertCompare;
}

