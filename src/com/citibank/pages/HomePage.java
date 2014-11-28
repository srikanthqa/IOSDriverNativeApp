package com.citibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Srikanth on 11/27/14.
 */
public class HomePage extends AbstractPage{

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[11]")
    private WebElement hamburgerMenuIcon;

    public boolean verifyMenuIcon(){
        return hamburgerMenuIcon.isEnabled();
    }

    public MenuPage clickMenuIcon(){
        hamburgerMenuIcon.click();
        return PageFactory.initElements(driver,MenuPage.class);
    }

}
