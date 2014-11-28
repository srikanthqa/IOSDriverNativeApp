package com.citibank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Srikanth on 11/27/14.
 */
public class TutorialPage extends AbstractPage{

    @FindBy(xpath = "//UIAButton[@name='Close Tutorial']")
    private WebElement closeTutorialButton;

    public HomePage clickCloseTutorialButton(){
        dynamicWebElement(closeTutorialButton);
        closeTutorialButton.click();
        return PageFactory.initElements(driver,HomePage.class);
    }
}
