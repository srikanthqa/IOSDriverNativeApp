package com.citibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by Srikanth on 11/27/14.
 */
public class MenuPage extends AbstractPage{

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAScrollView[1]/UIAStaticText[2]")
    private WebElement homeButton;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAScrollView[1]/UIAStaticText[3]")
    private WebElement atmButton;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAScrollView[1]/UIAStaticText[4]")
    private WebElement helpButton;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAScrollView[1]/UIAStaticText[5]")
    private WebElement contactButton;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAScrollView[1]/UIAStaticText[6]")
    private WebElement settingButton;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAScrollView[1]/UIAStaticText[7]")
    private WebElement feedbackButton;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAScrollView[1]/UIAStaticText[8]")
    private WebElement privacyButton;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAScrollView[1]/UIAStaticText[9]")
    private WebElement rewardsButton;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAScrollView[1]/UIAStaticText[10]")
    private WebElement popMoneyButton;

    @FindBy(name = "Sign Off")
    private WebElement signOffButton;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAButton[1]")
    private WebElement confirmSignOffButton;

    public void clickSignOffButton(){
        signOffButton.click();
    }

    public void clickConfirmSignOffButton(){
        confirmSignOffButton.click();
    }

    public void verifyMenuOptions(){
        Assert.assertTrue(homeButton.isDisplayed());
        Assert.assertTrue(atmButton.isDisplayed());
        Assert.assertTrue(helpButton.isDisplayed());
        Assert.assertTrue(contactButton.isDisplayed());
        Assert.assertTrue(settingButton.isDisplayed());
        Assert.assertTrue(feedbackButton.isDisplayed());
        Assert.assertTrue(privacyButton.isDisplayed());
        Assert.assertTrue(rewardsButton.isDisplayed());
        Assert.assertTrue(popMoneyButton.isDisplayed());
    }
}
