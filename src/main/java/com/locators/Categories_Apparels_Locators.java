package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categories_Apparels_Locators {
	
	@FindBy(xpath = "//a[contains(text(), 'Apparel & Shoes')]")
    public WebElement clickOnApparel;

    @FindBy(xpath = "//a[@href='/green-and-blue-sneaker']")
    public WebElement clickOnSneakers;


    @FindBy(xpath = "//input[@value='Email a friend']")
    public WebElement clickOnEmail2Friend;

    @FindBy(xpath = "//input[@name='FriendEmail']")
    public WebElement friendEmail;

    @FindBy(xpath = "//input[@id='YourEmailAddress' and @value='Exampale123456@gmail.com']")
    public WebElement MyEmail;
    
    @FindBy(xpath = "//input[@type='submit' and @name='send-email' and @value='Send email']")
    public WebElement clickOnSendemail;
    
    @FindBy(xpath = "//div[@class='result']")
    public WebElement assertmessage;
}
