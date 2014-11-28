package com.citibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Srikanth on 11/27/14.
 */
public class LoginPage extends AbstractPage{

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[2]/UIATextField[1]")
    private WebElement usernameEdit;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[3]/UIASecureTextField[1]")
    private WebElement passwordEdit;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[5]")
    private WebElement loginButton;

    public void setUserName(String username){
        usernameEdit.sendKeys(username);
    }

    public void setPassword(String password){
        passwordEdit.sendKeys(password);
    }

    public TutorialPage clickLoginButton(){
        loginButton.click();
        return PageFactory.initElements(driver,TutorialPage.class);
    }

    public boolean verifyLoginButton(){
        return loginButton.isDisplayed();
    }

    public void userLogin(String username,String password){
        usernameEdit.sendKeys(username);
        passwordEdit.sendKeys(password);
        loginButton.click();
    }

}
