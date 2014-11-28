package com.citibank.pages;

import com.citibank.tests.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Srikanth on 11/27/14.
 */
public class AbstractPage {
    protected RemoteWebDriver driver= AbstractTest.driver;

    protected void dynamicWebElement(WebElement element){
        new WebDriverWait(driver,20).pollingEvery(1,TimeUnit.SECONDS).until(ExpectedConditions.visibilityOf(element));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
