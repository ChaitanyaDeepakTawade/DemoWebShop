/*
 * A simple locater file for categories camera section.
 * 
 * @author Devansh M (Expleo Group)
 * since JDK17 9/25/2023
 */

package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesCameraLocators {
	
	@FindBy(xpath = "//div[@class = 'leftside-3']/descendant::li[3]/child::a")
	public WebElement electronicsTab;
	
	@FindBy(xpath = "//a[@href=\"/camera-photo\" and @title=\"Show products in category Camera, photo\"]")
	public WebElement cameraPhotoOption;
	
	@FindBy(xpath = "//h1[text()='Camera, photo']")
	public WebElement assertCameraPage;
	
	@FindBy(xpath = "//a[text()='1MP 60GB Hard Drive Handycam Camcorder']")
	public WebElement clickFirstCamera;
	
	@FindBy(xpath = "//input[@type='button' and @value='Add to compare list']")
	public WebElement addFirstCameraToCompare;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[3]/a")
	public WebElement clickElectronicsAgain;
	
	@FindBy(xpath = "//a[@href='/camera-photo' and @title='Show products in category Camera, photo']")
	public WebElement clickCameraPhotoOptionAgain;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a")
	public WebElement clickSecondCamera;
	
	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[8]/input")
	public WebElement addSecondCameraToCompare;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")
	public WebElement assertCompare;
}

