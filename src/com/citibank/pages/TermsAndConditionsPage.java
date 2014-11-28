package com.citibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Srikanth on 11/27/14.
 */
public class TermsAndConditionsPage extends AbstractPage{

    //Page Objects
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[7]")
    private WebElement acceptButton;

    //Operations
    public SignOnPage clickAcceptButton(){
        acceptButton.click();
        return PageFactory.initElements(driver,SignOnPage.class);
    }
}
